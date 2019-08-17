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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code id[64]} &ndash; optional 'id' attr of the shape or its group</li>
 * <li>{@code fill} &ndash; fill paint</li>
 * <li>{@code stroke} &ndash; stroke paint</li>
 * <li>{@code opacity} &ndash; opacity of the shape</li>
 * <li>{@code strokeWidth} &ndash; stroke width (scaled)</li>
 * <li>{@code strokeDashOffset} &ndash; stroke dash offset (scaled)</li>
 * <li>{@code strokeDashArray[8]} &ndash; stroke dash array (scaled)</li>
 * <li>{@code strokeDashCount} &ndash; number of dash values in dash array</li>
 * <li>{@code strokeLineJoin} &ndash; stroke join type</li>
 * <li>{@code strokeLineCap} &ndash; stroke cap type</li>
 * <li>{@code miterLimit} &ndash; miter limit</li>
 * <li>{@code fillRule} &ndash; fill rule, see NSVGfillRule</li>
 * <li>{@code flags} &ndash; logical or of NSVG_FLAGS_* flags</li>
 * <li>{@code bounds[4]} &ndash; tight bounding box of the shape {@code [minx,miny,maxx,maxy]}</li>
 * <li>{@code paths} &ndash; linked list of paths in the image</li>
 * <li>{@code next} &ndash; pointer to next shape, or {@code NULL} if last element</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NSVGshape {
 *     char id[64];
 *     {@link NSVGPaint NSVGpaint} fill;
 *     {@link NSVGPaint NSVGpaint} stroke;
 *     float opacity;
 *     float strokeWidth;
 *     float strokeDashOffset;
 *     float strokeDashArray[8];
 *     char strokeDashCount;
 *     char strokeLineJoin;
 *     char strokeLineCap;
 *     float miterLimit;
 *     char fillRule;
 *     unsigned char flags;
 *     float bounds[4];
 *     {@link NSVGPath NSVGpath} * paths;
 *     {@link NSVGShape NSVGshape} * next;
 * }</code></pre>
 */
