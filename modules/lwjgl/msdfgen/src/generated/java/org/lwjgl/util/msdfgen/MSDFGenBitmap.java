/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_bitmap {
 *     int type;
 *     int width;
 *     int height;
 *     void * handle;
 * }}</pre>
 */
@NativeType("struct msdf_bitmap")
public class MSDFGenBitmap extends Struct<MSDFGenBitmap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        WIDTH,
        HEIGHT,
        HANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
    }

    protected MSDFGenBitmap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenBitmap create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenBitmap(address, container);
    }

    /**
     * Creates a {@code MSDFGenBitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenBitmap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }

    /** Sets the specified value to the {@code type} field. */
    public MSDFGenBitmap type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public MSDFGenBitmap width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public MSDFGenBitmap height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public MSDFGenBitmap handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenBitmap set(
        int type,
        int width,
        int height,
        long handle
    ) {
        type(type);
        width(width);
        height(height);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenBitmap set(MSDFGenBitmap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenBitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenBitmap malloc() {
        return new MSDFGenBitmap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenBitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenBitmap calloc() {
        return new MSDFGenBitmap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenBitmap} instance allocated with {@link BufferUtils}. */
    public static MSDFGenBitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenBitmap(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenBitmap} instance for the specified memory address. */
    public static MSDFGenBitmap create(long address) {
        return new MSDFGenBitmap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenBitmap createSafe(long address) {
        return address == NULL ? null : new MSDFGenBitmap(address, null);
    }

    /**
     * Returns a new {@link MSDFGenBitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBitmap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenBitmap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenBitmap.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenBitmap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenBitmap malloc(MemoryStack stack) {
        return new MSDFGenBitmap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenBitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenBitmap calloc(MemoryStack stack) {
        return new MSDFGenBitmap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenBitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenBitmap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + MSDFGenBitmap.TYPE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + MSDFGenBitmap.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + MSDFGenBitmap.HEIGHT); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + MSDFGenBitmap.HANDLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + MSDFGenBitmap.TYPE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + MSDFGenBitmap.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + MSDFGenBitmap.HEIGHT, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + MSDFGenBitmap.HANDLE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + MSDFGenBitmap.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link MSDFGenBitmap} structs. */
    public static class Buffer extends StructBuffer<MSDFGenBitmap, Buffer> implements NativeResource {

        private static final MSDFGenBitmap ELEMENT_FACTORY = MSDFGenBitmap.create(-1L);

        /**
         * Creates a new {@code MSDFGenBitmap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenBitmap#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenBitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return MSDFGenBitmap.ntype(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return MSDFGenBitmap.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return MSDFGenBitmap.nheight(address()); }
        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return MSDFGenBitmap.nhandle(address()); }

        /** Sets the specified value to the {@code type} field. */
        public MSDFGenBitmap.Buffer type(int value) { MSDFGenBitmap.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public MSDFGenBitmap.Buffer width(int value) { MSDFGenBitmap.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public MSDFGenBitmap.Buffer height(int value) { MSDFGenBitmap.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public MSDFGenBitmap.Buffer handle(@NativeType("void *") long value) { MSDFGenBitmap.nhandle(address(), value); return this; }

    }

}