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
 * struct VkVideoEncodeRgbConversionCapabilitiesVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeRgbModelConversionFlagsVALVE rgbModels;
 *     VkVideoEncodeRgbRangeCompressionFlagsVALVE rgbRanges;
 *     VkVideoEncodeRgbChromaOffsetFlagsVALVE xChromaOffsets;
 *     VkVideoEncodeRgbChromaOffsetFlagsVALVE yChromaOffsets;
 * }}</pre>
 */
public class VkVideoEncodeRgbConversionCapabilitiesVALVE extends Struct<VkVideoEncodeRgbConversionCapabilitiesVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RGBMODELS,
        RGBRANGES,
        XCHROMAOFFSETS,
        YCHROMAOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RGBMODELS = layout.offsetof(2);
        RGBRANGES = layout.offsetof(3);
        XCHROMAOFFSETS = layout.offsetof(4);
        YCHROMAOFFSETS = layout.offsetof(5);
    }

    protected VkVideoEncodeRgbConversionCapabilitiesVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeRgbConversionCapabilitiesVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeRgbConversionCapabilitiesVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code rgbModels} field. */
    @NativeType("VkVideoEncodeRgbModelConversionFlagsVALVE")
    public int rgbModels() { return nrgbModels(address()); }
    /** @return the value of the {@code rgbRanges} field. */
    @NativeType("VkVideoEncodeRgbRangeCompressionFlagsVALVE")
    public int rgbRanges() { return nrgbRanges(address()); }
    /** @return the value of the {@code xChromaOffsets} field. */
    @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
    public int xChromaOffsets() { return nxChromaOffsets(address()); }
    /** @return the value of the {@code yChromaOffsets} field. */
    @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
    public int yChromaOffsets() { return nyChromaOffsets(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE} value to the {@code sType} field. */
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(
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
    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(VkVideoEncodeRgbConversionCapabilitiesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE malloc() {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE calloc() {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance for the specified memory address. */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE create(long address) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeRgbConversionCapabilitiesVALVE createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.PNEXT); }
    /** Unsafe version of {@link #rgbModels}. */
    public static int nrgbModels(long struct) { return memGetInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.RGBMODELS); }
    /** Unsafe version of {@link #rgbRanges}. */
    public static int nrgbRanges(long struct) { return memGetInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.RGBRANGES); }
    /** Unsafe version of {@link #xChromaOffsets}. */
    public static int nxChromaOffsets(long struct) { return memGetInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.XCHROMAOFFSETS); }
    /** Unsafe version of {@link #yChromaOffsets}. */
    public static int nyChromaOffsets(long struct) { return memGetInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.YCHROMAOFFSETS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRgbConversionCapabilitiesVALVE.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeRgbConversionCapabilitiesVALVE} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeRgbConversionCapabilitiesVALVE, Buffer> implements NativeResource {

        private static final VkVideoEncodeRgbConversionCapabilitiesVALVE ELEMENT_FACTORY = VkVideoEncodeRgbConversionCapabilitiesVALVE.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeRgbConversionCapabilitiesVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeRgbConversionCapabilitiesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.npNext(address()); }
        /** @return the value of the {@code rgbModels} field. */
        @NativeType("VkVideoEncodeRgbModelConversionFlagsVALVE")
        public int rgbModels() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.nrgbModels(address()); }
        /** @return the value of the {@code rgbRanges} field. */
        @NativeType("VkVideoEncodeRgbRangeCompressionFlagsVALVE")
        public int rgbRanges() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.nrgbRanges(address()); }
        /** @return the value of the {@code xChromaOffsets} field. */
        @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
        public int xChromaOffsets() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.nxChromaOffsets(address()); }
        /** @return the value of the {@code yChromaOffsets} field. */
        @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
        public int yChromaOffsets() { return VkVideoEncodeRgbConversionCapabilitiesVALVE.nyChromaOffsets(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeRgbConversionCapabilitiesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE} value to the {@code sType} field. */
        public VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeRgbConversionCapabilitiesVALVE.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeRgbConversionCapabilitiesVALVE.npNext(address(), value); return this; }

    }

}