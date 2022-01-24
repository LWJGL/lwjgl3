/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Offset in two dimensions.
 * 
 * <h5>Description</h5>
 * 
 * <p>This variant is for representing discrete values such as texels. For representing physical distances, the floating-point variant <b>must</b> be used instead.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Di}, {@link XrRect2Di}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrOffset2Di {
 *     int32_t {@link #x};
 *     int32_t {@link #y};
 * }</code></pre>
 */
public class XrOffset2Di extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrOffset2Di} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrOffset2Di(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the integer offset in the x direction. */
    @NativeType("int32_t")
    public int x() { return nx(address()); }
    /** the integer offset in the y direction. */
    @NativeType("int32_t")
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrOffset2Di x(@NativeType("int32_t") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrOffset2Di y(@NativeType("int32_t") int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrOffset2Di set(
        int x,
        int y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrOffset2Di set(XrOffset2Di src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrOffset2Di} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrOffset2Di malloc() {
        return wrap(XrOffset2Di.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrOffset2Di} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrOffset2Di calloc() {
        return wrap(XrOffset2Di.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrOffset2Di} instance allocated with {@link BufferUtils}. */
    public static XrOffset2Di create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrOffset2Di.class, memAddress(container), container);
    }

    /** Returns a new {@code XrOffset2Di} instance for the specified memory address. */
    public static XrOffset2Di create(long address) {
        return wrap(XrOffset2Di.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset2Di createSafe(long address) {
        return address == NULL ? null : wrap(XrOffset2Di.class, address);
    }

    /**
     * Returns a new {@link XrOffset2Di.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Di.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Di.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrOffset2Di.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset2Di.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrOffset2Di} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Di malloc(MemoryStack stack) {
        return wrap(XrOffset2Di.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrOffset2Di} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Di calloc(MemoryStack stack) {
        return wrap(XrOffset2Di.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrOffset2Di.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Di.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Di.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XrOffset2Di.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XrOffset2Di.Y); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XrOffset2Di.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XrOffset2Di.Y, value); }

    // -----------------------------------

    /** An array of {@link XrOffset2Di} structs. */
    public static class Buffer extends StructBuffer<XrOffset2Di, Buffer> implements NativeResource {

        private static final XrOffset2Di ELEMENT_FACTORY = XrOffset2Di.create(-1L);

        /**
         * Creates a new {@code XrOffset2Di.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrOffset2Di#SIZEOF}, and its mark will be undefined.
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
        protected XrOffset2Di getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrOffset2Di#x} field. */
        @NativeType("int32_t")
        public int x() { return XrOffset2Di.nx(address()); }
        /** @return the value of the {@link XrOffset2Di#y} field. */
        @NativeType("int32_t")
        public int y() { return XrOffset2Di.ny(address()); }

        /** Sets the specified value to the {@link XrOffset2Di#x} field. */
        public XrOffset2Di.Buffer x(@NativeType("int32_t") int value) { XrOffset2Di.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrOffset2Di#y} field. */
        public XrOffset2Di.Buffer y(@NativeType("int32_t") int value) { XrOffset2Di.ny(address(), value); return this; }

    }

}