/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * This structure models a BGRA color value of a {@code CPAL} palette entry.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Color {
 *     FT_Byte blue;
 *     FT_Byte green;
 *     FT_Byte red;
 *     FT_Byte alpha;
 * }</code></pre>
 */
public class FT_Color extends Struct<FT_Color> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLUE,
        GREEN,
        RED,
        ALPHA;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLUE = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        RED = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
    }

    protected FT_Color(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Color create(long address, @Nullable ByteBuffer container) {
        return new FT_Color(address, container);
    }

    /**
     * Creates a {@code FT_Color} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Color(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blue} field. */
    @NativeType("FT_Byte")
    public byte blue() { return nblue(address()); }
    /** @return the value of the {@code green} field. */
    @NativeType("FT_Byte")
    public byte green() { return ngreen(address()); }
    /** @return the value of the {@code red} field. */
    @NativeType("FT_Byte")
    public byte red() { return nred(address()); }
    /** @return the value of the {@code alpha} field. */
    @NativeType("FT_Byte")
    public byte alpha() { return nalpha(address()); }

    /** Sets the specified value to the {@code blue} field. */
    public FT_Color blue(@NativeType("FT_Byte") byte value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public FT_Color green(@NativeType("FT_Byte") byte value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code red} field. */
    public FT_Color red(@NativeType("FT_Byte") byte value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public FT_Color alpha(@NativeType("FT_Byte") byte value) { nalpha(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Color set(
        byte blue,
        byte green,
        byte red,
        byte alpha
    ) {
        blue(blue);
        green(green);
        red(red);
        alpha(alpha);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Color set(FT_Color src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Color} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Color malloc() {
        return new FT_Color(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Color} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Color calloc() {
        return new FT_Color(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Color} instance allocated with {@link BufferUtils}. */
    public static FT_Color create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Color(memAddress(container), container);
    }

    /** Returns a new {@code FT_Color} instance for the specified memory address. */
    public static FT_Color create(long address) {
        return new FT_Color(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Color createSafe(long address) {
        return address == NULL ? null : new FT_Color(address, null);
    }

    /**
     * Returns a new {@link FT_Color.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Color.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Color.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Color.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Color.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Color} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Color malloc(MemoryStack stack) {
        return new FT_Color(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Color} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Color calloc(MemoryStack stack) {
        return new FT_Color(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Color.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Color.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Color.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blue}. */
    public static byte nblue(long struct) { return UNSAFE.getByte(null, struct + FT_Color.BLUE); }
    /** Unsafe version of {@link #green}. */
    public static byte ngreen(long struct) { return UNSAFE.getByte(null, struct + FT_Color.GREEN); }
    /** Unsafe version of {@link #red}. */
    public static byte nred(long struct) { return UNSAFE.getByte(null, struct + FT_Color.RED); }
    /** Unsafe version of {@link #alpha}. */
    public static byte nalpha(long struct) { return UNSAFE.getByte(null, struct + FT_Color.ALPHA); }

    /** Unsafe version of {@link #blue(byte) blue}. */
    public static void nblue(long struct, byte value) { UNSAFE.putByte(null, struct + FT_Color.BLUE, value); }
    /** Unsafe version of {@link #green(byte) green}. */
    public static void ngreen(long struct, byte value) { UNSAFE.putByte(null, struct + FT_Color.GREEN, value); }
    /** Unsafe version of {@link #red(byte) red}. */
    public static void nred(long struct, byte value) { UNSAFE.putByte(null, struct + FT_Color.RED, value); }
    /** Unsafe version of {@link #alpha(byte) alpha}. */
    public static void nalpha(long struct, byte value) { UNSAFE.putByte(null, struct + FT_Color.ALPHA, value); }

    // -----------------------------------

    /** An array of {@link FT_Color} structs. */
    public static class Buffer extends StructBuffer<FT_Color, Buffer> implements NativeResource {

        private static final FT_Color ELEMENT_FACTORY = FT_Color.create(-1L);

        /**
         * Creates a new {@code FT_Color.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Color#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Color getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blue} field. */
        @NativeType("FT_Byte")
        public byte blue() { return FT_Color.nblue(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("FT_Byte")
        public byte green() { return FT_Color.ngreen(address()); }
        /** @return the value of the {@code red} field. */
        @NativeType("FT_Byte")
        public byte red() { return FT_Color.nred(address()); }
        /** @return the value of the {@code alpha} field. */
        @NativeType("FT_Byte")
        public byte alpha() { return FT_Color.nalpha(address()); }

        /** Sets the specified value to the {@code blue} field. */
        public FT_Color.Buffer blue(@NativeType("FT_Byte") byte value) { FT_Color.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public FT_Color.Buffer green(@NativeType("FT_Byte") byte value) { FT_Color.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code red} field. */
        public FT_Color.Buffer red(@NativeType("FT_Byte") byte value) { FT_Color.nred(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public FT_Color.Buffer alpha(@NativeType("FT_Byte") byte value) { FT_Color.nalpha(address(), value); return this; }

    }

}