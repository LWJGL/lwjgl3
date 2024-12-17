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
 * struct VkAndroidHardwareBufferFormatPropertiesANDROID {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormat format;
 *     uint64_t externalFormat;
 *     VkFormatFeatureFlags formatFeatures;
 *     {@link VkComponentMapping VkComponentMapping} samplerYcbcrConversionComponents;
 *     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
 *     VkSamplerYcbcrRange suggestedYcbcrRange;
 *     VkChromaLocation suggestedXChromaOffset;
 *     VkChromaLocation suggestedYChromaOffset;
 * }}</pre>
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
    @NativeType("VkFormatFeatureFlags")
    public int formatFeatures() { return nformatFeatures(address()); }
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
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID} value to the {@code sType} field. */
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code pNext} field. */
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
    public static @Nullable VkAndroidHardwareBufferFormatPropertiesANDROID createSafe(long address) {
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
    public static VkAndroidHardwareBufferFormatPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.FORMAT); }
    /** Unsafe version of {@link #externalFormat}. */
    public static long nexternalFormat(long struct) { return memGetLong(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.EXTERNALFORMAT); }
    /** Unsafe version of {@link #formatFeatures}. */
    public static int nformatFeatures(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.FORMATFEATURES); }
    /** Unsafe version of {@link #samplerYcbcrConversionComponents}. */
    public static VkComponentMapping nsamplerYcbcrConversionComponents(long struct) { return VkComponentMapping.create(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SAMPLERYCBCRCONVERSIONCOMPONENTS); }
    /** Unsafe version of {@link #suggestedYcbcrModel}. */
    public static int nsuggestedYcbcrModel(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCBCRMODEL); }
    /** Unsafe version of {@link #suggestedYcbcrRange}. */
    public static int nsuggestedYcbcrRange(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCBCRRANGE); }
    /** Unsafe version of {@link #suggestedXChromaOffset}. */
    public static int nsuggestedXChromaOffset(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDXCHROMAOFFSET); }
    /** Unsafe version of {@link #suggestedYChromaOffset}. */
    public static int nsuggestedYChromaOffset(long struct) { return memGetInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.SUGGESTEDYCHROMAOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAndroidHardwareBufferFormatPropertiesANDROID.STYPE, value); }
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkAndroidHardwareBufferFormatPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nformat(address()); }
        /** @return the value of the {@code externalFormat} field. */
        @NativeType("uint64_t")
        public long externalFormat() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nexternalFormat(address()); }
        /** @return the value of the {@code formatFeatures} field. */
        @NativeType("VkFormatFeatureFlags")
        public int formatFeatures() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nformatFeatures(address()); }
        /** @return a {@link VkComponentMapping} view of the {@code samplerYcbcrConversionComponents} field. */
        public VkComponentMapping samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsamplerYcbcrConversionComponents(address()); }
        /** @return the value of the {@code suggestedYcbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrModel(address()); }
        /** @return the value of the {@code suggestedYcbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrRange(address()); }
        /** @return the value of the {@code suggestedXChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedXChromaOffset(address()); }
        /** @return the value of the {@code suggestedYChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYChromaOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer sType(@NativeType("VkStructureType") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address(), value); return this; }
        /** Sets the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID} value to the {@code sType} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer sType$Default() { return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer pNext(@NativeType("void *") long value) { VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address(), value); return this; }

    }

}