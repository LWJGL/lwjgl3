/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct NSVGpath {
 *     float * pts;
 *     int npts;
 *     char closed;
 *     float bounds[4];
 *     {@link NSVGPath NSVGpath} * next;
 * }}</pre>
 */
@NativeType("struct NSVGpath")
public class NSVGPath extends Struct<NSVGPath> {

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

    protected NSVGPath(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGPath create(long address, @Nullable ByteBuffer container) {
        return new NSVGPath(address, container);
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

    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pts} field. */
    @NativeType("float *")
    public FloatBuffer pts() { return npts(address()); }
    /** @return the value of the {@code npts} field. */
    public int npts() { return nnpts(address()); }
    /** @return the value of the {@code closed} field. */
    @NativeType("char")
    public byte closed() { return nclosed(address()); }
    /** @return a {@link FloatBuffer} view of the {@code bounds} field. */
    @NativeType("float[4]")
    public FloatBuffer bounds() { return nbounds(address()); }
    /** @return the value at the specified index of the {@code bounds} field. */
    public float bounds(int index) { return nbounds(address(), index); }
    /** @return a {@link NSVGPath} view of the struct pointed to by the {@code next} field. */
    @NativeType("NSVGpath *")
    public NSVGPath next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@code NSVGPath} instance for the specified memory address. */
    public static NSVGPath create(long address) {
        return new NSVGPath(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NSVGPath createSafe(long address) {
        return address == NULL ? null : new NSVGPath(address, null);
    }

    /**
     * Create a {@link NSVGPath.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGPath.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NSVGPath.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pts() pts}. */
    public static FloatBuffer npts(long struct) { return memFloatBuffer(memGetAddress(struct + NSVGPath.PTS), (nnpts(struct) << 1)); }
    /** Unsafe version of {@link #npts}. */
    public static int nnpts(long struct) { return memGetInt(struct + NSVGPath.NPTS); }
    /** Unsafe version of {@link #closed}. */
    public static byte nclosed(long struct) { return memGetByte(struct + NSVGPath.CLOSED); }
    /** Unsafe version of {@link #bounds}. */
    public static FloatBuffer nbounds(long struct) { return memFloatBuffer(struct + NSVGPath.BOUNDS, 4); }
    /** Unsafe version of {@link #bounds(int) bounds}. */
    public static float nbounds(long struct, int index) {
        return memGetFloat(struct + NSVGPath.BOUNDS + check(index, 4) * 4);
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGPath#SIZEOF}, and its mark will be undefined.</p>
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
        protected NSVGPath getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pts} field. */
        @NativeType("float *")
        public FloatBuffer pts() { return NSVGPath.npts(address()); }
        /** @return the value of the {@code npts} field. */
        public int npts() { return NSVGPath.nnpts(address()); }
        /** @return the value of the {@code closed} field. */
        @NativeType("char")
        public byte closed() { return NSVGPath.nclosed(address()); }
        /** @return a {@link FloatBuffer} view of the {@code bounds} field. */
        @NativeType("float[4]")
        public FloatBuffer bounds() { return NSVGPath.nbounds(address()); }
        /** @return the value at the specified index of the {@code bounds} field. */
        public float bounds(int index) { return NSVGPath.nbounds(address(), index); }
        /** @return a {@link NSVGPath} view of the struct pointed to by the {@code next} field. */
        @NativeType("NSVGpath *")
        public NSVGPath next() { return NSVGPath.nnext(address()); }

    }

}