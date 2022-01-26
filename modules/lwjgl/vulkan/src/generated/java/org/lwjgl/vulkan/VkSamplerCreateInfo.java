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
 * Structure specifying parameters of a newly created sampler.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Mapping of OpenGL to Vulkan filter modes</h5>
 * 
 * <p>{@code magFilter} values of {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST} and {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} directly correspond to {@code GL_NEAREST} and {@code GL_LINEAR} magnification filters. {@code minFilter} and {@code mipmapMode} combine to correspond to the similarly named OpenGL minification filter of {@code GL_minFilter_MIPMAP_mipmapMode} (e.g. {@code minFilter} of {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code mipmapMode} of {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST} correspond to {@code GL_LINEAR_MIPMAP_NEAREST}).</p>
 * 
 * <p>There are no Vulkan filter modes that directly correspond to OpenGL minification filters of {@code GL_LINEAR} or {@code GL_NEAREST}, but they <b>can</b> be emulated using {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}, {@code minLod} = 0, and {@code maxLod} = 0.25, and using {@code minFilter} = {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} or {@code minFilter} = {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}, respectively.</p>
 * 
 * <p>Note that using a {@code maxLod} of zero would cause <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-filtering">magnification</a> to always be performed, and the {@code magFilter} to always be used. This is valid, just not an exact match for OpenGL behavior. Clamping the maximum LOD to 0.25 allows the <code>λ</code> value to be non-zero and minification to be performed, while still always rounding down to the base level. If the {@code minFilter} and {@code magFilter} are equal, then using a {@code maxLod} of zero also works.</p>
 * </div>
 * 
 * <p>The maximum number of sampler objects which <b>can</b> be simultaneously created on a device is implementation-dependent and specified by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxSamplerAllocationCount">maxSamplerAllocationCount</a> member of the {@link VkPhysicalDeviceLimits} structure.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For historical reasons, if {@code maxSamplerAllocationCount} is exceeded, some implementations may return {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}. Exceeding this limit will result in undefined behavior, and an application should not rely on the use of the returned error code in order to identify when the limit is reached.</p>
 * </div>
 * 
 * <p>Since {@code VkSampler} is a non-dispatchable handle type, implementations <b>may</b> return the same handle for sampler state vectors that are identical. In such cases, all such objects would only count once against the {@code maxSamplerAllocationCount} limit.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The absolute value of {@code mipLodBias} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxSamplerLodBias}</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::samplerMipLodBias} is {@link VK10#VK_FALSE FALSE}, {@code mipLodBias} <b>must</b> be zero</li>
 * <li>{@code maxLod} <b>must</b> be greater than or equal to {@code minLod}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-samplerAnisotropy">anisotropic sampling</a> feature is not enabled, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code anisotropyEnable} is {@link VK10#VK_TRUE TRUE}, {@code maxAnisotropy} <b>must</b> be between {@code 1.0} and {@link VkPhysicalDeviceLimits}{@code ::maxSamplerAnisotropy}, inclusive</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion do not support {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT}, {@code minFilter} and {@code magFilter} <b>must</b> be equal to the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion’s {@code chromaFilter}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minFilter} and {@code magFilter} <b>must</b> be equal</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code mipmapMode} <b>must</b> be {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minLod} and {@code maxLod} <b>must</b> be zero</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code addressModeU} and {@code addressModeV} <b>must</b> each be either {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE} or {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code compareEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If any of {@code addressModeU}, {@code addressModeV} or {@code addressModeW} are {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}, {@code borderColor} <b>must</b> be a valid {@code VkBorderColor} value</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled, {@code addressModeU}, {@code addressModeV}, and {@code addressModeW} <b>must</b> be {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}, and {@code unnormalizedCoordinates} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>The sampler reduction mode <b>must</b> be set to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE} if <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-samplerMirrorClampToEdge">samplerMirrorClampToEdge</a> is not enabled, and if the {@link KHRSamplerMirrorClampToEdge VK_KHR_sampler_mirror_clamp_to_edge} extension is not enabled, {@code addressModeU}, {@code addressModeV} and {@code addressModeW} <b>must</b> not be {@link VK12#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}</li>
 * <li>If {@code compareEnable} is {@link VK10#VK_TRUE TRUE}, {@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * <li>If either {@code magFilter} or {@code minFilter} is {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code compareEnable} is {@link VK10#VK_TRUE TRUE}, the {@code reductionMode} member of {@link VkSamplerReductionModeCreateInfo} <b>must</b> be {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code minFilter} and {@code magFilter} <b>must</b> be equal</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code mipmapMode} <b>must</b> be {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code minLod} and {@code maxLod} <b>must</b> be zero</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code addressModeU} and {@code addressModeV} <b>must</b> each be either {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE} or {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code compareEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code unnormalizedCoordinates} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code borderColor} is one of {@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT} or {@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}, then a {@link VkSamplerCustomBorderColorCreateInfoEXT} <b>must</b> be included in the {@code pNext} chain</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-customBorderColors">{@code customBorderColors}</a> feature is not enabled, {@code borderColor} <b>must</b> not be {@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT} or {@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}</li>
 * <li>If {@code borderColor} is one of {@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT} or {@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}, and {@link VkSamplerCustomBorderColorCreateInfoEXT}{@code ::format} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@link VkSamplerCustomBorderColorCreateInfoEXT}{@code ::customBorderColor} <b>must</b> be within the range of values representable in {@code format}</li>
 * <li>The maximum number of samplers with custom border colors which <b>can</b> be simultaneously created on a device is implementation-dependent and specified by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxCustomBorderColorSamplers">maxCustomBorderColorSamplers</a> member of the {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkSamplerBorderColorComponentMappingCreateInfoEXT}, {@link VkSamplerCustomBorderColorCreateInfoEXT}, {@link VkSamplerReductionModeCreateInfo}, or {@link VkSamplerYcbcrConversionInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSamplerCreateFlagBits} values</li>
 * <li>{@code magFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code minFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code mipmapMode} <b>must</b> be a valid {@code VkSamplerMipmapMode} value</li>
 * <li>{@code addressModeU} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * <li>{@code addressModeV} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * <li>{@code addressModeW} <b>must</b> be a valid {@code VkSamplerAddressMode} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateSampler CreateSampler}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSamplerCreateFlags {@link #flags};
 *     VkFilter {@link #magFilter};
 *     VkFilter {@link #minFilter};
 *     VkSamplerMipmapMode {@link #mipmapMode};
 *     VkSamplerAddressMode {@link #addressModeU};
 *     VkSamplerAddressMode {@link #addressModeV};
 *     VkSamplerAddressMode {@link #addressModeW};
 *     float {@link #mipLodBias};
 *     VkBool32 {@link #anisotropyEnable};
 *     float {@link #maxAnisotropy};
 *     VkBool32 {@link #compareEnable};
 *     VkCompareOp {@link #compareOp};
 *     float {@link #minLod};
 *     float {@link #maxLod};
 *     VkBorderColor {@link #borderColor};
 *     VkBool32 {@link #unnormalizedCoordinates};
 * }</code></pre>
 */
public class VkSamplerCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAGFILTER,
        MINFILTER,
        MIPMAPMODE,
        ADDRESSMODEU,
        ADDRESSMODEV,
        ADDRESSMODEW,
        MIPLODBIAS,
        ANISOTROPYENABLE,
        MAXANISOTROPY,
        COMPAREENABLE,
        COMPAREOP,
        MINLOD,
        MAXLOD,
        BORDERCOLOR,
        UNNORMALIZEDCOORDINATES;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAGFILTER = layout.offsetof(3);
        MINFILTER = layout.offsetof(4);
        MIPMAPMODE = layout.offsetof(5);
        ADDRESSMODEU = layout.offsetof(6);
        ADDRESSMODEV = layout.offsetof(7);
        ADDRESSMODEW = layout.offsetof(8);
        MIPLODBIAS = layout.offsetof(9);
        ANISOTROPYENABLE = layout.offsetof(10);
        MAXANISOTROPY = layout.offsetof(11);
        COMPAREENABLE = layout.offsetof(12);
        COMPAREOP = layout.offsetof(13);
        MINLOD = layout.offsetof(14);
        MAXLOD = layout.offsetof(15);
        BORDERCOLOR = layout.offsetof(16);
        UNNORMALIZEDCOORDINATES = layout.offsetof(17);
    }

    /**
     * Creates a {@code VkSamplerCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkSamplerCreateFlagBits} describing additional parameters of the sampler. */
    @NativeType("VkSamplerCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkFilter} value specifying the magnification filter to apply to lookups. */
    @NativeType("VkFilter")
    public int magFilter() { return nmagFilter(address()); }
    /** a {@code VkFilter} value specifying the minification filter to apply to lookups. */
    @NativeType("VkFilter")
    public int minFilter() { return nminFilter(address()); }
    /** a {@code VkSamplerMipmapMode} value specifying the mipmap filter to apply to lookups. */
    @NativeType("VkSamplerMipmapMode")
    public int mipmapMode() { return nmipmapMode(address()); }
    /** a {@code VkSamplerAddressMode} value specifying the addressing mode for U coordinates outside <code>[0,1)</code>. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeU() { return naddressModeU(address()); }
    /** a {@code VkSamplerAddressMode} value specifying the addressing mode for V coordinates outside <code>[0,1)</code>. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeV() { return naddressModeV(address()); }
    /** a {@code VkSamplerAddressMode} value specifying the addressing mode for W coordinates outside <code>[0,1)</code>. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeW() { return naddressModeW(address()); }
    /** the bias to be added to mipmap LOD (level-of-detail) calculation and bias provided by image sampling functions in SPIR-V, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-level-of-detail-operation">Level-of-Detail Operation</a> section. */
    public float mipLodBias() { return nmipLodBias(address()); }
    /** {@link VK10#VK_TRUE TRUE} to enable anisotropic filtering, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-anisotropic-filtering">Texel Anisotropic Filtering</a> section, or {@link VK10#VK_FALSE FALSE} otherwise. */
    @NativeType("VkBool32")
    public boolean anisotropyEnable() { return nanisotropyEnable(address()) != 0; }
    /** the anisotropy value clamp used by the sampler when {@code anisotropyEnable} is {@link VK10#VK_TRUE TRUE}. If {@code anisotropyEnable} is {@link VK10#VK_FALSE FALSE}, {@code maxAnisotropy} is ignored. */
    public float maxAnisotropy() { return nmaxAnisotropy(address()); }
    /**
     * {@link VK10#VK_TRUE TRUE} to enable comparison against a reference value during lookups, or {@link VK10#VK_FALSE FALSE} otherwise.
     * 
     * <ul>
     * <li>Note: Some implementations will default to shader state if this member does not match.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean compareEnable() { return ncompareEnable(address()) != 0; }
    /** a {@code VkCompareOp} value specifying the comparison function to apply to fetched data before filtering as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">Depth Compare Operation</a> section. */
    @NativeType("VkCompareOp")
    public int compareOp() { return ncompareOp(address()); }
    /** used to clamp the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-level-of-detail-operation">minimum of the computed LOD value</a>. */
    public float minLod() { return nminLod(address()); }
    /** used to clamp the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-level-of-detail-operation">maximum of the computed LOD value</a>. To avoid clamping the maximum value, set {@code maxLod} to the constant {@link VK10#VK_LOD_CLAMP_NONE LOD_CLAMP_NONE}. */
    public float maxLod() { return nmaxLod(address()); }
    /** a {@code VkBorderColor} value specifying the predefined border color to use. */
    @NativeType("VkBorderColor")
    public int borderColor() { return nborderColor(address()); }
    /**
     * controls whether to use unnormalized or normalized texel coordinates to address texels of the image. When set to {@link VK10#VK_TRUE TRUE}, the range of the image coordinates used to lookup the texel is in the range of zero to the image size in each dimension. When set to {@link VK10#VK_FALSE FALSE} the range of image coordinates is zero to one.
     * 
     * <p>When {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, images the sampler is used with in the shader have the following requirements:</p>
     * 
     * <ul>
     * <li>The {@code viewType} <b>must</b> be either {@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D} or {@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}.</li>
     * <li>The image view <b>must</b> have a single layer and a single mip level.</li>
     * </ul>
     * 
     * <p>When {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, image built-in functions in the shader that use the sampler have the following requirements:</p>
     * 
     * <ul>
     * <li>The functions <b>must</b> not use projection.</li>
     * <li>The functions <b>must</b> not use offsets.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean unnormalizedCoordinates() { return nunnormalizedCoordinates(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO} value to the {@link #sType} field. */
    public VkSamplerCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerCustomBorderColorCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerCustomBorderColorCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerReductionModeCreateInfo} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerReductionModeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSamplerCreateInfo flags(@NativeType("VkSamplerCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #magFilter} field. */
    public VkSamplerCreateInfo magFilter(@NativeType("VkFilter") int value) { nmagFilter(address(), value); return this; }
    /** Sets the specified value to the {@link #minFilter} field. */
    public VkSamplerCreateInfo minFilter(@NativeType("VkFilter") int value) { nminFilter(address(), value); return this; }
    /** Sets the specified value to the {@link #mipmapMode} field. */
    public VkSamplerCreateInfo mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { nmipmapMode(address(), value); return this; }
    /** Sets the specified value to the {@link #addressModeU} field. */
    public VkSamplerCreateInfo addressModeU(@NativeType("VkSamplerAddressMode") int value) { naddressModeU(address(), value); return this; }
    /** Sets the specified value to the {@link #addressModeV} field. */
    public VkSamplerCreateInfo addressModeV(@NativeType("VkSamplerAddressMode") int value) { naddressModeV(address(), value); return this; }
    /** Sets the specified value to the {@link #addressModeW} field. */
    public VkSamplerCreateInfo addressModeW(@NativeType("VkSamplerAddressMode") int value) { naddressModeW(address(), value); return this; }
    /** Sets the specified value to the {@link #mipLodBias} field. */
    public VkSamplerCreateInfo mipLodBias(float value) { nmipLodBias(address(), value); return this; }
    /** Sets the specified value to the {@link #anisotropyEnable} field. */
    public VkSamplerCreateInfo anisotropyEnable(@NativeType("VkBool32") boolean value) { nanisotropyEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maxAnisotropy} field. */
    public VkSamplerCreateInfo maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
    /** Sets the specified value to the {@link #compareEnable} field. */
    public VkSamplerCreateInfo compareEnable(@NativeType("VkBool32") boolean value) { ncompareEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #compareOp} field. */
    public VkSamplerCreateInfo compareOp(@NativeType("VkCompareOp") int value) { ncompareOp(address(), value); return this; }
    /** Sets the specified value to the {@link #minLod} field. */
    public VkSamplerCreateInfo minLod(float value) { nminLod(address(), value); return this; }
    /** Sets the specified value to the {@link #maxLod} field. */
    public VkSamplerCreateInfo maxLod(float value) { nmaxLod(address(), value); return this; }
    /** Sets the specified value to the {@link #borderColor} field. */
    public VkSamplerCreateInfo borderColor(@NativeType("VkBorderColor") int value) { nborderColor(address(), value); return this; }
    /** Sets the specified value to the {@link #unnormalizedCoordinates} field. */
    public VkSamplerCreateInfo unnormalizedCoordinates(@NativeType("VkBool32") boolean value) { nunnormalizedCoordinates(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int magFilter,
        int minFilter,
        int mipmapMode,
        int addressModeU,
        int addressModeV,
        int addressModeW,
        float mipLodBias,
        boolean anisotropyEnable,
        float maxAnisotropy,
        boolean compareEnable,
        int compareOp,
        float minLod,
        float maxLod,
        int borderColor,
        boolean unnormalizedCoordinates
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        magFilter(magFilter);
        minFilter(minFilter);
        mipmapMode(mipmapMode);
        addressModeU(addressModeU);
        addressModeV(addressModeV);
        addressModeW(addressModeW);
        mipLodBias(mipLodBias);
        anisotropyEnable(anisotropyEnable);
        maxAnisotropy(maxAnisotropy);
        compareEnable(compareEnable);
        compareOp(compareOp);
        minLod(minLod);
        maxLod(maxLod);
        borderColor(borderColor);
        unnormalizedCoordinates(unnormalizedCoordinates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerCreateInfo set(VkSamplerCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerCreateInfo malloc() {
        return wrap(VkSamplerCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerCreateInfo calloc() {
        return wrap(VkSamplerCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance for the specified memory address. */
    public static VkSamplerCreateInfo create(long address) {
        return wrap(VkSamplerCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo malloc(MemoryStack stack) {
        return wrap(VkSamplerCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo calloc(MemoryStack stack) {
        return wrap(VkSamplerCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.FLAGS); }
    /** Unsafe version of {@link #magFilter}. */
    public static int nmagFilter(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.MAGFILTER); }
    /** Unsafe version of {@link #minFilter}. */
    public static int nminFilter(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.MINFILTER); }
    /** Unsafe version of {@link #mipmapMode}. */
    public static int nmipmapMode(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.MIPMAPMODE); }
    /** Unsafe version of {@link #addressModeU}. */
    public static int naddressModeU(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEU); }
    /** Unsafe version of {@link #addressModeV}. */
    public static int naddressModeV(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEV); }
    /** Unsafe version of {@link #addressModeW}. */
    public static int naddressModeW(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEW); }
    /** Unsafe version of {@link #mipLodBias}. */
    public static float nmipLodBias(long struct) { return UNSAFE.getFloat(null, struct + VkSamplerCreateInfo.MIPLODBIAS); }
    /** Unsafe version of {@link #anisotropyEnable}. */
    public static int nanisotropyEnable(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.ANISOTROPYENABLE); }
    /** Unsafe version of {@link #maxAnisotropy}. */
    public static float nmaxAnisotropy(long struct) { return UNSAFE.getFloat(null, struct + VkSamplerCreateInfo.MAXANISOTROPY); }
    /** Unsafe version of {@link #compareEnable}. */
    public static int ncompareEnable(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.COMPAREENABLE); }
    /** Unsafe version of {@link #compareOp}. */
    public static int ncompareOp(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.COMPAREOP); }
    /** Unsafe version of {@link #minLod}. */
    public static float nminLod(long struct) { return UNSAFE.getFloat(null, struct + VkSamplerCreateInfo.MINLOD); }
    /** Unsafe version of {@link #maxLod}. */
    public static float nmaxLod(long struct) { return UNSAFE.getFloat(null, struct + VkSamplerCreateInfo.MAXLOD); }
    /** Unsafe version of {@link #borderColor}. */
    public static int nborderColor(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.BORDERCOLOR); }
    /** Unsafe version of {@link #unnormalizedCoordinates}. */
    public static int nunnormalizedCoordinates(long struct) { return UNSAFE.getInt(null, struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #magFilter(int) magFilter}. */
    public static void nmagFilter(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.MAGFILTER, value); }
    /** Unsafe version of {@link #minFilter(int) minFilter}. */
    public static void nminFilter(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.MINFILTER, value); }
    /** Unsafe version of {@link #mipmapMode(int) mipmapMode}. */
    public static void nmipmapMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.MIPMAPMODE, value); }
    /** Unsafe version of {@link #addressModeU(int) addressModeU}. */
    public static void naddressModeU(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEU, value); }
    /** Unsafe version of {@link #addressModeV(int) addressModeV}. */
    public static void naddressModeV(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEV, value); }
    /** Unsafe version of {@link #addressModeW(int) addressModeW}. */
    public static void naddressModeW(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.ADDRESSMODEW, value); }
    /** Unsafe version of {@link #mipLodBias(float) mipLodBias}. */
    public static void nmipLodBias(long struct, float value) { UNSAFE.putFloat(null, struct + VkSamplerCreateInfo.MIPLODBIAS, value); }
    /** Unsafe version of {@link #anisotropyEnable(boolean) anisotropyEnable}. */
    public static void nanisotropyEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.ANISOTROPYENABLE, value); }
    /** Unsafe version of {@link #maxAnisotropy(float) maxAnisotropy}. */
    public static void nmaxAnisotropy(long struct, float value) { UNSAFE.putFloat(null, struct + VkSamplerCreateInfo.MAXANISOTROPY, value); }
    /** Unsafe version of {@link #compareEnable(boolean) compareEnable}. */
    public static void ncompareEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.COMPAREENABLE, value); }
    /** Unsafe version of {@link #compareOp(int) compareOp}. */
    public static void ncompareOp(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.COMPAREOP, value); }
    /** Unsafe version of {@link #minLod(float) minLod}. */
    public static void nminLod(long struct, float value) { UNSAFE.putFloat(null, struct + VkSamplerCreateInfo.MINLOD, value); }
    /** Unsafe version of {@link #maxLod(float) maxLod}. */
    public static void nmaxLod(long struct, float value) { UNSAFE.putFloat(null, struct + VkSamplerCreateInfo.MAXLOD, value); }
    /** Unsafe version of {@link #borderColor(int) borderColor}. */
    public static void nborderColor(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.BORDERCOLOR, value); }
    /** Unsafe version of {@link #unnormalizedCoordinates(boolean) unnormalizedCoordinates}. */
    public static void nunnormalizedCoordinates(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerCreateInfo ELEMENT_FACTORY = VkSamplerCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#flags} field. */
        @NativeType("VkSamplerCreateFlags")
        public int flags() { return VkSamplerCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#magFilter} field. */
        @NativeType("VkFilter")
        public int magFilter() { return VkSamplerCreateInfo.nmagFilter(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#minFilter} field. */
        @NativeType("VkFilter")
        public int minFilter() { return VkSamplerCreateInfo.nminFilter(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#mipmapMode} field. */
        @NativeType("VkSamplerMipmapMode")
        public int mipmapMode() { return VkSamplerCreateInfo.nmipmapMode(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#addressModeU} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeU() { return VkSamplerCreateInfo.naddressModeU(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#addressModeV} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeV() { return VkSamplerCreateInfo.naddressModeV(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#addressModeW} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeW() { return VkSamplerCreateInfo.naddressModeW(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#mipLodBias} field. */
        public float mipLodBias() { return VkSamplerCreateInfo.nmipLodBias(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#anisotropyEnable} field. */
        @NativeType("VkBool32")
        public boolean anisotropyEnable() { return VkSamplerCreateInfo.nanisotropyEnable(address()) != 0; }
        /** @return the value of the {@link VkSamplerCreateInfo#maxAnisotropy} field. */
        public float maxAnisotropy() { return VkSamplerCreateInfo.nmaxAnisotropy(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#compareEnable} field. */
        @NativeType("VkBool32")
        public boolean compareEnable() { return VkSamplerCreateInfo.ncompareEnable(address()) != 0; }
        /** @return the value of the {@link VkSamplerCreateInfo#compareOp} field. */
        @NativeType("VkCompareOp")
        public int compareOp() { return VkSamplerCreateInfo.ncompareOp(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#minLod} field. */
        public float minLod() { return VkSamplerCreateInfo.nminLod(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#maxLod} field. */
        public float maxLod() { return VkSamplerCreateInfo.nmaxLod(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#borderColor} field. */
        @NativeType("VkBorderColor")
        public int borderColor() { return VkSamplerCreateInfo.nborderColor(address()); }
        /** @return the value of the {@link VkSamplerCreateInfo#unnormalizedCoordinates} field. */
        @NativeType("VkBool32")
        public boolean unnormalizedCoordinates() { return VkSamplerCreateInfo.nunnormalizedCoordinates(address()) != 0; }

        /** Sets the specified value to the {@link VkSamplerCreateInfo#sType} field. */
        public VkSamplerCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO} value to the {@link VkSamplerCreateInfo#sType} field. */
        public VkSamplerCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO); }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#pNext} field. */
        public VkSamplerCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerCustomBorderColorCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerCustomBorderColorCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerReductionModeCreateInfo} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerReductionModeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerReductionModeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerReductionModeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#flags} field. */
        public VkSamplerCreateInfo.Buffer flags(@NativeType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#magFilter} field. */
        public VkSamplerCreateInfo.Buffer magFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nmagFilter(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#minFilter} field. */
        public VkSamplerCreateInfo.Buffer minFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nminFilter(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#mipmapMode} field. */
        public VkSamplerCreateInfo.Buffer mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.nmipmapMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#addressModeU} field. */
        public VkSamplerCreateInfo.Buffer addressModeU(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeU(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#addressModeV} field. */
        public VkSamplerCreateInfo.Buffer addressModeV(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeV(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#addressModeW} field. */
        public VkSamplerCreateInfo.Buffer addressModeW(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeW(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#mipLodBias} field. */
        public VkSamplerCreateInfo.Buffer mipLodBias(float value) { VkSamplerCreateInfo.nmipLodBias(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#anisotropyEnable} field. */
        public VkSamplerCreateInfo.Buffer anisotropyEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nanisotropyEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#maxAnisotropy} field. */
        public VkSamplerCreateInfo.Buffer maxAnisotropy(float value) { VkSamplerCreateInfo.nmaxAnisotropy(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#compareEnable} field. */
        public VkSamplerCreateInfo.Buffer compareEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.ncompareEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#compareOp} field. */
        public VkSamplerCreateInfo.Buffer compareOp(@NativeType("VkCompareOp") int value) { VkSamplerCreateInfo.ncompareOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#minLod} field. */
        public VkSamplerCreateInfo.Buffer minLod(float value) { VkSamplerCreateInfo.nminLod(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#maxLod} field. */
        public VkSamplerCreateInfo.Buffer maxLod(float value) { VkSamplerCreateInfo.nmaxLod(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#borderColor} field. */
        public VkSamplerCreateInfo.Buffer borderColor(@NativeType("VkBorderColor") int value) { VkSamplerCreateInfo.nborderColor(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerCreateInfo#unnormalizedCoordinates} field. */
        public VkSamplerCreateInfo.Buffer unnormalizedCoordinates(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nunnormalizedCoordinates(address(), value ? 1 : 0); return this; }

    }

}