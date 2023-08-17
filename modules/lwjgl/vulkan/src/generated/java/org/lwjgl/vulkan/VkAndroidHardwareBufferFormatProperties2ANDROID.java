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
 * <p>The bits reported in {@code formatFeatures} <b>must</b> include the bits reported in the corresponding fields of {@link VkAndroidHardwareBufferFormatPropertiesANDROID}{@code ::formatFeatures}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAndroidHardwareBufferFormatProperties2ANDROID {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFormat {@link #format};
 *     uint64_t {@link #externalFormat};
 *     VkFormatFeatureFlags2 {@link #formatFeatures};
 *     {@link VkComponentMapping VkComponentMapping} {@link #samplerYcbcrConversionComponents};
 *     VkSamplerYcbcrModelConversion {@link #suggestedYcbcrModel};
 *     VkSamplerYcbcrRange {@link #suggestedYcbcrRange};
 *     VkChromaLocation {@link #suggestedXChromaOffset};
 *     VkChromaLocation {@link #suggestedYChromaOffset};
 * }</code></pre>
 */
public class VkAndroidHardwareBufferFormatProperties2ANDROID extends Struct<VkAndroidHardwareBufferFormatProperties2ANDROID> implements NativeResource {

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
            __member(8),
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

    protected VkAndroidHardwareBufferFormatProperties2ANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAndroidHardwareBufferFormatProperties2ANDROID create(long address, @Nullable ByteBuffer container) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(address, container);
    }

    /**
     * Creates a {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAndroidHardwareBufferFormatProperties2ANDROID(ByteBuffer container) {
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
    @NativeType("VkFormatFeatureFlags2")
    public long formatFeatures() { return nformatFeatures(address()); }
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
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID} value to the {@link #sType} field. */
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAndroidHardwareBufferFormatProperties2ANDROID pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAndroidHardwareBufferFormatProperties2ANDROID set(
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
    public VkAndroidHardwareBufferFormatProperties2ANDROID set(VkAndroidHardwareBufferFormatProperties2ANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID malloc() {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID calloc() {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance allocated with {@link BufferUtils}. */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(memAddress(container), container);
    }

    /** Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance for the specified memory address. */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID create(long address) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferFormatProperties2ANDROID createSafe(long address) {
        return address == NULL ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(address, null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.FORMAT); }
    /** Unsafe version of {@link #externalFormat}. */
    public static long nexternalFormat(long struct) { return UNSAFE.getLong(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.EXTERNALFORMAT); }
    /** Unsafe version of {@link #formatFeatures}. */
    public static long nformatFeatures(long struct) { return UNSAFE.getLong(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.FORMATFEATURES); }
    /** Unsafe version of {@link #samplerYcbcrConversionComponents}. */
    public static VkComponentMapping nsamplerYcbcrConversionComponents(long struct) { return VkComponentMapping.create(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SAMPLERYCBCRCONVERSIONCOMPONENTS); }
    /** Unsafe version of {@link #suggestedYcbcrModel}. */
    public static int nsuggestedYcbcrModel(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCBCRMODEL); }
    /** Unsafe version of {@link #suggestedYcbcrRange}. */
    public static int nsuggestedYcbcrRange(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCBCRRANGE); }
    /** Unsafe version of {@link #suggestedXChromaOffset}. */
    public static int nsuggestedXChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDXCHROMAOFFSET); }
    /** Unsafe version of {@link #suggestedYChromaOffset}. */
    public static int nsuggestedYChromaOffset(long struct) { return UNSAFE.getInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCHROMAOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAndroidHardwareBufferFormatProperties2ANDROID.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAndroidHardwareBufferFormatProperties2ANDROID} structs. */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferFormatProperties2ANDROID, Buffer> implements NativeResource {

        private static final VkAndroidHardwareBufferFormatProperties2ANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferFormatProperties2ANDROID.create(-1L);

        /**
         * Creates a new {@code VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAndroidHardwareBufferFormatProperties2ANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAndroidHardwareBufferFormatProperties2ANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nformat(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#externalFormat} field. */
        @NativeType("uint64_t")
        public long externalFormat() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nexternalFormat(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#formatFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long formatFeatures() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nformatFeatures(address()); }
        /** @return a {@link VkComponentMapping} view of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#samplerYcbcrConversionComponents} field. */
        public VkComponentMapping samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsamplerYcbcrConversionComponents(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#suggestedYcbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrModel(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#suggestedYcbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrRange(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#suggestedXChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedXChromaOffset(address()); }
        /** @return the value of the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#suggestedYChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYChromaOffset(address()); }

        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID} value to the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#sType} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID); }
        /** Sets the specified value to the {@link VkAndroidHardwareBufferFormatProperties2ANDROID#pNext} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address(), value); return this; }

    }

}