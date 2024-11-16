/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * layout rectangle
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct UIrect {
 *     union {
 *         int v[4];
 *         struct {
 *             int x;
 *             int y;
 *             int w;
 *             int h;
 *         };
 *     };
 * }</code></pre>
 */
@NativeType("struct UIrect")
public class UIRect extends Struct<UIRect> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V,
        X,
        Y,
        W,
        H;

    static {
        Layout layout = __struct(
            __union(
                __array(4, 4),
                __struct(
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4)
                )
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        V = layout.offsetof(1);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        W = layout.offsetof(5);
        H = layout.offsetof(6);
    }

    protected UIRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected UIRect create(long address, @Nullable ByteBuffer container) {
        return new UIRect(address, container);
    }

    /**
     * Creates a {@code UIRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public UIRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code v} field. */
    @NativeType("int[4]")
    public IntBuffer v() { return nv(address()); }
    /** @return the value at the specified index of the {@code v} field. */
    public int v(int index) { return nv(address(), index); }
    /** @return the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public int h() { return nh(address()); }

    /** Copies the specified {@link IntBuffer} to the {@code v} field. */
    public UIRect v(@NativeType("int[4]") IntBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public UIRect v(int index, int value) { nv(address(), index, value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public UIRect x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public UIRect y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public UIRect w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public UIRect h(int value) { nh(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public UIRect set(UIRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code UIRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static UIRect malloc() {
        return new UIRect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code UIRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static UIRect calloc() {
        return new UIRect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code UIRect} instance allocated with {@link BufferUtils}. */
    public static UIRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new UIRect(memAddress(container), container);
    }

    /** Returns a new {@code UIRect} instance for the specified memory address. */
    public static UIRect create(long address) {
        return new UIRect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable UIRect createSafe(long address) {
        return address == NULL ? null : new UIRect(address, null);
    }

    /**
     * Returns a new {@link UIRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link UIRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link UIRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link UIRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static UIRect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static UIRect mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static UIRect callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static UIRect mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static UIRect callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static UIRect.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static UIRect.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static UIRect.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static UIRect.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code UIRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static UIRect malloc(MemoryStack stack) {
        return new UIRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code UIRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static UIRect calloc(MemoryStack stack) {
        return new UIRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link UIRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link UIRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static UIRect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static IntBuffer nv(long struct) { return memIntBuffer(struct + UIRect.V, 4); }
    /** Unsafe version of {@link #v(int) v}. */
    public static int nv(long struct, int index) {
        return memGetInt(struct + UIRect.V + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + UIRect.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + UIRect.Y); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + UIRect.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + UIRect.H); }

    /** Unsafe version of {@link #v(IntBuffer) v}. */
    public static void nv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + UIRect.V, value.remaining() * 4);
    }
    /** Unsafe version of {@link #v(int, int) v}. */
    public static void nv(long struct, int index, int value) {
        memPutInt(struct + UIRect.V + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + UIRect.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + UIRect.Y, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + UIRect.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + UIRect.H, value); }

    // -----------------------------------

    /** An array of {@link UIRect} structs. */
    public static class Buffer extends StructBuffer<UIRect, Buffer> implements NativeResource {

        private static final UIRect ELEMENT_FACTORY = UIRect.create(-1L);

        /**
         * Creates a new {@code UIRect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link UIRect#SIZEOF}, and its mark will be undefined.</p>
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
        protected UIRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code v} field. */
        @NativeType("int[4]")
        public IntBuffer v() { return UIRect.nv(address()); }
        /** @return the value at the specified index of the {@code v} field. */
        public int v(int index) { return UIRect.nv(address(), index); }
        /** @return the value of the {@code x} field. */
        public int x() { return UIRect.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return UIRect.ny(address()); }
        /** @return the value of the {@code w} field. */
        public int w() { return UIRect.nw(address()); }
        /** @return the value of the {@code h} field. */
        public int h() { return UIRect.nh(address()); }

        /** Copies the specified {@link IntBuffer} to the {@code v} field. */
        public UIRect.Buffer v(@NativeType("int[4]") IntBuffer value) { UIRect.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public UIRect.Buffer v(int index, int value) { UIRect.nv(address(), index, value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public UIRect.Buffer x(int value) { UIRect.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public UIRect.Buffer y(int value) { UIRect.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public UIRect.Buffer w(int value) { UIRect.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public UIRect.Buffer h(int value) { UIRect.nh(address(), value); return this; }

    }

}