/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for a native rectangle.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct JAWT_Rectangle {
 *     jint {@link #x};
 *     jint {@link #y};
 *     jint {@link #width};
 *     jint {@link #height};
 * }</code></pre>
 */
@NativeType("struct JAWT_Rectangle")
public class JAWTRectangle extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
    }

    /**
     * Creates a {@code JAWTRectangle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWTRectangle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the rectangle X axis coordinate */
    @NativeType("jint")
    public int x() { return nx(address()); }
    /** the rectangle Y axis coordinate */
    @NativeType("jint")
    public int y() { return ny(address()); }
    /** the rectangle width */
    @NativeType("jint")
    public int width() { return nwidth(address()); }
    /** the rectangle height */
    @NativeType("jint")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public JAWTRectangle x(@NativeType("jint") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public JAWTRectangle y(@NativeType("jint") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public JAWTRectangle width(@NativeType("jint") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public JAWTRectangle height(@NativeType("jint") int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JAWTRectangle set(
        int x,
        int y,
        int width,
        int height
    ) {
        x(x);
        y(y);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JAWTRectangle set(JAWTRectangle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JAWTRectangle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JAWTRectangle malloc() {
        return wrap(JAWTRectangle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code JAWTRectangle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JAWTRectangle calloc() {
        return wrap(JAWTRectangle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code JAWTRectangle} instance allocated with {@link BufferUtils}. */
    public static JAWTRectangle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(JAWTRectangle.class, memAddress(container), container);
    }

    /** Returns a new {@code JAWTRectangle} instance for the specified memory address. */
    public static JAWTRectangle create(long address) {
        return wrap(JAWTRectangle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWTRectangle createSafe(long address) {
        return address == NULL ? null : wrap(JAWTRectangle.class, address);
    }

    /**
     * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JAWTRectangle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link JAWTRectangle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWTRectangle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static JAWTRectangle.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code JAWTRectangle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWTRectangle malloc(MemoryStack stack) {
        return wrap(JAWTRectangle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code JAWTRectangle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWTRectangle calloc(MemoryStack stack) {
        return wrap(JAWTRectangle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JAWTRectangle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JAWTRectangle.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + JAWTRectangle.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + JAWTRectangle.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + JAWTRectangle.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + JAWTRectangle.HEIGHT); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + JAWTRectangle.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + JAWTRectangle.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + JAWTRectangle.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + JAWTRectangle.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link JAWTRectangle} structs. */
    public static class Buffer extends StructBuffer<JAWTRectangle, Buffer> implements NativeResource {

        private static final JAWTRectangle ELEMENT_FACTORY = JAWTRectangle.create(-1L);

        /**
         * Creates a new {@code JAWTRectangle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTRectangle#SIZEOF}, and its mark will be undefined.
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
        protected JAWTRectangle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link JAWTRectangle#x} field. */
        @NativeType("jint")
        public int x() { return JAWTRectangle.nx(address()); }
        /** @return the value of the {@link JAWTRectangle#y} field. */
        @NativeType("jint")
        public int y() { return JAWTRectangle.ny(address()); }
        /** @return the value of the {@link JAWTRectangle#width} field. */
        @NativeType("jint")
        public int width() { return JAWTRectangle.nwidth(address()); }
        /** @return the value of the {@link JAWTRectangle#height} field. */
        @NativeType("jint")
        public int height() { return JAWTRectangle.nheight(address()); }

        /** Sets the specified value to the {@link JAWTRectangle#x} field. */
        public JAWTRectangle.Buffer x(@NativeType("jint") int value) { JAWTRectangle.nx(address(), value); return this; }
        /** Sets the specified value to the {@link JAWTRectangle#y} field. */
        public JAWTRectangle.Buffer y(@NativeType("jint") int value) { JAWTRectangle.ny(address(), value); return this; }
        /** Sets the specified value to the {@link JAWTRectangle#width} field. */
        public JAWTRectangle.Buffer width(@NativeType("jint") int value) { JAWTRectangle.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link JAWTRectangle#height} field. */
        public JAWTRectangle.Buffer height(@NativeType("jint") int value) { JAWTRectangle.nheight(address(), value); return this; }

    }

}