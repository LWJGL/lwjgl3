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
 * Structure specifying physical device properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code pNext} chain of this structure is used to extend the structure with properties defined by extensions.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}, {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}, {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}, {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV}, {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT}, {@link VkPhysicalDeviceDepthStencilResolveProperties}, {@link VkPhysicalDeviceDescriptorIndexingProperties}, {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}, {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}, {@link VkPhysicalDeviceDriverProperties}, {@link VkPhysicalDeviceDrmPropertiesEXT}, {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT}, {@link VkPhysicalDeviceFloatControlsProperties}, {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT}, {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM}, {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT}, {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV}, {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR}, {@link VkPhysicalDeviceIDProperties}, {@link VkPhysicalDeviceInlineUniformBlockProperties}, {@link VkPhysicalDeviceLineRasterizationPropertiesEXT}, {@link VkPhysicalDeviceMaintenance3Properties}, {@link VkPhysicalDeviceMaintenance4Properties}, {@link VkPhysicalDeviceMeshShaderPropertiesNV}, {@link VkPhysicalDeviceMultiDrawPropertiesEXT}, {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX}, {@link VkPhysicalDeviceMultiviewProperties}, {@link VkPhysicalDevicePCIBusInfoPropertiesEXT}, {@link VkPhysicalDevicePerformanceQueryPropertiesKHR}, {@link VkPhysicalDevicePointClippingProperties}, {@link VkPhysicalDevicePortabilitySubsetPropertiesKHR}, {@link VkPhysicalDeviceProtectedMemoryProperties}, {@link VkPhysicalDeviceProvokingVertexPropertiesEXT}, {@link VkPhysicalDevicePushDescriptorPropertiesKHR}, {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}, {@link VkPhysicalDeviceRayTracingPropertiesNV}, {@link VkPhysicalDeviceRobustness2PropertiesEXT}, {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}, {@link VkPhysicalDeviceSamplerFilterMinmaxProperties}, {@link VkPhysicalDeviceShaderCoreProperties2AMD}, {@link VkPhysicalDeviceShaderCorePropertiesAMD}, {@link VkPhysicalDeviceShaderIntegerDotProductProperties}, {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV}, {@link VkPhysicalDeviceShadingRateImagePropertiesNV}, {@link VkPhysicalDeviceSubgroupProperties}, {@link VkPhysicalDeviceSubgroupSizeControlProperties}, {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI}, {@link VkPhysicalDeviceTexelBufferAlignmentProperties}, {@link VkPhysicalDeviceTimelineSemaphoreProperties}, {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}, {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}, {@link VkPhysicalDeviceVulkan11Properties}, {@link VkPhysicalDeviceVulkan12Properties}, or {@link VkPhysicalDeviceVulkan13Properties}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceProperties}, {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceProperties2KHR GetPhysicalDeviceProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkPhysicalDeviceProperties VkPhysicalDeviceProperties} {@link #properties};
 * }</code></pre>
 */
