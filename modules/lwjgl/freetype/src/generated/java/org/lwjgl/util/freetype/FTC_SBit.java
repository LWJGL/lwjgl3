/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A very compact structure used to describe a small glyph bitmap.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FTC_SBitRec {
 *     FT_Byte width;
 *     FT_Byte height;
 *     FT_Char left;
 *     FT_Char top;
 *     FT_Byte format;
 *     FT_Byte max_grays;
 *     FT_Short pitch;
 *     FT_Char xadvance;
 *     FT_Char yadvance;
 *     FT_Byte * buffer;
 * }</code></pre>
 */
@NativeType("struct FTC_SBitRec")
public class FTC_SBit extends Struct<FTC_SBit> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        LEFT,
        TOP,
        FORMAT,
        MAX_GRAYS,
        PITCH,
        XADVANCE,
        YADVANCE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(1),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        LEFT = layout.offsetof(2);
        TOP = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        MAX_GRAYS = layout.offsetof(5);
        PITCH = layout.offsetof(6);
        XADVANCE = layout.offsetof(7);
        YADVANCE = layout.offsetof(8);
        BUFFER = layout.offsetof(9);
    }

    protected FTC_SBit(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FTC_SBit create(long address, @Nullable ByteBuffer container) {
        return new FTC_SBit(address, container);
    }

    /**
     * Creates a {@code FTC_SBit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FTC_SBit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    @NativeType("FT_Byte")
    public byte width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("FT_Byte")
    public byte height() { return nheight(address()); }
    /** @return the value of the {@code left} field. */
    @NativeType("FT_Char")
    public byte left() { return nleft(address()); }
    /** @return the value of the {@code top} field. */
    @NativeType("FT_Char")
    public byte top() { return ntop(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("FT_Byte")
    public byte format() { return nformat(address()); }
    /** @return the value of the {@code max_grays} field. */
    @NativeType("FT_Byte")
    public byte max_grays() { return nmax_grays(address()); }
    /** @return the value of the {@code pitch} field. */
    @NativeType("FT_Short")
    public short pitch() { return npitch(address()); }
    /** @return the value of the {@code xadvance} field. */
    @NativeType("FT_Char")
    public byte xadvance() { return nxadvance(address()); }
    /** @return the value of the {@code yadvance} field. */
    @NativeType("FT_Char")
    public byte yadvance() { return nyadvance(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("FT_Byte *")
    public ByteBuffer buffer(int capacity) { return nbuffer(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code FTC_SBit} instance for the specified memory address. */
    public static FTC_SBit create(long address) {
        return new FTC_SBit(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_SBit createSafe(long address) {
        return address == NULL ? null : new FTC_SBit(address, null);
    }

    /**
     * Create a {@link FTC_SBit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FTC_SBit.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FTC_SBit.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static byte nwidth(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static byte nheight(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.HEIGHT); }
    /** Unsafe version of {@link #left}. */
    public static byte nleft(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static byte ntop(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.TOP); }
    /** Unsafe version of {@link #format}. */
    public static byte nformat(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.FORMAT); }
    /** Unsafe version of {@link #max_grays}. */
    public static byte nmax_grays(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.MAX_GRAYS); }
    /** Unsafe version of {@link #pitch}. */
    public static short npitch(long struct) { return UNSAFE.getShort(null, struct + FTC_SBit.PITCH); }
    /** Unsafe version of {@link #xadvance}. */
    public static byte nxadvance(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.XADVANCE); }
    /** Unsafe version of {@link #yadvance}. */
    public static byte nyadvance(long struct) { return UNSAFE.getByte(null, struct + FTC_SBit.YADVANCE); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static ByteBuffer nbuffer(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + FTC_SBit.BUFFER), capacity); }

    // -----------------------------------

    /** An array of {@link FTC_SBit} structs. */
    public static class Buffer extends StructBuffer<FTC_SBit, Buffer> {

        private static final FTC_SBit ELEMENT_FACTORY = FTC_SBit.create(-1L);

        /**
         * Creates a new {@code FTC_SBit.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FTC_SBit#SIZEOF}, and its mark will be undefined.</p>
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
        protected FTC_SBit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("FT_Byte")
        public byte width() { return FTC_SBit.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_Byte")
        public byte height() { return FTC_SBit.nheight(address()); }
        /** @return the value of the {@code left} field. */
        @NativeType("FT_Char")
        public byte left() { return FTC_SBit.nleft(address()); }
        /** @return the value of the {@code top} field. */
        @NativeType("FT_Char")
        public byte top() { return FTC_SBit.ntop(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("FT_Byte")
        public byte format() { return FTC_SBit.nformat(address()); }
        /** @return the value of the {@code max_grays} field. */
        @NativeType("FT_Byte")
        public byte max_grays() { return FTC_SBit.nmax_grays(address()); }
        /** @return the value of the {@code pitch} field. */
        @NativeType("FT_Short")
        public short pitch() { return FTC_SBit.npitch(address()); }
        /** @return the value of the {@code xadvance} field. */
        @NativeType("FT_Char")
        public byte xadvance() { return FTC_SBit.nxadvance(address()); }
        /** @return the value of the {@code yadvance} field. */
        @NativeType("FT_Char")
        public byte yadvance() { return FTC_SBit.nyadvance(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("FT_Byte *")
        public ByteBuffer buffer(int capacity) { return FTC_SBit.nbuffer(address(), capacity); }

    }

}