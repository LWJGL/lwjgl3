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
 * A structure used to store a 2x3 matrix. Coefficients are in 16.16 fixed-point format.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Affine23 {
 *     FT_Fixed xx;
 *     FT_Fixed xy;
 *     FT_Fixed dx;
 *     FT_Fixed yx;
 *     FT_Fixed yy;
 *     FT_Fixed dy;
 * }</code></pre>
 */
public class FT_Affine23 extends Struct<FT_Affine23> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XX,
        XY,
        DX,
        YX,
        YY,
        DY;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XX = layout.offsetof(0);
        XY = layout.offsetof(1);
        DX = layout.offsetof(2);
        YX = layout.offsetof(3);
        YY = layout.offsetof(4);
        DY = layout.offsetof(5);
    }

    protected FT_Affine23(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Affine23 create(long address, @Nullable ByteBuffer container) {
        return new FT_Affine23(address, container);
    }

    /**
     * Creates a {@code FT_Affine23} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Affine23(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code xx} field. */
    @NativeType("FT_Fixed")
    public long xx() { return nxx(address()); }
    /** @return the value of the {@code xy} field. */
    @NativeType("FT_Fixed")
    public long xy() { return nxy(address()); }
    /** @return the value of the {@code dx} field. */
    @NativeType("FT_Fixed")
    public long dx() { return ndx(address()); }
    /** @return the value of the {@code yx} field. */
    @NativeType("FT_Fixed")
    public long yx() { return nyx(address()); }
    /** @return the value of the {@code yy} field. */
    @NativeType("FT_Fixed")
    public long yy() { return nyy(address()); }
    /** @return the value of the {@code dy} field. */
    @NativeType("FT_Fixed")
    public long dy() { return ndy(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Affine23} instance for the specified memory address. */
    public static FT_Affine23 create(long address) {
        return new FT_Affine23(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Affine23 createSafe(long address) {
        return address == NULL ? null : new FT_Affine23(address, null);
    }

    /**
     * Create a {@link FT_Affine23.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Affine23.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Affine23.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xx}. */
    public static long nxx(long struct) { return memGetCLong(struct + FT_Affine23.XX); }
    /** Unsafe version of {@link #xy}. */
    public static long nxy(long struct) { return memGetCLong(struct + FT_Affine23.XY); }
    /** Unsafe version of {@link #dx}. */
    public static long ndx(long struct) { return memGetCLong(struct + FT_Affine23.DX); }
    /** Unsafe version of {@link #yx}. */
    public static long nyx(long struct) { return memGetCLong(struct + FT_Affine23.YX); }
    /** Unsafe version of {@link #yy}. */
    public static long nyy(long struct) { return memGetCLong(struct + FT_Affine23.YY); }
    /** Unsafe version of {@link #dy}. */
    public static long ndy(long struct) { return memGetCLong(struct + FT_Affine23.DY); }

    // -----------------------------------

    /** An array of {@link FT_Affine23} structs. */
    public static class Buffer extends StructBuffer<FT_Affine23, Buffer> {

        private static final FT_Affine23 ELEMENT_FACTORY = FT_Affine23.create(-1L);

        /**
         * Creates a new {@code FT_Affine23.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Affine23#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Affine23 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code xx} field. */
        @NativeType("FT_Fixed")
        public long xx() { return FT_Affine23.nxx(address()); }
        /** @return the value of the {@code xy} field. */
        @NativeType("FT_Fixed")
        public long xy() { return FT_Affine23.nxy(address()); }
        /** @return the value of the {@code dx} field. */
        @NativeType("FT_Fixed")
        public long dx() { return FT_Affine23.ndx(address()); }
        /** @return the value of the {@code yx} field. */
        @NativeType("FT_Fixed")
        public long yx() { return FT_Affine23.nyx(address()); }
        /** @return the value of the {@code yy} field. */
        @NativeType("FT_Fixed")
        public long yy() { return FT_Affine23.nyy(address()); }
        /** @return the value of the {@code dy} field. */
        @NativeType("FT_Fixed")
        public long dy() { return FT_Affine23.ndy(address()); }

    }

}