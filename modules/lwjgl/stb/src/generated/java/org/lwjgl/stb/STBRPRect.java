/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A packed rectangle.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code id} &ndash; reserved for your use</li>
 * <li>{@code w} &ndash; input width</li>
 * <li>{@code h} &ndash; input height</li>
 * <li>{@code x} &ndash; output x coordinate</li>
 * <li>{@code y} &ndash; output y coordinate</li>
 * <li>{@code was_packed} &ndash; non-zero if valid packing</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbrp_rect {
 *     int id;
 *     stbrp_coord w;
 *     stbrp_coord h;
 *     stbrp_coord x;
 *     stbrp_coord y;
 *     int was_packed;
 * }</code></pre>
 */
@NativeType("struct stbrp_rect")
public class STBRPRect extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        W,
        H,
        X,
        Y,
        WAS_PACKED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        WAS_PACKED = layout.offsetof(5);
    }

    /**
     * Creates a {@code STBRPRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBRPRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code id} field. */
    public int id() { return nid(address()); }
    /** Returns the value of the {@code w} field. */
    @NativeType("stbrp_coord")
    public short w() { return nw(address()); }
    /** Returns the value of the {@code h} field. */
    @NativeType("stbrp_coord")
    public short h() { return nh(address()); }
    /** Returns the value of the {@code x} field. */
    @NativeType("stbrp_coord")
    public short x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("stbrp_coord")
    public short y() { return ny(address()); }
    /** Returns the value of the {@code was_packed} field. */
    @NativeType("int")
    public boolean was_packed() { return nwas_packed(address()) != 0; }

    /** Sets the specified value to the {@code id} field. */
    public STBRPRect id(int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public STBRPRect w(@NativeType("stbrp_coord") short value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public STBRPRect h(@NativeType("stbrp_coord") short value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public STBRPRect x(@NativeType("stbrp_coord") short value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public STBRPRect y(@NativeType("stbrp_coord") short value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code was_packed} field. */
    public STBRPRect was_packed(@NativeType("int") boolean value) { nwas_packed(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public STBRPRect set(
        int id,
        short w,
        short h,
        short x,
        short y,
        boolean was_packed
    ) {
        id(id);
        w(w);
        h(h);
        x(x);
        y(y);
        was_packed(was_packed);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBRPRect set(STBRPRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBRPRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBRPRect malloc() {
        return wrap(STBRPRect.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBRPRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBRPRect calloc() {
        return wrap(STBRPRect.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBRPRect} instance allocated with {@link BufferUtils}. */
    public static STBRPRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBRPRect.class, memAddress(container), container);
    }

    /** Returns a new {@code STBRPRect} instance for the specified memory address. */
    public static STBRPRect create(long address) {
        return wrap(STBRPRect.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPRect createSafe(long address) {
        return address == NULL ? null : wrap(STBRPRect.class, address);
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBRPRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPRect.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code STBRPRect} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBRPRect mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code STBRPRect} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBRPRect callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code STBRPRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPRect mallocStack(MemoryStack stack) {
        return wrap(STBRPRect.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBRPRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPRect callocStack(MemoryStack stack) {
        return wrap(STBRPRect.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.ID); }
    /** Unsafe version of {@link #w}. */
    public static short nw(long struct) { return UNSAFE.getShort(null, struct + STBRPRect.W); }
    /** Unsafe version of {@link #h}. */
    public static short nh(long struct) { return UNSAFE.getShort(null, struct + STBRPRect.H); }
    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return UNSAFE.getShort(null, struct + STBRPRect.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return UNSAFE.getShort(null, struct + STBRPRect.Y); }
    /** Unsafe version of {@link #was_packed}. */
    public static int nwas_packed(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.WAS_PACKED); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.ID, value); }
    /** Unsafe version of {@link #w(short) w}. */
    public static void nw(long struct, short value) { UNSAFE.putShort(null, struct + STBRPRect.W, value); }
    /** Unsafe version of {@link #h(short) h}. */
    public static void nh(long struct, short value) { UNSAFE.putShort(null, struct + STBRPRect.H, value); }
    /** Unsafe version of {@link #x(short) x}. */
    public static void nx(long struct, short value) { UNSAFE.putShort(null, struct + STBRPRect.X, value); }
    /** Unsafe version of {@link #y(short) y}. */
    public static void ny(long struct, short value) { UNSAFE.putShort(null, struct + STBRPRect.Y, value); }
    /** Unsafe version of {@link #was_packed(boolean) was_packed}. */
    public static void nwas_packed(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.WAS_PACKED, value); }

    // -----------------------------------

    /** An array of {@link STBRPRect} structs. */
    public static class Buffer extends StructBuffer<STBRPRect, Buffer> implements NativeResource {

        private static final STBRPRect ELEMENT_FACTORY = STBRPRect.create(-1L);

        /**
         * Creates a new {@code STBRPRect.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBRPRect#SIZEOF}, and its mark will be undefined.
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
        protected STBRPRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code id} field. */
        public int id() { return STBRPRect.nid(address()); }
        /** Returns the value of the {@code w} field. */
        @NativeType("stbrp_coord")
        public short w() { return STBRPRect.nw(address()); }
        /** Returns the value of the {@code h} field. */
        @NativeType("stbrp_coord")
        public short h() { return STBRPRect.nh(address()); }
        /** Returns the value of the {@code x} field. */
        @NativeType("stbrp_coord")
        public short x() { return STBRPRect.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("stbrp_coord")
        public short y() { return STBRPRect.ny(address()); }
        /** Returns the value of the {@code was_packed} field. */
        @NativeType("int")
        public boolean was_packed() { return STBRPRect.nwas_packed(address()) != 0; }

        /** Sets the specified value to the {@code id} field. */
        public STBRPRect.Buffer id(int value) { STBRPRect.nid(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public STBRPRect.Buffer w(@NativeType("stbrp_coord") short value) { STBRPRect.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public STBRPRect.Buffer h(@NativeType("stbrp_coord") short value) { STBRPRect.nh(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public STBRPRect.Buffer x(@NativeType("stbrp_coord") short value) { STBRPRect.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public STBRPRect.Buffer y(@NativeType("stbrp_coord") short value) { STBRPRect.ny(address(), value); return this; }
        /** Sets the specified value to the {@code was_packed} field. */
        public STBRPRect.Buffer was_packed(@NativeType("int") boolean value) { STBRPRect.nwas_packed(address(), value ? 1 : 0); return this; }

    }

}