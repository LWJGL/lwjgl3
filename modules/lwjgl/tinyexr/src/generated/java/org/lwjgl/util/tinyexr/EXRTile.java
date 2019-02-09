/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; actual width in a tile</li>
 * <li>{@code height} &ndash; actual height in a tile</li>
 * <li>{@code images} &ndash; image[channels][pixels]</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct EXRTile {
 *     int offset_x;
 *     int offset_y;
 *     int level_x;
 *     int level_y;
 *     int width;
 *     int height;
 *     unsigned char ** images;
 * }</code></pre>
 */
public class EXRTile extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET_X,
        OFFSET_Y,
        LEVEL_X,
        LEVEL_Y,
        WIDTH,
        HEIGHT,
        IMAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET_X = layout.offsetof(0);
        OFFSET_Y = layout.offsetof(1);
        LEVEL_X = layout.offsetof(2);
        LEVEL_Y = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
        IMAGES = layout.offsetof(6);
    }

    /**
     * Creates a {@code EXRTile} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRTile(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code offset_x} field. */
    public int offset_x() { return noffset_x(address()); }
    /** Returns the value of the {@code offset_y} field. */
    public int offset_y() { return noffset_y(address()); }
    /** Returns the value of the {@code level_x} field. */
    public int level_x() { return nlevel_x(address()); }
    /** Returns the value of the {@code level_y} field. */
    public int level_y() { return nlevel_y(address()); }
    /** Returns the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /**
     * Returns a {@link PointerBuffer} view of the data pointed to by the {@code images} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char **")
    public PointerBuffer images(int capacity) { return nimages(address(), capacity); }

    /** Sets the specified value to the {@code offset_x} field. */
    public EXRTile offset_x(int value) { noffset_x(address(), value); return this; }
    /** Sets the specified value to the {@code offset_y} field. */
    public EXRTile offset_y(int value) { noffset_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public EXRTile level_x(int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public EXRTile level_y(int value) { nlevel_y(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public EXRTile width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public EXRTile height(int value) { nheight(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code images} field. */
    public EXRTile images(@NativeType("unsigned char **") PointerBuffer value) { nimages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRTile set(
        int offset_x,
        int offset_y,
        int level_x,
        int level_y,
        int width,
        int height,
        PointerBuffer images
    ) {
        offset_x(offset_x);
        offset_y(offset_y);
        level_x(level_x);
        level_y(level_y);
        width(width);
        height(height);
        images(images);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRTile set(EXRTile src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRTile} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRTile malloc() {
        return wrap(EXRTile.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRTile} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRTile calloc() {
        return wrap(EXRTile.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRTile} instance allocated with {@link BufferUtils}. */
    public static EXRTile create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRTile.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRTile} instance for the specified memory address. */
    public static EXRTile create(long address) {
        return wrap(EXRTile.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRTile createSafe(long address) {
        return address == NULL ? null : wrap(EXRTile.class, address);
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRTile.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRTile.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code EXRTile} instance allocated on the thread-local {@link MemoryStack}. */
    public static EXRTile mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code EXRTile} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static EXRTile callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code EXRTile} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRTile mallocStack(MemoryStack stack) {
        return wrap(EXRTile.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRTile} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRTile callocStack(MemoryStack stack) {
        return wrap(EXRTile.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRTile.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRTile.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset_x}. */
    public static int noffset_x(long struct) { return UNSAFE.getInt(null, struct + EXRTile.OFFSET_X); }
    /** Unsafe version of {@link #offset_y}. */
    public static int noffset_y(long struct) { return UNSAFE.getInt(null, struct + EXRTile.OFFSET_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return UNSAFE.getInt(null, struct + EXRTile.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return UNSAFE.getInt(null, struct + EXRTile.LEVEL_Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + EXRTile.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + EXRTile.HEIGHT); }
    /** Unsafe version of {@link #images(int) images}. */
    public static PointerBuffer nimages(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + EXRTile.IMAGES), capacity); }

    /** Unsafe version of {@link #offset_x(int) offset_x}. */
    public static void noffset_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.OFFSET_X, value); }
    /** Unsafe version of {@link #offset_y(int) offset_y}. */
    public static void noffset_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.OFFSET_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.LEVEL_Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + EXRTile.HEIGHT, value); }
    /** Unsafe version of {@link #images(PointerBuffer) images}. */
    public static void nimages(long struct, PointerBuffer value) { memPutAddress(struct + EXRTile.IMAGES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + EXRTile.IMAGES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link EXRTile} structs. */
    public static class Buffer extends StructBuffer<EXRTile, Buffer> implements NativeResource {

        private static final EXRTile ELEMENT_FACTORY = EXRTile.create(-1L);

        /**
         * Creates a new {@code EXRTile.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRTile#SIZEOF}, and its mark will be undefined.
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
        protected EXRTile getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code offset_x} field. */
        public int offset_x() { return EXRTile.noffset_x(address()); }
        /** Returns the value of the {@code offset_y} field. */
        public int offset_y() { return EXRTile.noffset_y(address()); }
        /** Returns the value of the {@code level_x} field. */
        public int level_x() { return EXRTile.nlevel_x(address()); }
        /** Returns the value of the {@code level_y} field. */
        public int level_y() { return EXRTile.nlevel_y(address()); }
        /** Returns the value of the {@code width} field. */
        public int width() { return EXRTile.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public int height() { return EXRTile.nheight(address()); }
        /**
         * Returns a {@link PointerBuffer} view of the data pointed to by the {@code images} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char **")
        public PointerBuffer images(int capacity) { return EXRTile.nimages(address(), capacity); }

        /** Sets the specified value to the {@code offset_x} field. */
        public EXRTile.Buffer offset_x(int value) { EXRTile.noffset_x(address(), value); return this; }
        /** Sets the specified value to the {@code offset_y} field. */
        public EXRTile.Buffer offset_y(int value) { EXRTile.noffset_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public EXRTile.Buffer level_x(int value) { EXRTile.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public EXRTile.Buffer level_y(int value) { EXRTile.nlevel_y(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public EXRTile.Buffer width(int value) { EXRTile.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public EXRTile.Buffer height(int value) { EXRTile.nheight(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code images} field. */
        public EXRTile.Buffer images(@NativeType("unsigned char **") PointerBuffer value) { EXRTile.nimages(address(), value); return this; }

    }

}