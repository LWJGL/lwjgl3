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
 * Structure describing what extended dynamic state is supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExtendedDynamicState3FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #extendedDynamicState3TessellationDomainOrigin};
 *     VkBool32 {@link #extendedDynamicState3DepthClampEnable};
 *     VkBool32 {@link #extendedDynamicState3PolygonMode};
 *     VkBool32 {@link #extendedDynamicState3RasterizationSamples};
 *     VkBool32 {@link #extendedDynamicState3SampleMask};
 *     VkBool32 {@link #extendedDynamicState3AlphaToCoverageEnable};
 *     VkBool32 {@link #extendedDynamicState3AlphaToOneEnable};
 *     VkBool32 {@link #extendedDynamicState3LogicOpEnable};
 *     VkBool32 {@link #extendedDynamicState3ColorBlendEnable};
 *     VkBool32 {@link #extendedDynamicState3ColorBlendEquation};
 *     VkBool32 {@link #extendedDynamicState3ColorWriteMask};
 *     VkBool32 {@link #extendedDynamicState3RasterizationStream};
 *     VkBool32 {@link #extendedDynamicState3ConservativeRasterizationMode};
 *     VkBool32 {@link #extendedDynamicState3ExtraPrimitiveOverestimationSize};
 *     VkBool32 {@link #extendedDynamicState3DepthClipEnable};
 *     VkBool32 {@link #extendedDynamicState3SampleLocationsEnable};
 *     VkBool32 {@link #extendedDynamicState3ColorBlendAdvanced};
 *     VkBool32 {@link #extendedDynamicState3ProvokingVertexMode};
 *     VkBool32 {@link #extendedDynamicState3LineRasterizationMode};
 *     VkBool32 {@link #extendedDynamicState3LineStippleEnable};
 *     VkBool32 {@link #extendedDynamicState3DepthClipNegativeOneToOne};
 *     VkBool32 {@link #extendedDynamicState3ViewportWScalingEnable};
 *     VkBool32 {@link #extendedDynamicState3ViewportSwizzle};
 *     VkBool32 {@link #extendedDynamicState3CoverageToColorEnable};
 *     VkBool32 {@link #extendedDynamicState3CoverageToColorLocation};
 *     VkBool32 {@link #extendedDynamicState3CoverageModulationMode};
 *     VkBool32 {@link #extendedDynamicState3CoverageModulationTableEnable};
 *     VkBool32 {@link #extendedDynamicState3CoverageModulationTable};
 *     VkBool32 {@link #extendedDynamicState3CoverageReductionMode};
 *     VkBool32 {@link #extendedDynamicState3RepresentativeFragmentTestEnable};
 *     VkBool32 {@link #extendedDynamicState3ShadingRateImageEnable};
 * }</code></pre>
 */
public class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN,
        EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE,
        EXTENDEDDYNAMICSTATE3POLYGONMODE,
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES,
        EXTENDEDDYNAMICSTATE3SAMPLEMASK,
        EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE,
        EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE,
        EXTENDEDDYNAMICSTATE3LOGICOPENABLE,
        EXTENDEDDYNAMICSTATE3COLORBLENDENABLE,
        EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION,
        EXTENDEDDYNAMICSTATE3COLORWRITEMASK,
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM,
        EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE,
        EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE,
        EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE,
        EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE,
        EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED,
        EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE,
        EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE,
        EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE,
        EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE,
        EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE,
        EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE,
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE,
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION,
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE,
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE,
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE,
        EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE,
        EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE,
        EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE;

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
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN = layout.offsetof(2);
        EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE = layout.offsetof(3);
        EXTENDEDDYNAMICSTATE3POLYGONMODE = layout.offsetof(4);
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES = layout.offsetof(5);
        EXTENDEDDYNAMICSTATE3SAMPLEMASK = layout.offsetof(6);
        EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE = layout.offsetof(7);
        EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE = layout.offsetof(8);
        EXTENDEDDYNAMICSTATE3LOGICOPENABLE = layout.offsetof(9);
        EXTENDEDDYNAMICSTATE3COLORBLENDENABLE = layout.offsetof(10);
        EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION = layout.offsetof(11);
        EXTENDEDDYNAMICSTATE3COLORWRITEMASK = layout.offsetof(12);
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM = layout.offsetof(13);
        EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE = layout.offsetof(14);
        EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(15);
        EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE = layout.offsetof(16);
        EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE = layout.offsetof(17);
        EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED = layout.offsetof(18);
        EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE = layout.offsetof(19);
        EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE = layout.offsetof(20);
        EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE = layout.offsetof(21);
        EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE = layout.offsetof(22);
        EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE = layout.offsetof(23);
        EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE = layout.offsetof(24);
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE = layout.offsetof(25);
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION = layout.offsetof(26);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE = layout.offsetof(27);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE = layout.offsetof(28);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE = layout.offsetof(29);
        EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE = layout.offsetof(30);
        EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE = layout.offsetof(31);
        EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE = layout.offsetof(32);
    }

    protected VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3TessellationDomainOrigin() { return nextendedDynamicState3TessellationDomainOrigin(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClampEnable() { return nextendedDynamicState3DepthClampEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_POLYGON_MODE_EXT DYNAMIC_STATE_POLYGON_MODE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3PolygonMode() { return nextendedDynamicState3PolygonMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationSamples() { return nextendedDynamicState3RasterizationSamples(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_MASK_EXT DYNAMIC_STATE_SAMPLE_MASK_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3SampleMask() { return nextendedDynamicState3SampleMask(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToCoverageEnable() { return nextendedDynamicState3AlphaToCoverageEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToOneEnable() { return nextendedDynamicState3AlphaToOneEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3LogicOpEnable() { return nextendedDynamicState3LogicOpEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEnable() { return nextendedDynamicState3ColorBlendEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEquation() { return nextendedDynamicState3ColorBlendEquation(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT DYNAMIC_STATE_COLOR_WRITE_MASK_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorWriteMask() { return nextendedDynamicState3ColorWriteMask(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT DYNAMIC_STATE_RASTERIZATION_STREAM_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationStream() { return nextendedDynamicState3RasterizationStream(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ConservativeRasterizationMode() { return nextendedDynamicState3ConservativeRasterizationMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() { return nextendedDynamicState3ExtraPrimitiveOverestimationSize(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipEnable() { return nextendedDynamicState3DepthClipEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3SampleLocationsEnable() { return nextendedDynamicState3SampleLocationsEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendAdvanced() { return nextendedDynamicState3ColorBlendAdvanced(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ProvokingVertexMode() { return nextendedDynamicState3ProvokingVertexMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3LineRasterizationMode() { return nextendedDynamicState3LineRasterizationMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3LineStippleEnable() { return nextendedDynamicState3LineStippleEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipNegativeOneToOne() { return nextendedDynamicState3DepthClipNegativeOneToOne(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportWScalingEnable() { return nextendedDynamicState3ViewportWScalingEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportSwizzle() { return nextendedDynamicState3ViewportSwizzle(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorEnable() { return nextendedDynamicState3CoverageToColorEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorLocation() { return nextendedDynamicState3CoverageToColorLocation(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationMode() { return nextendedDynamicState3CoverageModulationMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTableEnable() { return nextendedDynamicState3CoverageModulationTableEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTable() { return nextendedDynamicState3CoverageModulationTable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageReductionMode() { return nextendedDynamicState3CoverageReductionMode(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3RepresentativeFragmentTestEnable() { return nextendedDynamicState3RepresentativeFragmentTestEnable(address()) != 0; }
    /**
     * indicates that the implementation supports the following dynamic state:
     * 
     * <ul>
     * <li>{@link EXTExtendedDynamicState3#VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV}</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean extendedDynamicState3ShadingRateImageEnable() { return nextendedDynamicState3ShadingRateImageEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType$Default() { return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3TessellationDomainOrigin} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(@NativeType("VkBool32") boolean value) { nextendedDynamicState3TessellationDomainOrigin(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3DepthClampEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3DepthClampEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3PolygonMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3PolygonMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3RasterizationSamples} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(@NativeType("VkBool32") boolean value) { nextendedDynamicState3RasterizationSamples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3SampleMask} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(@NativeType("VkBool32") boolean value) { nextendedDynamicState3SampleMask(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3AlphaToCoverageEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3AlphaToCoverageEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3AlphaToOneEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3AlphaToOneEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3LogicOpEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3LogicOpEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ColorBlendEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ColorBlendEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ColorBlendEquation} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ColorBlendEquation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ColorWriteMask} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ColorWriteMask(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3RasterizationStream} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(@NativeType("VkBool32") boolean value) { nextendedDynamicState3RasterizationStream(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ConservativeRasterizationMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ConservativeRasterizationMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ExtraPrimitiveOverestimationSize} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ExtraPrimitiveOverestimationSize(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3DepthClipEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3DepthClipEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3SampleLocationsEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3SampleLocationsEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ColorBlendAdvanced} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ColorBlendAdvanced(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ProvokingVertexMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ProvokingVertexMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3LineRasterizationMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3LineRasterizationMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3LineStippleEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3LineStippleEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3DepthClipNegativeOneToOne} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(@NativeType("VkBool32") boolean value) { nextendedDynamicState3DepthClipNegativeOneToOne(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ViewportWScalingEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ViewportWScalingEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ViewportSwizzle} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ViewportSwizzle(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageToColorEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageToColorEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageToColorLocation} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageToColorLocation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageModulationMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageModulationMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageModulationTableEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageModulationTable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageModulationTable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3CoverageReductionMode} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(@NativeType("VkBool32") boolean value) { nextendedDynamicState3CoverageReductionMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3RepresentativeFragmentTestEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3RepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #extendedDynamicState3ShadingRateImageEnable} field. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(@NativeType("VkBool32") boolean value) { nextendedDynamicState3ShadingRateImageEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(
        int sType,
        long pNext,
        boolean extendedDynamicState3TessellationDomainOrigin,
        boolean extendedDynamicState3DepthClampEnable,
        boolean extendedDynamicState3PolygonMode,
        boolean extendedDynamicState3RasterizationSamples,
        boolean extendedDynamicState3SampleMask,
        boolean extendedDynamicState3AlphaToCoverageEnable,
        boolean extendedDynamicState3AlphaToOneEnable,
        boolean extendedDynamicState3LogicOpEnable,
        boolean extendedDynamicState3ColorBlendEnable,
        boolean extendedDynamicState3ColorBlendEquation,
        boolean extendedDynamicState3ColorWriteMask,
        boolean extendedDynamicState3RasterizationStream,
        boolean extendedDynamicState3ConservativeRasterizationMode,
        boolean extendedDynamicState3ExtraPrimitiveOverestimationSize,
        boolean extendedDynamicState3DepthClipEnable,
        boolean extendedDynamicState3SampleLocationsEnable,
        boolean extendedDynamicState3ColorBlendAdvanced,
        boolean extendedDynamicState3ProvokingVertexMode,
        boolean extendedDynamicState3LineRasterizationMode,
        boolean extendedDynamicState3LineStippleEnable,
        boolean extendedDynamicState3DepthClipNegativeOneToOne,
        boolean extendedDynamicState3ViewportWScalingEnable,
        boolean extendedDynamicState3ViewportSwizzle,
        boolean extendedDynamicState3CoverageToColorEnable,
        boolean extendedDynamicState3CoverageToColorLocation,
        boolean extendedDynamicState3CoverageModulationMode,
        boolean extendedDynamicState3CoverageModulationTableEnable,
        boolean extendedDynamicState3CoverageModulationTable,
        boolean extendedDynamicState3CoverageReductionMode,
        boolean extendedDynamicState3RepresentativeFragmentTestEnable,
        boolean extendedDynamicState3ShadingRateImageEnable
    ) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState3TessellationDomainOrigin(extendedDynamicState3TessellationDomainOrigin);
        extendedDynamicState3DepthClampEnable(extendedDynamicState3DepthClampEnable);
        extendedDynamicState3PolygonMode(extendedDynamicState3PolygonMode);
        extendedDynamicState3RasterizationSamples(extendedDynamicState3RasterizationSamples);
        extendedDynamicState3SampleMask(extendedDynamicState3SampleMask);
        extendedDynamicState3AlphaToCoverageEnable(extendedDynamicState3AlphaToCoverageEnable);
        extendedDynamicState3AlphaToOneEnable(extendedDynamicState3AlphaToOneEnable);
        extendedDynamicState3LogicOpEnable(extendedDynamicState3LogicOpEnable);
        extendedDynamicState3ColorBlendEnable(extendedDynamicState3ColorBlendEnable);
        extendedDynamicState3ColorBlendEquation(extendedDynamicState3ColorBlendEquation);
        extendedDynamicState3ColorWriteMask(extendedDynamicState3ColorWriteMask);
        extendedDynamicState3RasterizationStream(extendedDynamicState3RasterizationStream);
        extendedDynamicState3ConservativeRasterizationMode(extendedDynamicState3ConservativeRasterizationMode);
        extendedDynamicState3ExtraPrimitiveOverestimationSize(extendedDynamicState3ExtraPrimitiveOverestimationSize);
        extendedDynamicState3DepthClipEnable(extendedDynamicState3DepthClipEnable);
        extendedDynamicState3SampleLocationsEnable(extendedDynamicState3SampleLocationsEnable);
        extendedDynamicState3ColorBlendAdvanced(extendedDynamicState3ColorBlendAdvanced);
        extendedDynamicState3ProvokingVertexMode(extendedDynamicState3ProvokingVertexMode);
        extendedDynamicState3LineRasterizationMode(extendedDynamicState3LineRasterizationMode);
        extendedDynamicState3LineStippleEnable(extendedDynamicState3LineStippleEnable);
        extendedDynamicState3DepthClipNegativeOneToOne(extendedDynamicState3DepthClipNegativeOneToOne);
        extendedDynamicState3ViewportWScalingEnable(extendedDynamicState3ViewportWScalingEnable);
        extendedDynamicState3ViewportSwizzle(extendedDynamicState3ViewportSwizzle);
        extendedDynamicState3CoverageToColorEnable(extendedDynamicState3CoverageToColorEnable);
        extendedDynamicState3CoverageToColorLocation(extendedDynamicState3CoverageToColorLocation);
        extendedDynamicState3CoverageModulationMode(extendedDynamicState3CoverageModulationMode);
        extendedDynamicState3CoverageModulationTableEnable(extendedDynamicState3CoverageModulationTableEnable);
        extendedDynamicState3CoverageModulationTable(extendedDynamicState3CoverageModulationTable);
        extendedDynamicState3CoverageReductionMode(extendedDynamicState3CoverageReductionMode);
        extendedDynamicState3RepresentativeFragmentTestEnable(extendedDynamicState3RepresentativeFragmentTestEnable);
        extendedDynamicState3ShadingRateImageEnable(extendedDynamicState3ShadingRateImageEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #extendedDynamicState3TessellationDomainOrigin}. */
    public static int nextendedDynamicState3TessellationDomainOrigin(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClampEnable}. */
    public static int nextendedDynamicState3DepthClampEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3PolygonMode}. */
    public static int nextendedDynamicState3PolygonMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3POLYGONMODE); }
    /** Unsafe version of {@link #extendedDynamicState3RasterizationSamples}. */
    public static int nextendedDynamicState3RasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES); }
    /** Unsafe version of {@link #extendedDynamicState3SampleMask}. */
    public static int nextendedDynamicState3SampleMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLEMASK); }
    /** Unsafe version of {@link #extendedDynamicState3AlphaToCoverageEnable}. */
    public static int nextendedDynamicState3AlphaToCoverageEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3AlphaToOneEnable}. */
    public static int nextendedDynamicState3AlphaToOneEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3LogicOpEnable}. */
    public static int nextendedDynamicState3LogicOpEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LOGICOPENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendEnable}. */
    public static int nextendedDynamicState3ColorBlendEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendEquation}. */
    public static int nextendedDynamicState3ColorBlendEquation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION); }
    /** Unsafe version of {@link #extendedDynamicState3ColorWriteMask}. */
    public static int nextendedDynamicState3ColorWriteMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORWRITEMASK); }
    /** Unsafe version of {@link #extendedDynamicState3RasterizationStream}. */
    public static int nextendedDynamicState3RasterizationStream(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM); }
    /** Unsafe version of {@link #extendedDynamicState3ConservativeRasterizationMode}. */
    public static int nextendedDynamicState3ConservativeRasterizationMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE); }
    /** Unsafe version of {@link #extendedDynamicState3ExtraPrimitiveOverestimationSize}. */
    public static int nextendedDynamicState3ExtraPrimitiveOverestimationSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClipEnable}. */
    public static int nextendedDynamicState3DepthClipEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3SampleLocationsEnable}. */
    public static int nextendedDynamicState3SampleLocationsEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendAdvanced}. */
    public static int nextendedDynamicState3ColorBlendAdvanced(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED); }
    /** Unsafe version of {@link #extendedDynamicState3ProvokingVertexMode}. */
    public static int nextendedDynamicState3ProvokingVertexMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE); }
    /** Unsafe version of {@link #extendedDynamicState3LineRasterizationMode}. */
    public static int nextendedDynamicState3LineRasterizationMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE); }
    /** Unsafe version of {@link #extendedDynamicState3LineStippleEnable}. */
    public static int nextendedDynamicState3LineStippleEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClipNegativeOneToOne}. */
    public static int nextendedDynamicState3DepthClipNegativeOneToOne(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE); }
    /** Unsafe version of {@link #extendedDynamicState3ViewportWScalingEnable}. */
    public static int nextendedDynamicState3ViewportWScalingEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3ViewportSwizzle}. */
    public static int nextendedDynamicState3ViewportSwizzle(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageToColorEnable}. */
    public static int nextendedDynamicState3CoverageToColorEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageToColorLocation}. */
    public static int nextendedDynamicState3CoverageToColorLocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationMode}. */
    public static int nextendedDynamicState3CoverageModulationMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationTableEnable}. */
    public static int nextendedDynamicState3CoverageModulationTableEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationTable}. */
    public static int nextendedDynamicState3CoverageModulationTable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageReductionMode}. */
    public static int nextendedDynamicState3CoverageReductionMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE); }
    /** Unsafe version of {@link #extendedDynamicState3RepresentativeFragmentTestEnable}. */
    public static int nextendedDynamicState3RepresentativeFragmentTestEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE); }
    /** Unsafe version of {@link #extendedDynamicState3ShadingRateImageEnable}. */
    public static int nextendedDynamicState3ShadingRateImageEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #extendedDynamicState3TessellationDomainOrigin(boolean) extendedDynamicState3TessellationDomainOrigin}. */
    public static void nextendedDynamicState3TessellationDomainOrigin(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN, value); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClampEnable(boolean) extendedDynamicState3DepthClampEnable}. */
    public static void nextendedDynamicState3DepthClampEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3PolygonMode(boolean) extendedDynamicState3PolygonMode}. */
    public static void nextendedDynamicState3PolygonMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3POLYGONMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3RasterizationSamples(boolean) extendedDynamicState3RasterizationSamples}. */
    public static void nextendedDynamicState3RasterizationSamples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES, value); }
    /** Unsafe version of {@link #extendedDynamicState3SampleMask(boolean) extendedDynamicState3SampleMask}. */
    public static void nextendedDynamicState3SampleMask(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLEMASK, value); }
    /** Unsafe version of {@link #extendedDynamicState3AlphaToCoverageEnable(boolean) extendedDynamicState3AlphaToCoverageEnable}. */
    public static void nextendedDynamicState3AlphaToCoverageEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3AlphaToOneEnable(boolean) extendedDynamicState3AlphaToOneEnable}. */
    public static void nextendedDynamicState3AlphaToOneEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3LogicOpEnable(boolean) extendedDynamicState3LogicOpEnable}. */
    public static void nextendedDynamicState3LogicOpEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LOGICOPENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendEnable(boolean) extendedDynamicState3ColorBlendEnable}. */
    public static void nextendedDynamicState3ColorBlendEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendEquation(boolean) extendedDynamicState3ColorBlendEquation}. */
    public static void nextendedDynamicState3ColorBlendEquation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION, value); }
    /** Unsafe version of {@link #extendedDynamicState3ColorWriteMask(boolean) extendedDynamicState3ColorWriteMask}. */
    public static void nextendedDynamicState3ColorWriteMask(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORWRITEMASK, value); }
    /** Unsafe version of {@link #extendedDynamicState3RasterizationStream(boolean) extendedDynamicState3RasterizationStream}. */
    public static void nextendedDynamicState3RasterizationStream(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM, value); }
    /** Unsafe version of {@link #extendedDynamicState3ConservativeRasterizationMode(boolean) extendedDynamicState3ConservativeRasterizationMode}. */
    public static void nextendedDynamicState3ConservativeRasterizationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ExtraPrimitiveOverestimationSize(boolean) extendedDynamicState3ExtraPrimitiveOverestimationSize}. */
    public static void nextendedDynamicState3ExtraPrimitiveOverestimationSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE, value); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClipEnable(boolean) extendedDynamicState3DepthClipEnable}. */
    public static void nextendedDynamicState3DepthClipEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3SampleLocationsEnable(boolean) extendedDynamicState3SampleLocationsEnable}. */
    public static void nextendedDynamicState3SampleLocationsEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ColorBlendAdvanced(boolean) extendedDynamicState3ColorBlendAdvanced}. */
    public static void nextendedDynamicState3ColorBlendAdvanced(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED, value); }
    /** Unsafe version of {@link #extendedDynamicState3ProvokingVertexMode(boolean) extendedDynamicState3ProvokingVertexMode}. */
    public static void nextendedDynamicState3ProvokingVertexMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3LineRasterizationMode(boolean) extendedDynamicState3LineRasterizationMode}. */
    public static void nextendedDynamicState3LineRasterizationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3LineStippleEnable(boolean) extendedDynamicState3LineStippleEnable}. */
    public static void nextendedDynamicState3LineStippleEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3DepthClipNegativeOneToOne(boolean) extendedDynamicState3DepthClipNegativeOneToOne}. */
    public static void nextendedDynamicState3DepthClipNegativeOneToOne(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ViewportWScalingEnable(boolean) extendedDynamicState3ViewportWScalingEnable}. */
    public static void nextendedDynamicState3ViewportWScalingEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ViewportSwizzle(boolean) extendedDynamicState3ViewportSwizzle}. */
    public static void nextendedDynamicState3ViewportSwizzle(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageToColorEnable(boolean) extendedDynamicState3CoverageToColorEnable}. */
    public static void nextendedDynamicState3CoverageToColorEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageToColorLocation(boolean) extendedDynamicState3CoverageToColorLocation}. */
    public static void nextendedDynamicState3CoverageToColorLocation(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationMode(boolean) extendedDynamicState3CoverageModulationMode}. */
    public static void nextendedDynamicState3CoverageModulationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationTableEnable(boolean) extendedDynamicState3CoverageModulationTableEnable}. */
    public static void nextendedDynamicState3CoverageModulationTableEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageModulationTable(boolean) extendedDynamicState3CoverageModulationTable}. */
    public static void nextendedDynamicState3CoverageModulationTable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3CoverageReductionMode(boolean) extendedDynamicState3CoverageReductionMode}. */
    public static void nextendedDynamicState3CoverageReductionMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE, value); }
    /** Unsafe version of {@link #extendedDynamicState3RepresentativeFragmentTestEnable(boolean) extendedDynamicState3RepresentativeFragmentTestEnable}. */
    public static void nextendedDynamicState3RepresentativeFragmentTestEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE, value); }
    /** Unsafe version of {@link #extendedDynamicState3ShadingRateImageEnable(boolean) extendedDynamicState3ShadingRateImageEnable}. */
    public static void nextendedDynamicState3ShadingRateImageEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedDynamicState3FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3TessellationDomainOrigin} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3TessellationDomainOrigin() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClampEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClampEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3PolygonMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3PolygonMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RasterizationSamples} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationSamples() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3SampleMask} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3SampleMask() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3AlphaToCoverageEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToCoverageEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3AlphaToOneEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToOneEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LogicOpEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3LogicOpEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendEquation} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEquation() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorWriteMask} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorWriteMask() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RasterizationStream} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationStream() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ConservativeRasterizationMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ConservativeRasterizationMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ExtraPrimitiveOverestimationSize} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClipEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3SampleLocationsEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3SampleLocationsEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendAdvanced} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendAdvanced() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ProvokingVertexMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ProvokingVertexMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LineRasterizationMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3LineRasterizationMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LineStippleEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3LineStippleEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClipNegativeOneToOne} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipNegativeOneToOne() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ViewportWScalingEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportWScalingEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ViewportSwizzle} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportSwizzle() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageToColorEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageToColorLocation} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorLocation() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationTableEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTableEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationTable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageReductionMode} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageReductionMode() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RepresentativeFragmentTestEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3RepresentativeFragmentTestEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ShadingRateImageEnable} field. */
        @NativeType("VkBool32")
        public boolean extendedDynamicState3ShadingRateImageEnable() { return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTExtendedDynamicState3#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT} value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#sType} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer sType$Default() { return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3TessellationDomainOrigin} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3TessellationDomainOrigin(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClampEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClampEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3PolygonMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3PolygonMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RasterizationSamples} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RasterizationSamples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3SampleMask} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3SampleMask(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3AlphaToCoverageEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3AlphaToCoverageEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3AlphaToOneEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3AlphaToOneEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LogicOpEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LogicOpEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendEquation} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendEquation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorWriteMask} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorWriteMask(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RasterizationStream} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RasterizationStream(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ConservativeRasterizationMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ConservativeRasterizationMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ExtraPrimitiveOverestimationSize} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ExtraPrimitiveOverestimationSize(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClipEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClipEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3SampleLocationsEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3SampleLocationsEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ColorBlendAdvanced} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ColorBlendAdvanced(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ProvokingVertexMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ProvokingVertexMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LineRasterizationMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LineRasterizationMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3LineStippleEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3LineStippleEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3DepthClipNegativeOneToOne} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3DepthClipNegativeOneToOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ViewportWScalingEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ViewportWScalingEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ViewportSwizzle} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ViewportSwizzle(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageToColorEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageToColorEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageToColorLocation} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageToColorLocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationTableEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationTableEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageModulationTable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageModulationTable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3CoverageReductionMode} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3CoverageReductionMode(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3RepresentativeFragmentTestEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3RepresentativeFragmentTestEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExtendedDynamicState3FeaturesEXT#extendedDynamicState3ShadingRateImageEnable} field. */
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.Buffer extendedDynamicState3ShadingRateImageEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(address(), value ? 1 : 0); return this; }

    }

}