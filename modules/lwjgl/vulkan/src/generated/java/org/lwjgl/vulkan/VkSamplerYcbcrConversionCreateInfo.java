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
 * </div>
 * 
 * <p>Sampler Y'C<sub>B</sub>C<sub>R</sub> conversion objects do not support <em>external format conversion</em> without additional extensions defining <em>external formats</em>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>{@code format} <b>must</b> support {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT} or {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}</li>
 * <li>If the format does not support {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link VK11#VK_CHROMA_LOCATION_COSITED_EVEN CHROMA_LOCATION_COSITED_EVEN}</li>
 * <li>If the format does not support {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link VK11#VK_CHROMA_LOCATION_MIDPOINT CHROMA_LOCATION_MIDPOINT}</li>
 * <li>{@code format} <b>must</b> represent unsigned normalized values (i.e. the format must be a {@code UNORM} format)</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.g} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.a} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}, {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, or {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.r} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY} or {@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, then {@code components.b} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY} or {@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix, and if either {@code components.r} or {@code components.b} is {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}, both values <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
 * <li>If {@code ycbcrModel} is not {@link VK11#VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY}, then {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> correspond to channels of the {@code format}; that is, {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> not be {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO} or {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, and <b>must</b> not correspond to a channel which contains zero or one as a consequence of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#textures-conversion-to-rgba">conversion to RGBA</a></li>
 * <li>If the format does not support {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT}, {@code forceExplicitReconstruction} <b>must</b> be FALSE</li>
 * <li>If the format does not support {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT}, {@code chromaFilter} <b>must</b> be {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}</li>
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
 * <p>If {@code chromaFilter} is {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}, chroma samples are reconstructed to luma channel resolution using nearest-neighbour sampling. Otherwise, chroma samples are reconstructed using interpolation. More details can be found in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#textures-sampler-YCbCr-conversion">the description of sampler Y'C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#textures">Image Operations</a> chapter.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link VK11#vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code format} &ndash; the format of the image from which color information will be retrieved.</li>
 * <li>{@code ycbcrModel} &ndash; describes the color matrix for conversion between color models.</li>
 * <li>{@code ycbcrRange} &ndash; describes whether the encoded values have headroom and foot room, or whether the encoding uses the full numerical range.</li>
 * <li>{@code components} &ndash; applies a <em>swizzle</em> based on {@code VkComponentSwizzle} enums prior to range expansion and color model conversion.</li>
 * <li>{@code xChromaOffset} &ndash; describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma channels in the x dimension. {@code xChromaOffset} has no effect for formats in which chroma channels are the same resolution as the luma channel.</li>
 * <li>{@code yChromaOffset} &ndash; describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma channels in the y dimension. {@code yChromaOffset} has no effect for formats in which the chroma channels are not downsampled vertically.</li>
 * <li>{@code chromaFilter} &ndash; the filter for chroma reconstruction.</li>
 * <li>{@code forceExplicitReconstruction} &ndash; <b>can</b> be used to ensure that reconstruction is done explicitly, if supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     VkSamplerYcbcrModelConversion ycbcrModel;
 *     VkSamplerYcbcrRange ycbcrRange;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     VkChromaLocation xChromaOffset;
 *     VkChromaLocation yChromaOffset;
 *     VkFilter chromaFilter;
 *     VkBool32 forceExplicitReconstruction;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code ycbcrModel} field. */
    @NativeType("VkSamplerYcbcrModelConversion")
    public int ycbcrModel() { return nycbcrModel(address()); }
    /** Returns the value of the {@code ycbcrRange} field. */
    @NativeType("VkSamplerYcbcrRange")
    public int ycbcrRange() { return nycbcrRange(address()); }
    /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** Returns the value of the {@code xChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int xChromaOffset() { return nxChromaOffset(address()); }
    /** Returns the value of the {@code yChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int yChromaOffset() { return nyChromaOffset(address()); }
    /** Returns the value of the {@code chromaFilter} field. */
    @NativeType("VkFilter")
    public int chromaFilter() { return nchromaFilter(address()); }
    /** Returns the value of the {@code forceExplicitReconstruction} field. */
    @NativeType("VkBool32")
    public boolean forceExplicitReconstruction() { return nforceExplicitReconstruction(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerYcbcrConversionCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerYcbcrConversionCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkSamplerYcbcrConversionCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrModel} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { nycbcrModel(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrRange} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { nycbcrRange(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkSamplerYcbcrConversionCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerYcbcrConversionCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Sets the specified value to the {@code xChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(@NativeType("VkChromaLocation") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code yChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(@NativeType("VkChromaLocation") int value) { nyChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code chromaFilter} field. */
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(@NativeType("VkFilter") int value) { nchromaFilter(address(), value); return this; }
    /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
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

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerYcbcrConversionCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerYcbcrConversionCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerYcbcrConversionCreateInfo.npNext(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSamplerYcbcrConversionCreateInfo.nformat(address()); }
        /** Returns the value of the {@code ycbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int ycbcrModel() { return VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address()); }
        /** Returns the value of the {@code ycbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int ycbcrRange() { return VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address()); }
        /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkSamplerYcbcrConversionCreateInfo.ncomponents(address()); }
        /** Returns the value of the {@code xChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int xChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address()); }
        /** Returns the value of the {@code yChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int yChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address()); }
        /** Returns the value of the {@code chromaFilter} field. */
        @NativeType("VkFilter")
        public int chromaFilter() { return VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address()); }
        /** Returns the value of the {@code forceExplicitReconstruction} field. */
        @NativeType("VkBool32")
        public boolean forceExplicitReconstruction() { return VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerYcbcrConversionCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrModel} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrRange} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(VkComponentMapping value) { VkSamplerYcbcrConversionCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Sets the specified value to the {@code xChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code yChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code chromaFilter} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer chromaFilter(@NativeType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address(), value); return this; }
        /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    }

}