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
 * <pre>{@code
 * struct VkAndroidHardwareBufferFormatProperties2ANDROID {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormat format;
 *     uint64_t externalFormat;
 *     VkFormatFeatureFlags2 formatFeatures;
 *     {@link VkComponentMapping VkComponentMapping} samplerYcbcrConversionComponents;
 *     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
 *     VkSamplerYcbcrRange suggestedYcbcrRange;
 *     VkChromaLocation suggestedXChromaOffset;
 *     VkChromaLocation suggestedYChromaOffset;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code externalFormat} field. */
    @NativeType("uint64_t")
    public long externalFormat() { return nexternalFormat(address()); }
    /** @return the value of the {@code formatFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long formatFeatures() { return nformatFeatures(address()); }
    /** @return a {@link VkComponentMapping} view of the {@code samplerYcbcrConversionComponents} field. */
    public VkComponentMapping samplerYcbcrConversionComponents() { return nsamplerYcbcrConversionComponents(address()); }
    /** @return the value of the {@code suggestedYcbcrModel} field. */
    @NativeType("VkSamplerYcbcrModelConversion")
    public int suggestedYcbcrModel() { return nsuggestedYcbcrModel(address()); }
    /** @return the value of the {@code suggestedYcbcrRange} field. */
    @NativeType("VkSamplerYcbcrRange")
    public int suggestedYcbcrRange() { return nsuggestedYcbcrRange(address()); }
    /** @return the value of the {@code suggestedXChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int suggestedXChromaOffset() { return nsuggestedXChromaOffset(address()); }
    /** @return the value of the {@code suggestedYChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int suggestedYChromaOffset() { return nsuggestedYChromaOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID} value to the {@code sType} field. */
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID); }
    /** Sets the specified value to the {@code pNext} field. */
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
    public static @Nullable VkAndroidHardwareBufferFormatProperties2ANDROID createSafe(long address) {
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
    public static VkAndroidHardwareBufferFormatProperties2ANDROID.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.FORMAT); }
    /** Unsafe version of {@link #externalFormat}. */
    public static long nexternalFormat(long struct) { return memGetLong(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.EXTERNALFORMAT); }
    /** Unsafe version of {@link #formatFeatures}. */
    public static long nformatFeatures(long struct) { return memGetLong(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.FORMATFEATURES); }
    /** Unsafe version of {@link #samplerYcbcrConversionComponents}. */
    public static VkComponentMapping nsamplerYcbcrConversionComponents(long struct) { return VkComponentMapping.create(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SAMPLERYCBCRCONVERSIONCOMPONENTS); }
    /** Unsafe version of {@link #suggestedYcbcrModel}. */
    public static int nsuggestedYcbcrModel(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCBCRMODEL); }
    /** Unsafe version of {@link #suggestedYcbcrRange}. */
    public static int nsuggestedYcbcrRange(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCBCRRANGE); }
    /** Unsafe version of {@link #suggestedXChromaOffset}. */
    public static int nsuggestedXChromaOffset(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDXCHROMAOFFSET); }
    /** Unsafe version of {@link #suggestedYChromaOffset}. */
    public static int nsuggestedYChromaOffset(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.SUGGESTEDYCHROMAOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAndroidHardwareBufferFormatProperties2ANDROID.STYPE, value); }
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkAndroidHardwareBufferFormatProperties2ANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nformat(address()); }
        /** @return the value of the {@code externalFormat} field. */
        @NativeType("uint64_t")
        public long externalFormat() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nexternalFormat(address()); }
        /** @return the value of the {@code formatFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long formatFeatures() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nformatFeatures(address()); }
        /** @return a {@link VkComponentMapping} view of the {@code samplerYcbcrConversionComponents} field. */
        public VkComponentMapping samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsamplerYcbcrConversionComponents(address()); }
        /** @return the value of the {@code suggestedYcbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrModel(address()); }
        /** @return the value of the {@code suggestedYcbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrRange(address()); }
        /** @return the value of the {@code suggestedXChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedXChromaOffset(address()); }
        /** @return the value of the {@code suggestedYChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYChromaOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID} value to the {@code sType} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAndroidHardwareBufferFormatProperties2ANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address(), value); return this; }

    }

}