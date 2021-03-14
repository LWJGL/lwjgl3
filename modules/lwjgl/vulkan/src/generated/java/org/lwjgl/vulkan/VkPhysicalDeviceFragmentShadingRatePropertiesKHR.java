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
 * Structure describing variable fragment shading rate limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Multiplication of the combiner rates using the fragment width/height in linear space is equivalent to an addition of those values in log2 space. Some implementations inadvertently implemented an addition in linear space due to unclear requirements originating outside of this specification. This resulted in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> being added. Fortunately, this only affects situations where a rate of 1 in either dimension is combined with another rate of 1. All other combinations result in the exact same result as if multiplication was performed in linear space due to the clamping logic, and the fact that both the sum and product of 2 and 2 are equal. In many cases, this limit will not affect the correct operation of applications.</p>
 * </div>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code minFragmentShadingRateAttachmentTexelSize} &ndash; indicates minimum supported width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. Each value <b>must</b> be less than or equal to the values in {@code maxFragmentShadingRateAttachmentTexelSize}. Each value <b>must</b> be a power-of-two. It <b>must</b> be <code>(0,0)</code> if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is not supported.</li>
 * <li>{@code maxFragmentShadingRateAttachmentTexelSize} &ndash; indicates maximum supported width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. Each value <b>must</b> be greater than or equal to the values in {@code minFragmentShadingRateAttachmentTexelSize}. Each value <b>must</b> be a power-of-two. It <b>must</b> be <code>(0,0)</code> if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is not supported.</li>
 * <li>{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} &ndash; indicates the maximum ratio between the width and height of the portion of the framebuffer corresponding to each texel in a fragment shading rate attachment. {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} <b>must</b> be a power-of-two value, and <b>must</b> be less than or equal to <code>max(maxFragmentShadingRateAttachmentTexelSize.width / minFragmentShadingRateAttachmentTexelSize.height, maxFragmentShadingRateAttachmentTexelSize.height / minFragmentShadingRateAttachmentTexelSize.width)</code>. It <b>must</b> be 0 if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is not supported.</li>
 * <li>{@code primitiveFragmentShadingRateWithMultipleViewports} &ndash; specifies whether the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive fragment shading rate</a> <b>can</b> be used when multiple viewports are used. If this value is {@link VK10#VK_FALSE FALSE}, only a single viewport <b>must</b> be used, and applications <b>must</b> not write to the {@code ViewportMaskNV} or {@code ViewportIndex} built-in when setting {@code PrimitiveShadingRateKHR}. It <b>must</b> be {@link VK10#VK_FALSE FALSE} if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderOutputViewportIndex">{@code shaderOutputViewportIndex}</a> feature, the VK_EXT_shader_viewport_index_layer.html[VK_EXT_shader_viewport_index_layer] extension, or the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is not supported, or if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a> feature is not supported.</li>
 * <li>{@code layeredShadingRateAttachments} &ndash; specifies whether a shading rate attachment image view <b>can</b> be created with multiple layers. If this value is {@link VK10#VK_FALSE FALSE}, when creating an image view with a {@code usage} that includes {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}, {@code layerCount} <b>must</b> be 1. It <b>must</b> be {@link VK10#VK_FALSE FALSE} if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-multiview">{@code multiview}</a> feature, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderOutputViewportIndex">{@code shaderOutputViewportIndex}</a> feature, the VK_EXT_shader_viewport_index_layer.html[VK_EXT_shader_viewport_index_layer] extension, or the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> feature is not supported, or if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is not supported.</li>
 * <li>{@code fragmentShadingRateNonTrivialCombinerOps} &ndash; specifies whether {@code VkFragmentShadingRateCombinerOpKHR} enums other than {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR} or {@link KHRFragmentShadingRate#VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR} <b>can</b> be used. It <b>must</b> be {@link VK10#VK_FALSE FALSE} unless either the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> feature is supported.</li>
 * <li>{@code maxFragmentSize} &ndash; indicates the maximum supported width and height of a fragment. Its {@code width} and {@code height} members <b>must</b> both be power-of-two values. This limit is purely informational, and is not validated.</li>
 * <li>{@code maxFragmentSizeAspectRatio} &ndash; indicates the maximum ratio between the width and height of a fragment. {@code maxFragmentSizeAspectRatio} <b>must</b> be a power-of-two value, and <b>must</b> be less than or equal to the maximum of the {@code width} and {@code height} members of {@code maxFragmentSize}. This limit is purely informational, and is not validated.</li>
 * <li>{@code maxFragmentShadingRateCoverageSamples} &ndash; specifies the maximum number of coverage samples supported in a single fragment. {@code maxFragmentShadingRateCoverageSamples} <b>must</b> be less than or equal to the product of the {@code width} and {@code height} members of {@code maxFragmentSize}, and the sample count reported by {@code maxFragmentShadingRateRasterizationSamples}. {@code maxFragmentShadingRateCoverageSamples} <b>must</b> be less than or equal to <code>maxSampleMaskWords * 32</code> if {@code fragmentShadingRateWithShaderSampleMask} is supported. This limit is purely informational, and is not validated.</li>
 * <li>{@code maxFragmentShadingRateRasterizationSamples} &ndash; specifies the maximum sample rate supported when a fragment covers multiple pixels. This limit is purely informational, and is not validated.</li>
 * <li>{@code fragmentShadingRateWithShaderDepthStencilWrites} &ndash; specifies whether the implementation supports writing {@code FragDepth} or {@code FragStencilRefEXT} from a fragment shader for multi-pixel fragments. If this value is {@link VK10#VK_FALSE FALSE}, writing to those built-ins will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateWithSampleMask} &ndash; specifies whether the the implementation supports setting valid bits of {@link VkPipelineMultisampleStateCreateInfo}::pSampleMask to 0 for multi-pixel fragments. If this value is {@link VK10#VK_FALSE FALSE}, zeroing valid bits in the sample mask will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateWithShaderSampleMask} &ndash; specifies whether the implementation supports reading or writing {@code SampleMask} for multi-pixel fragments. If this value is {@link VK10#VK_FALSE FALSE}, using that built-in will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateWithConservativeRasterization} &ndash; specifies whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-conservativeraster">conservative rasterization</a> is supported for multi-pixel fragments. It <b>must</b> be {@link VK10#VK_FALSE FALSE} if VK_EXT_conservative_rasterization.html[VK_EXT_conservative_rasterization] is not supported. If this value is {@link VK10#VK_FALSE FALSE}, using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-conservativeraster">conservative rasterization</a> will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateWithFragmentShaderInterlock} &ndash; specifies whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shaders-fragment-shader-interlock">fragment shader interlock</a> is supported for multi-pixel fragments. It <b>must</b> be {@link VK10#VK_FALSE FALSE} if VK_EXT_fragment_shader_interlock.html[VK_EXT_fragment_shader_interlock] is not supported. If this value is {@link VK10#VK_FALSE FALSE}, using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shaders-fragment-shader-interlock">fragment shader interlock</a> will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateWithCustomSampleLocations} &ndash; specifies whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primrast-samplelocations">custom sample locations</a> are supported for multi-pixel fragments. It <b>must</b> be {@link VK10#VK_FALSE FALSE} if VK_EXT_sample_locations.html[VK_EXT_sample_locations] is not supported. If this value is {@link VK10#VK_FALSE FALSE}, using <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primrast-samplelocations">custom sample locations</a> will clamp the fragment shading rate to <code>(1,1)</code>.</li>
 * <li>{@code fragmentShadingRateStrictMultiplyCombiner} &ndash; specifies whether VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR accurately performs a multiplication or not. Implementations where this value is {@link VK10#VK_FALSE FALSE} will instead combine rates with an addition. If {@code fragmentShadingRateNonTrivialCombinerOps} is {@link VK10#VK_FALSE FALSE}, implementations <b>must</b> report this as {@link VK10#VK_FALSE FALSE}. If {@code fragmentShadingRateNonTrivialCombinerOps} is {@link VK10#VK_TRUE TRUE}, implementations <b>should</b> report this as {@link VK10#VK_TRUE TRUE}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} minFragmentShadingRateAttachmentTexelSize;
 *     {@link VkExtent2D VkExtent2D} maxFragmentShadingRateAttachmentTexelSize;
 *     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
 *     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
 *     VkBool32 layeredShadingRateAttachments;
 *     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
 *     {@link VkExtent2D VkExtent2D} maxFragmentSize;
 *     uint32_t maxFragmentSizeAspectRatio;
 *     uint32_t maxFragmentShadingRateCoverageSamples;
 *     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
 *     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
 *     VkBool32 fragmentShadingRateWithSampleMask;
 *     VkBool32 fragmentShadingRateWithShaderSampleMask;
 *     VkBool32 fragmentShadingRateWithConservativeRasterization;
 *     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
 *     VkBool32 fragmentShadingRateWithCustomSampleLocations;
 *     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE,
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE,
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO,
        PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS,
        LAYEREDSHADINGRATEATTACHMENTS,
        FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS,
        MAXFRAGMENTSIZE,
        MAXFRAGMENTSIZEASPECTRATIO,
        MAXFRAGMENTSHADINGRATECOVERAGESAMPLES,
        MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES,
        FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES,
        FRAGMENTSHADINGRATEWITHSAMPLEMASK,
        FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK,
        FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION,
        FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK,
        FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS,
        FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
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
        MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(3);
        MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO = layout.offsetof(4);
        PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS = layout.offsetof(5);
        LAYEREDSHADINGRATEATTACHMENTS = layout.offsetof(6);
        FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS = layout.offsetof(7);
        MAXFRAGMENTSIZE = layout.offsetof(8);
        MAXFRAGMENTSIZEASPECTRATIO = layout.offsetof(9);
        MAXFRAGMENTSHADINGRATECOVERAGESAMPLES = layout.offsetof(10);
        MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES = layout.offsetof(11);
        FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES = layout.offsetof(12);
        FRAGMENTSHADINGRATEWITHSAMPLEMASK = layout.offsetof(13);
        FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK = layout.offsetof(14);
        FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION = layout.offsetof(15);
        FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK = layout.offsetof(16);
        FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS = layout.offsetof(17);
        FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER = layout.offsetof(18);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code minFragmentShadingRateAttachmentTexelSize} field. */
    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() { return nminFragmentShadingRateAttachmentTexelSize(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code maxFragmentShadingRateAttachmentTexelSize} field. */
    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() { return nmaxFragmentShadingRateAttachmentTexelSize(address()); }
    /** Returns the value of the {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} field. */
    @NativeType("uint32_t")
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address()); }
    /** Returns the value of the {@code primitiveFragmentShadingRateWithMultipleViewports} field. */
    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateWithMultipleViewports() { return nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0; }
    /** Returns the value of the {@code layeredShadingRateAttachments} field. */
    @NativeType("VkBool32")
    public boolean layeredShadingRateAttachments() { return nlayeredShadingRateAttachments(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateNonTrivialCombinerOps} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateNonTrivialCombinerOps() { return nfragmentShadingRateNonTrivialCombinerOps(address()) != 0; }
    /** Returns a {@link VkExtent2D} view of the {@code maxFragmentSize} field. */
    public VkExtent2D maxFragmentSize() { return nmaxFragmentSize(address()); }
    /** Returns the value of the {@code maxFragmentSizeAspectRatio} field. */
    @NativeType("uint32_t")
    public int maxFragmentSizeAspectRatio() { return nmaxFragmentSizeAspectRatio(address()); }
    /** Returns the value of the {@code maxFragmentShadingRateCoverageSamples} field. */
    @NativeType("uint32_t")
    public int maxFragmentShadingRateCoverageSamples() { return nmaxFragmentShadingRateCoverageSamples(address()); }
    /** Returns the value of the {@code maxFragmentShadingRateRasterizationSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateRasterizationSamples() { return nmaxFragmentShadingRateRasterizationSamples(address()); }
    /** Returns the value of the {@code fragmentShadingRateWithShaderDepthStencilWrites} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderDepthStencilWrites() { return nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateWithSampleMask} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithSampleMask() { return nfragmentShadingRateWithSampleMask(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateWithShaderSampleMask} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderSampleMask() { return nfragmentShadingRateWithShaderSampleMask(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateWithConservativeRasterization} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithConservativeRasterization() { return nfragmentShadingRateWithConservativeRasterization(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateWithFragmentShaderInterlock} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithFragmentShaderInterlock() { return nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateWithCustomSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateWithCustomSampleLocations() { return nfragmentShadingRateWithCustomSampleLocations(address()) != 0; }
    /** Returns the value of the {@code fragmentShadingRateStrictMultiplyCombiner} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateStrictMultiplyCombiner() { return nfragmentShadingRateStrictMultiplyCombiner(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(
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
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #minFragmentShadingRateAttachmentTexelSize}. */
    public static VkExtent2D nminFragmentShadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentShadingRateAttachmentTexelSize}. */
    public static VkExtent2D nmaxFragmentShadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentShadingRateAttachmentTexelSizeAspectRatio}. */
    public static int nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO); }
    /** Unsafe version of {@link #primitiveFragmentShadingRateWithMultipleViewports}. */
    public static int nprimitiveFragmentShadingRateWithMultipleViewports(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS); }
    /** Unsafe version of {@link #layeredShadingRateAttachments}. */
    public static int nlayeredShadingRateAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.LAYEREDSHADINGRATEATTACHMENTS); }
    /** Unsafe version of {@link #fragmentShadingRateNonTrivialCombinerOps}. */
    public static int nfragmentShadingRateNonTrivialCombinerOps(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS); }
    /** Unsafe version of {@link #maxFragmentSize}. */
    public static VkExtent2D nmaxFragmentSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZE); }
    /** Unsafe version of {@link #maxFragmentSizeAspectRatio}. */
    public static int nmaxFragmentSizeAspectRatio(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZEASPECTRATIO); }
    /** Unsafe version of {@link #maxFragmentShadingRateCoverageSamples}. */
    public static int nmaxFragmentShadingRateCoverageSamples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATECOVERAGESAMPLES); }
    /** Unsafe version of {@link #maxFragmentShadingRateRasterizationSamples}. */
    public static int nmaxFragmentShadingRateRasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES); }
    /** Unsafe version of {@link #fragmentShadingRateWithShaderDepthStencilWrites}. */
    public static int nfragmentShadingRateWithShaderDepthStencilWrites(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES); }
    /** Unsafe version of {@link #fragmentShadingRateWithSampleMask}. */
    public static int nfragmentShadingRateWithSampleMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSAMPLEMASK); }
    /** Unsafe version of {@link #fragmentShadingRateWithShaderSampleMask}. */
    public static int nfragmentShadingRateWithShaderSampleMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK); }
    /** Unsafe version of {@link #fragmentShadingRateWithConservativeRasterization}. */
    public static int nfragmentShadingRateWithConservativeRasterization(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION); }
    /** Unsafe version of {@link #fragmentShadingRateWithFragmentShaderInterlock}. */
    public static int nfragmentShadingRateWithFragmentShaderInterlock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK); }
    /** Unsafe version of {@link #fragmentShadingRateWithCustomSampleLocations}. */
    public static int nfragmentShadingRateWithCustomSampleLocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS); }
    /** Unsafe version of {@link #fragmentShadingRateStrictMultiplyCombiner}. */
    public static int nfragmentShadingRateStrictMultiplyCombiner(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRatePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRatePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRatePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code minFragmentShadingRateAttachmentTexelSize} field. */
        public VkExtent2D minFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nminFragmentShadingRateAttachmentTexelSize(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code maxFragmentShadingRateAttachmentTexelSize} field. */
        public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSize(address()); }
        /** Returns the value of the {@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio} field. */
        @NativeType("uint32_t")
        public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(address()); }
        /** Returns the value of the {@code primitiveFragmentShadingRateWithMultipleViewports} field. */
        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateWithMultipleViewports() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nprimitiveFragmentShadingRateWithMultipleViewports(address()) != 0; }
        /** Returns the value of the {@code layeredShadingRateAttachments} field. */
        @NativeType("VkBool32")
        public boolean layeredShadingRateAttachments() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nlayeredShadingRateAttachments(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateNonTrivialCombinerOps} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateNonTrivialCombinerOps() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateNonTrivialCombinerOps(address()) != 0; }
        /** Returns a {@link VkExtent2D} view of the {@code maxFragmentSize} field. */
        public VkExtent2D maxFragmentSize() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSize(address()); }
        /** Returns the value of the {@code maxFragmentSizeAspectRatio} field. */
        @NativeType("uint32_t")
        public int maxFragmentSizeAspectRatio() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSizeAspectRatio(address()); }
        /** Returns the value of the {@code maxFragmentShadingRateCoverageSamples} field. */
        @NativeType("uint32_t")
        public int maxFragmentShadingRateCoverageSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateCoverageSamples(address()); }
        /** Returns the value of the {@code maxFragmentShadingRateRasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateRasterizationSamples() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateRasterizationSamples(address()); }
        /** Returns the value of the {@code fragmentShadingRateWithShaderDepthStencilWrites} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderDepthStencilWrites() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderDepthStencilWrites(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateWithSampleMask} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithSampleMask(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateWithShaderSampleMask} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderSampleMask() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderSampleMask(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateWithConservativeRasterization} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithConservativeRasterization() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithConservativeRasterization(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateWithFragmentShaderInterlock} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithFragmentShaderInterlock() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithFragmentShaderInterlock(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateWithCustomSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateWithCustomSampleLocations() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithCustomSampleLocations(address()) != 0; }
        /** Returns the value of the {@code fragmentShadingRateStrictMultiplyCombiner} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateStrictMultiplyCombiner() { return VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateStrictMultiplyCombiner(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(address(), value); return this; }

    }

}