public class VkPhysicalDeviceProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceProperties.SIZEOF, VkPhysicalDeviceProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProperties2(ByteBuffer container) {
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
    /** a {@link VkPhysicalDeviceProperties} structure describing properties of the physical device. This structure is written with the same values as if it were written by {@link VK10#vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}. */
    public VkPhysicalDeviceProperties properties() { return nproperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2} value to the {@link #sType} field. */
    public VkPhysicalDeviceProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceAccelerationStructurePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceConservativeRasterizationPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCooperativeMatrixPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceCustomBorderColorPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthStencilResolveProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDepthStencilResolveProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDepthStencilResolvePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorIndexingProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDescriptorIndexingPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDiscardRectanglePropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDriverProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDriverProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDriverPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDriverPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceDrmPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceDrmPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceExternalMemoryHostPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFloatControlsProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFloatControlsProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFloatControlsPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFloatControlsPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentDensityMapPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceFragmentShadingRatePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIDProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceIDProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceIDPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceIDPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceInlineUniformBlockProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceInlineUniformBlockPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceLineRasterizationPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance3Properties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance3Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance3PropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance3PropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Properties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance4Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMaintenance4PropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMaintenance4PropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMeshShaderPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMeshShaderPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiDrawPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiDrawPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceMultiviewPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceMultiviewPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePCIBusInfoPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePCIBusInfoPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePerformanceQueryPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePointClippingProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePointClippingProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePointClippingPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePointClippingPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePortabilitySubsetPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceProtectedMemoryProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceProvokingVertexPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDevicePushDescriptorPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDevicePushDescriptorPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingPipelinePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRayTracingPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRayTracingPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceRobustness2PropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceRobustness2PropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSampleLocationsPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerFilterMinmaxProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSamplerFilterMinmaxProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderCoreProperties2AMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCoreProperties2AMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderCorePropertiesAMD} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderCorePropertiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderIntegerDotProductProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceShadingRateImagePropertiesNV} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceShadingRateImagePropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupSizeControlProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTexelBufferAlignmentProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreProperties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTimelineSemaphoreProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphorePropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTimelineSemaphorePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceTransformFeedbackPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan11Properties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan11Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan12Properties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan12Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceVulkan13Properties} value to the {@code pNext} chain. */
    public VkPhysicalDeviceProperties2 pNext(VkPhysicalDeviceVulkan13Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProperties2 set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceProperties2 set(VkPhysicalDeviceProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties2 malloc() {
        return wrap(VkPhysicalDeviceProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties2 calloc() {
        return wrap(VkPhysicalDeviceProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance for the specified memory address. */
    public static VkPhysicalDeviceProperties2 create(long address) {
        return wrap(VkPhysicalDeviceProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProperties2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties2 malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties2 calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProperties2.PNEXT); }
    /** Unsafe version of {@link #properties}. */
    public static VkPhysicalDeviceProperties nproperties(long struct) { return VkPhysicalDeviceProperties.create(struct + VkPhysicalDeviceProperties2.PROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProperties2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProperties2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProperties2 ELEMENT_FACTORY = VkPhysicalDeviceProperties2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProperties2.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProperties2.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceProperties} view of the {@link VkPhysicalDeviceProperties2#properties} field. */
        public VkPhysicalDeviceProperties properties() { return VkPhysicalDeviceProperties2.nproperties(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceProperties2#sType} field. */
        public VkPhysicalDeviceProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2} value to the {@link VkPhysicalDeviceProperties2#sType} field. */
        public VkPhysicalDeviceProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkPhysicalDeviceProperties2#pNext} field. */
        public VkPhysicalDeviceProperties2.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProperties2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceAccelerationStructurePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceConservativeRasterizationPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceCooperativeMatrixPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceCustomBorderColorPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthStencilResolveProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDepthStencilResolveProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDepthStencilResolvePropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDepthStencilResolvePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDescriptorIndexingPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDiscardRectanglePropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDriverProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDriverProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDriverPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDriverPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceDrmPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceDrmPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceExternalMemoryHostPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFloatControlsProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFloatControlsProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFloatControlsPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFloatControlsPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFragmentDensityMapPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceFragmentShadingRatePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIDProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceIDProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceIDPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceIDPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceInlineUniformBlockPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceLineRasterizationPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceLineRasterizationPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance3Properties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMaintenance3Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance3PropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMaintenance3PropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4Properties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMaintenance4Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMaintenance4PropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMaintenance4PropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMeshShaderPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMeshShaderPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiDrawPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMultiDrawPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMultiviewProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceMultiviewPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceMultiviewPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePCIBusInfoPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePCIBusInfoPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePerformanceQueryPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePerformanceQueryPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePointClippingProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePointClippingProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePointClippingPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePointClippingPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePortabilitySubsetPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePortabilitySubsetPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProtectedMemoryProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceProtectedMemoryProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceProvokingVertexPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceProvokingVertexPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDevicePushDescriptorPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDevicePushDescriptorPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceRayTracingPipelinePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRayTracingPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceRayTracingPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceRobustness2PropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceRobustness2PropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSampleLocationsPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerFilterMinmaxProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSamplerFilterMinmaxProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderCoreProperties2AMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShaderCoreProperties2AMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderCorePropertiesAMD} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShaderCorePropertiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceShadingRateImagePropertiesNV} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceShadingRateImagePropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSubgroupProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphoreProperties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceTimelineSemaphoreProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTimelineSemaphorePropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceTimelineSemaphorePropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceTransformFeedbackPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan11Properties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceVulkan11Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan12Properties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceVulkan12Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceVulkan13Properties} value to the {@code pNext} chain. */
        public VkPhysicalDeviceProperties2.Buffer pNext(VkPhysicalDeviceVulkan13Properties value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}