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
 * Structure specifying the parameters of the newly created conversion.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Setting {@code forceExplicitReconstruction} to {@link VK10#VK_TRUE TRUE} <b>may</b> have a performance penalty on implementations where explicit reconstruction is not the default mode of operation.</p>
 * 
 * <p>If {@code format} supports {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT} the {@code forceExplicitReconstruction} value behaves as if it was set to {@link VK10#VK_TRUE TRUE}.</p>
 * </div>
 * 
 * <p>Sampler Y′C<sub>B</sub>C<sub>R</sub> conversion objects do not support <em>external format conversion</em> without additional extensions defining <em>external formats</em>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> represent unsigned normalized values (i.e. the format must be a {@code UNORM} format)</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion <b>must</b> support {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT} or {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion do not support {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link VK11#VK_CHROMA_LOCATION_COSITED_EVEN CHROMA_LOCATION_COSITED_EVEN} if the corresponding components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">downsampled</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion do not support {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link VK11#VK_CHROMA_LOCATION_MIDPOINT CHROMA_LOCATION_MIDPOINT} if the corresponding components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">downsampled</a></li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.g} <b>must</b> be the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a></li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.a} <b>must</b> be the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a>, {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, or {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.r} <b>must</b> be the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a> or {@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.b} <b>must</b> be the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a> or {@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, and if either {@code components.r} or {@code components.b} is the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a>, both values <b>must</b> be the identity swizzle</li>
 * <li>If {@code ycbcrModel} is not {@link VK11#VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY}, then {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> correspond to components of the {@code format}; that is, {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> not be {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO} or {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, and <b>must</b> not correspond to a component containing zero or one as a consequence of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-conversion-to-rgba">conversion to RGBA</a></li>
 * <li>If {@code ycbcrRange} is {@link VK11#VK_SAMPLER_YCBCR_RANGE_ITU_NARROW SAMPLER_YCBCR_RANGE_ITU_NARROW} then the R, G and B components obtained by applying the {@code component} swizzle to {@code format} <b>must</b> each have a bit-depth greater than or equal to 8</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion do not support {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT} {@code forceExplicitReconstruction} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> of the sampler Y′C<sub>B</sub>C<sub>R</sub> conversion do not support {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT}, {@code chromaFilter} <b>must</b> not be {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code ycbcrModel} <b>must</b> be a valid {@code VkSamplerYcbcrModelConversion} value</li>
 * <li>{@code ycbcrRange} <b>must</b> be a valid {@code VkSamplerYcbcrRange} value</li>
 * <li>{@code components} <b>must</b> be a valid {@link VkComponentMapping} structure</li>
 * <li>{@code xChromaOffset} <b>must</b> be a valid {@code VkChromaLocation} value</li>
 * <li>{@code yChromaOffset} <b>must</b> be a valid {@code VkChromaLocation} value</li>
 * <li>{@code chromaFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * </ul>
 * 
 * <p>If {@code chromaFilter} is {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}, chroma samples are reconstructed to luma component resolution using nearest-neighbour sampling. Otherwise, chroma samples are reconstructed using interpolation. More details can be found in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-sampler-YCbCr-conversion">the description of sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures">Image Operations</a> chapter.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link VK11#vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFormat {@link #format};
 *     VkSamplerYcbcrModelConversion {@link #ycbcrModel};
 *     VkSamplerYcbcrRange {@link #ycbcrRange};
 *     {@link VkComponentMapping VkComponentMapping} {@link #components};
 *     VkChromaLocation {@link #xChromaOffset};
 *     VkChromaLocation {@link #yChromaOffset};
 *     VkFilter {@link #chromaFilter};
 *     VkBool32 {@link #forceExplicitReconstruction};
 * }</code></pre>
 */
public class VkSamplerYcbcrConversionCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        YCBCRMODEL,
        YCBCRRANGE,
        COMPONENTS,
        XCHROMAOFFSET,
        YCHROMAOFFSET,
        CHROMAFILTER,
        FORCEEXPLICITRECONSTRUCTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        YCBCRMODEL = layout.offsetof(3);
        YCBCRRANGE = layout.offsetof(4);
        COMPONENTS = layout.offsetof(5);
        XCHROMAOFFSET = layout.offsetof(6);
        YCHROMAOFFSET = layout.offsetof(7);
        CHROMAFILTER = layout.offsetof(8);
        FORCEEXPLICITRECONSTRUCTION = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkSamplerYcbcrConversionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionCreateInfo(ByteBuffer container) {
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
    /** the format of the image from which color information will be retrieved. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** describes the color matrix for conversion between color models. */
    @NativeType("VkSamplerYcbcrModelConversion")
    public int ycbcrModel() { return nycbcrModel(address()); }
    /** describes whether the encoded values have headroom and foot room, or whether the encoding uses the full numerical range. */
    @NativeType("VkSamplerYcbcrRange")
    public int ycbcrRange() { return nycbcrRange(address()); }
    /** applies a <em>swizzle</em> based on {@code VkComponentSwizzle} enums prior to range expansion and color model conversion. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma components in the x dimension. {@code xChromaOffset} has no effect for formats in which chroma components are not downsampled horizontally. */
    @NativeType("VkChromaLocation")
    public int xChromaOffset() { return nxChromaOffset(address()); }
    /** describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma components in the y dimension. {@code yChromaOffset} has no effect for formats in which the chroma components are not downsampled vertically. */
    @NativeType("VkChromaLocation")
    public int yChromaOffset() { return nyChromaOffset(address()); }
    /** the filter for chroma reconstruction. */
    @NativeType("VkFilter")
    public int chromaFilter() { return nchromaFilter(address()); }
    /** <b>can</b> be used to ensure that reconstruction is done explicitly, if supported. */
    @NativeType("VkBool32")
    public boolean forceExplicitReconstruction() { return nforceExplicitReconstruction(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO} value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerYcbcrConversionCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkSamplerYcbcrConversionCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #ycbcrModel} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { nycbcrModel(address(), value); return this; }
    /** Sets the specified value to the {@link #ycbcrRange} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { nycbcrRange(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@link #components} field. */
    public VkSamplerYcbcrConversionCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@link #components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerYcbcrConversionCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Sets the specified value to the {@link #xChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(@NativeType("VkChromaLocation") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #yChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(@NativeType("VkChromaLocation") int value) { nyChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #chromaFilter} field. */
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(@NativeType("VkFilter") int value) { nchromaFilter(address(), value); return this; }
    /** Sets the specified value to the {@link #forceExplicitReconstruction} field. */
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionCreateInfo set(
        int sType,
        long pNext,
        int format,
        int ycbcrModel,
        int ycbcrRange,
        VkComponentMapping components,
        int xChromaOffset,
        int yChromaOffset,
        int chromaFilter,
        boolean forceExplicitReconstruction
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        ycbcrModel(ycbcrModel);
        ycbcrRange(ycbcrRange);
        components(components);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        chromaFilter(chromaFilter);
        forceExplicitReconstruction(forceExplicitReconstruction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionCreateInfo set(VkSamplerYcbcrConversionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfo malloc() {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfo calloc() {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionCreateInfo create(long address) {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerYcbcrConversionCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo malloc(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo calloc(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionCreateInfo.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.FORMAT); }
    /** Unsafe version of {@link #ycbcrModel}. */
    public static int nycbcrModel(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL); }
    /** Unsafe version of {@link #ycbcrRange}. */
    public static int nycbcrRange(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkSamplerYcbcrConversionCreateInfo.COMPONENTS); }
    /** Unsafe version of {@link #xChromaOffset}. */
    public static int nxChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET); }
    /** Unsafe version of {@link #yChromaOffset}. */
    public static int nyChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET); }
    /** Unsafe version of {@link #chromaFilter}. */
    public static int nchromaFilter(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER); }
    /** Unsafe version of {@link #forceExplicitReconstruction}. */
    public static int nforceExplicitReconstruction(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #ycbcrModel(int) ycbcrModel}. */
    public static void nycbcrModel(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL, value); }
    /** Unsafe version of {@link #ycbcrRange(int) ycbcrRange}. */
    public static void nycbcrRange(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkSamplerYcbcrConversionCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #xChromaOffset(int) xChromaOffset}. */
    public static void nxChromaOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET, value); }
    /** Unsafe version of {@link #yChromaOffset(int) yChromaOffset}. */
    public static void nyChromaOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET, value); }
    /** Unsafe version of {@link #chromaFilter(int) chromaFilter}. */
    public static void nchromaFilter(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER, value); }
    /** Unsafe version of {@link #forceExplicitReconstruction(boolean) forceExplicitReconstruction}. */
    public static void nforceExplicitReconstruction(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerYcbcrConversionCreateInfo ELEMENT_FACTORY = VkSamplerYcbcrConversionCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerYcbcrConversionCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSamplerYcbcrConversionCreateInfo.nformat(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#ycbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int ycbcrModel() { return VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#ycbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int ycbcrRange() { return VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address()); }
        /** @return a {@link VkComponentMapping} view of the {@link VkSamplerYcbcrConversionCreateInfo#components} field. */
        public VkComponentMapping components() { return VkSamplerYcbcrConversionCreateInfo.ncomponents(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#xChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int xChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#yChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int yChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#chromaFilter} field. */
        @NativeType("VkFilter")
        public int chromaFilter() { return VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionCreateInfo#forceExplicitReconstruction} field. */
        @NativeType("VkBool32")
        public boolean forceExplicitReconstruction() { return VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address()) != 0; }

        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#sType} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO} value to the {@link VkSamplerYcbcrConversionCreateInfo#sType} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO); }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#pNext} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerYcbcrConversionCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#format} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#ycbcrModel} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#ycbcrRange} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@link VkSamplerYcbcrConversionCreateInfo#components} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(VkComponentMapping value) { VkSamplerYcbcrConversionCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@link VkSamplerYcbcrConversionCreateInfo#components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#xChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#yChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#chromaFilter} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer chromaFilter(@NativeType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionCreateInfo#forceExplicitReconstruction} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    }

}