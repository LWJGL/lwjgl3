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
 * Structure describing the Vulkan 1.4 features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan14Features} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVulkan14Features} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan14Features {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #globalPriorityQuery};
 *     VkBool32 {@link #shaderSubgroupRotate};
 *     VkBool32 {@link #shaderSubgroupRotateClustered};
 *     VkBool32 {@link #shaderFloatControls2};
 *     VkBool32 {@link #shaderExpectAssume};
 *     VkBool32 {@link #rectangularLines};
 *     VkBool32 {@link #bresenhamLines};
 *     VkBool32 {@link #smoothLines};
 *     VkBool32 {@link #stippledRectangularLines};
 *     VkBool32 {@link #stippledBresenhamLines};
 *     VkBool32 {@link #stippledSmoothLines};
 *     VkBool32 {@link #vertexAttributeInstanceRateDivisor};
 *     VkBool32 {@link #vertexAttributeInstanceRateZeroDivisor};
 *     VkBool32 {@link #indexTypeUint8};
 *     VkBool32 {@link #dynamicRenderingLocalRead};
 *     VkBool32 {@link #maintenance5};
 *     VkBool32 {@link #maintenance6};
 *     VkBool32 {@link #pipelineProtectedAccess};
 *     VkBool32 {@link #pipelineRobustness};
 *     VkBool32 {@link #hostImageCopy};
 *     VkBool32 {@link #pushDescriptor};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan14Features extends Struct<VkPhysicalDeviceVulkan14Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GLOBALPRIORITYQUERY,
        SHADERSUBGROUPROTATE,
        SHADERSUBGROUPROTATECLUSTERED,
        SHADERFLOATCONTROLS2,
        SHADEREXPECTASSUME,
        RECTANGULARLINES,
        BRESENHAMLINES,
        SMOOTHLINES,
        STIPPLEDRECTANGULARLINES,
        STIPPLEDBRESENHAMLINES,
        STIPPLEDSMOOTHLINES,
        VERTEXATTRIBUTEINSTANCERATEDIVISOR,
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR,
        INDEXTYPEUINT8,
        DYNAMICRENDERINGLOCALREAD,
        MAINTENANCE5,
        MAINTENANCE6,
        PIPELINEPROTECTEDACCESS,
        PIPELINEROBUSTNESS,
        HOSTIMAGECOPY,
        PUSHDESCRIPTOR;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GLOBALPRIORITYQUERY = layout.offsetof(2);
        SHADERSUBGROUPROTATE = layout.offsetof(3);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(4);
        SHADERFLOATCONTROLS2 = layout.offsetof(5);
        SHADEREXPECTASSUME = layout.offsetof(6);
        RECTANGULARLINES = layout.offsetof(7);
        BRESENHAMLINES = layout.offsetof(8);
        SMOOTHLINES = layout.offsetof(9);
        STIPPLEDRECTANGULARLINES = layout.offsetof(10);
        STIPPLEDBRESENHAMLINES = layout.offsetof(11);
        STIPPLEDSMOOTHLINES = layout.offsetof(12);
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(13);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(14);
        INDEXTYPEUINT8 = layout.offsetof(15);
        DYNAMICRENDERINGLOCALREAD = layout.offsetof(16);
        MAINTENANCE5 = layout.offsetof(17);
        MAINTENANCE6 = layout.offsetof(18);
        PIPELINEPROTECTEDACCESS = layout.offsetof(19);
        PIPELINEROBUSTNESS = layout.offsetof(20);
        HOSTIMAGECOPY = layout.offsetof(21);
        PUSHDESCRIPTOR = layout.offsetof(22);
    }

    protected VkPhysicalDeviceVulkan14Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan14Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan14Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan14Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan14Features(ByteBuffer container) {
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
    /** indicates whether the implementation supports the ability to query global queue priorities. */
    @NativeType("VkBool32")
    public boolean globalPriorityQuery() { return nglobalPriorityQuery(address()) != 0; }
    /** specifies whether shader modules <b>can</b> declare the {@code GroupNonUniformRotateKHR} capability. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotate() { return nshaderSubgroupRotate(address()) != 0; }
    /** specifies whether shader modules <b>can</b> use the {@code ClusterSize} operand to {@code OpGroupNonUniformRotateKHR}. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() { return nshaderSubgroupRotateClustered(address()) != 0; }
    /** specifies whether shader modules <b>can</b> declare the {@code FloatControls2} capability. */
    @NativeType("VkBool32")
    public boolean shaderFloatControls2() { return nshaderFloatControls2(address()) != 0; }
    /** specifies whether shader modules <b>can</b> declare the {@code ExpectAssumeKHR} capability. */
    @NativeType("VkBool32")
    public boolean shaderExpectAssume() { return nshaderExpectAssume(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines">rectangular line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean rectangularLines() { return nrectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-bresenham">Bresenham-style line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean bresenhamLines() { return nbresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-smooth">smooth line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean smoothLines() { return nsmoothLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link VK14#VK_LINE_RASTERIZATION_MODE_RECTANGULAR LINE_RASTERIZATION_MODE_RECTANGULAR} lines. */
    @NativeType("VkBool32")
    public boolean stippledRectangularLines() { return nstippledRectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link VK14#VK_LINE_RASTERIZATION_MODE_BRESENHAM LINE_RASTERIZATION_MODE_BRESENHAM} lines. */
    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() { return nstippledBresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link VK14#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH} lines. */
    @NativeType("VkBool32")
    public boolean stippledSmoothLines() { return nstippledSmoothLines(address()) != 0; }
    /** specifies whether vertex attribute fetching may be repeated in the case of instanced rendering. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() { return nvertexAttributeInstanceRateDivisor(address()) != 0; }
    /** specifies whether a zero value for {@link VkVertexInputBindingDivisorDescriptionEXT}{@code ::divisor} is supported. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() { return nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }
    /** indicates that {@link VK14#VK_INDEX_TYPE_UINT8 INDEX_TYPE_UINT8} can be used with {@link VK14#vkCmdBindIndexBuffer2 CmdBindIndexBuffer2} and {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}. */
    @NativeType("VkBool32")
    public boolean indexTypeUint8() { return nindexTypeUint8(address()) != 0; }
    /** specifies that the implementation supports local reads inside dynamic render pass instances using the {@link VK13#vkCmdBeginRendering CmdBeginRendering} command. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalRead() { return ndynamicRenderingLocalRead(address()) != 0; }
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>The ability to expose support for the optional format {@link VK14#VK_FORMAT_A1B5G5R5_UNORM_PACK16 FORMAT_A1B5G5R5_UNORM_PACK16}.</li>
     * <li>The ability to expose support for the optional format {@link VK14#VK_FORMAT_A8_UNORM FORMAT_A8_UNORM}.</li>
     * <li>A property to indicate that multisample coverage operations are performed after sample counting in EarlyFragmentTests mode.</li>
     * <li>Creating a {@code VkBufferView} with a subset of the associated {@code VkBuffer} usage using {@link VkBufferUsageFlags2CreateInfo}.</li>
     * <li>A new function {@link VK14#vkCmdBindIndexBuffer2 CmdBindIndexBuffer2}, allowing a range of memory to be bound as an index buffer.</li>
     * <li>{@link VK10#vkGetDeviceProcAddr GetDeviceProcAddr} will return {@code NULL} for function pointers of core functions for versions higher than the version requested by the application.</li>
     * <li>{@link VK13#vkCmdBindVertexBuffers2 CmdBindVertexBuffers2} supports using {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} in the {@code pSizes} parameter.</li>
     * <li>If {@code PointSize} is not written, a default value of {@code 1.0} is used for the size of points.</li>
     * <li>{@link VkShaderModuleCreateInfo} <b>can</b> be added as a chained structure to pipeline creation via {@link VkPipelineShaderStageCreateInfo}, rather than having to create a shader module.</li>
     * <li>A function {@link VK14#vkGetRenderingAreaGranularity GetRenderingAreaGranularity} to query the optimal render area for a dynamic rendering instance.</li>
     * <li>A property to indicate that depth/stencil texturing operations with {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE} have defined behavior.</li>
     * <li>{@link VK14#vkGetDeviceImageSubresourceLayout GetDeviceImageSubresourceLayout} allows an application to perform a {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout} query without having to create an image.</li>
     * <li>{@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} as the {@code layerCount} member of {@link VkImageSubresourceLayers}.</li>
     * <li>A property to indicate whether {@code PointSize} controls the final rasterization of polygons if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#primsrast-polygonmode">polygon mode</a> is {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT}.</li>
     * <li>Two properties to indicate the non-strict line rasterization algorithm used.</li>
     * <li>Two new flags words {@code VkPipelineCreateFlagBits2} and {@code VkBufferUsageFlagBits2}.</li>
     * <li>Physical-device-level functions <b>can</b> now be called with any value in the valid range for a type beyond the defined enumerants, such that applications can avoid checking individual features, extensions, or versions before querying supported properties of a particular enumerant.</li>
     * <li>Copies between images of any type are allowed, with 1D images treated as 2D images with a height of 1.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance5() { return nmaintenance5(address()) != 0; }
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>{@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>can</b> be used when binding an index buffer</li>
     * <li>{@link VkBindMemoryStatus} <b>can</b> be included in the {@code pNext} chain of the {@link VkBindBufferMemoryInfo} and {@link VkBindImageMemoryInfo} structures, enabling applications to retrieve {@code VkResult} values for individual memory binding operations.</li>
     * <li>{@link VkPhysicalDeviceMaintenance6Properties}{@code ::blockTexelViewCompatibleMultipleLayers} property to indicate that the implementation supports creating image views with {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} where the {@code layerCount} member of {@code subresourceRange} is greater than 1.</li>
     * <li>{@link VkPhysicalDeviceMaintenance6Properties}{@code ::maxCombinedImageSamplerDescriptorCount} property which indicates the maximum descriptor size required for any <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation.</li>
     * <li>A {@link VkPhysicalDeviceMaintenance6Properties}{@code ::fragmentShadingRateClampCombinerInputs} property which indicates whether the implementation clamps the inputs to fragment shading rate combiner operations.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance6() { return nmaintenance6(address()) != 0; }
    /** indicates whether the implementation supports specifying protected access on individual pipelines. */
    @NativeType("VkBool32")
    public boolean pipelineProtectedAccess() { return npipelineProtectedAccess(address()) != 0; }
    /** indicates that robustness <b>can</b> be requested on a per-pipeline-stage granularity. */
    @NativeType("VkBool32")
    public boolean pipelineRobustness() { return npipelineRobustness(address()) != 0; }
    /** indicates that the implementation supports copying from host memory to images using the {@link VK14#vkCopyMemoryToImage CopyMemoryToImage} command, copying from images to host memory using the {@link VK14#vkCopyImageToMemory CopyImageToMemory} command, and copying between images using the {@link VK14#vkCopyImageToImage CopyImageToImage} command. */
    @NativeType("VkBool32")
    public boolean hostImageCopy() { return nhostImageCopy(address()) != 0; }
    /** indicates that the implementation supports push descriptors. */
    @NativeType("VkBool32")
    public boolean pushDescriptor() { return npushDescriptor(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan14Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan14Features sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan14Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #globalPriorityQuery} field. */
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(@NativeType("VkBool32") boolean value) { nglobalPriorityQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupRotate} field. */
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupRotateClustered} field. */
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderFloatControls2} field. */
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(@NativeType("VkBool32") boolean value) { nshaderFloatControls2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderExpectAssume} field. */
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(@NativeType("VkBool32") boolean value) { nshaderExpectAssume(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rectangularLines} field. */
    public VkPhysicalDeviceVulkan14Features rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bresenhamLines} field. */
    public VkPhysicalDeviceVulkan14Features bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #smoothLines} field. */
    public VkPhysicalDeviceVulkan14Features smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledRectangularLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledBresenhamLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledSmoothLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vertexAttributeInstanceRateDivisor} field. */
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vertexAttributeInstanceRateZeroDivisor} field. */
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #indexTypeUint8} field. */
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(@NativeType("VkBool32") boolean value) { nindexTypeUint8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dynamicRenderingLocalRead} field. */
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maintenance5} field. */
    public VkPhysicalDeviceVulkan14Features maintenance5(@NativeType("VkBool32") boolean value) { nmaintenance5(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maintenance6} field. */
    public VkPhysicalDeviceVulkan14Features maintenance6(@NativeType("VkBool32") boolean value) { nmaintenance6(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pipelineProtectedAccess} field. */
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { npipelineProtectedAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pipelineRobustness} field. */
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(@NativeType("VkBool32") boolean value) { npipelineRobustness(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #hostImageCopy} field. */
    public VkPhysicalDeviceVulkan14Features hostImageCopy(@NativeType("VkBool32") boolean value) { nhostImageCopy(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pushDescriptor} field. */
    public VkPhysicalDeviceVulkan14Features pushDescriptor(@NativeType("VkBool32") boolean value) { npushDescriptor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan14Features set(
        int sType,
        long pNext,
        boolean globalPriorityQuery,
        boolean shaderSubgroupRotate,
        boolean shaderSubgroupRotateClustered,
        boolean shaderFloatControls2,
        boolean shaderExpectAssume,
        boolean rectangularLines,
        boolean bresenhamLines,
        boolean smoothLines,
        boolean stippledRectangularLines,
        boolean stippledBresenhamLines,
        boolean stippledSmoothLines,
        boolean vertexAttributeInstanceRateDivisor,
        boolean vertexAttributeInstanceRateZeroDivisor,
        boolean indexTypeUint8,
        boolean dynamicRenderingLocalRead,
        boolean maintenance5,
        boolean maintenance6,
        boolean pipelineProtectedAccess,
        boolean pipelineRobustness,
        boolean hostImageCopy,
        boolean pushDescriptor
    ) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);
        shaderFloatControls2(shaderFloatControls2);
        shaderExpectAssume(shaderExpectAssume);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        indexTypeUint8(indexTypeUint8);
        dynamicRenderingLocalRead(dynamicRenderingLocalRead);
        maintenance5(maintenance5);
        maintenance6(maintenance6);
        pipelineProtectedAccess(pipelineProtectedAccess);
        pipelineRobustness(pipelineRobustness);
        hostImageCopy(hostImageCopy);
        pushDescriptor(pushDescriptor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan14Features set(VkPhysicalDeviceVulkan14Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Features malloc() {
        return new VkPhysicalDeviceVulkan14Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Features calloc() {
        return new VkPhysicalDeviceVulkan14Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan14Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan14Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan14Features create(long address) {
        return new VkPhysicalDeviceVulkan14Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan14Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan14Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan14Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan14Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan14Features.PNEXT); }
    /** Unsafe version of {@link #globalPriorityQuery}. */
    public static int nglobalPriorityQuery(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY); }
    /** Unsafe version of {@link #shaderSubgroupRotate}. */
    public static int nshaderSubgroupRotate(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered}. */
    public static int nshaderSubgroupRotateClustered(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED); }
    /** Unsafe version of {@link #shaderFloatControls2}. */
    public static int nshaderFloatControls2(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2); }
    /** Unsafe version of {@link #shaderExpectAssume}. */
    public static int nshaderExpectAssume(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME); }
    /** Unsafe version of {@link #rectangularLines}. */
    public static int nrectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.RECTANGULARLINES); }
    /** Unsafe version of {@link #bresenhamLines}. */
    public static int nbresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.BRESENHAMLINES); }
    /** Unsafe version of {@link #smoothLines}. */
    public static int nsmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SMOOTHLINES); }
    /** Unsafe version of {@link #stippledRectangularLines}. */
    public static int nstippledRectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES); }
    /** Unsafe version of {@link #stippledBresenhamLines}. */
    public static int nstippledBresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES); }
    /** Unsafe version of {@link #stippledSmoothLines}. */
    public static int nstippledSmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor}. */
    public static int nvertexAttributeInstanceRateDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor}. */
    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR); }
    /** Unsafe version of {@link #indexTypeUint8}. */
    public static int nindexTypeUint8(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead}. */
    public static int ndynamicRenderingLocalRead(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD); }
    /** Unsafe version of {@link #maintenance5}. */
    public static int nmaintenance5(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE5); }
    /** Unsafe version of {@link #maintenance6}. */
    public static int nmaintenance6(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE6); }
    /** Unsafe version of {@link #pipelineProtectedAccess}. */
    public static int npipelineProtectedAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS); }
    /** Unsafe version of {@link #pipelineRobustness}. */
    public static int npipelineRobustness(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS); }
    /** Unsafe version of {@link #hostImageCopy}. */
    public static int nhostImageCopy(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY); }
    /** Unsafe version of {@link #pushDescriptor}. */
    public static int npushDescriptor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan14Features.PNEXT, value); }
    /** Unsafe version of {@link #globalPriorityQuery(boolean) globalPriorityQuery}. */
    public static void nglobalPriorityQuery(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY, value); }
    /** Unsafe version of {@link #shaderSubgroupRotate(boolean) shaderSubgroupRotate}. */
    public static void nshaderSubgroupRotate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE, value); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered(boolean) shaderSubgroupRotateClustered}. */
    public static void nshaderSubgroupRotateClustered(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED, value); }
    /** Unsafe version of {@link #shaderFloatControls2(boolean) shaderFloatControls2}. */
    public static void nshaderFloatControls2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2, value); }
    /** Unsafe version of {@link #shaderExpectAssume(boolean) shaderExpectAssume}. */
    public static void nshaderExpectAssume(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME, value); }
    /** Unsafe version of {@link #rectangularLines(boolean) rectangularLines}. */
    public static void nrectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.RECTANGULARLINES, value); }
    /** Unsafe version of {@link #bresenhamLines(boolean) bresenhamLines}. */
    public static void nbresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.BRESENHAMLINES, value); }
    /** Unsafe version of {@link #smoothLines(boolean) smoothLines}. */
    public static void nsmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SMOOTHLINES, value); }
    /** Unsafe version of {@link #stippledRectangularLines(boolean) stippledRectangularLines}. */
    public static void nstippledRectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES, value); }
    /** Unsafe version of {@link #stippledBresenhamLines(boolean) stippledBresenhamLines}. */
    public static void nstippledBresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES, value); }
    /** Unsafe version of {@link #stippledSmoothLines(boolean) stippledSmoothLines}. */
    public static void nstippledSmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor(boolean) vertexAttributeInstanceRateDivisor}. */
    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor(boolean) vertexAttributeInstanceRateZeroDivisor}. */
    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value); }
    /** Unsafe version of {@link #indexTypeUint8(boolean) indexTypeUint8}. */
    public static void nindexTypeUint8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8, value); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead(boolean) dynamicRenderingLocalRead}. */
    public static void ndynamicRenderingLocalRead(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD, value); }
    /** Unsafe version of {@link #maintenance5(boolean) maintenance5}. */
    public static void nmaintenance5(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE5, value); }
    /** Unsafe version of {@link #maintenance6(boolean) maintenance6}. */
    public static void nmaintenance6(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE6, value); }
    /** Unsafe version of {@link #pipelineProtectedAccess(boolean) pipelineProtectedAccess}. */
    public static void npipelineProtectedAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS, value); }
    /** Unsafe version of {@link #pipelineRobustness(boolean) pipelineRobustness}. */
    public static void npipelineRobustness(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS, value); }
    /** Unsafe version of {@link #hostImageCopy(boolean) hostImageCopy}. */
    public static void nhostImageCopy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY, value); }
    /** Unsafe version of {@link #pushDescriptor(boolean) pushDescriptor}. */
    public static void npushDescriptor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan14Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan14Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan14Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan14Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan14Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan14Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan14Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan14Features.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan14Features.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#globalPriorityQuery} field. */
        @NativeType("VkBool32")
        public boolean globalPriorityQuery() { return VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#shaderSubgroupRotate} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() { return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#shaderSubgroupRotateClustered} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() { return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#shaderFloatControls2} field. */
        @NativeType("VkBool32")
        public boolean shaderFloatControls2() { return VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#shaderExpectAssume} field. */
        @NativeType("VkBool32")
        public boolean shaderExpectAssume() { return VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#rectangularLines} field. */
        @NativeType("VkBool32")
        public boolean rectangularLines() { return VkPhysicalDeviceVulkan14Features.nrectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#bresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean bresenhamLines() { return VkPhysicalDeviceVulkan14Features.nbresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#smoothLines} field. */
        @NativeType("VkBool32")
        public boolean smoothLines() { return VkPhysicalDeviceVulkan14Features.nsmoothLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#stippledRectangularLines} field. */
        @NativeType("VkBool32")
        public boolean stippledRectangularLines() { return VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#stippledBresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() { return VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#stippledSmoothLines} field. */
        @NativeType("VkBool32")
        public boolean stippledSmoothLines() { return VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#vertexAttributeInstanceRateDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#vertexAttributeInstanceRateZeroDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#indexTypeUint8} field. */
        @NativeType("VkBool32")
        public boolean indexTypeUint8() { return VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#dynamicRenderingLocalRead} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalRead() { return VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#maintenance5} field. */
        @NativeType("VkBool32")
        public boolean maintenance5() { return VkPhysicalDeviceVulkan14Features.nmaintenance5(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#maintenance6} field. */
        @NativeType("VkBool32")
        public boolean maintenance6() { return VkPhysicalDeviceVulkan14Features.nmaintenance6(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#pipelineProtectedAccess} field. */
        @NativeType("VkBool32")
        public boolean pipelineProtectedAccess() { return VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#pipelineRobustness} field. */
        @NativeType("VkBool32")
        public boolean pipelineRobustness() { return VkPhysicalDeviceVulkan14Features.npipelineRobustness(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#hostImageCopy} field. */
        @NativeType("VkBool32")
        public boolean hostImageCopy() { return VkPhysicalDeviceVulkan14Features.nhostImageCopy(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan14Features#pushDescriptor} field. */
        @NativeType("VkBool32")
        public boolean pushDescriptor() { return VkPhysicalDeviceVulkan14Features.npushDescriptor(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#sType} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Features.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES} value to the {@link VkPhysicalDeviceVulkan14Features#sType} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#pNext} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan14Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#globalPriorityQuery} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#shaderSubgroupRotate} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#shaderSubgroupRotateClustered} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#shaderFloatControls2} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#shaderExpectAssume} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#rectangularLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#bresenhamLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#smoothLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#stippledRectangularLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#stippledBresenhamLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#stippledSmoothLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#vertexAttributeInstanceRateDivisor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#vertexAttributeInstanceRateZeroDivisor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#indexTypeUint8} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#dynamicRenderingLocalRead} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#maintenance5} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer maintenance5(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nmaintenance5(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#maintenance6} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer maintenance6(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nmaintenance6(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#pipelineProtectedAccess} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#pipelineRobustness} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npipelineRobustness(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#hostImageCopy} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer hostImageCopy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nhostImageCopy(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan14Features#pushDescriptor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pushDescriptor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npushDescriptor(address(), value ? 1 : 0); return this; }

    }

}