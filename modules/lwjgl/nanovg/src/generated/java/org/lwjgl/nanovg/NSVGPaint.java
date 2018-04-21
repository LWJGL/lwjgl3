/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct NSVGpaint {
 *     char type;
 *     union {
 *         unsigned int color;
 *         {@link NSVGGradient NSVGgradient} * gradient;
 *     };
 * }</pre></code>
 */
@NativeType("struct NSVGpaint")
public class NSVGPaint extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COLOR,
        GRADIENT;

    static {
        Layout layout = __struct(
            __member(1),
            __union(
                __member(4),
                __member(POINTER_SIZE)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(2);
        GRADIENT = layout.offsetof(3);
    }

    NSVGPaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NSVGPaint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGPaint(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("char")
    public byte type() { return ntype(address()); }
    /** Returns the value of the {@code color} field. */
    @NativeType("unsigned int")
    public int color() { return ncolor(address()); }
    /** Returns a {@link NSVGGradient} view of the struct pointed to by the {@code gradient} field. */
    @NativeType("NSVGgradient *")
    public NSVGGradient gradient() { return ngradient(address()); }

    // -----------------------------------

    /** Returns a new {@link NSVGPaint} instance for the specified memory address. */
    public static NSVGPaint create(long address) {
        return new NSVGPaint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGPaint createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NSVGPaint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGPaint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGPaint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static byte ntype(long struct) { return memGetByte(struct + NSVGPaint.TYPE); }
    /** Unsafe version of {@link #color}. */
    public static int ncolor(long struct) { return memGetInt(struct + NSVGPaint.COLOR); }
    /** Unsafe version of {@link #gradient}. */
    public static NSVGGradient ngradient(long struct) { return NSVGGradient.create(memGetAddress(struct + NSVGPaint.GRADIENT)); }

    // -----------------------------------

    /** An array of {@link NSVGPaint} structs. */
    public static class Buffer extends StructBuffer<NSVGPaint, Buffer> {

        /**
         * Creates a new {@link NSVGPaint.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGPaint#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NSVGPaint newInstance(long address) {
            return new NSVGPaint(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("char")
        public byte type() { return NSVGPaint.ntype(address()); }
        /** Returns the value of the {@code color} field. */
        @NativeType("unsigned int")
        public int color() { return NSVGPaint.ncolor(address()); }
        /** Returns a {@link NSVGGradient} view of the struct pointed to by the {@code gradient} field. */
        @NativeType("NSVGgradient *")
        public NSVGGradient gradient() { return NSVGPaint.ngradient(address()); }

    }

}