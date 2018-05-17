/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * HMD info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; frame buffer width</li>
 * <li>{@code height} &ndash; frame buffer height</li>
 * <li>{@code deviceWidth} &ndash; device resolution width</li>
 * <li>{@code deviceHeight} &ndash; device resolution height</li>
 * <li>{@code flags} &ndash; status flags</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_hmd_t {
 *     {@link BGFXHmdEye bgfx_hmd_eye_t} eye[2];
 *     uint16_t width;
 *     uint16_t height;
 *     uint32_t deviceWidth;
 *     uint32_t deviceHeight;
 *     uint8_t flags;
 * }</pre></code>
 */
@NativeType("struct bgfx_hmd_t")
public class BGFXHmd extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EYE,
        WIDTH,
        HEIGHT,
        DEVICEWIDTH,
        DEVICEHEIGHT,
        FLAGS;

    static {
        Layout layout = __struct(
            __array(BGFXHmdEye.SIZEOF, BGFXHmdEye.ALIGNOF, 2),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EYE = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        DEVICEWIDTH = layout.offsetof(3);
        DEVICEHEIGHT = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    BGFXHmd(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXHmd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXHmd(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link BGFXHmdEye}.Buffer view of the {@code eye} field. */
    @NativeType("bgfx_hmd_eye_t[2]")
    public BGFXHmdEye.Buffer eye() { return neye(address()); }
    /** Returns a {@link BGFXHmdEye} view of the struct at the specified index of the {@code eye} field. */
    @NativeType("bgfx_hmd_eye_t")
    public BGFXHmdEye eye(int index) { return neye(address(), index); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint16_t")
    public short width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint16_t")
    public short height() { return nheight(address()); }
    /** Returns the value of the {@code deviceWidth} field. */
    @NativeType("uint32_t")
    public int deviceWidth() { return ndeviceWidth(address()); }
    /** Returns the value of the {@code deviceHeight} field. */
    @NativeType("uint32_t")
    public int deviceHeight() { return ndeviceHeight(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("uint8_t")
    public byte flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXHmd} instance for the specified memory address. */
    public static BGFXHmd create(long address) {
        return new BGFXHmd(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXHmd createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eye}. */
    public static BGFXHmdEye.Buffer neye(long struct) { return BGFXHmdEye.create(struct + BGFXHmd.EYE, 2); }
    /** Unsafe version of {@link #eye(int) eye}. */
    public static BGFXHmdEye neye(long struct, int index) {
        return BGFXHmdEye.create(struct + BGFXHmd.EYE + check(index, 2) * BGFXHmdEye.SIZEOF);
    }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return memGetShort(struct + BGFXHmd.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return memGetShort(struct + BGFXHmd.HEIGHT); }
    /** Unsafe version of {@link #deviceWidth}. */
    public static int ndeviceWidth(long struct) { return memGetInt(struct + BGFXHmd.DEVICEWIDTH); }
    /** Unsafe version of {@link #deviceHeight}. */
    public static int ndeviceHeight(long struct) { return memGetInt(struct + BGFXHmd.DEVICEHEIGHT); }
    /** Unsafe version of {@link #flags}. */
    public static byte nflags(long struct) { return memGetByte(struct + BGFXHmd.FLAGS); }

}