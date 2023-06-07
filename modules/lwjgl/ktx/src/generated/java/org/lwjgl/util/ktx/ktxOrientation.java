/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Struct describing the logical orientation of an image.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxOrientation {
 *     ktxOrientationX {@link #x};
 *     ktxOrientationY {@link #y};
 *     ktxOrientationZ {@link #z};
 * }</code></pre>
 */
@NativeType("struct ktxOrientation")
public class ktxOrientation extends Struct<ktxOrientation> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    protected ktxOrientation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxOrientation create(long address, @Nullable ByteBuffer container) {
        return new ktxOrientation(address, container);
    }

    /**
     * Creates a {@code ktxOrientation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxOrientation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** orientation in X */
    @NativeType("ktxOrientationX")
    public int x() { return nx(address()); }
    /** orientation in Y */
    @NativeType("ktxOrientationY")
    public int y() { return ny(address()); }
    /** orientation in Z */
    @NativeType("ktxOrientationZ")
    public int z() { return nz(address()); }

    // -----------------------------------

    /** Returns a new {@code ktxOrientation} instance for the specified memory address. */
    public static ktxOrientation create(long address) {
        return new ktxOrientation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxOrientation createSafe(long address) {
        return address == NULL ? null : new ktxOrientation(address, null);
    }

    /**
     * Create a {@link ktxOrientation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxOrientation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxOrientation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + ktxOrientation.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + ktxOrientation.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return UNSAFE.getInt(null, struct + ktxOrientation.Z); }

    // -----------------------------------

    /** An array of {@link ktxOrientation} structs. */
    public static class Buffer extends StructBuffer<ktxOrientation, Buffer> {

        private static final ktxOrientation ELEMENT_FACTORY = ktxOrientation.create(-1L);

        /**
         * Creates a new {@code ktxOrientation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxOrientation#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxOrientation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxOrientation#x} field. */
        @NativeType("ktxOrientationX")
        public int x() { return ktxOrientation.nx(address()); }
        /** @return the value of the {@link ktxOrientation#y} field. */
        @NativeType("ktxOrientationY")
        public int y() { return ktxOrientation.ny(address()); }
        /** @return the value of the {@link ktxOrientation#z} field. */
        @NativeType("ktxOrientationZ")
        public int z() { return ktxOrientation.nz(address()); }

    }

}