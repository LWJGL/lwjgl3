/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * for cursor positions, mainly
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct UIvec2 {
 *     union {
 *         int v[2];
 *         struct {
 *             int x;
 *             int y;
 *         };
 *     };
 * }</code></pre>
 */
@NativeType("struct UIvec2")
public class UIVec2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V,
        X,
        Y;

    static {
        Layout layout = __struct(
            __union(
                __array(4, 2),
                __struct(
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
    }

    /**
     * Creates a {@code UIVec2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public UIVec2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code v} field. */
    @NativeType("int[2]")
    public IntBuffer v() { return nv(address()); }
    /** @return the value at the specified index of the {@code v} field. */
    public int v(int index) { return nv(address(), index); }
    /** @return the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public int y() { return ny(address()); }

    /** Copies the specified {@link IntBuffer} to the {@code v} field. */
    public UIVec2 v(@NativeType("int[2]") IntBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public UIVec2 v(int index, int value) { nv(address(), index, value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public UIVec2 x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public UIVec2 y(int value) { ny(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public UIVec2 set(UIVec2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code UIVec2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static UIVec2 malloc() {
        return wrap(UIVec2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code UIVec2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static UIVec2 calloc() {
        return wrap(UIVec2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code UIVec2} instance allocated with {@link BufferUtils}. */
    public static UIVec2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(UIVec2.class, memAddress(container), container);
    }

    /** Returns a new {@code UIVec2} instance for the specified memory address. */
    public static UIVec2 create(long address) {
        return wrap(UIVec2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static UIVec2 createSafe(long address) {
        return address == NULL ? null : wrap(UIVec2.class, address);
    }

    /**
     * Returns a new {@link UIVec2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link UIVec2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link UIVec2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link UIVec2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static UIVec2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static UIVec2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static UIVec2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static UIVec2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static UIVec2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static UIVec2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static UIVec2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static UIVec2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static UIVec2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code UIVec2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static UIVec2 malloc(MemoryStack stack) {
        return wrap(UIVec2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code UIVec2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static UIVec2 calloc(MemoryStack stack) {
        return wrap(UIVec2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link UIVec2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link UIVec2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static UIVec2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static IntBuffer nv(long struct) { return memIntBuffer(struct + UIVec2.V, 2); }
    /** Unsafe version of {@link #v(int) v}. */
    public static int nv(long struct, int index) {
        return UNSAFE.getInt(null, struct + UIVec2.V + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + UIVec2.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + UIVec2.Y); }

    /** Unsafe version of {@link #v(IntBuffer) v}. */
    public static void nv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + UIVec2.V, value.remaining() * 4);
    }
    /** Unsafe version of {@link #v(int, int) v}. */
    public static void nv(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + UIVec2.V + check(index, 2) * 4, value);
    }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + UIVec2.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + UIVec2.Y, value); }

    // -----------------------------------

    /** An array of {@link UIVec2} structs. */
    public static class Buffer extends StructBuffer<UIVec2, Buffer> implements NativeResource {

        private static final UIVec2 ELEMENT_FACTORY = UIVec2.create(-1L);

        /**
         * Creates a new {@code UIVec2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link UIVec2#SIZEOF}, and its mark will be undefined.
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
        protected UIVec2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code v} field. */
        @NativeType("int[2]")
        public IntBuffer v() { return UIVec2.nv(address()); }
        /** @return the value at the specified index of the {@code v} field. */
        public int v(int index) { return UIVec2.nv(address(), index); }
        /** @return the value of the {@code x} field. */
        public int x() { return UIVec2.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return UIVec2.ny(address()); }

        /** Copies the specified {@link IntBuffer} to the {@code v} field. */
        public UIVec2.Buffer v(@NativeType("int[2]") IntBuffer value) { UIVec2.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public UIVec2.Buffer v(int index, int value) { UIVec2.nv(address(), index, value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public UIVec2.Buffer x(int value) { UIVec2.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public UIVec2.Buffer y(int value) { UIVec2.ny(address(), value); return this; }

    }

}