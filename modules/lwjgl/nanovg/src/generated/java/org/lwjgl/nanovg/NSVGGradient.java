/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NSVGgradient {
 *     float xform[6];
 *     char spread;
 *     float fx;
 *     float fy;
 *     int nstops;
 *     {@link NSVGGradientStop NSVGgradientStop} pstops[1];
 * }</code></pre>
 */
@NativeType("struct NSVGgradient")
public class NSVGGradient extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XFORM,
        SPREAD,
        FX,
        FY,
        NSTOPS,
        PSTOPS;

    static {
        Layout layout = __struct(
            __array(4, 6),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __array(NSVGGradientStop.SIZEOF, NSVGGradientStop.ALIGNOF, 1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XFORM = layout.offsetof(0);
        SPREAD = layout.offsetof(1);
        FX = layout.offsetof(2);
        FY = layout.offsetof(3);
        NSTOPS = layout.offsetof(4);
        PSTOPS = layout.offsetof(5);
    }

    /**
     * Creates a {@code NSVGGradient} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGGradient(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code xform} field. */
    @NativeType("float[6]")
    public FloatBuffer xform() { return nxform(address()); }
    /** @return the value at the specified index of the {@code xform} field. */
    public float xform(int index) { return nxform(address(), index); }
    /** @return the value of the {@code spread} field. */
    @NativeType("char")
    public byte spread() { return nspread(address()); }
    /** @return the value of the {@code fx} field. */
    public float fx() { return nfx(address()); }
    /** @return the value of the {@code fy} field. */
    public float fy() { return nfy(address()); }
    /** @return the value of the {@code nstops} field. */
    public int nstops() { return nnstops(address()); }
    /** @return a {@link NSVGGradientStop}.Buffer view of the {@code pstops} field. */
    @NativeType("NSVGgradientStop[1]")
    public NSVGGradientStop.Buffer pstops() { return npstops(address()); }
    /** @return a {@link NSVGGradientStop} view of the struct at the specified index of the {@code pstops} field. */
    @NativeType("NSVGgradientStop")
    public NSVGGradientStop pstops(int index) { return npstops(address(), index); }

    // -----------------------------------

    /** Returns a new {@code NSVGGradient} instance for the specified memory address. */
    public static NSVGGradient create(long address) {
        return wrap(NSVGGradient.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGGradient createSafe(long address) {
        return address == NULL ? null : wrap(NSVGGradient.class, address);
    }

    /**
     * Create a {@link NSVGGradient.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGGradient.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGGradient.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xform}. */
    public static FloatBuffer nxform(long struct) { return memFloatBuffer(struct + NSVGGradient.XFORM, 6); }
    /** Unsafe version of {@link #xform(int) xform}. */
    public static float nxform(long struct, int index) {
        return UNSAFE.getFloat(null, struct + NSVGGradient.XFORM + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #spread}. */
    public static byte nspread(long struct) { return UNSAFE.getByte(null, struct + NSVGGradient.SPREAD); }
    /** Unsafe version of {@link #fx}. */
    public static float nfx(long struct) { return UNSAFE.getFloat(null, struct + NSVGGradient.FX); }
    /** Unsafe version of {@link #fy}. */
    public static float nfy(long struct) { return UNSAFE.getFloat(null, struct + NSVGGradient.FY); }
    /** Unsafe version of {@link #nstops}. */
    public static int nnstops(long struct) { return UNSAFE.getInt(null, struct + NSVGGradient.NSTOPS); }
    /** Unsafe version of {@link #pstops}. */
    public static NSVGGradientStop.Buffer npstops(long struct) { return NSVGGradientStop.create(struct + NSVGGradient.PSTOPS, nnstops(struct)); }
    /** Unsafe version of {@link #pstops(int) pstops}. */
    public static NSVGGradientStop npstops(long struct, int index) {
        return NSVGGradientStop.create(struct + NSVGGradient.PSTOPS + check(index, nnstops(struct)) * NSVGGradientStop.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link NSVGGradient} structs. */
    public static class Buffer extends StructBuffer<NSVGGradient, Buffer> {

        private static final NSVGGradient ELEMENT_FACTORY = NSVGGradient.create(-1L);

        /**
         * Creates a new {@code NSVGGradient.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGGradient#SIZEOF}, and its mark will be undefined.
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
        protected NSVGGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code xform} field. */
        @NativeType("float[6]")
        public FloatBuffer xform() { return NSVGGradient.nxform(address()); }
        /** @return the value at the specified index of the {@code xform} field. */
        public float xform(int index) { return NSVGGradient.nxform(address(), index); }
        /** @return the value of the {@code spread} field. */
        @NativeType("char")
        public byte spread() { return NSVGGradient.nspread(address()); }
        /** @return the value of the {@code fx} field. */
        public float fx() { return NSVGGradient.nfx(address()); }
        /** @return the value of the {@code fy} field. */
        public float fy() { return NSVGGradient.nfy(address()); }
        /** @return the value of the {@code nstops} field. */
        public int nstops() { return NSVGGradient.nnstops(address()); }
        /** @return a {@link NSVGGradientStop}.Buffer view of the {@code pstops} field. */
        @NativeType("NSVGgradientStop[1]")
        public NSVGGradientStop.Buffer pstops() { return NSVGGradient.npstops(address()); }
        /** @return a {@link NSVGGradientStop} view of the struct at the specified index of the {@code pstops} field. */
        @NativeType("NSVGgradientStop")
        public NSVGGradientStop pstops(int index) { return NSVGGradient.npstops(address(), index); }

    }

}