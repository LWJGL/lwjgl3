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
 * <li>If the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan11Features} structure, then it <b>must</b> not include a {@link VkPhysicalDevice16BitStorageFeatures}, {@link VkPhysicalDeviceMultiviewFeatures}, {@link VkPhysicalDeviceVariablePointersFeatures}, {@link VkPhysicalDeviceProtectedMemoryFeatures}, {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures}, or {@link VkPhysicalDeviceShaderDrawParametersFeatures} structure</li>
 * <li>If the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then it <b>must</b> not include a {@link VkPhysicalDevice8BitStorageFeatures}, {@link VkPhysicalDeviceShaderAtomicInt64Features}, {@link VkPhysicalDeviceShaderFloat16Int8Features}, {@link VkPhysicalDeviceDescriptorIndexingFeatures}, {@link VkPhysicalDeviceScalarBlockLayoutFeatures}, {@link VkPhysicalDeviceImagelessFramebufferFeatures}, {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures}, {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures}, {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures}, {@link VkPhysicalDeviceHostQueryResetFeatures}, {@link VkPhysicalDeviceTimelineSemaphoreFeatures}, {@link VkPhysicalDeviceBufferDeviceAddressFeatures}, or {@link VkPhysicalDeviceVulkanMemoryModelFeatures} structure</li>
 * <li>If {@code ppEnabledExtensions} contains code:"VK_KHR_draw_indirect_count" and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::drawIndirectCount} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains code:"VK_KHR_sampler_mirror_clamp_to_edge" and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::samplerMirrorClampToEdge} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains code:"VK_EXT_descriptor_indexing" and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::descriptorIndexing} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains code:"VK_EXT_sampler_filter_minmax" and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::samplerFilterMinmax} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code ppEnabledExtensions} contains code:"VK_EXT_shader_viewport_index_layer" and the {@code pNext} chain includes a {@link VkPhysicalDeviceVulkan12Features} structure, then {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputViewportIndex} and {@link VkPhysicalDeviceVulkan12Features}{@code ::shaderOutputLayer} <b>must</b> both be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupDeviceCreateInfo}, {@link VkDeviceMemoryOverallocationCreateInfoAMD}, {@link VkPhysicalDevice16BitStorageFeatures}, {@link VkPhysicalDevice8BitStorageFeatures}, {@link VkPhysicalDeviceASTCDecodeFeaturesEXT}, {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT}, {@link VkPhysicalDeviceBufferDeviceAddressFeatures}, {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}, {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD}, {@link VkPhysicalDeviceComputeShaderDerivativesFeaturesNV}, {@link VkPhysicalDeviceConditionalRenderingFeaturesEXT}, {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV}, {@link VkPhysicalDeviceCornerSampledImageFeaturesNV}, {@link VkPhysicalDeviceCoverageReductionModeFeaturesNV}, {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV}, {@link VkPhysicalDeviceDepthClipEnableFeaturesEXT}, {@link VkPhysicalDeviceDescriptorIndexingFeatures}, {@link VkPhysicalDeviceExclusiveScissorFeaturesNV}, {@link VkPhysicalDeviceFeatures2}, {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT}, {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV}, {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT}, {@link VkPhysicalDeviceHostQueryResetFeatures}, {@link VkPhysicalDeviceImagelessFramebufferFeatures}, {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT}, {@link VkPhysicalDeviceInlineUniformBlockFeaturesEXT}, {@link VkPhysicalDeviceLineRasterizationFeaturesEXT}, {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT}, {@link VkPhysicalDeviceMeshShaderFeaturesNV}, {@link VkPhysicalDeviceMultiviewFeatures}, {@link VkPhysicalDevicePerformanceQueryFeaturesKHR}, {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR}, {@link VkPhysicalDeviceProtectedMemoryFeatures}, {@link VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV}, {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures}, {@link VkPhysicalDeviceScalarBlockLayoutFeatures}, {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures}, {@link VkPhysicalDeviceShaderAtomicInt64Features}, {@link VkPhysicalDeviceShaderClockFeaturesKHR}, {@link VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT}, {@link VkPhysicalDeviceShaderDrawParametersFeatures}, {@link VkPhysicalDeviceShaderFloat16Int8Features}, {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV}, {@link VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL}, {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV}, {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures}, {@link VkPhysicalDeviceShadingRateImageFeaturesNV}, {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT}, {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT}, {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT}, {@link VkPhysicalDeviceTimelineSemaphoreFeatures}, {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}, {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures}, {@link VkPhysicalDeviceVariablePointersFeatures}, {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT}, {@link VkPhysicalDeviceVulkan11Features}, {@link VkPhysicalDeviceVulkan12Features}, {@link VkPhysicalDeviceVulkanMemoryModelFeatures}, or {@link VkPhysicalDeviceYcbcrImageArraysFeaturesEXT}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code queueCreateInfoCount} &ndash; the unsigned integer size of the {@code pQueueCreateInfos} array. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-queue-creation">Queue Creation</a> section below for further details.</li>
 * <li>{@code pQueueCreateInfos} &ndash; a pointer to an array of {@link VkDeviceQueueCreateInfo} structures describing the queues that are requested to be created along with the logical device. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-queue-creation">Queue Creation</a> section below for further details.</li>
 * <li>{@code enabledLayerCount} &ndash; deprecated and ignored.</li>
 * <li>{@code ppEnabledLayerNames} &ndash; deprecated and ignored. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-layers-devicelayerdeprecation">Device Layer Deprecation</a>.</li>
 * <li>{@code enabledExtensionCount} &ndash; the number of device extensions to enable.</li>
 * <li>{@code ppEnabledExtensionNames} &ndash; a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable for the created device. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-extensions">Extensions</a> section for further details.</li>
 * <li>{@code pEnabledFeatures} &ndash; {@code NULL} or a pointer to a {@link VkPhysicalDeviceFeatures} structure containing boolean indicators of all the features to be enabled. Refer to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features">Features</a> section for further details.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkDeviceCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code queueCreateInfoCount} field. */
    @NativeType("uint32_t")
    public int queueCreateInfoCount() { return nqueueCreateInfoCount(address()); }
    /** Returns a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
    @NativeType("VkDeviceQueueCreateInfo const *")
    public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() { return npQueueCreateInfos(address()); }
    /** Returns the value of the {@code enabledLayerCount} field. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** Returns the value of the {@code enabledExtensionCount} field. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }
    /** Returns a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
    @Nullable
    @NativeType("VkPhysicalDeviceFeatures const *")
    public VkPhysicalDeviceFeatures pEnabledFeatures() { return npEnabledFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDeviceCreateInfo flags(@NativeType("VkDeviceCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
    public VkDeviceCreateInfo pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) { npQueueCreateInfos(address(), value); return this; }
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

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkDeviceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkDeviceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDeviceCreateFlags")
        public int flags() { return VkDeviceCreateInfo.nflags(address()); }
        /** Returns the value of the {@code queueCreateInfoCount} field. */
        @NativeType("uint32_t")
        public int queueCreateInfoCount() { return VkDeviceCreateInfo.nqueueCreateInfoCount(address()); }
        /** Returns a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
        @NativeType("VkDeviceQueueCreateInfo const *")
        public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() { return VkDeviceCreateInfo.npQueueCreateInfos(address()); }
        /** Returns the value of the {@code enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkDeviceCreateInfo.nenabledLayerCount(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledLayerNames() { return VkDeviceCreateInfo.nppEnabledLayerNames(address()); }
        /** Returns the value of the {@code enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkDeviceCreateInfo.nenabledExtensionCount(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledExtensionNames() { return VkDeviceCreateInfo.nppEnabledExtensionNames(address()); }
        /** Returns a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
        @Nullable
        @NativeType("VkPhysicalDeviceFeatures const *")
        public VkPhysicalDeviceFeatures pEnabledFeatures() { return VkDeviceCreateInfo.npEnabledFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceCreateInfo.Buffer flags(@NativeType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
        public VkDeviceCreateInfo.Buffer pQueueCreateInfos(@NativeType("VkDeviceQueueCreateInfo const *") VkDeviceQueueCreateInfo.Buffer value) { VkDeviceCreateInfo.npQueueCreateInfos(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
        public VkDeviceCreateInfo.Buffer ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkDeviceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@code pEnabledFeatures} field. */
        public VkDeviceCreateInfo.Buffer pEnabledFeatures(@Nullable @NativeType("VkPhysicalDeviceFeatures const *") VkPhysicalDeviceFeatures value) { VkDeviceCreateInfo.npEnabledFeatures(address(), value); return this; }

    }

}