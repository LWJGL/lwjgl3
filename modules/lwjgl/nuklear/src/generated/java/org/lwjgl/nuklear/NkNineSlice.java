/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_nine_slice {
 *     {@link NkImage struct nk_image} img;
 *     nk_ushort l;
 *     nk_ushort t;
 *     nk_ushort r;
 *     nk_ushort b;
 * }</code></pre>
 */
@NativeType("struct nk_nine_slice")
public class NkNineSlice extends Struct<NkNineSlice> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMG,
        L,
        T,
        R,
        B;

    static {
        Layout layout = __struct(
            __member(NkImage.SIZEOF, NkImage.ALIGNOF),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMG = layout.offsetof(0);
        L = layout.offsetof(1);
        T = layout.offsetof(2);
        R = layout.offsetof(3);
        B = layout.offsetof(4);
    }

    protected NkNineSlice(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkNineSlice create(long address, @Nullable ByteBuffer container) {
        return new NkNineSlice(address, container);
    }

    /**
     * Creates a {@code NkNineSlice} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkNineSlice(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkImage} view of the {@code img} field. */
    @NativeType("struct nk_image")
    public NkImage img() { return nimg(address()); }
    /** @return the value of the {@code l} field. */
    @NativeType("nk_ushort")
    public short l() { return nl(address()); }
    /** @return the value of the {@code t} field. */
    @NativeType("nk_ushort")
    public short t() { return nt(address()); }
    /** @return the value of the {@code r} field. */
    @NativeType("nk_ushort")
    public short r() { return nr(address()); }
    /** @return the value of the {@code b} field. */
    @NativeType("nk_ushort")
    public short b() { return nb(address()); }

    /** Copies the specified {@link NkImage} to the {@code img} field. */
    public NkNineSlice img(@NativeType("struct nk_image") NkImage value) { nimg(address(), value); return this; }
    /** Passes the {@code img} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkNineSlice img(java.util.function.Consumer<NkImage> consumer) { consumer.accept(img()); return this; }
    /** Sets the specified value to the {@code l} field. */
    public NkNineSlice l(@NativeType("nk_ushort") short value) { nl(address(), value); return this; }
    /** Sets the specified value to the {@code t} field. */
    public NkNineSlice t(@NativeType("nk_ushort") short value) { nt(address(), value); return this; }
    /** Sets the specified value to the {@code r} field. */
    public NkNineSlice r(@NativeType("nk_ushort") short value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public NkNineSlice b(@NativeType("nk_ushort") short value) { nb(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkNineSlice set(
        NkImage img,
        short l,
        short t,
        short r,
        short b
    ) {
        img(img);
        l(l);
        t(t);
        r(r);
        b(b);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkNineSlice set(NkNineSlice src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkNineSlice} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkNineSlice malloc() {
        return new NkNineSlice(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkNineSlice} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkNineSlice calloc() {
        return new NkNineSlice(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkNineSlice} instance allocated with {@link BufferUtils}. */
    public static NkNineSlice create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkNineSlice(memAddress(container), container);
    }

    /** Returns a new {@code NkNineSlice} instance for the specified memory address. */
    public static NkNineSlice create(long address) {
        return new NkNineSlice(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkNineSlice createSafe(long address) {
        return address == NULL ? null : new NkNineSlice(address, null);
    }

    /**
     * Returns a new {@link NkNineSlice.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkNineSlice.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkNineSlice.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkNineSlice.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkNineSlice.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkNineSlice} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkNineSlice malloc(MemoryStack stack) {
        return new NkNineSlice(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkNineSlice} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkNineSlice calloc(MemoryStack stack) {
        return new NkNineSlice(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkNineSlice.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkNineSlice.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkNineSlice.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #img}. */
    public static NkImage nimg(long struct) { return NkImage.create(struct + NkNineSlice.IMG); }
    /** Unsafe version of {@link #l}. */
    public static short nl(long struct) { return memGetShort(struct + NkNineSlice.L); }
    /** Unsafe version of {@link #t}. */
    public static short nt(long struct) { return memGetShort(struct + NkNineSlice.T); }
    /** Unsafe version of {@link #r}. */
    public static short nr(long struct) { return memGetShort(struct + NkNineSlice.R); }
    /** Unsafe version of {@link #b}. */
    public static short nb(long struct) { return memGetShort(struct + NkNineSlice.B); }

    /** Unsafe version of {@link #img(NkImage) img}. */
    public static void nimg(long struct, NkImage value) { memCopy(value.address(), struct + NkNineSlice.IMG, NkImage.SIZEOF); }
    /** Unsafe version of {@link #l(short) l}. */
    public static void nl(long struct, short value) { memPutShort(struct + NkNineSlice.L, value); }
    /** Unsafe version of {@link #t(short) t}. */
    public static void nt(long struct, short value) { memPutShort(struct + NkNineSlice.T, value); }
    /** Unsafe version of {@link #r(short) r}. */
    public static void nr(long struct, short value) { memPutShort(struct + NkNineSlice.R, value); }
    /** Unsafe version of {@link #b(short) b}. */
    public static void nb(long struct, short value) { memPutShort(struct + NkNineSlice.B, value); }

    // -----------------------------------

    /** An array of {@link NkNineSlice} structs. */
    public static class Buffer extends StructBuffer<NkNineSlice, Buffer> implements NativeResource {

        private static final NkNineSlice ELEMENT_FACTORY = NkNineSlice.create(-1L);

        /**
         * Creates a new {@code NkNineSlice.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkNineSlice#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkNineSlice getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkImage} view of the {@code img} field. */
        @NativeType("struct nk_image")
        public NkImage img() { return NkNineSlice.nimg(address()); }
        /** @return the value of the {@code l} field. */
        @NativeType("nk_ushort")
        public short l() { return NkNineSlice.nl(address()); }
        /** @return the value of the {@code t} field. */
        @NativeType("nk_ushort")
        public short t() { return NkNineSlice.nt(address()); }
        /** @return the value of the {@code r} field. */
        @NativeType("nk_ushort")
        public short r() { return NkNineSlice.nr(address()); }
        /** @return the value of the {@code b} field. */
        @NativeType("nk_ushort")
        public short b() { return NkNineSlice.nb(address()); }

        /** Copies the specified {@link NkImage} to the {@code img} field. */
        public NkNineSlice.Buffer img(@NativeType("struct nk_image") NkImage value) { NkNineSlice.nimg(address(), value); return this; }
        /** Passes the {@code img} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkNineSlice.Buffer img(java.util.function.Consumer<NkImage> consumer) { consumer.accept(img()); return this; }
        /** Sets the specified value to the {@code l} field. */
        public NkNineSlice.Buffer l(@NativeType("nk_ushort") short value) { NkNineSlice.nl(address(), value); return this; }
        /** Sets the specified value to the {@code t} field. */
        public NkNineSlice.Buffer t(@NativeType("nk_ushort") short value) { NkNineSlice.nt(address(), value); return this; }
        /** Sets the specified value to the {@code r} field. */
        public NkNineSlice.Buffer r(@NativeType("nk_ushort") short value) { NkNineSlice.nr(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public NkNineSlice.Buffer b(@NativeType("nk_ushort") short value) { NkNineSlice.nb(address(), value); return this; }

    }

}