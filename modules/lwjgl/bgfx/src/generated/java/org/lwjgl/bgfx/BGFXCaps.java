/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.bgfx.BGFX.BGFX_TEXTURE_FORMAT_COUNT;

/**
 * <pre>{@code
 * struct bgfx_caps_t {
 *     bgfx_renderer_type_t rendererType;
 *     uint64_t supported;
 *     uint16_t vendorId;
 *     uint16_t deviceId;
 *     bool homogeneousDepth;
 *     bool originBottomLeft;
 *     uint8_t numGPUs;
 *     {@link BGFXCapsGPU bgfx_caps_gpu_t} gpu[4];
 *     {@link BGFXCapsLimits bgfx_caps_limits_t} limits;
 *     uint16_t formats[BGFX_TEXTURE_FORMAT_COUNT];
 * }}</pre>
 */
@NativeType("struct bgfx_caps_t")
public class BGFXCaps extends Struct<BGFXCaps> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RENDERERTYPE,
        SUPPORTED,
        VENDORID,
        DEVICEID,
        HOMOGENEOUSDEPTH,
        ORIGINBOTTOMLEFT,
        NUMGPUS,
        GPU,
        LIMITS,
        FORMATS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __array(BGFXCapsGPU.SIZEOF, BGFXCapsGPU.ALIGNOF, 4),
            __member(BGFXCapsLimits.SIZEOF, BGFXCapsLimits.ALIGNOF),
            __array(2, BGFX_TEXTURE_FORMAT_COUNT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RENDERERTYPE = layout.offsetof(0);
        SUPPORTED = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        HOMOGENEOUSDEPTH = layout.offsetof(4);
        ORIGINBOTTOMLEFT = layout.offsetof(5);
        NUMGPUS = layout.offsetof(6);
        GPU = layout.offsetof(7);
        LIMITS = layout.offsetof(8);
        FORMATS = layout.offsetof(9);
    }

    protected BGFXCaps(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXCaps create(long address, @Nullable ByteBuffer container) {
        return new BGFXCaps(address, container);
    }

    /**
     * Creates a {@code BGFXCaps} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCaps(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code rendererType} field. */
    @NativeType("bgfx_renderer_type_t")
    public int rendererType() { return nrendererType(address()); }
    /** @return the value of the {@code supported} field. */
    @NativeType("uint64_t")
    public long supported() { return nsupported(address()); }
    /** @return the value of the {@code vendorId} field. */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** @return the value of the {@code deviceId} field. */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }
    /** @return the value of the {@code homogeneousDepth} field. */
    @NativeType("bool")
    public boolean homogeneousDepth() { return nhomogeneousDepth(address()); }
    /** @return the value of the {@code originBottomLeft} field. */
    @NativeType("bool")
    public boolean originBottomLeft() { return noriginBottomLeft(address()); }
    /** @return the value of the {@code numGPUs} field. */
    @NativeType("uint8_t")
    public byte numGPUs() { return nnumGPUs(address()); }
    /** @return a {@link BGFXCapsGPU}.Buffer view of the {@code gpu} field. */
    @NativeType("bgfx_caps_gpu_t[4]")
    public BGFXCapsGPU.Buffer gpu() { return ngpu(address()); }
    /** @return a {@link BGFXCapsGPU} view of the struct at the specified index of the {@code gpu} field. */
    @NativeType("bgfx_caps_gpu_t")
    public BGFXCapsGPU gpu(int index) { return ngpu(address(), index); }
    /** @return a {@link BGFXCapsLimits} view of the {@code limits} field. */
    @NativeType("bgfx_caps_limits_t")
    public BGFXCapsLimits limits() { return nlimits(address()); }
    /** @return a {@link ShortBuffer} view of the {@code formats} field. */
    @NativeType("uint16_t[BGFX_TEXTURE_FORMAT_COUNT]")
    public ShortBuffer formats() { return nformats(address()); }
    /** @return the value at the specified index of the {@code formats} field. */
    @NativeType("uint16_t")
    public short formats(int index) { return nformats(address(), index); }

    // -----------------------------------

    /** Returns a new {@code BGFXCaps} instance for the specified memory address. */
    public static BGFXCaps create(long address) {
        return new BGFXCaps(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXCaps createSafe(long address) {
        return address == NULL ? null : new BGFXCaps(address, null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rendererType}. */
    public static int nrendererType(long struct) { return memGetInt(struct + BGFXCaps.RENDERERTYPE); }
    /** Unsafe version of {@link #supported}. */
    public static long nsupported(long struct) { return memGetLong(struct + BGFXCaps.SUPPORTED); }
    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return memGetShort(struct + BGFXCaps.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return memGetShort(struct + BGFXCaps.DEVICEID); }
    /** Unsafe version of {@link #homogeneousDepth}. */
    public static boolean nhomogeneousDepth(long struct) { return memGetByte(struct + BGFXCaps.HOMOGENEOUSDEPTH) != 0; }
    /** Unsafe version of {@link #originBottomLeft}. */
    public static boolean noriginBottomLeft(long struct) { return memGetByte(struct + BGFXCaps.ORIGINBOTTOMLEFT) != 0; }
    /** Unsafe version of {@link #numGPUs}. */
    public static byte nnumGPUs(long struct) { return memGetByte(struct + BGFXCaps.NUMGPUS); }
    /** Unsafe version of {@link #gpu}. */
    public static BGFXCapsGPU.Buffer ngpu(long struct) { return BGFXCapsGPU.create(struct + BGFXCaps.GPU, Byte.toUnsignedInt(nnumGPUs(struct))); }
    /** Unsafe version of {@link #gpu(int) gpu}. */
    public static BGFXCapsGPU ngpu(long struct, int index) {
        return BGFXCapsGPU.create(struct + BGFXCaps.GPU + check(index, Byte.toUnsignedInt(nnumGPUs(struct))) * BGFXCapsGPU.SIZEOF);
    }
    /** Unsafe version of {@link #limits}. */
    public static BGFXCapsLimits nlimits(long struct) { return BGFXCapsLimits.create(struct + BGFXCaps.LIMITS); }
    /** Unsafe version of {@link #formats}. */
    public static ShortBuffer nformats(long struct) { return memShortBuffer(struct + BGFXCaps.FORMATS, BGFX_TEXTURE_FORMAT_COUNT); }
    /** Unsafe version of {@link #formats(int) formats}. */
    public static short nformats(long struct, int index) {
        return memGetShort(struct + BGFXCaps.FORMATS + check(index, BGFX_TEXTURE_FORMAT_COUNT) * 2);
    }

}