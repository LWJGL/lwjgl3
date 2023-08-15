/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Optical flow are fundamental algorithms in computer vision (CV) area. This extension allows applications to estimate 2D displacement of pixels between two frames.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension is designed to be used with upcoming NVIDIA Optical Flow SDK Version 5 which will be available on NVIDIA Developer webpage.</p>
 * </div>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 * // Example querying available input formats
 * VkOpticalFlowImageFormatInfoNV ofFormatInfo = { VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV };
 * ofFormatInfo.usage = VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV;
 * 
 * uint32_t count = 0;
 * vkGetPhysicalDeviceOpticalFlowImageFormatsNV(physicalDevice, &amp;ofFormatInfo, &amp;count, NULL);
 * VkOpticalFlowImageFormatPropertiesNV* fmt = new VkOpticalFlowImageFormatPropertiesNV[count];
 * memset(fmt, 0, count  * sizeof(VkOpticalFlowImageFormatPropertiesNV));
 * for (uint32_t i = 0; i &lt; count; i++) {
 *     fmt[i].sType = VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV;
 * }
 * vkGetPhysicalDeviceOpticalFlowImageFormatsNV(physicalDevice, &amp;ofFormatInfo, &amp;count, fmt);
 * 
 * // Pick one of the available formats
 * VkFormat inputFormat = fmt[0].format;
 * 
 * // Check feature support for optimal tiling
 * VkFormatProperties3 formatProperties3 = { VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 };
 * VkFormatProperties2 formatProperties2 = { VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2, &amp;formatProperties3 };
 * vkGetPhysicalDeviceFormatProperties2(physicalDevice, inputFormat, &amp;formatProperties2);
 * if (!(formatProperties3.optimalTilingFeatures &amp; VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV)) {
 *     return false;
 * }
 * 
 * // Check support for image creation parameters
 * VkPhysicalDeviceImageFormatInfo2 imageFormatInfo2 = { VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2, &amp;ofFormatInfo };
 * imageFormatInfo2.format = inputFormat;
 * imageFormatInfo2.type = VK_IMAGE_TYPE_2D;
 * imageFormatInfo2.tiling = VK_IMAGE_TILING_OPTIMAL;
 * imageFormatInfo2.usage = VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_DST_BIT;
 * 
 * VkImageFormatProperties2 imageFormatProperties2 = { VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 };
 * if (vkGetPhysicalDeviceImageFormatProperties2(physicalDevice, &amp;imageFormatInfo2, &amp;imageFormatProperties2) != VK_SUCCESS) {
 *     return false;
 * }
 * 
 * VkImageCreateInfo imageCreateInfo = { VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO, &amp;ofFormatInfo };
 * imageCreateInfo.imageType = VK_IMAGE_TYPE_2D;
 * imageCreateInfo.format = inputFormat;
 * imageCreateInfo.extent = { width, height, (uint32_t)1};
 * imageCreateInfo.mipLevels = 1;
 * imageCreateInfo.arrayLayers = 1;
 * imageCreateInfo.samples = VK_SAMPLE_COUNT_1_BIT;
 * imageCreateInfo.usage = VK_IMAGE_USAGE_SAMPLED_BIT | VK_IMAGE_USAGE_TRANSFER_DST_BIT;;
 * imageCreateInfo.tiling = VK_IMAGE_TILING_OPTIMAL;
 * 
 * vkCreateImage(device, &amp;imageCreateInfo, NULL, &amp;input);
 * "allocate memory, bind image, create view"
 * 
 * "do the same for reference and output"
 * 
 * // Create optical flow session
 * VkOpticalFlowSessionCreateInfoNV sessionCreateInfo = { VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV };
 * sessionCreateInfo.width = width;
 * sessionCreateInfo.height = height;
 * sessionCreateInfo.imageFormat = inputFormat;
 * sessionCreateInfo.flowVectorFormat = outputFormat;
 * sessionCreateInfo.outputGridSize = VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV;
 * sessionCreateInfo.performanceLevel = VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV;
 * VkOpticalFlowSessionNV session;
 * vkCreateOpticalFlowSessionNV(device, &amp;sessionCreateInfo, NULL, &amp;session);
 * 
 * "allocate command buffer"
 * 
 * "transfer images to VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV"
 * "transfer input images to VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV and output image to VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV"
 * 
 * vkBindOpticalFlowSessionImageNV(device, session, VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV, inputView, VK_IMAGE_LAYOUT_GENERAL);
 * vkBindOpticalFlowSessionImageNV(device, session, VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV, refView, VK_IMAGE_LAYOUT_GENERAL);
 * vkBindOpticalFlowSessionImageNV(device, session, VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV, outputView, VK_IMAGE_LAYOUT_GENERAL);
 * 
 * VkOpticalFlowExecuteInfoNV opticalFlowExecuteInfo = { VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV };
 * vkCmdOpticalFlowExecuteNV(cmd, session, &amp;opticalFlowExecuteInfo);
 * 
 * "submit command buffer"</code></pre>
 * 
 * <h5>VK_NV_optical_flow</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_optical_flow}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>465</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRFormatFeatureFlags2 VK_KHR_format_feature_flags2} and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Carsten Rohde <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_optical_flow]%20@crohde%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_optical_flow%20extension*">crohde</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-09-26</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Carsten Rohde, NVIDIA</li>
 * <li>Vipul Parashar, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVOpticalFlow {

    /** The extension specification version. */
    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV         = 1000464000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV       = 1000464001,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV                = 1000464002,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV          = 1000464003,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV              = 1000464004,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV                     = 1000464005,
        VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;

    /** Extends {@code VkFormat}. */
    public static final int VK_FORMAT_R16G16_S10_5_NV = 1000464000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;

    /** Extends {@code VkQueueFlagBits}. */
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 0x100;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 0x20000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV ACCESS_2_OPTICAL_FLOW_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV  = 0x40000000000L,
        VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 0x80000000000L;

    /**
     * Extends {@code VkFormatFeatureFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV}</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV}</li>
     * <li>{@link #VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV  = 0x10000000000L,
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 0x20000000000L,
        VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV   = 0x40000000000L;

    /**
     * VkOpticalFlowGridSizeFlagBitsNV - Bits specifying grid sizes for optical flow operations
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV} specifies that grid is 1x1 pixel.</li>
     * <li>{@link #VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV} specifies that grid is 2x2 pixel.</li>
     * <li>{@link #VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV} specifies that grid is 4x4 pixel.</li>
     * <li>{@link #VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV} specifies that grid is 8x8 pixel.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV}</li>
     * </ul>
     */
    public static final int
        VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0,
        VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 0x1,
        VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 0x2,
        VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 0x4,
        VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 0x8;

    /**
     * VkOpticalFlowUsageFlagBitsNV - Bits specifying usage for optical flow operations
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV OPTICAL_FLOW_USAGE_INPUT_BIT_NV} specifies that the image <b>can</b> be used as input or reference frame for an optical flow operation.</li>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV} specifies that the image <b>can</b> be used as output flow vector map for an optical flow operation.</li>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV OPTICAL_FLOW_USAGE_HINT_BIT_NV} specifies that the image <b>can</b> be used as hint flow vector map for an optical flow operation.</li>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_COST_BIT_NV OPTICAL_FLOW_USAGE_COST_BIT_NV} specifies that the image <b>can</b> be used as output cost map for an optical flow operation.</li>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV} specifies that the image <b>can</b> be used as global flow vector for an optical flow operation.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV OPTICAL_FLOW_USAGE_UNKNOWN_NV}</li>
     * </ul>
     */
    public static final int
        VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV         = 0,
        VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV       = 0x1,
        VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV      = 0x2,
        VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV        = 0x4,
        VK_OPTICAL_FLOW_USAGE_COST_BIT_NV        = 0x8,
        VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 0x10;

    /**
     * VkOpticalFlowPerformanceLevelNV - Optical flow performance level types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV} is a level with slower performance but higher quality.</li>
     * <li>{@link #VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV} is a level with medium performance and medium quality.</li>
     * <li>{@link #VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV} is a preset with higher performance but lower quality.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkOpticalFlowSessionCreateInfoNV}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV}</li>
     * </ul>
     */
    public static final int
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV    = 1,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV  = 2,
        VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV    = 3;

    /**
     * VkOpticalFlowSessionBindingPointNV - Binding points of an optical flow session
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV} specifies the binding point for the input frame.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV} specifies the binding point for the input reference frame.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV} specifies the binding point for the optional external hint flow vectors.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV} specifies the binding point for output flow vectors of default forward flow calcution.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV} specifies the binding point for the optional output flow vector map of optional backward flow calcution.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV} specifies the binding point for the optional output cost map of default forward flow calcution.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV} specifies the binding point for the optional output cost map of optional backward flow calcution.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV} specifies the binding point for the optional global flow value of default forward flow calcution.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkBindOpticalFlowSessionImageNV BindOpticalFlowSessionImageNV}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV}</li>
     * </ul>
     */
    public static final int
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV              = 0,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV                = 1,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV            = 2,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV                 = 3,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV          = 4,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV                 = 6,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV        = 7,
        VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV          = 8;

    /**
     * VkOpticalFlowSessionCreateFlagBitsNV - Bits specifying flags for optical flow session
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV} specifies that a {@code VkImageView} with external flow vectors will be used as hints in performing the motion search and <b>must</b> be bound to {@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV}.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV} specifies that the cost for the forward flow is generated in a {@code VkImageView} which <b>must</b> be bound to {@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV}. Additionally, if {@link #VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV} is also set, the cost for backward flow is generated in a {@code VkImageView} which <b>must</b> be bound to {@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV}. The cost is the confidence level of the flow vector for each grid in the frame. The Cost implies how (in)accurate the flow vector is. Higher cost value implies the flow vector to be less accurate and vice-versa.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV} specifies that a global flow vector is estimated from forward flow in a single pixel {@code VkImageView} which <b>must</b> be bound to {@link #VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV}.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV} specifies that regions of interest <b>can</b> be specified in {@link VkOpticalFlowExecuteInfoNV}.</li>
     * <li>{@link #VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV} specifies that backward flow is generated in addition to forward flow which is always generated.</li>
     * </ul>
     */
    public static final int
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV        = 0x1,
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV        = 0x2,
        VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 0x4,
        VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV      = 0x8,
        VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV    = 0x10;

    /**
     * VkOpticalFlowExecuteFlagBitsNV - Bits specifying flags for a optical flow vector calculation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV} specifies that temporal hints from previously generated flow vectors are not used. If temporal hints are enabled, optical flow vectors from previous {@link #vkCmdOpticalFlowExecuteNV CmdOpticalFlowExecuteNV} call are automatically used as hints for the current {@link #vkCmdOpticalFlowExecuteNV CmdOpticalFlowExecuteNV} call, to take advantage of temporal correlation in a video sequence. Temporal hints should be disabled if there is a-priori knowledge of no temporal correlation (e.g. a scene change, independent successive frame pairs).</li>
     * </ul>
     */
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 0x1;

    protected NVOpticalFlow() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceOpticalFlowImageFormatsNV ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceOpticalFlowImageFormatsNV GetPhysicalDeviceOpticalFlowImageFormatsNV}
     *
     * @param pFormatCount a pointer to an integer related to the number of optical flow properties available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, long pOpticalFlowImageFormatInfo, long pFormatCount, long pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties, __functionAddress);
    }

    /**
     * Query image formats for optical flow.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enumerate the supported image formats for a specific optical flow usage, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkOpticalFlowImageFormatInfoNV*       pOpticalFlowImageFormatInfo,
     *     uint32_t*                                   pFormatCount,
     *     VkOpticalFlowImageFormatPropertiesNV*       pImageFormatProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pImageFormatProperties} is {@code NULL}, then the number of optical flow properties supported for the given {@code physicalDevice} is returned in {@code pFormatCount}. Otherwise, {@code pFormatCount} must point to a variable set by the user to the number of elements in the {@code pImageFormatProperties} array, and on return the variable is overwritten with the number of values actually written to {@code pImageFormatProperties}. If the value of {@code pFormatCount} is less than the number of optical flow properties supported, at most {@code pFormatCount} values will be written to {@code pImageFormatProperties}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available values were returned. Before creating an image to be used as a optical flow frame, obtain the supported image creation parameters by querying with {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} using one of the reported formats and adding {@link VkOpticalFlowImageFormatInfoNV} to the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2}. When querying the parameters with {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} for images used for optical flow operations, the {@link VkOpticalFlowImageFormatInfoNV}{@code ::usage} field should contain one or more of the bits defined in {@code VkOpticalFlowUsageFlagBitsNV}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pOpticalFlowImageFormatInfo} <b>must</b> be a valid pointer to a valid {@link VkOpticalFlowImageFormatInfoNV} structure</li>
     * <li>{@code pFormatCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pFormatCount} is not 0, and {@code pImageFormatProperties} is not {@code NULL}, {@code pImageFormatProperties} <b>must</b> be a valid pointer to an array of {@code pFormatCount} {@link VkOpticalFlowImageFormatPropertiesNV} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@link VK10#VK_FORMAT_B8G8R8A8_UNORM FORMAT_B8G8R8A8_UNORM}, {@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM} and {@link VK11#VK_FORMAT_G8_B8R8_2PLANE_420_UNORM FORMAT_G8_B8R8_2PLANE_420_UNORM} are initially supported for images with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#opticalflow-usage">optical usage</a> {@link #VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV OPTICAL_FLOW_USAGE_INPUT_BIT_NV}.</p>
     * 
     * <p>{@link #VK_FORMAT_R16G16_S10_5_NV FORMAT_R16G16_S10_5_NV} is initially supported for images with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#opticalflow-usage">optical flow usage</a> {@link #VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV}, {@link #VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV OPTICAL_FLOW_USAGE_HINT_BIT_NV} and {@link #VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV}.</p>
     * 
     * <p>{@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT} and {@link VK10#VK_FORMAT_R32_UINT FORMAT_R32_UINT} are initially supported for images with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#opticalflow-usage">optical flow usage</a> {@link #VK_OPTICAL_FLOW_USAGE_COST_BIT_NV OPTICAL_FLOW_USAGE_COST_BIT_NV}. It is recommended to use {@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT} because of the lower bandwidth.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkOpticalFlowImageFormatInfoNV}, {@link VkOpticalFlowImageFormatPropertiesNV}</p>
     *
     * @param physicalDevice              the physical device being queried.
     * @param pOpticalFlowImageFormatInfo a pointer to a {@link VkOpticalFlowImageFormatInfoNV} structure specifying the optical flow usage for which information is returned.
     * @param pFormatCount                a pointer to an integer related to the number of optical flow properties available or queried, as described below.
     * @param pImageFormatProperties      a pointer to an array of {@link VkOpticalFlowImageFormatPropertiesNV} structures in which supported formats and image parameters are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") IntBuffer pFormatCount, @Nullable @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.Buffer pImageFormatProperties) {
        if (CHECKS) {
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount.get(pFormatCount.position()));
        }
        return nvkGetPhysicalDeviceOpticalFlowImageFormatsNV(physicalDevice, pOpticalFlowImageFormatInfo.address(), memAddress(pFormatCount), memAddressSafe(pImageFormatProperties));
    }

    // --- [ vkCreateOpticalFlowSessionNV ] ---

    /** Unsafe version of: {@link #vkCreateOpticalFlowSessionNV CreateOpticalFlowSessionNV} */
    public static int nvkCreateOpticalFlowSessionNV(VkDevice device, long pCreateInfo, long pAllocator, long pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pSession, __functionAddress);
    }

    /**
     * Creates an optical flow session object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create an optical flow session object, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateOpticalFlowSessionNV(
     *     VkDevice                                    device,
     *     const VkOpticalFlowSessionCreateInfoNV*     pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkOpticalFlowSessionNV*                     pSession);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkOpticalFlowSessionCreateInfoNV} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSession} <b>must</b> be a valid pointer to a {@code VkOpticalFlowSessionNV} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkOpticalFlowSessionCreateInfoNV}</p>
     *
     * @param device      the logical device that creates the optical flow session object.
     * @param pCreateInfo a pointer to a {@link VkOpticalFlowSessionCreateInfoNV} structure containing parameters specifying the creation of the optical flow session.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pSession    a pointer to a {@code VkOpticalFlowSessionNV} handle specifying the optical flow session object which will be created by this function when it returns {@link VK10#VK_SUCCESS SUCCESS}
     */
    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") LongBuffer pSession) {
        if (CHECKS) {
            check(pSession, 1);
        }
        return nvkCreateOpticalFlowSessionNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSession));
    }

    // --- [ vkDestroyOpticalFlowSessionNV ] ---

    /** Unsafe version of: {@link #vkDestroyOpticalFlowSessionNV DestroyOpticalFlowSessionNV} */
    public static void nvkDestroyOpticalFlowSessionNV(VkDevice device, long session, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), session, pAllocator, __functionAddress);
    }

    /**
     * Destroy optical flow session object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a optical flow session object, call:</p>
     * 
     * <pre><code>
     * void vkDestroyOpticalFlowSessionNV(
     *     VkDevice                                    device,
     *     VkOpticalFlowSessionNV                      session,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code session} <b>must</b> be a valid {@code VkOpticalFlowSessionNV} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code session} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the device that was used for the creation of the optical flow session.
     * @param session    the optical flow session to be destroyed.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyOpticalFlowSessionNV(device, session, memAddressSafe(pAllocator));
    }

    // --- [ vkBindOpticalFlowSessionImageNV ] ---

    /**
     * Bind image to an optical flow session.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind a vulkan image to an optical flow session object, call:</p>
     * 
     * <pre><code>
     * VkResult vkBindOpticalFlowSessionImageNV(
     *     VkDevice                                    device,
     *     VkOpticalFlowSessionNV                      session,
     *     VkOpticalFlowSessionBindingPointNV          bindingPoint,
     *     VkImageView                                 view,
     *     VkImageLayout                               layout);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code session} <b>must</b> be a valid {@code VkOpticalFlowSessionNV} handle</li>
     * <li>{@code bindingPoint} <b>must</b> be a valid {@code VkOpticalFlowSessionBindingPointNV} value</li>
     * <li>If {@code view} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code view} <b>must</b> be a valid {@code VkImageView} handle</li>
     * <li>{@code layout} <b>must</b> be a valid {@code VkImageLayout} value</li>
     * <li>{@code session} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * <li>If {@code view} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device       the device which owns the optical flow session object {@code session}.
     * @param session      the optical flow session object to which the image view is to be bound.
     * @param bindingPoint specifies the binding point {@code VkOpticalFlowSessionBindingPointNV} to which the image view is bound.
     * @param view         a {@code VkImageView} to be bound.
     */
    @NativeType("VkResult")
    public static int vkBindOpticalFlowSessionImageNV(VkDevice device, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowSessionBindingPointNV") int bindingPoint, @NativeType("VkImageView") long view, @NativeType("VkImageLayout") int layout) {
        long __functionAddress = device.getCapabilities().vkBindOpticalFlowSessionImageNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(device.address(), session, bindingPoint, view, layout, __functionAddress);
    }

    // --- [ vkCmdOpticalFlowExecuteNV ] ---

    /** Unsafe version of: {@link #vkCmdOpticalFlowExecuteNV CmdOpticalFlowExecuteNV} */
    public static void nvkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, long session, long pExecuteInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdOpticalFlowExecuteNV;
        if (CHECKS) {
            check(__functionAddress);
            VkOpticalFlowExecuteInfoNV.validate(pExecuteInfo);
        }
        callPJPV(commandBuffer.address(), session, pExecuteInfo, __functionAddress);
    }

    /**
     * Calculate optical flow vectors.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Default direction of flow estimation is forward which calculates the optical flow from input frame to reference frame. Optionally backward flow estimation can be additionally calculated. An output flow vector (Vx, Vy) means that current pixel (x, y) of input frame can be found at location (x+Vx, y+Vy) in reference frame. A backward flow vector (Vx, Vy) means that current pixel (x, y) of reference frame can be found at location (x+Vx, y+Vy) in input frame.</p>
     * 
     * <p>To calculate optical flow vectors from two input frames, call:</p>
     * 
     * <pre><code>
     * void vkCmdOpticalFlowExecuteNV(
     *     VkCommandBuffer                             commandBuffer,
     *     VkOpticalFlowSessionNV                      session,
     *     const VkOpticalFlowExecuteInfoNV*           pExecuteInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code session} <b>must</b> be a valid {@code VkOpticalFlowSessionNV} handle</li>
     * <li>{@code pExecuteInfo} <b>must</b> be a valid pointer to a valid {@link VkOpticalFlowExecuteInfoNV} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support optical flow operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>Both of {@code commandBuffer}, and {@code session} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Opticalflow</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkOpticalFlowExecuteInfoNV}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param session       the optical flow session object on which this command is operating.
     * @param pExecuteInfo  Info is a pointer to a {@link VkOpticalFlowExecuteInfoNV}.
     */
    public static void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, @NativeType("VkOpticalFlowSessionNV") long session, @NativeType("VkOpticalFlowExecuteInfoNV const *") VkOpticalFlowExecuteInfoNV pExecuteInfo) {
        nvkCmdOpticalFlowExecuteNV(commandBuffer, session, pExecuteInfo.address());
    }

    /** Array version of: {@link #vkGetPhysicalDeviceOpticalFlowImageFormatsNV GetPhysicalDeviceOpticalFlowImageFormatsNV} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, @NativeType("VkOpticalFlowImageFormatInfoNV const *") VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo, @NativeType("uint32_t *") int[] pFormatCount, @Nullable @NativeType("VkOpticalFlowImageFormatPropertiesNV *") VkOpticalFlowImageFormatPropertiesNV.Buffer pImageFormatProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceOpticalFlowImageFormatsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pFormatCount, 1);
            checkSafe(pImageFormatProperties, pFormatCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pOpticalFlowImageFormatInfo.address(), pFormatCount, memAddressSafe(pImageFormatProperties), __functionAddress);
    }

    /** Array version of: {@link #vkCreateOpticalFlowSessionNV CreateOpticalFlowSessionNV} */
    @NativeType("VkResult")
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, @NativeType("VkOpticalFlowSessionCreateInfoNV const *") VkOpticalFlowSessionCreateInfoNV pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkOpticalFlowSessionNV *") long[] pSession) {
        long __functionAddress = device.getCapabilities().vkCreateOpticalFlowSessionNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pSession, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSession, __functionAddress);
    }

}