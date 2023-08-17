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
 * Structure describing the image format properties of an Android hardware buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the Android hardware buffer has one of the formats listed in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-external-android-hardware-buffer-formats">Format Equivalence table</a>, then {@code format} <b>must</b> have the equivalent Vulkan format listed in the table. Otherwise, {@code format} <b>may</b> be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, indicating the Android hardware buffer <b>can</b> only be used with an external format.</p>
 * 
 * <p>The {@code formatFeatures} member <b>must</b> include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} and at least one of {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT} or {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}, and <b>should</b> include {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} and {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@code formatFeatures} member only indicates the features available when using an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-external-android-hardware-buffer-external-formats">external-format image</a> created from the Android hardware buffer. Images from Android hardware buffers with a format other than {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} are subject to the format capabilities obtained from {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2}, and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} with appropriate parameters. These sets of features are independent of each other, e.g. the external format will support sampler Y′C<sub>B</sub>C<sub>R</sub> conversion even if the non-external format does not, and writing to non-external format images is possible but writing to external format images is not.</p>
 * </div>
 * 
 * <p>Android hardware buffers with the same external format <b>must</b> have the same support for {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}, {@link VK11#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT}, {@link VK11#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT}, {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT}, {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT}, and {@link VK11#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT}. in {@code formatFeatures}. Other format features <b>may</b> differ between Android hardware buffers that have the same external format. This allows applications to use the same {@code VkSamplerYcbcrConversion} object (and samplers and pipelines created from them) for any Android hardware buffers that have the same external format.</p>
 * 
 * <p>If {@code format} is not {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, then the value of {@code samplerYcbcrConversionComponents} <b>must</b> be valid when used as the {@code components} member of {@link VkSamplerYcbcrConversionCreateInfo} with that format. If {@code format} is {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, all members of {@code samplerYcbcrConversionComponents} <b>must</b> be the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a>.</p>
 * 
 * <p>Implementations <b>may</b> not always be able to determine the color model, numerical range, or chroma offsets of the image contents, so the values in {@link VkAndroidHardwareBufferFormatPropertiesANDROID} are only suggestions. Applications <b>should</b> treat these values as sensible defaults to use in the absence of more reliable information obtained through some other means. If the underlying physical device is also usable via OpenGL ES with the <a href="https://registry.khronos.org/OpenGL/extensions/OES/OES_EGL_image_external.txt">{@code GL_OES_EGL_image_external}</a> extension, the implementation <b>should</b> suggest values that will produce similar sampled values as would be obtained by sampling the same external image via {@code samplerExternalOES} in OpenGL ES using equivalent sampler parameters.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Since <a href="https://registry.khronos.org/OpenGL/extensions/OES/OES_EGL_image_external.txt">{@code GL_OES_EGL_image_external}</a> does not require the same sampling and conversion calculations as Vulkan does, achieving identical results between APIs <b>may</b> not be possible on some implementations.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAndroidHardwareBufferFormatPropertiesANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFormat {@link #format};
 *     uint64_t {@link #externalFormat};
 *     VkFormatFeatureFlags {@link #formatFeatures};
 *     {@link VkComponentMapping VkComponentMapping} {@link #samplerYcbcrConversionComponents};
 *     VkSamplerYcbcrModelConversion {@link #suggestedYcbcrModel};
 *     VkSamplerYcbcrRange {@link #suggestedYcbcrRange};
 *     VkChromaLocation {@link #suggestedXChromaOffset};
 *     VkChromaLocation {@link #suggestedYChromaOffset};
 * }</code></pre>
 */
public class VkAndroidHardwareBufferFormatPropertiesANDROID extends Struct<VkAndroidHardwareBufferFormatPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        EXTERNALFORMAT,
        FORMATFEATURES,
        SAMPLERYCBCRCONVERSIONCOMPONENTS,
        SUGGESTEDYCBCRMODEL,
        SUGGESTEDYCBCRRANGE,
        SUGGESTEDXCHROMAOFFSET,
        SUGGESTEDYCHROMAOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
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
        EXTERNALFORMAT = layout.offsetof(3);
        FORMATFEATURES = layout.offsetof(4);
        SAMPLERYCBCRCONVERSIONCOMPONENTS = layout.offsetof(5);
        SUGGESTEDYCBCRMODEL = layout.offsetof(6);
        SUGGESTEDYCBCRRANGE = layout.offsetof(7);
        SUGGESTEDXCHROMAOFFSET = layout.offsetof(8);
        SUGGESTEDYCHROMAOFFSET = layout.offsetof(9);
    }

    protected VkAndroidHardwareBufferFormatPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAndroidHardwareBufferFormatPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAndroidHardwareBufferFormatPropertiesANDROID(ByteBuffer container) {
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
    /** the Vulkan format corresponding to the Android hardware buffer’s format, or {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED} if there is not an equivalent Vulkan format. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** an implementation-defined external format identifier for use with {@link VkExternalFormatANDROID}. It <b>must</b> not be zero. */
    @NativeType("uint64_t")
    public long externalFormat() { return nexternalFormat(address()); }
    /** describes the capabilities of this external format when used with an image bound to memory imported from {@code buffer}. */
    @NativeType("VkFormatFeatureFlags")
    public int formatFeatures() { return nformatFeatures(address()); }
    /** the component swizzle that <b>should</b> be used in {@link VkSamplerYcbcrConversionCreateInfo}. */
    public VkComponentMapping samplerYcbcrConversionComponents() { return nsamplerYcbcrConversionComponents(address()); }
    /** a suggested color model to use in the {@link VkSamplerYcbcrConversionCreateInfo}. */
    @NativeType("VkSamplerYcbcrModelConversion")
    public int suggestedYcbcrModel() { return nsuggestedYcbcrModel(address()); }
    /** a suggested numerical value range to use in {@link VkSamplerYcbcrConversionCreateInfo}. */
    @NativeType("VkSamplerYcbcrRange")
    public int suggestedYcbcrRange() { return nsuggestedYcbcrRange(address()); }
    /** a suggested X chroma offset to use in {@link VkSamplerYcbcrConversionCreateInfo}. */
    @NativeType("VkChromaLocation")
    public int suggestedXChromaOffset() { return nsuggestedXChromaOffset(address()); }
    /** a suggested Y chroma offset to use in {@link VkSamplerYcbcrConversionCreateInfo}. */
    @NativeType("VkChromaLocation")
    public int suggestedYChromaOffset() { return nsuggestedYChromaOffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID} value to the {@link #sType} field. */
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAndroidHardwareBufferFormatPropertiesANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAndroidHardwareBufferFormatPropertiesANDROID set(
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
    public VkAndroidHardwareBufferFormatPropertiesANDROID set(VkAndroidHardwareBufferFormatPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID malloc() {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID calloc() {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance for the specified memory address. */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID create(long address) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferFormatPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.FORMAT); }
    /** Unsafe version of {@link #externalFormat}. */
    public static long nexternalFormat(long struct) { return UNSAFE.getLong(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.EXTERNALFORMAT); }
    /** Unsafe version of {@link #formatFeatures}. */
    public static int nformatFeatures(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.FORMATFEATURES); }
    /** Unsafe version of {@link #samplerYcbcrConversionComponents}. */
    public static VkComponentMapping nsamplerYcbcrConversionComponents(long struct) { return VkComponentMapping.create(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SAMPLERYCBCRCONVERSIONCOMPONENTS); }
    /** Unsafe version of {@link #suggestedYcbcrModel}. */
    public static int nsuggestedYcbcrModel(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCBCRMODEL); }
    /** Unsafe version of {@link #suggestedYcbcrRange}. */
    public static int nsuggestedYcbcrRange(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCBCRRANGE); }
    /** Unsafe version of {@link #suggestedXChromaOffset}. */
    public static int nsuggestedXChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDXCHROMAOFFSET); }
    /** Unsafe version of {@link #suggestedYChromaOffset}. */
    public static int nsuggestedYChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCHROMAOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAndroidHardwareBufferFormatPropertiesANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAndroidHardwareBufferFormatPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferFormatPropertiesANDROID, Buffer> implements NativeResource {

        private static final VkAndroidHardwareBufferFormatPropertiesANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferFormatPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAndroidHardwareBufferFormatPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAndroidHardwareBufferFormatPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nformat(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#externalFormat} field. */
        @NativeType("uint64_t")
        public long externalFormat() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nexternalFormat(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#formatFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int formatFeatures() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nformatFeatures(address()); }
        /** @return a {@link VkComponentMapping} view of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#samplerYcbcrConversionComponents} field. */
        public VkComponentMapping samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsamplerYcbcrConversionComponents(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#suggestedYcbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrModel(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#suggestedYcbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrRange(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#suggestedXChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedXChromaOffset(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#suggestedYChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYChromaOffset(address()); }

        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID} value to the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatPropertiesANDROID#pNext} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address(), value); return this; }

    }

}