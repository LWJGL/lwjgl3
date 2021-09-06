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
 * struct nk_color {
 *     nk_byte r;
 *     nk_byte g;
 *     nk_byte b;
 *     nk_byte a;
 * }</code></pre>
 */
@NativeType("struct nk_color")
public class NkColor extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    /**
     * Creates a {@code NkColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkColor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code r} field. */
    @NativeType("nk_byte")
    public byte r() { return nr(address()); }
    /** @return the value of the {@code g} field. */
    @NativeType("nk_byte")
    public byte g() { return ng(address()); }
    /** @return the value of the {@code b} field. */
    @NativeType("nk_byte")
    public byte b() { return nb(address()); }
    /** @return the value of the {@code a} field. */
    @NativeType("nk_byte")
    public byte a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public NkColor r(@NativeType("nk_byte") byte value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public NkColor g(@NativeType("nk_byte") byte value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public NkColor b(@NativeType("nk_byte") byte value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public NkColor a(@NativeType("nk_byte") byte value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkColor set(
        byte r,
        byte g,
        byte b,
        byte a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkColor set(NkColor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkColor malloc() {
        return wrap(NkColor.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkColor calloc() {
        return wrap(NkColor.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkColor} instance allocated with {@link BufferUtils}. */
    public static NkColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkColor.class, memAddress(container), container);
    }

    /** Returns a new {@code NkColor} instance for the specified memory address. */
    public static NkColor create(long address) {
        return wrap(NkColor.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkColor createSafe(long address) {
        return address == NULL ? null : wrap(NkColor.class, address);
    }

    /**
     * Returns a new {@link NkColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkColor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkColor.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkColor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkColor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkColor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkColor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkColor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkColor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkColor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkColor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkColor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkColor malloc(MemoryStack stack) {
        return wrap(NkColor.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkColor calloc(MemoryStack stack) {
        return wrap(NkColor.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkColor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkColor.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return UNSAFE.getByte(null, struct + NkColor.R); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return UNSAFE.getByte(null, struct + NkColor.G); }
    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return UNSAFE.getByte(null, struct + NkColor.B); }
    /** Unsafe version of {@link #a}. */
    public static byte na(long struct) { return UNSAFE.getByte(null, struct + NkColor.A); }

    /** Unsafe version of {@link #r(byte) r}. */
    public static void nr(long struct, byte value) { UNSAFE.putByte(null, struct + NkColor.R, value); }
    /** Unsafe version of {@link #g(byte) g}. */
    public static void ng(long struct, byte value) { UNSAFE.putByte(null, struct + NkColor.G, value); }
    /** Unsafe version of {@link #b(byte) b}. */
    public static void nb(long struct, byte value) { UNSAFE.putByte(null, struct + NkColor.B, value); }
    /** Unsafe version of {@link #a(byte) a}. */
    public static void na(long struct, byte value) { UNSAFE.putByte(null, struct + NkColor.A, value); }

    // -----------------------------------

    /** An array of {@link NkColor} structs. */
    public static class Buffer extends StructBuffer<NkColor, Buffer> implements NativeResource {

        private static final NkColor ELEMENT_FACTORY = NkColor.create(-1L);

        /**
         * Creates a new {@code NkColor.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkColor#SIZEOF}, and its mark will be undefined.
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
        protected NkColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        @NativeType("nk_byte")
        public byte r() { return NkColor.nr(address()); }
        /** @return the value of the {@code g} field. */
        @NativeType("nk_byte")
        public byte g() { return NkColor.ng(address()); }
        /** @return the value of the {@code b} field. */
        @NativeType("nk_byte")
        public byte b() { return NkColor.nb(address()); }
        /** @return the value of the {@code a} field. */
        @NativeType("nk_byte")
        public byte a() { return NkColor.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public NkColor.Buffer r(@NativeType("nk_byte") byte value) { NkColor.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public NkColor.Buffer g(@NativeType("nk_byte") byte value) { NkColor.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public NkColor.Buffer b(@NativeType("nk_byte") byte value) { NkColor.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public NkColor.Buffer a(@NativeType("nk_byte") byte value) { NkColor.na(address(), value); return this; }

    }

}