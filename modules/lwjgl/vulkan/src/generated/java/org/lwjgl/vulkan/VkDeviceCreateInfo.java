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
 * struct VkDeviceCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceCreateFlags flags;
 *     uint32_t queueCreateInfoCount;
 *     {@link VkDeviceQueueCreateInfo VkDeviceQueueCreateInfo} const * pQueueCreateInfos;
 *     uint32_t enabledLayerCount;
 *     char const * const * ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     char const * const * ppEnabledExtensionNames;
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} const * pEnabledFeatures;
 * }</code></pre>
 */
public class VkDeviceCreateInfo extends Struct<VkDeviceCreateInfo> implements NativeResource {

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

    protected VkDeviceCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceCreateInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code queueCreateInfoCount} field. */
    @NativeType("uint32_t")
    public int queueCreateInfoCount() { return nqueueCreateInfoCount(address()); }
    /** @return a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
    @NativeType("VkDeviceQueueCreateInfo const *")
    public VkDeviceQueueCreateInfo.@Nullable Buffer pQueueCreateInfos() { return npQueueCreateInfos(address()); }
    /** @return the value of the {@code enabledLayerCount} field. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** @return the value of the {@code enabledExtensionCount} field. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }
    /** @return a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
    @NativeType("VkPhysicalDeviceFeatures const *")
    public @Nullable VkPhysicalDeviceFeatures pEnabledFeatures() { return npEnabledFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_CREATE_INFO} value to the {@code sType} field. */
    public VkDeviceCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceDeviceMemoryReportCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceDeviceMemoryReportCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceDiagnosticsConfigCreateInfoNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceDiagnosticsConfigCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupDeviceCreateInfo} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceGroupDeviceCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupDeviceCreateInfoKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceGroupDeviceCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceMemoryOverallocationCreateInfoAMD} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceMemoryOverallocationCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDevicePipelineBinaryInternalCacheControlKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDevicePipelineBinaryInternalCacheControlKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDevicePrivateDataCreateInfo} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDevicePrivateDataCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDevicePrivateDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDevicePrivateDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceQueueShaderCoreControlCreateInfoARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalComputeQueueDeviceCreateInfoNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkExternalComputeQueueDeviceCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevice16BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice4444FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevice8BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAntiLagFeaturesAMD} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferAddressFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeVectorFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCubicClampFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomResolveFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDataGraphFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDataGraphFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDisplacementMicromapFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFaultFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFaultFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFeatures2} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFeatures2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFeatures2KHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFeatures2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFormatPackFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFormatPackFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostImageCopyFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance10FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance5Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance5Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance5FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance6Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance6Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance6FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance7FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance8FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance9FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceOpticalFlowFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentBarrierFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentId2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentId2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentMeteringFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentTimingFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentWait2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePushConstantBankFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRawAccessChainsFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRenderPassStripedFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSchedulingControlsFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShader64BitIndexingFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloat8FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloatControls2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderFmaFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderObjectFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderQuadControlFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTensorFeaturesARM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTileMemoryHeapFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTileShadingFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointerFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoDecodeVP9FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan14Features} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkan14Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
    public VkDeviceCreateInfo pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDeviceCreateInfo flags(@NativeType("VkDeviceCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
    public VkDeviceCreateInfo pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.@Nullable Buffer value) { npQueueCreateInfos(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
    public VkDeviceCreateInfo ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
    public VkDeviceCreateInfo ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@code pEnabledFeatures} field. */
    public VkDeviceCreateInfo pEnabledFeatures(@Nullable @NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) { npEnabledFeatures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkDeviceQueueCreateInfo.@Nullable Buffer pQueueCreateInfos,
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
        return new VkDeviceCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceCreateInfo calloc() {
        return new VkDeviceCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance for the specified memory address. */
    public static VkDeviceCreateInfo create(long address) {
        return new VkDeviceCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueCreateInfoCount}. */
    public static int nqueueCreateInfoCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT); }
    /** Unsafe version of {@link #pQueueCreateInfos}. */
    public static VkDeviceQueueCreateInfo.@Nullable Buffer npQueueCreateInfos(long struct) { return VkDeviceQueueCreateInfo.createSafe(memGetAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS), nqueueCreateInfoCount(struct)); }
    /** Unsafe version of {@link #enabledLayerCount}. */
    public static int nenabledLayerCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT); }
    /** Unsafe version of {@link #ppEnabledLayerNames() ppEnabledLayerNames}. */
    public static @Nullable PointerBuffer nppEnabledLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES), nenabledLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #ppEnabledExtensionNames() ppEnabledExtensionNames}. */
    public static @Nullable PointerBuffer nppEnabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }
    /** Unsafe version of {@link #pEnabledFeatures}. */
    public static @Nullable VkPhysicalDeviceFeatures npEnabledFeatures(long struct) { return VkPhysicalDeviceFeatures.createSafe(memGetAddress(struct + VkDeviceCreateInfo.PENABLEDFEATURES)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code queueCreateInfoCount} field of the specified {@code struct}. */
    public static void nqueueCreateInfoCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT, value); }
    /** Unsafe version of {@link #pQueueCreateInfos(VkDeviceQueueCreateInfo.Buffer) pQueueCreateInfos}. */
    public static void npQueueCreateInfos(long struct, VkDeviceQueueCreateInfo.@Nullable Buffer value) { memPutAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS, memAddressSafe(value)); nqueueCreateInfoCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledLayerCount} field of the specified {@code struct}. */
    public static void nenabledLayerCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
    public static void nppEnabledLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); nenabledLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
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
        if (queueCreateInfoCount != 0) {
            long pQueueCreateInfos = memGetAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS);
            check(pQueueCreateInfos);
            validate(pQueueCreateInfos, queueCreateInfoCount, VkDeviceQueueCreateInfo.SIZEOF, VkDeviceQueueCreateInfo::validate);
        }
        if (nenabledLayerCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceCreateInfo ELEMENT_FACTORY = VkDeviceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceCreateFlags")
        public int flags() { return VkDeviceCreateInfo.nflags(address()); }
        /** @return the value of the {@code queueCreateInfoCount} field. */
        @NativeType("uint32_t")
        public int queueCreateInfoCount() { return VkDeviceCreateInfo.nqueueCreateInfoCount(address()); }
        /** @return a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
        @NativeType("VkDeviceQueueCreateInfo const *")
        public VkDeviceQueueCreateInfo.@Nullable Buffer pQueueCreateInfos() { return VkDeviceCreateInfo.npQueueCreateInfos(address()); }
        /** @return the value of the {@code enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkDeviceCreateInfo.nenabledLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledLayerNames() { return VkDeviceCreateInfo.nppEnabledLayerNames(address()); }
        /** @return the value of the {@code enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkDeviceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledExtensionNames() { return VkDeviceCreateInfo.nppEnabledExtensionNames(address()); }
        /** @return a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
        @NativeType("VkPhysicalDeviceFeatures const *")
        public @Nullable VkPhysicalDeviceFeatures pEnabledFeatures() { return VkDeviceCreateInfo.npEnabledFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_CREATE_INFO} value to the {@code sType} field. */
        public VkDeviceCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceDeviceMemoryReportCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceDeviceMemoryReportCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceDiagnosticsConfigCreateInfoNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceDiagnosticsConfigCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupDeviceCreateInfo} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceGroupDeviceCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupDeviceCreateInfoKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceGroupDeviceCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceMemoryOverallocationCreateInfoAMD} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceMemoryOverallocationCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDevicePipelineBinaryInternalCacheControlKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDevicePipelineBinaryInternalCacheControlKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDevicePrivateDataCreateInfo} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDevicePrivateDataCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDevicePrivateDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDevicePrivateDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceQueueShaderCoreControlCreateInfoARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalComputeQueueDeviceCreateInfoNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkExternalComputeQueueDeviceCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevice16BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice16BitStorageFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevice16BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice4444FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevice4444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevice8BitStorageFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevice8BitStorageFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevice8BitStorageFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceASTCDecodeFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceASTCDecodeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAccelerationStructureFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAddressBindingReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAmigoProfilingFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAntiLagFeaturesAMD} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAntiLagFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferAddressFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBufferAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceClusterAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceClusterAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCoherentMemoryFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceColorWriteEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCommandBufferInheritanceFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceConditionalRenderingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrix2FeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCooperativeMatrix2FeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCooperativeMatrixFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeVectorFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCooperativeVectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCopyMemoryIndirectFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCornerSampledImageFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCornerSampledImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCoverageReductionModeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCubicClampFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCubicClampFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCubicWeightsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCudaKernelLaunchFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCudaKernelLaunchFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCustomBorderColorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomResolveFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceCustomResolveFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDataGraphFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDataGraphFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDataGraphModelFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthBiasControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthBiasControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthClampControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthClipControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDepthClipEnableFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorHeapFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorHeapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceMemoryReportFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDiagnosticsConfigFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDisplacementMicromapFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDisplacementMicromapFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDynamicRenderingFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExclusiveScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExclusiveScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalFormatResolveFeaturesANDROID} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryRDMAFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFaultFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFaultFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFeatures2} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFeatures2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFeatures2KHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFeatures2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFormatPackFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFormatPackFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentDensityMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFragmentShadingRateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceFrameBoundaryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceHdrVividFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceHostImageCopyFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceHostImageCopyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceHostQueryResetFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceHostQueryResetFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceHostQueryResetFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageAlignmentControlFeaturesMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageCompressionControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageProcessing2FeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageProcessingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageViewMinLodFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImageViewMinLodFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImagelessFramebufferFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceImagelessFramebufferFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceIndexTypeUint8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceIndexTypeUint8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInheritedViewportScissorFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceInheritedViewportScissorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceInlineUniformBlockFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLegacyDitheringFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLegacyDitheringFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLineRasterizationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLineRasterizationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLinearColorAttachmentFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceLinearColorAttachmentFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance10FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance10FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance4Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance4FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance5Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance5Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance5FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance5FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance6Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance6Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance6FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance6FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance7FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance7FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance8FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance9FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMaintenance9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMemoryDecompressionFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMemoryPriorityFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMeshShaderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiDrawFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultiDrawFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultiviewFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultiviewFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceNestedCommandBufferFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceNestedCommandBufferFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceOpacityMicromapFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceOpticalFlowFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceOpticalFlowFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePartitionedAccelerationStructureFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerStageDescriptorSetFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePerStageDescriptorSetFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePerformanceQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineBinaryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelinePropertiesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineRobustnessFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePipelineRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePortabilitySubsetFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentBarrierFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentBarrierFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentId2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentId2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentIdFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentIdFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentMeteringFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentMeteringFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentTimingFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentTimingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentWait2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentWait2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePresentWaitFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePresentWaitFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePrivateDataFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePrivateDataFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePrivateDataFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceProtectedMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceProvokingVertexFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePushConstantBankFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDevicePushConstantBankFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRawAccessChainsFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRawAccessChainsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayQueryFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayQueryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingPipelineFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingValidationFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRayTracingValidationFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRenderPassStripedFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRenderPassStripedFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRobustness2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceRobustness2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceScalarBlockLayoutFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceScalarBlockLayoutFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSchedulingControlsFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSchedulingControlsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShader64BitIndexingFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShader64BitIndexingFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicFloatFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderAtomicInt64FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderBfloat16FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderBfloat16FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderClockFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderClockFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParameterFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderDrawParameterFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderDrawParametersFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderDrawParametersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderEnqueueFeaturesAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloat8FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFloat8FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFloatControls2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFloatControls2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFloatControls2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderFmaFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderFmaFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderImageFootprintFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderLongVectorFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderLongVectorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderObjectFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderObjectFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderQuadControlFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderQuadControlFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderTileImageFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderUniformBufferUnsizedArrayFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShadingRateImageFeaturesNV} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceShadingRateImageFeaturesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSynchronization2Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSynchronization2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceSynchronization2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTensorFeaturesARM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTensorFeaturesARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTileMemoryHeapFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTilePropertiesFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTileShadingFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTileShadingFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceTransformFeedbackFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVariablePointerFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointerFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVariablePointerFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVariablePointersFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVariablePointersFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVariablePointersFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVertexAttributeRobustnessFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoDecodeVP9FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance1FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoMaintenance1FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan11Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkan11Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan12Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkan12Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan13Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkan13Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan14Features} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkan14Features value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceYcbcrImageArraysFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceZeroInitializeDeviceMemoryFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} value to the {@code pNext} chain. */
        public VkDeviceCreateInfo.Buffer pNext(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceCreateInfo.Buffer flags(@NativeType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
        public VkDeviceCreateInfo.Buffer pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.@Nullable Buffer value) { VkDeviceCreateInfo.npQueueCreateInfos(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@code pEnabledFeatures} field. */
        public VkDeviceCreateInfo.Buffer pEnabledFeatures(@Nullable @NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) { VkDeviceCreateInfo.npEnabledFeatures(address(), value); return this; }

    }

}