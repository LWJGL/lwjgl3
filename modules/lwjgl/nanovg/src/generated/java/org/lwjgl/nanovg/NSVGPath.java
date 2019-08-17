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
 * <li>{@code pts} &ndash; cubic bezier points: {@code x0,y0, [cpx1,cpx1,cpx2,cpy2,x1,y1], ...}</li>
 * <li>{@code npts} &ndash; total number of bezier points</li>
 * <li>{@code closed} &ndash; flag indicating if shapes should be treated as closed</li>
 * <li>{@code bounds[4]} &ndash; tight bounding box of the shape {@code [minx,miny,maxx,maxy]}</li>
 * <li>{@code next} &ndash; pointer to next path, or {@code NULL} if last element</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NSVGpath {
 *     float * pts;
 *     int npts;
 *     char closed;
 *     float bounds[4];
 *     {@link NSVGPath NSVGpath} * next;
 * }</code></pre>
 */
@NativeType("struct NSVGpath")
public class NSVGPath extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTS,
        NPTS,
        CLOSED,
        BOUNDS,
        NEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(1),
            __array(4, 4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTS = layout.offsetof(0);
        NPTS = layout.offsetof(1);
        CLOSED = layout.offsetof(2);
        BOUNDS = layout.offsetof(3);
        NEXT = layout.offsetof(4);
    }

    /**
     * Creates a {@code NSVGPath} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGPath(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pts} field. */
    @NativeType("float *")
    public FloatBuffer pts() { return npts(address()); }
    /** Returns the value of the {@code npts} field. */
    public int npts() { return nnpts(address()); }
    /** Returns the value of the {@code closed} field. */
    @NativeType("char")
    public byte closed() { return nclosed(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code bounds} field. */
    @NativeType("float[4]")
    public FloatBuffer bounds() { return nbounds(address()); }
    /** Returns the value at the specified index of the {@code bounds} field. */
    public float bounds(int index) { return nbounds(address(), index); }
    /** Returns a {@link NSVGPath} view of the struct pointed to by the {@code next} field. */
    @NativeType("NSVGpath *")
    public NSVGPath next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@code NSVGPath} instance for the specified memory address. */
    public static NSVGPath create(long address) {
        return wrap(NSVGPath.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGPath createSafe(long address) {
        return address == NULL ? null : wrap(NSVGPath.class, address);
    }

    /**
     * Create a {@link NSVGPath.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGPath.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGPath.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pts() pts}. */
    public static FloatBuffer npts(long struct) { return memFloatBuffer(memGetAddress(struct + NSVGPath.PTS), nnpts(struct)); }
    /** Unsafe version of {@link #npts}. */
    public static int nnpts(long struct) { return UNSAFE.getInt(null, struct + NSVGPath.NPTS); }
    /** Unsafe version of {@link #closed}. */
    public static byte nclosed(long struct) { return UNSAFE.getByte(null, struct + NSVGPath.CLOSED); }
    /** Unsafe version of {@link #bounds}. */
    public static FloatBuffer nbounds(long struct) { return memFloatBuffer(struct + NSVGPath.BOUNDS, 4); }
    /** Unsafe version of {@link #bounds(int) bounds}. */
    public static float nbounds(long struct, int index) {
        return UNSAFE.getFloat(null, struct + NSVGPath.BOUNDS + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #next}. */
    public static NSVGPath nnext(long struct) { return NSVGPath.create(memGetAddress(struct + NSVGPath.NEXT)); }

    // -----------------------------------

    /** An array of {@link NSVGPath} structs. */
    public static class Buffer extends StructBuffer<NSVGPath, Buffer> {

        private static final NSVGPath ELEMENT_FACTORY = NSVGPath.create(-1L);

        /**
         * Creates a new {@code NSVGPath.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGPath#SIZEOF}, and its mark will be undefined.
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
        protected NSVGPath getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pts} field. */
        @NativeType("float *")
        public FloatBuffer pts() { return NSVGPath.npts(address()); }
        /** Returns the value of the {@code npts} field. */
        public int npts() { return NSVGPath.nnpts(address()); }
        /** Returns the value of the {@code closed} field. */
        @NativeType("char")
        public byte closed() { return NSVGPath.nclosed(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code bounds} field. */
        @NativeType("float[4]")
        public FloatBuffer bounds() { return NSVGPath.nbounds(address()); }
        /** Returns the value at the specified index of the {@code bounds} field. */
        public float bounds(int index) { return NSVGPath.nbounds(address(), index); }
        /** Returns a {@link NSVGPath} view of the struct pointed to by the {@code next} field. */
        @NativeType("NSVGpath *")
        public NSVGPath next() { return NSVGPath.nnext(address()); }

    }

}