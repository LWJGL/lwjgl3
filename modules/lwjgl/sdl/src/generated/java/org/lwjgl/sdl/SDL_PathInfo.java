/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_PathInfo {
 *     SDL_PathType type;
 *     Uint64 size;
 *     SDL_Time create_time;
 *     SDL_Time modify_time;
 *     SDL_Time access_time;
 * }}</pre>
 */
public class SDL_PathInfo extends Struct<SDL_PathInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SIZE,
        CREATE_TIME,
        MODIFY_TIME,
        ACCESS_TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        CREATE_TIME = layout.offsetof(2);
        MODIFY_TIME = layout.offsetof(3);
        ACCESS_TIME = layout.offsetof(4);
    }

    protected SDL_PathInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PathInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_PathInfo(address, container);
    }

    /**
     * Creates a {@code SDL_PathInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PathInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_PathType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("Uint64")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code create_time} field. */
    @NativeType("SDL_Time")
    public long create_time() { return ncreate_time(address()); }
    /** @return the value of the {@code modify_time} field. */
    @NativeType("SDL_Time")
    public long modify_time() { return nmodify_time(address()); }
    /** @return the value of the {@code access_time} field. */
    @NativeType("SDL_Time")
    public long access_time() { return naccess_time(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_PathInfo type(@NativeType("SDL_PathType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public SDL_PathInfo size(@NativeType("Uint64") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code create_time} field. */
    public SDL_PathInfo create_time(@NativeType("SDL_Time") long value) { ncreate_time(address(), value); return this; }
    /** Sets the specified value to the {@code modify_time} field. */
    public SDL_PathInfo modify_time(@NativeType("SDL_Time") long value) { nmodify_time(address(), value); return this; }
    /** Sets the specified value to the {@code access_time} field. */
    public SDL_PathInfo access_time(@NativeType("SDL_Time") long value) { naccess_time(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PathInfo set(
        int type,
        long size,
        long create_time,
        long modify_time,
        long access_time
    ) {
        type(type);
        size(size);
        create_time(create_time);
        modify_time(modify_time);
        access_time(access_time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_PathInfo set(SDL_PathInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PathInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PathInfo malloc() {
        return new SDL_PathInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PathInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PathInfo calloc() {
        return new SDL_PathInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PathInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_PathInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PathInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PathInfo} instance for the specified memory address. */
    public static SDL_PathInfo create(long address) {
        return new SDL_PathInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PathInfo createSafe(long address) {
        return address == NULL ? null : new SDL_PathInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_PathInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PathInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PathInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PathInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PathInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PathInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PathInfo malloc(MemoryStack stack) {
        return new SDL_PathInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PathInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PathInfo calloc(MemoryStack stack) {
        return new SDL_PathInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PathInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PathInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PathInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_PathInfo.TYPE); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + SDL_PathInfo.SIZE); }
    /** Unsafe version of {@link #create_time}. */
    public static long ncreate_time(long struct) { return memGetLong(struct + SDL_PathInfo.CREATE_TIME); }
    /** Unsafe version of {@link #modify_time}. */
    public static long nmodify_time(long struct) { return memGetLong(struct + SDL_PathInfo.MODIFY_TIME); }
    /** Unsafe version of {@link #access_time}. */
    public static long naccess_time(long struct) { return memGetLong(struct + SDL_PathInfo.ACCESS_TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_PathInfo.TYPE, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + SDL_PathInfo.SIZE, value); }
    /** Unsafe version of {@link #create_time(long) create_time}. */
    public static void ncreate_time(long struct, long value) { memPutLong(struct + SDL_PathInfo.CREATE_TIME, value); }
    /** Unsafe version of {@link #modify_time(long) modify_time}. */
    public static void nmodify_time(long struct, long value) { memPutLong(struct + SDL_PathInfo.MODIFY_TIME, value); }
    /** Unsafe version of {@link #access_time(long) access_time}. */
    public static void naccess_time(long struct, long value) { memPutLong(struct + SDL_PathInfo.ACCESS_TIME, value); }

    // -----------------------------------

    /** An array of {@link SDL_PathInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_PathInfo, Buffer> implements NativeResource {

        private static final SDL_PathInfo ELEMENT_FACTORY = SDL_PathInfo.create(-1L);

        /**
         * Creates a new {@code SDL_PathInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PathInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PathInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_PathType")
        public int type() { return SDL_PathInfo.ntype(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("Uint64")
        public long size() { return SDL_PathInfo.nsize(address()); }
        /** @return the value of the {@code create_time} field. */
        @NativeType("SDL_Time")
        public long create_time() { return SDL_PathInfo.ncreate_time(address()); }
        /** @return the value of the {@code modify_time} field. */
        @NativeType("SDL_Time")
        public long modify_time() { return SDL_PathInfo.nmodify_time(address()); }
        /** @return the value of the {@code access_time} field. */
        @NativeType("SDL_Time")
        public long access_time() { return SDL_PathInfo.naccess_time(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_PathInfo.Buffer type(@NativeType("SDL_PathType") int value) { SDL_PathInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public SDL_PathInfo.Buffer size(@NativeType("Uint64") long value) { SDL_PathInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code create_time} field. */
        public SDL_PathInfo.Buffer create_time(@NativeType("SDL_Time") long value) { SDL_PathInfo.ncreate_time(address(), value); return this; }
        /** Sets the specified value to the {@code modify_time} field. */
        public SDL_PathInfo.Buffer modify_time(@NativeType("SDL_Time") long value) { SDL_PathInfo.nmodify_time(address(), value); return this; }
        /** Sets the specified value to the {@code access_time} field. */
        public SDL_PathInfo.Buffer access_time(@NativeType("SDL_Time") long value) { SDL_PathInfo.naccess_time(address(), value); return this; }

    }

}