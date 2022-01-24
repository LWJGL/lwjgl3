/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265ScalingLists {
 *     uint8_t {@link #ScalingList4x4}[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS];
 *     uint8_t {@link #ScalingList8x8}[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS];
 *     uint8_t {@link #ScalingList16x16}[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS];
 *     uint8_t {@link #ScalingList32x32}[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS];
 *     uint8_t {@link #ScalingListDCCoef16x16}[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS];
 *     uint8_t {@link #ScalingListDCCoef32x32}[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS];
 * }</code></pre>
 */
public class StdVideoH265ScalingLists extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SCALINGLIST4X4,
        SCALINGLIST8X8,
        SCALINGLIST16X16,
        SCALINGLIST32X32,
        SCALINGLISTDCCOEF16X16,
        SCALINGLISTDCCOEF32X32;

    static {
        Layout layout = __struct(
            __array(1, STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS),
            __array(1, STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS),
            __array(1, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS),
            __array(1, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS),
            __array(1, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS),
            __array(1, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SCALINGLIST4X4 = layout.offsetof(0);
        SCALINGLIST8X8 = layout.offsetof(1);
        SCALINGLIST16X16 = layout.offsetof(2);
        SCALINGLIST32X32 = layout.offsetof(3);
        SCALINGLISTDCCOEF16X16 = layout.offsetof(4);
        SCALINGLISTDCCOEF32X32 = layout.offsetof(5);
    }

    /**
     * Creates a {@code StdVideoH265ScalingLists} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265ScalingLists(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code scalingList[ 0 ][ MatrixID ][ i ] (sizeID = 0)} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
    public ByteBuffer ScalingList4x4() { return nScalingList4x4(address()); }
    /** {@code scalingList[ 0 ][ MatrixID ][ i ] (sizeID = 0)} */
    @NativeType("uint8_t")
    public byte ScalingList4x4(int index) { return nScalingList4x4(address(), index); }
    /** {@code scalingList[ 1 ][ MatrixID ][ i ] (sizeID = 1)} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
    public ByteBuffer ScalingList8x8() { return nScalingList8x8(address()); }
    /** {@code scalingList[ 1 ][ MatrixID ][ i ] (sizeID = 1)} */
    @NativeType("uint8_t")
    public byte ScalingList8x8(int index) { return nScalingList8x8(address(), index); }
    /** {@code scalingList[ 2 ][ MatrixID ][ i ] (sizeID = 2)} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
    public ByteBuffer ScalingList16x16() { return nScalingList16x16(address()); }
    /** {@code scalingList[ 2 ][ MatrixID ][ i ] (sizeID = 2)} */
    @NativeType("uint8_t")
    public byte ScalingList16x16(int index) { return nScalingList16x16(address(), index); }
    /** {@code scalingList[ 3 ][ MatrixID ][ i ] (sizeID = 3)} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
    public ByteBuffer ScalingList32x32() { return nScalingList32x32(address()); }
    /** {@code scalingList[ 3 ][ MatrixID ][ i ] (sizeID = 3)} */
    @NativeType("uint8_t")
    public byte ScalingList32x32(int index) { return nScalingList32x32(address(), index); }
    /** {@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8, sizeID = 2} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
    public ByteBuffer ScalingListDCCoef16x16() { return nScalingListDCCoef16x16(address()); }
    /** {@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8, sizeID = 2} */
    @NativeType("uint8_t")
    public byte ScalingListDCCoef16x16(int index) { return nScalingListDCCoef16x16(address(), index); }
    /** {@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8. sizeID = 3} */
    @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
    public ByteBuffer ScalingListDCCoef32x32() { return nScalingListDCCoef32x32(address()); }
    /** {@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8. sizeID = 3} */
    @NativeType("uint8_t")
    public byte ScalingListDCCoef32x32(int index) { return nScalingListDCCoef32x32(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingList4x4} field. */
    public StdVideoH265ScalingLists ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) { nScalingList4x4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingList4x4} field. */
    public StdVideoH265ScalingLists ScalingList4x4(int index, @NativeType("uint8_t") byte value) { nScalingList4x4(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingList8x8} field. */
    public StdVideoH265ScalingLists ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) { nScalingList8x8(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingList8x8} field. */
    public StdVideoH265ScalingLists ScalingList8x8(int index, @NativeType("uint8_t") byte value) { nScalingList8x8(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingList16x16} field. */
    public StdVideoH265ScalingLists ScalingList16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") ByteBuffer value) { nScalingList16x16(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingList16x16} field. */
    public StdVideoH265ScalingLists ScalingList16x16(int index, @NativeType("uint8_t") byte value) { nScalingList16x16(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingList32x32} field. */
    public StdVideoH265ScalingLists ScalingList32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") ByteBuffer value) { nScalingList32x32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingList32x32} field. */
    public StdVideoH265ScalingLists ScalingList32x32(int index, @NativeType("uint8_t") byte value) { nScalingList32x32(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingListDCCoef16x16} field. */
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") ByteBuffer value) { nScalingListDCCoef16x16(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingListDCCoef16x16} field. */
    public StdVideoH265ScalingLists ScalingListDCCoef16x16(int index, @NativeType("uint8_t") byte value) { nScalingListDCCoef16x16(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #ScalingListDCCoef32x32} field. */
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") ByteBuffer value) { nScalingListDCCoef32x32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #ScalingListDCCoef32x32} field. */
    public StdVideoH265ScalingLists ScalingListDCCoef32x32(int index, @NativeType("uint8_t") byte value) { nScalingListDCCoef32x32(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265ScalingLists set(
        ByteBuffer ScalingList4x4,
        ByteBuffer ScalingList8x8,
        ByteBuffer ScalingList16x16,
        ByteBuffer ScalingList32x32,
        ByteBuffer ScalingListDCCoef16x16,
        ByteBuffer ScalingListDCCoef32x32
    ) {
        ScalingList4x4(ScalingList4x4);
        ScalingList8x8(ScalingList8x8);
        ScalingList16x16(ScalingList16x16);
        ScalingList32x32(ScalingList32x32);
        ScalingListDCCoef16x16(ScalingListDCCoef16x16);
        ScalingListDCCoef32x32(ScalingListDCCoef32x32);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265ScalingLists set(StdVideoH265ScalingLists src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265ScalingLists} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265ScalingLists malloc() {
        return wrap(StdVideoH265ScalingLists.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265ScalingLists} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265ScalingLists calloc() {
        return wrap(StdVideoH265ScalingLists.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265ScalingLists} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265ScalingLists create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265ScalingLists.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265ScalingLists} instance for the specified memory address. */
    public static StdVideoH265ScalingLists create(long address) {
        return wrap(StdVideoH265ScalingLists.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ScalingLists createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265ScalingLists.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265ScalingLists.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ScalingLists.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ScalingLists.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265ScalingLists.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ScalingLists.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265ScalingLists} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ScalingLists malloc(MemoryStack stack) {
        return wrap(StdVideoH265ScalingLists.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265ScalingLists} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ScalingLists calloc(MemoryStack stack) {
        return wrap(StdVideoH265ScalingLists.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265ScalingLists.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ScalingLists.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ScalingLists.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ScalingList4x4}. */
    public static ByteBuffer nScalingList4x4(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLIST4X4, STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList4x4(int) ScalingList4x4}. */
    public static byte nScalingList4x4(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST4X4 + check(index, STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS) * 1);
    }
    /** Unsafe version of {@link #ScalingList8x8}. */
    public static ByteBuffer nScalingList8x8(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLIST8X8, STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList8x8(int) ScalingList8x8}. */
    public static byte nScalingList8x8(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST8X8 + check(index, STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS) * 1);
    }
    /** Unsafe version of {@link #ScalingList16x16}. */
    public static ByteBuffer nScalingList16x16(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLIST16X16, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList16x16(int) ScalingList16x16}. */
    public static byte nScalingList16x16(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST16X16 + check(index, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS) * 1);
    }
    /** Unsafe version of {@link #ScalingList32x32}. */
    public static ByteBuffer nScalingList32x32(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLIST32X32, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList32x32(int) ScalingList32x32}. */
    public static byte nScalingList32x32(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST32X32 + check(index, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS) * 1);
    }
    /** Unsafe version of {@link #ScalingListDCCoef16x16}. */
    public static ByteBuffer nScalingListDCCoef16x16(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS); }
    /** Unsafe version of {@link #ScalingListDCCoef16x16(int) ScalingListDCCoef16x16}. */
    public static byte nScalingListDCCoef16x16(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16 + check(index, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS) * 1);
    }
    /** Unsafe version of {@link #ScalingListDCCoef32x32}. */
    public static ByteBuffer nScalingListDCCoef32x32(long struct) { return memByteBuffer(struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS); }
    /** Unsafe version of {@link #ScalingListDCCoef32x32(int) ScalingListDCCoef32x32}. */
    public static byte nScalingListDCCoef32x32(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32 + check(index, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS) * 1);
    }

    /** Unsafe version of {@link #ScalingList4x4(ByteBuffer) ScalingList4x4}. */
    public static void nScalingList4x4(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLIST4X4, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList4x4(int, byte) ScalingList4x4}. */
    public static void nScalingList4x4(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST4X4 + check(index, STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingList8x8(ByteBuffer) ScalingList8x8}. */
    public static void nScalingList8x8(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLIST8X8, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList8x8(int, byte) ScalingList8x8}. */
    public static void nScalingList8x8(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST8X8 + check(index, STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingList16x16(ByteBuffer) ScalingList16x16}. */
    public static void nScalingList16x16(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLIST16X16, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList16x16(int, byte) ScalingList16x16}. */
    public static void nScalingList16x16(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST16X16 + check(index, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingList32x32(ByteBuffer) ScalingList32x32}. */
    public static void nScalingList32x32(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLIST32X32, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList32x32(int, byte) ScalingList32x32}. */
    public static void nScalingList32x32(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLIST32X32 + check(index, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingListDCCoef16x16(ByteBuffer) ScalingListDCCoef16x16}. */
    public static void nScalingListDCCoef16x16(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingListDCCoef16x16(int, byte) ScalingListDCCoef16x16}. */
    public static void nScalingListDCCoef16x16(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF16X16 + check(index, STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingListDCCoef32x32(ByteBuffer) ScalingListDCCoef32x32}. */
    public static void nScalingListDCCoef32x32(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS); }
        memCopy(memAddress(value), struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingListDCCoef32x32(int, byte) ScalingListDCCoef32x32}. */
    public static void nScalingListDCCoef32x32(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265ScalingLists.SCALINGLISTDCCOEF32X32 + check(index, STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265ScalingLists} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265ScalingLists, Buffer> implements NativeResource {

        private static final StdVideoH265ScalingLists ELEMENT_FACTORY = StdVideoH265ScalingLists.create(-1L);

        /**
         * Creates a new {@code StdVideoH265ScalingLists.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265ScalingLists#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265ScalingLists getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingList4x4} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]")
        public ByteBuffer ScalingList4x4() { return StdVideoH265ScalingLists.nScalingList4x4(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList4x4} field. */
        @NativeType("uint8_t")
        public byte ScalingList4x4(int index) { return StdVideoH265ScalingLists.nScalingList4x4(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingList8x8} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]")
        public ByteBuffer ScalingList8x8() { return StdVideoH265ScalingLists.nScalingList8x8(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList8x8} field. */
        @NativeType("uint8_t")
        public byte ScalingList8x8(int index) { return StdVideoH265ScalingLists.nScalingList8x8(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingList16x16} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]")
        public ByteBuffer ScalingList16x16() { return StdVideoH265ScalingLists.nScalingList16x16(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList16x16} field. */
        @NativeType("uint8_t")
        public byte ScalingList16x16(int index) { return StdVideoH265ScalingLists.nScalingList16x16(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingList32x32} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]")
        public ByteBuffer ScalingList32x32() { return StdVideoH265ScalingLists.nScalingList32x32(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList32x32} field. */
        @NativeType("uint8_t")
        public byte ScalingList32x32(int index) { return StdVideoH265ScalingLists.nScalingList32x32(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingListDCCoef16x16} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]")
        public ByteBuffer ScalingListDCCoef16x16() { return StdVideoH265ScalingLists.nScalingListDCCoef16x16(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingListDCCoef16x16} field. */
        @NativeType("uint8_t")
        public byte ScalingListDCCoef16x16(int index) { return StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link StdVideoH265ScalingLists#ScalingListDCCoef32x32} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]")
        public ByteBuffer ScalingListDCCoef32x32() { return StdVideoH265ScalingLists.nScalingListDCCoef32x32(address()); }
        /** @return the value at the specified index of the {@link StdVideoH265ScalingLists#ScalingListDCCoef32x32} field. */
        @NativeType("uint8_t")
        public byte ScalingListDCCoef32x32(int index) { return StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingList4x4} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingList4x4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList4x4} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList4x4(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingList4x4(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingList8x8} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingList8x8(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList8x8} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList8x8(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingList8x8(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingList16x16} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingList16x16(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList16x16} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList16x16(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingList16x16(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingList32x32} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingList32x32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingList32x32} field. */
        public StdVideoH265ScalingLists.Buffer ScalingList32x32(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingList32x32(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingListDCCoef16x16} field. */
        public StdVideoH265ScalingLists.Buffer ScalingListDCCoef16x16(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingListDCCoef16x16} field. */
        public StdVideoH265ScalingLists.Buffer ScalingListDCCoef16x16(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingListDCCoef16x16(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link StdVideoH265ScalingLists#ScalingListDCCoef32x32} field. */
        public StdVideoH265ScalingLists.Buffer ScalingListDCCoef32x32(@NativeType("uint8_t[STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS]") ByteBuffer value) { StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoH265ScalingLists#ScalingListDCCoef32x32} field. */
        public StdVideoH265ScalingLists.Buffer ScalingListDCCoef32x32(int index, @NativeType("uint8_t") byte value) { StdVideoH265ScalingLists.nScalingListDCCoef32x32(address(), index, value); return this; }

    }

}