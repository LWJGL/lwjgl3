/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_recti {
 *     short x;
 *     short y;
 *     short w;
 *     short h;
 * }</code></pre>
 */
@NativeType("struct nk_recti")
public class NkRecti extends Struct<NkRecti> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        W,
        H;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
    }

    protected NkRecti(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkRecti create(long address, @Nullable ByteBuffer container) {
        return new NkRecti(address, container);
    }

    /**
     * Creates a {@code NkRecti} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkRecti(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public short x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public short y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public short w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public short h() { return nh(address()); }

    /** Sets the specified value to the {@code x} field. */
    public NkRecti x(short value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public NkRecti y(short value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public NkRecti w(short value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public NkRecti h(short value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkRecti set(
        short x,
        short y,
        short w,
        short h
    ) {
        x(x);
        y(y);
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkRecti set(NkRecti src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkRecti} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkRecti malloc() {
        return new NkRecti(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkRecti} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkRecti calloc() {
        return new NkRecti(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkRecti} instance allocated with {@link BufferUtils}. */
    public static NkRecti create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkRecti(memAddress(container), container);
    }

    /** Returns a new {@code NkRecti} instance for the specified memory address. */
    public static NkRecti create(long address) {
        return new NkRecti(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkRecti createSafe(long address) {
        return address == NULL ? null : new NkRecti(address, null);
    }

    /**
     * Returns a new {@link NkRecti.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkRecti.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkRecti.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkRecti.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkRecti.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkRecti} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkRecti malloc(MemoryStack stack) {
        return new NkRecti(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkRecti} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkRecti calloc(MemoryStack stack) {
        return new NkRecti(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkRecti.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkRecti.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkRecti.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + NkRecti.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + NkRecti.Y); }
    /** Unsafe version of {@link #w}. */
    public static short nw(long struct) { return UNSAFE.getShort(null, struct + NkRecti.W); }
    /** Unsafe version of {@link #h}. */
    public static short nh(long struct) { return UNSAFE.getShort(null, struct + NkRecti.H); }

    /** Unsafe version of {@link #x(short) x}. */
    public static void nx(long struct, short value) { UNSAFE.putShort(null, struct + NkRecti.X, value); }
    /** Unsafe version of {@link #y(short) y}. */
    public static void ny(long struct, short value) { UNSAFE.putShort(null, struct + NkRecti.Y, value); }
    /** Unsafe version of {@link #w(short) w}. */
    public static void nw(long struct, short value) { UNSAFE.putShort(null, struct + NkRecti.W, value); }
    /** Unsafe version of {@link #h(short) h}. */
    public static void nh(long struct, short value) { UNSAFE.putShort(null, struct + NkRecti.H, value); }

    // -----------------------------------

    /** An array of {@link NkRecti} structs. */
    public static class Buffer extends StructBuffer<NkRecti, Buffer> implements NativeResource {

        private static final NkRecti ELEMENT_FACTORY = NkRecti.create(-1L);

        /**
         * Creates a new {@code NkRecti.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkRecti#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkRecti getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public short x() { return NkRecti.nx(address()); }
        /** @return the value of the {@code y} field. */
        public short y() { return NkRecti.ny(address()); }
        /** @return the value of the {@code w} field. */
        public short w() { return NkRecti.nw(address()); }
        /** @return the value of the {@code h} field. */
        public short h() { return NkRecti.nh(address()); }

        /** Sets the specified value to the {@code x} field. */
        public NkRecti.Buffer x(short value) { NkRecti.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public NkRecti.Buffer y(short value) { NkRecti.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public NkRecti.Buffer w(short value) { NkRecti.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public NkRecti.Buffer h(short value) { NkRecti.nh(address(), value); return this; }

    }

}