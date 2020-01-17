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
 * <p>Note that using a {@code maxLod} of zero would cause <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-texel-filtering">magnification</a> to always be performed, and the {@code magFilter} to always be used. This is valid, just not an exact match for OpenGL behavior. Clamping the maximum LOD to 0.25 allows the <code>λ</code> value to be non-zero and minification to be performed, while still always rounding down to the base level. If the {@code minFilter} and {@code magFilter} are equal, then using a {@code maxLod} of zero also works.</p>
 * </div>
 * 
 * <p>The maximum number of sampler objects which <b>can</b> be simultaneously created on a device is implementation-dependent and specified by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-maxSamplerAllocationCount">maxSamplerAllocationCount</a> member of the {@link VkPhysicalDeviceLimits} structure. If {@code maxSamplerAllocationCount} is exceeded, {@code vkCreateSampler} will return {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}.</p>
 * 
 * <p>Since {@code VkSampler} is a non-dispatchable handle type, implementations <b>may</b> return the same handle for sampler state vectors that are identical. In such cases, all such objects would only count once against the {@code maxSamplerAllocationCount} limit.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The absolute value of {@code mipLodBias} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxSamplerLodBias}</li>
 * <li>{@code maxLod} <b>must</b> be greater than or equal to {@code minLod}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-samplerAnisotropy">anisotropic sampling</a> feature is not enabled, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code anisotropyEnable} is {@link VK10#VK_TRUE TRUE}, {@code maxAnisotropy} <b>must</b> be between {@code 1.0} and {@link VkPhysicalDeviceLimits}{@code ::maxSamplerAnisotropy}, inclusive</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled and {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT} is not set for the format, {@code minFilter} and {@code magFilter} <b>must</b> be equal to the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion&#8217;s {@code chromaFilter}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minFilter} and {@code magFilter} <b>must</b> be equal</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code mipmapMode} <b>must</b> be {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code minLod} and {@code maxLod} <b>must</b> be zero</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code addressModeU} and {@code addressModeV} <b>must</b> each be either {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE} or {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code unnormalizedCoordinates} is {@link VK10#VK_TRUE TRUE}, {@code compareEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If any of {@code addressModeU}, {@code addressModeV} or {@code addressModeW} are {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}, {@code borderColor} <b>must</b> be a valid {@code VkBorderColor} value</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled, {@code addressModeU}, {@code addressModeV}, and {@code addressModeW} <b>must</b> be {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}, and {@code unnormalizedCoordinates} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>The sampler reduction mode <b>must</b> be set to {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE} if <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-samplerMirrorClampToEdge">samplerMirrorClampToEdge</a> is not enabled, and if the {@link KHRSamplerMirrorClampToEdge VK_KHR_sampler_mirror_clamp_to_edge} extension is not enabled, {@code addressModeU}, {@code addressModeV} and {@code addressModeW} <b>must</b> not be {@link VK12#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}</li>
 * <li>If {@code compareEnable} is {@link VK10#VK_TRUE TRUE}, {@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * <li>If either {@code magFilter} or {@code minFilter} is {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@code compareEnable} is {@link VK10#VK_TRUE TRUE}, the {@code reductionMode} member of {@link VkSamplerReductionModeCreateInfo} <b>must</b> be {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code minFilter} and {@code magFilter} <b>must</b> be equal.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code mipmapMode} <b>must</b> be {@link VK10#VK_SAMPLER_MIPMAP_MODE_NEAREST SAMPLER_MIPMAP_MODE_NEAREST}.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code minLod} and {@code maxLod} <b>must</b> be zero.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code addressModeU} and {@code addressModeV} <b>must</b> each be either {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE} or {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER}.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code anisotropyEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code compareEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * <li>If {@code flags} includes {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_BIT_EXT}, then {@code unnormalizedCoordinates} <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkSamplerReductionModeCreateInfo} or {@link VkSamplerYcbcrConversionInfo}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkSamplerCreateFlagBits} describing additional parameters of the sampler.</li>
 * <li>{@code magFilter} &ndash; a {@code VkFilter} value specifying the magnification filter to apply to lookups.</li>
 * <li>{@code minFilter} &ndash; a {@code VkFilter} value specifying the minification filter to apply to lookups.</li>
 * <li>{@code mipmapMode} &ndash; a {@code VkSamplerMipmapMode} value specifying the mipmap filter to apply to lookups.</li>
 * <li>{@code addressModeU} &ndash; a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for U coordinate.</li>
 * <li>{@code addressModeV} &ndash; a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for V coordinate.</li>
 * <li>{@code addressModeW} &ndash; a {@code VkSamplerAddressMode} value specifying the addressing mode for outside [0..1] range for W coordinate.</li>
 * <li>{@code mipLodBias} &ndash; the bias to be added to mipmap LOD (level-of-detail) calculation and bias provided by image sampling functions in SPIR-V, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-level-of-detail-operation">Level-of-Detail Operation</a> section.</li>
 * <li>{@code anisotropyEnable} &ndash; {@link VK10#VK_TRUE TRUE} to enable anisotropic filtering, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-texel-anisotropic-filtering">Texel Anisotropic Filtering</a> section, or {@link VK10#VK_FALSE FALSE} otherwise.</li>
 * <li>{@code maxAnisotropy} &ndash; the anisotropy value clamp used by the sampler when {@code anisotropyEnable} is {@link VK10#VK_TRUE TRUE}. If {@code anisotropyEnable} is {@link VK10#VK_FALSE FALSE}, {@code maxAnisotropy} is ignored.</li>
 * <li>{@code compareEnable} &ndash; {@link VK10#VK_TRUE TRUE} to enable comparison against a reference value during lookups, or {@link VK10#VK_FALSE FALSE} otherwise.
 * 
 * <ul>
 * <li>Note: Some implementations will default to shader state if this member does not match.</li>
 * </ul></li>
 * <li>{@code compareOp} &ndash; a {@code VkCompareOp} value specifying the comparison function to apply to fetched data before filtering as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-depth-compare-operation">Depth Compare Operation</a> section.</li>
 * <li>{@code minLod} &ndash; {@code minLod} and {@code maxLod} are the values used to clamp the computed LOD value, as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#textures-level-of-detail-operation">Level-of-Detail Operation</a> section.</li>
 * <li>{@code maxLod} &ndash; see {@code minLod}</li>
 * <li>{@code borderColor} &ndash; a {@code VkBorderColor} value specifying the predefined border color to use.</li>
 * <li>{@code unnormalizedCoordinates} &ndash; controls whether to use unnormalized or normalized texel coordinates to address texels of the image. When set to {@link VK10#VK_TRUE TRUE}, the range of the image coordinates used to lookup the texel is in the range of zero to the image dimensions for x, y and z. When set to {@link VK10#VK_FALSE FALSE} the range of image coordinates is zero to one.
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
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSamplerCreateFlags flags;
 *     VkFilter magFilter;
 *     VkFilter minFilter;
 *     VkSamplerMipmapMode mipmapMode;
 *     VkSamplerAddressMode addressModeU;
 *     VkSamplerAddressMode addressModeV;
 *     VkSamplerAddressMode addressModeW;
 *     float mipLodBias;
 *     VkBool32 anisotropyEnable;
 *     float maxAnisotropy;
 *     VkBool32 compareEnable;
 *     VkCompareOp compareOp;
 *     float minLod;
 *     float maxLod;
 *     VkBorderColor borderColor;
 *     VkBool32 unnormalizedCoordinates;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkSamplerCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code magFilter} field. */
    @NativeType("VkFilter")
    public int magFilter() { return nmagFilter(address()); }
    /** Returns the value of the {@code minFilter} field. */
    @NativeType("VkFilter")
    public int minFilter() { return nminFilter(address()); }
    /** Returns the value of the {@code mipmapMode} field. */
    @NativeType("VkSamplerMipmapMode")
    public int mipmapMode() { return nmipmapMode(address()); }
    /** Returns the value of the {@code addressModeU} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeU() { return naddressModeU(address()); }
    /** Returns the value of the {@code addressModeV} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeV() { return naddressModeV(address()); }
    /** Returns the value of the {@code addressModeW} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeW() { return naddressModeW(address()); }
    /** Returns the value of the {@code mipLodBias} field. */
    public float mipLodBias() { return nmipLodBias(address()); }
    /** Returns the value of the {@code anisotropyEnable} field. */
    @NativeType("VkBool32")
    public boolean anisotropyEnable() { return nanisotropyEnable(address()) != 0; }
    /** Returns the value of the {@code maxAnisotropy} field. */
    public float maxAnisotropy() { return nmaxAnisotropy(address()); }
    /** Returns the value of the {@code compareEnable} field. */
    @NativeType("VkBool32")
    public boolean compareEnable() { return ncompareEnable(address()) != 0; }
    /** Returns the value of the {@code compareOp} field. */
    @NativeType("VkCompareOp")
    public int compareOp() { return ncompareOp(address()); }
    /** Returns the value of the {@code minLod} field. */
    public float minLod() { return nminLod(address()); }
    /** Returns the value of the {@code maxLod} field. */
    public float maxLod() { return nmaxLod(address()); }
    /** Returns the value of the {@code borderColor} field. */
    @NativeType("VkBorderColor")
    public int borderColor() { return nborderColor(address()); }
    /** Returns the value of the {@code unnormalizedCoordinates} field. */
    @NativeType("VkBool32")
    public boolean unnormalizedCoordinates() { return nunnormalizedCoordinates(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSamplerCreateInfo flags(@NativeType("VkSamplerCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code magFilter} field. */
    public VkSamplerCreateInfo magFilter(@NativeType("VkFilter") int value) { nmagFilter(address(), value); return this; }
    /** Sets the specified value to the {@code minFilter} field. */
    public VkSamplerCreateInfo minFilter(@NativeType("VkFilter") int value) { nminFilter(address(), value); return this; }
    /** Sets the specified value to the {@code mipmapMode} field. */
    public VkSamplerCreateInfo mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { nmipmapMode(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeU} field. */
    public VkSamplerCreateInfo addressModeU(@NativeType("VkSamplerAddressMode") int value) { naddressModeU(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeV} field. */
    public VkSamplerCreateInfo addressModeV(@NativeType("VkSamplerAddressMode") int value) { naddressModeV(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeW} field. */
    public VkSamplerCreateInfo addressModeW(@NativeType("VkSamplerAddressMode") int value) { naddressModeW(address(), value); return this; }
    /** Sets the specified value to the {@code mipLodBias} field. */
    public VkSamplerCreateInfo mipLodBias(float value) { nmipLodBias(address(), value); return this; }
    /** Sets the specified value to the {@code anisotropyEnable} field. */
    public VkSamplerCreateInfo anisotropyEnable(@NativeType("VkBool32") boolean value) { nanisotropyEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maxAnisotropy} field. */
    public VkSamplerCreateInfo maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
    /** Sets the specified value to the {@code compareEnable} field. */
    public VkSamplerCreateInfo compareEnable(@NativeType("VkBool32") boolean value) { ncompareEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code compareOp} field. */
    public VkSamplerCreateInfo compareOp(@NativeType("VkCompareOp") int value) { ncompareOp(address(), value); return this; }
    /** Sets the specified value to the {@code minLod} field. */
    public VkSamplerCreateInfo minLod(float value) { nminLod(address(), value); return this; }
    /** Sets the specified value to the {@code maxLod} field. */
    public VkSamplerCreateInfo maxLod(float value) { nmaxLod(address(), value); return this; }
    /** Sets the specified value to the {@code borderColor} field. */
    public VkSamplerCreateInfo borderColor(@NativeType("VkBorderColor") int value) { nborderColor(address(), value); return this; }
    /** Sets the specified value to the {@code unnormalizedCoordinates} field. */
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

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkSamplerCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkSamplerCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkSamplerCreateFlags")
        public int flags() { return VkSamplerCreateInfo.nflags(address()); }
        /** Returns the value of the {@code magFilter} field. */
        @NativeType("VkFilter")
        public int magFilter() { return VkSamplerCreateInfo.nmagFilter(address()); }
        /** Returns the value of the {@code minFilter} field. */
        @NativeType("VkFilter")
        public int minFilter() { return VkSamplerCreateInfo.nminFilter(address()); }
        /** Returns the value of the {@code mipmapMode} field. */
        @NativeType("VkSamplerMipmapMode")
        public int mipmapMode() { return VkSamplerCreateInfo.nmipmapMode(address()); }
        /** Returns the value of the {@code addressModeU} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeU() { return VkSamplerCreateInfo.naddressModeU(address()); }
        /** Returns the value of the {@code addressModeV} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeV() { return VkSamplerCreateInfo.naddressModeV(address()); }
        /** Returns the value of the {@code addressModeW} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeW() { return VkSamplerCreateInfo.naddressModeW(address()); }
        /** Returns the value of the {@code mipLodBias} field. */
        public float mipLodBias() { return VkSamplerCreateInfo.nmipLodBias(address()); }
        /** Returns the value of the {@code anisotropyEnable} field. */
        @NativeType("VkBool32")
        public boolean anisotropyEnable() { return VkSamplerCreateInfo.nanisotropyEnable(address()) != 0; }
        /** Returns the value of the {@code maxAnisotropy} field. */
        public float maxAnisotropy() { return VkSamplerCreateInfo.nmaxAnisotropy(address()); }
        /** Returns the value of the {@code compareEnable} field. */
        @NativeType("VkBool32")
        public boolean compareEnable() { return VkSamplerCreateInfo.ncompareEnable(address()) != 0; }
        /** Returns the value of the {@code compareOp} field. */
        @NativeType("VkCompareOp")
        public int compareOp() { return VkSamplerCreateInfo.ncompareOp(address()); }
        /** Returns the value of the {@code minLod} field. */
        public float minLod() { return VkSamplerCreateInfo.nminLod(address()); }
        /** Returns the value of the {@code maxLod} field. */
        public float maxLod() { return VkSamplerCreateInfo.nmaxLod(address()); }
        /** Returns the value of the {@code borderColor} field. */
        @NativeType("VkBorderColor")
        public int borderColor() { return VkSamplerCreateInfo.nborderColor(address()); }
        /** Returns the value of the {@code unnormalizedCoordinates} field. */
        @NativeType("VkBool32")
        public boolean unnormalizedCoordinates() { return VkSamplerCreateInfo.nunnormalizedCoordinates(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSamplerCreateInfo.Buffer flags(@NativeType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code magFilter} field. */
        public VkSamplerCreateInfo.Buffer magFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nmagFilter(address(), value); return this; }
        /** Sets the specified value to the {@code minFilter} field. */
        public VkSamplerCreateInfo.Buffer minFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nminFilter(address(), value); return this; }
        /** Sets the specified value to the {@code mipmapMode} field. */
        public VkSamplerCreateInfo.Buffer mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.nmipmapMode(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeU} field. */
        public VkSamplerCreateInfo.Buffer addressModeU(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeU(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeV} field. */
        public VkSamplerCreateInfo.Buffer addressModeV(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeV(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeW} field. */
        public VkSamplerCreateInfo.Buffer addressModeW(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeW(address(), value); return this; }
        /** Sets the specified value to the {@code mipLodBias} field. */
        public VkSamplerCreateInfo.Buffer mipLodBias(float value) { VkSamplerCreateInfo.nmipLodBias(address(), value); return this; }
        /** Sets the specified value to the {@code anisotropyEnable} field. */
        public VkSamplerCreateInfo.Buffer anisotropyEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nanisotropyEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maxAnisotropy} field. */
        public VkSamplerCreateInfo.Buffer maxAnisotropy(float value) { VkSamplerCreateInfo.nmaxAnisotropy(address(), value); return this; }
        /** Sets the specified value to the {@code compareEnable} field. */
        public VkSamplerCreateInfo.Buffer compareEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.ncompareEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code compareOp} field. */
        public VkSamplerCreateInfo.Buffer compareOp(@NativeType("VkCompareOp") int value) { VkSamplerCreateInfo.ncompareOp(address(), value); return this; }
        /** Sets the specified value to the {@code minLod} field. */
        public VkSamplerCreateInfo.Buffer minLod(float value) { VkSamplerCreateInfo.nminLod(address(), value); return this; }
        /** Sets the specified value to the {@code maxLod} field. */
        public VkSamplerCreateInfo.Buffer maxLod(float value) { VkSamplerCreateInfo.nmaxLod(address(), value); return this; }
        /** Sets the specified value to the {@code borderColor} field. */
        public VkSamplerCreateInfo.Buffer borderColor(@NativeType("VkBorderColor") int value) { VkSamplerCreateInfo.nborderColor(address(), value); return this; }
        /** Sets the specified value to the {@code unnormalizedCoordinates} field. */
        public VkSamplerCreateInfo.Buffer unnormalizedCoordinates(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nunnormalizedCoordinates(address(), value ? 1 : 0); return this; }

    }

}