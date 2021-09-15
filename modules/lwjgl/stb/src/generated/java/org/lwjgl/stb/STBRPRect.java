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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbrp_rect {
 *     int {@link #id};
 *     stbrp_coord {@link #w};
 *     stbrp_coord {@link #h};
 *     stbrp_coord {@link #x};
 *     stbrp_coord {@link #y};
 *     int {@link #was_packed};
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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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

    /** reserved for your use */
    public int id() { return nid(address()); }
    /** input width */
    @NativeType("stbrp_coord")
    public int w() { return nw(address()); }
    /** input height */
    @NativeType("stbrp_coord")
    public int h() { return nh(address()); }
    /** output x coordinate */
    @NativeType("stbrp_coord")
    public int x() { return nx(address()); }
    /** output y coordinate */
    @NativeType("stbrp_coord")
    public int y() { return ny(address()); }
    /** non-zero if valid packing */
    @NativeType("int")
    public boolean was_packed() { return nwas_packed(address()) != 0; }

    /** Sets the specified value to the {@link #id} field. */
    public STBRPRect id(int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@link #w} field. */
    public STBRPRect w(@NativeType("stbrp_coord") int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@link #h} field. */
    public STBRPRect h(@NativeType("stbrp_coord") int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@link #x} field. */
    public STBRPRect x(@NativeType("stbrp_coord") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public STBRPRect y(@NativeType("stbrp_coord") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #was_packed} field. */
    public STBRPRect was_packed(@NativeType("int") boolean value) { nwas_packed(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public STBRPRect set(
        int id,
        int w,
        int h,
        int x,
        int y,
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBRPRect mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBRPRect callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBRPRect mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBRPRect callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPRect.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPRect.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPRect.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBRPRect.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBRPRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPRect malloc(MemoryStack stack) {
        return wrap(STBRPRect.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBRPRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBRPRect calloc(MemoryStack stack) {
        return wrap(STBRPRect.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBRPRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBRPRect.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.ID); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.H); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.Y); }
    /** Unsafe version of {@link #was_packed}. */
    public static int nwas_packed(long struct) { return UNSAFE.getInt(null, struct + STBRPRect.WAS_PACKED); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.ID, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.H, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + STBRPRect.Y, value); }
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

        /** @return the value of the {@link STBRPRect#id} field. */
        public int id() { return STBRPRect.nid(address()); }
        /** @return the value of the {@link STBRPRect#w} field. */
        @NativeType("stbrp_coord")
        public int w() { return STBRPRect.nw(address()); }
        /** @return the value of the {@link STBRPRect#h} field. */
        @NativeType("stbrp_coord")
        public int h() { return STBRPRect.nh(address()); }
        /** @return the value of the {@link STBRPRect#x} field. */
        @NativeType("stbrp_coord")
        public int x() { return STBRPRect.nx(address()); }
        /** @return the value of the {@link STBRPRect#y} field. */
        @NativeType("stbrp_coord")
        public int y() { return STBRPRect.ny(address()); }
        /** @return the value of the {@link STBRPRect#was_packed} field. */
        @NativeType("int")
        public boolean was_packed() { return STBRPRect.nwas_packed(address()) != 0; }

        /** Sets the specified value to the {@link STBRPRect#id} field. */
        public STBRPRect.Buffer id(int value) { STBRPRect.nid(address(), value); return this; }
        /** Sets the specified value to the {@link STBRPRect#w} field. */
        public STBRPRect.Buffer w(@NativeType("stbrp_coord") int value) { STBRPRect.nw(address(), value); return this; }
        /** Sets the specified value to the {@link STBRPRect#h} field. */
        public STBRPRect.Buffer h(@NativeType("stbrp_coord") int value) { STBRPRect.nh(address(), value); return this; }
        /** Sets the specified value to the {@link STBRPRect#x} field. */
        public STBRPRect.Buffer x(@NativeType("stbrp_coord") int value) { STBRPRect.nx(address(), value); return this; }
        /** Sets the specified value to the {@link STBRPRect#y} field. */
        public STBRPRect.Buffer y(@NativeType("stbrp_coord") int value) { STBRPRect.ny(address(), value); return this; }
        /** Sets the specified value to the {@link STBRPRect#was_packed} field. */
        public STBRPRect.Buffer was_packed(@NativeType("int") boolean value) { STBRPRect.nwas_packed(address(), value ? 1 : 0); return this; }

    }

}