@NativeType("struct NSVGshape")
public class NSVGShape extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        FILL,
        STROKE,
        OPACITY,
        STROKEWIDTH,
        STROKEDASHOFFSET,
        STROKEDASHARRAY,
        STROKEDASHCOUNT,
        STROKELINEJOIN,
        STROKELINECAP,
        MITERLIMIT,
        FILLRULE,
        FLAGS,
        BOUNDS,
        PATHS,
        NEXT;

    static {
        Layout layout = __struct(
            __array(1, 64),
            __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF),
            __member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 8),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(1),
            __array(4, 4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        FILL = layout.offsetof(1);
        STROKE = layout.offsetof(2);
        OPACITY = layout.offsetof(3);
        STROKEWIDTH = layout.offsetof(4);
        STROKEDASHOFFSET = layout.offsetof(5);
        STROKEDASHARRAY = layout.offsetof(6);
        STROKEDASHCOUNT = layout.offsetof(7);
        STROKELINEJOIN = layout.offsetof(8);
        STROKELINECAP = layout.offsetof(9);
        MITERLIMIT = layout.offsetof(10);
        FILLRULE = layout.offsetof(11);
        FLAGS = layout.offsetof(12);
        BOUNDS = layout.offsetof(13);
        PATHS = layout.offsetof(14);
        NEXT = layout.offsetof(15);
    }

    /**
     * Creates a {@code NSVGShape} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGShape(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code id} field. */
    @NativeType("char[64]")
    public ByteBuffer id() { return nid(address()); }
    /** Decodes the null-terminated string stored in the {@code id} field. */
    @NativeType("char[64]")
    public String idString() { return nidString(address()); }
    /** Returns a {@link NSVGPaint} view of the {@code fill} field. */
    @NativeType("NSVGpaint")
    public NSVGPaint fill() { return nfill(address()); }
    /** Returns a {@link NSVGPaint} view of the {@code stroke} field. */
    @NativeType("NSVGpaint")
    public NSVGPaint stroke() { return nstroke(address()); }
    /** Returns the value of the {@code opacity} field. */
    public float opacity() { return nopacity(address()); }
    /** Returns the value of the {@code strokeWidth} field. */
    public float strokeWidth() { return nstrokeWidth(address()); }
    /** Returns the value of the {@code strokeDashOffset} field. */
    public float strokeDashOffset() { return nstrokeDashOffset(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code strokeDashArray} field. */
    @NativeType("float[8]")
    public FloatBuffer strokeDashArray() { return nstrokeDashArray(address()); }
    /** Returns the value at the specified index of the {@code strokeDashArray} field. */
    public float strokeDashArray(int index) { return nstrokeDashArray(address(), index); }
    /** Returns the value of the {@code strokeDashCount} field. */
    @NativeType("char")
    public byte strokeDashCount() { return nstrokeDashCount(address()); }
    /** Returns the value of the {@code strokeLineJoin} field. */
    @NativeType("char")
    public byte strokeLineJoin() { return nstrokeLineJoin(address()); }
    /** Returns the value of the {@code strokeLineCap} field. */
    @NativeType("char")
    public byte strokeLineCap() { return nstrokeLineCap(address()); }
    /** Returns the value of the {@code miterLimit} field. */
    public float miterLimit() { return nmiterLimit(address()); }
    /** Returns the value of the {@code fillRule} field. */
    @NativeType("char")
    public byte fillRule() { return nfillRule(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("unsigned char")
    public byte flags() { return nflags(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code bounds} field. */
    @NativeType("float[4]")
    public FloatBuffer bounds() { return nbounds(address()); }
    /** Returns the value at the specified index of the {@code bounds} field. */
    public float bounds(int index) { return nbounds(address(), index); }
    /** Returns a {@link NSVGPath} view of the struct pointed to by the {@code paths} field. */
    @NativeType("NSVGpath *")
    public NSVGPath paths() { return npaths(address()); }
    /** Returns a {@link NSVGShape} view of the struct pointed to by the {@code next} field. */
    @NativeType("NSVGshape *")
    public NSVGShape next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@code NSVGShape} instance for the specified memory address. */
    public static NSVGShape create(long address) {
        return wrap(NSVGShape.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGShape createSafe(long address) {
        return address == NULL ? null : wrap(NSVGShape.class, address);
    }

    /**
     * Create a {@link NSVGShape.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGShape.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGShape.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static ByteBuffer nid(long struct) { return memByteBuffer(struct + NSVGShape.ID, 64); }
    /** Unsafe version of {@link #idString}. */
    public static String nidString(long struct) { return memASCII(struct + NSVGShape.ID); }
    /** Unsafe version of {@link #fill}. */
    public static NSVGPaint nfill(long struct) { return NSVGPaint.create(struct + NSVGShape.FILL); }
    /** Unsafe version of {@link #stroke}. */
    public static NSVGPaint nstroke(long struct) { return NSVGPaint.create(struct + NSVGShape.STROKE); }
    /** Unsafe version of {@link #opacity}. */
    public static float nopacity(long struct) { return UNSAFE.getFloat(null, struct + NSVGShape.OPACITY); }
    /** Unsafe version of {@link #strokeWidth}. */
    public static float nstrokeWidth(long struct) { return UNSAFE.getFloat(null, struct + NSVGShape.STROKEWIDTH); }
    /** Unsafe version of {@link #strokeDashOffset}. */
    public static float nstrokeDashOffset(long struct) { return UNSAFE.getFloat(null, struct + NSVGShape.STROKEDASHOFFSET); }
    /** Unsafe version of {@link #strokeDashArray}. */
    public static FloatBuffer nstrokeDashArray(long struct) { return memFloatBuffer(struct + NSVGShape.STROKEDASHARRAY, 8); }
    /** Unsafe version of {@link #strokeDashArray(int) strokeDashArray}. */
    public static float nstrokeDashArray(long struct, int index) {
        return UNSAFE.getFloat(null, struct + NSVGShape.STROKEDASHARRAY + check(index, 8) * 4);
    }
    /** Unsafe version of {@link #strokeDashCount}. */
    public static byte nstrokeDashCount(long struct) { return UNSAFE.getByte(null, struct + NSVGShape.STROKEDASHCOUNT); }
    /** Unsafe version of {@link #strokeLineJoin}. */
    public static byte nstrokeLineJoin(long struct) { return UNSAFE.getByte(null, struct + NSVGShape.STROKELINEJOIN); }
    /** Unsafe version of {@link #strokeLineCap}. */
    public static byte nstrokeLineCap(long struct) { return UNSAFE.getByte(null, struct + NSVGShape.STROKELINECAP); }
    /** Unsafe version of {@link #miterLimit}. */
    public static float nmiterLimit(long struct) { return UNSAFE.getFloat(null, struct + NSVGShape.MITERLIMIT); }
    /** Unsafe version of {@link #fillRule}. */
    public static byte nfillRule(long struct) { return UNSAFE.getByte(null, struct + NSVGShape.FILLRULE); }
    /** Unsafe version of {@link #flags}. */
    public static byte nflags(long struct) { return UNSAFE.getByte(null, struct + NSVGShape.FLAGS); }
    /** Unsafe version of {@link #bounds}. */
    public static FloatBuffer nbounds(long struct) { return memFloatBuffer(struct + NSVGShape.BOUNDS, 4); }
    /** Unsafe version of {@link #bounds(int) bounds}. */
    public static float nbounds(long struct, int index) {
        return UNSAFE.getFloat(null, struct + NSVGShape.BOUNDS + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #paths}. */
    public static NSVGPath npaths(long struct) { return NSVGPath.create(memGetAddress(struct + NSVGShape.PATHS)); }
    /** Unsafe version of {@link #next}. */
    public static NSVGShape nnext(long struct) { return NSVGShape.create(memGetAddress(struct + NSVGShape.NEXT)); }

    // -----------------------------------

    /** An array of {@link NSVGShape} structs. */
    public static class Buffer extends StructBuffer<NSVGShape, Buffer> {

        private static final NSVGShape ELEMENT_FACTORY = NSVGShape.create(-1L);

        /**
         * Creates a new {@code NSVGShape.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGShape#SIZEOF}, and its mark will be undefined.
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
        protected NSVGShape getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code id} field. */
        @NativeType("char[64]")
        public ByteBuffer id() { return NSVGShape.nid(address()); }
        /** Decodes the null-terminated string stored in the {@code id} field. */
        @NativeType("char[64]")
        public String idString() { return NSVGShape.nidString(address()); }
        /** Returns a {@link NSVGPaint} view of the {@code fill} field. */
        @NativeType("NSVGpaint")
        public NSVGPaint fill() { return NSVGShape.nfill(address()); }
        /** Returns a {@link NSVGPaint} view of the {@code stroke} field. */
        @NativeType("NSVGpaint")
        public NSVGPaint stroke() { return NSVGShape.nstroke(address()); }
        /** Returns the value of the {@code opacity} field. */
        public float opacity() { return NSVGShape.nopacity(address()); }
        /** Returns the value of the {@code strokeWidth} field. */
        public float strokeWidth() { return NSVGShape.nstrokeWidth(address()); }
        /** Returns the value of the {@code strokeDashOffset} field. */
        public float strokeDashOffset() { return NSVGShape.nstrokeDashOffset(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code strokeDashArray} field. */
        @NativeType("float[8]")
        public FloatBuffer strokeDashArray() { return NSVGShape.nstrokeDashArray(address()); }
        /** Returns the value at the specified index of the {@code strokeDashArray} field. */
        public float strokeDashArray(int index) { return NSVGShape.nstrokeDashArray(address(), index); }
        /** Returns the value of the {@code strokeDashCount} field. */
        @NativeType("char")
        public byte strokeDashCount() { return NSVGShape.nstrokeDashCount(address()); }
        /** Returns the value of the {@code strokeLineJoin} field. */
        @NativeType("char")
        public byte strokeLineJoin() { return NSVGShape.nstrokeLineJoin(address()); }
        /** Returns the value of the {@code strokeLineCap} field. */
        @NativeType("char")
        public byte strokeLineCap() { return NSVGShape.nstrokeLineCap(address()); }
        /** Returns the value of the {@code miterLimit} field. */
        public float miterLimit() { return NSVGShape.nmiterLimit(address()); }
        /** Returns the value of the {@code fillRule} field. */
        @NativeType("char")
        public byte fillRule() { return NSVGShape.nfillRule(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("unsigned char")
        public byte flags() { return NSVGShape.nflags(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code bounds} field. */
        @NativeType("float[4]")
        public FloatBuffer bounds() { return NSVGShape.nbounds(address()); }
        /** Returns the value at the specified index of the {@code bounds} field. */
        public float bounds(int index) { return NSVGShape.nbounds(address(), index); }
        /** Returns a {@link NSVGPath} view of the struct pointed to by the {@code paths} field. */
        @NativeType("NSVGpath *")
        public NSVGPath paths() { return NSVGShape.npaths(address()); }
        /** Returns a {@link NSVGShape} view of the struct pointed to by the {@code next} field. */
        @NativeType("NSVGshape *")
        public NSVGShape next() { return NSVGShape.nnext(address()); }

    }

}