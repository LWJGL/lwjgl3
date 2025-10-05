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
 * struct VkVideoEncodeSessionRgbConversionCreateInfoVALVE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoEncodeRgbModelConversionFlagBitsVALVE rgbModel;
 *     VkVideoEncodeRgbRangeCompressionFlagBitsVALVE rgbRange;
 *     VkVideoEncodeRgbChromaOffsetFlagBitsVALVE xChromaOffset;
 *     VkVideoEncodeRgbChromaOffsetFlagBitsVALVE yChromaOffset;
 * }}</pre>
 */
public class VkVideoEncodeSessionRgbConversionCreateInfoVALVE extends Struct<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RGBMODEL,
        RGBRANGE,
        XCHROMAOFFSET,
        YCHROMAOFFSET;

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
        RGBMODEL = layout.offsetof(2);
        RGBRANGE = layout.offsetof(3);
        XCHROMAOFFSET = layout.offsetof(4);
        YCHROMAOFFSET = layout.offsetof(5);
    }

    protected VkVideoEncodeSessionRgbConversionCreateInfoVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code rgbModel} field. */
    @NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
    public int rgbModel() { return nrgbModel(address()); }
    /** @return the value of the {@code rgbRange} field. */
    @NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
    public int rgbRange() { return nrgbRange(address()); }
    /** @return the value of the {@code xChromaOffset} field. */
    @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int xChromaOffset() { return nxChromaOffset(address()); }
    /** @return the value of the {@code yChromaOffset} field. */
    @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int yChromaOffset() { return nyChromaOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE} value to the {@code sType} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rgbModel} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(@NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int value) { nrgbModel(address(), value); return this; }
    /** Sets the specified value to the {@code rgbRange} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(@NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int value) { nrgbRange(address(), value); return this; }
    /** Sets the specified value to the {@code xChromaOffset} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code yChromaOffset} field. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) { nyChromaOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(
        int sType,
        long pNext,
        int rgbModel,
        int rgbRange,
        int xChromaOffset,
        int yChromaOffset
    ) {
        sType(sType);
        pNext(pNext);
        rgbModel(rgbModel);
        rgbRange(rgbRange);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(VkVideoEncodeSessionRgbConversionCreateInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc() {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc() {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance for the specified memory address. */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long address) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeSessionRgbConversionCreateInfoVALVE createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.PNEXT); }
    /** Unsafe version of {@link #rgbModel}. */
    public static int nrgbModel(long struct) { return memGetInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBMODEL); }
    /** Unsafe version of {@link #rgbRange}. */
    public static int nrgbRange(long struct) { return memGetInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBRANGE); }
    /** Unsafe version of {@link #xChromaOffset}. */
    public static int nxChromaOffset(long struct) { return memGetInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.XCHROMAOFFSET); }
    /** Unsafe version of {@link #yChromaOffset}. */
    public static int nyChromaOffset(long struct) { return memGetInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.YCHROMAOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.PNEXT, value); }
    /** Unsafe version of {@link #rgbModel(int) rgbModel}. */
    public static void nrgbModel(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBMODEL, value); }
    /** Unsafe version of {@link #rgbRange(int) rgbRange}. */
    public static void nrgbRange(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.RGBRANGE, value); }
    /** Unsafe version of {@link #xChromaOffset(int) xChromaOffset}. */
    public static void nxChromaOffset(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.XCHROMAOFFSET, value); }
    /** Unsafe version of {@link #yChromaOffset(int) yChromaOffset}. */
    public static void nyChromaOffset(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionRgbConversionCreateInfoVALVE.YCHROMAOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionRgbConversionCreateInfoVALVE, Buffer> implements NativeResource {

        private static final VkVideoEncodeSessionRgbConversionCreateInfoVALVE ELEMENT_FACTORY = VkVideoEncodeSessionRgbConversionCreateInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeSessionRgbConversionCreateInfoVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeSessionRgbConversionCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(address()); }
        /** @return the value of the {@code rgbModel} field. */
        @NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
        public int rgbModel() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(address()); }
        /** @return the value of the {@code rgbRange} field. */
        @NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
        public int rgbRange() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(address()); }
        /** @return the value of the {@code xChromaOffset} field. */
        @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int xChromaOffset() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(address()); }
        /** @return the value of the {@code yChromaOffset} field. */
        @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int yChromaOffset() { return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE} value to the {@code sType} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rgbModel} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer rgbModel(@NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(address(), value); return this; }
        /** Sets the specified value to the {@code rgbRange} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer rgbRange(@NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(address(), value); return this; }
        /** Sets the specified value to the {@code xChromaOffset} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer xChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code yChromaOffset} field. */
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE.Buffer yChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) { VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(address(), value); return this; }

    }

}