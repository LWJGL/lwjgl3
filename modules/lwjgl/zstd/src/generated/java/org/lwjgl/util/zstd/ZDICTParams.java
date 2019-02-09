/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code compressionLevel} &ndash; optimize for a specific zstd compression level; 0 means default</li>
 * <li>{@code notificationLevel} &ndash; write log to {@code stderr}; 0 = none (default); 1 = errors; 2 = progression; 3 = details; 4 = debug;</li>
 * <li>{@code dictID} &ndash; force {@code dictID} value; 0 means auto mode (32-bits random value)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZDICT_params_t {
 *     int compressionLevel;
 *     unsigned notificationLevel;
 *     unsigned dictID;
 * }</code></pre>
 */
@NativeType("struct ZDICT_params_t")
public class ZDICTParams extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMPRESSIONLEVEL,
        NOTIFICATIONLEVEL,
        DICTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMPRESSIONLEVEL = layout.offsetof(0);
        NOTIFICATIONLEVEL = layout.offsetof(1);
        DICTID = layout.offsetof(2);
    }

    /**
     * Creates a {@code ZDICTParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZDICTParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code compressionLevel} field. */
    public int compressionLevel() { return ncompressionLevel(address()); }
    /** Returns the value of the {@code notificationLevel} field. */
    @NativeType("unsigned")
    public int notificationLevel() { return nnotificationLevel(address()); }
    /** Returns the value of the {@code dictID} field. */
    @NativeType("unsigned")
    public int dictID() { return ndictID(address()); }

    /** Sets the specified value to the {@code compressionLevel} field. */
    public ZDICTParams compressionLevel(int value) { ncompressionLevel(address(), value); return this; }
    /** Sets the specified value to the {@code notificationLevel} field. */
    public ZDICTParams notificationLevel(@NativeType("unsigned") int value) { nnotificationLevel(address(), value); return this; }
    /** Sets the specified value to the {@code dictID} field. */
    public ZDICTParams dictID(@NativeType("unsigned") int value) { ndictID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZDICTParams set(
        int compressionLevel,
        int notificationLevel,
        int dictID
    ) {
        compressionLevel(compressionLevel);
        notificationLevel(notificationLevel);
        dictID(dictID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZDICTParams set(ZDICTParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZDICTParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZDICTParams malloc() {
        return wrap(ZDICTParams.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZDICTParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZDICTParams calloc() {
        return wrap(ZDICTParams.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZDICTParams} instance allocated with {@link BufferUtils}. */
    public static ZDICTParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZDICTParams.class, memAddress(container), container);
    }

    /** Returns a new {@code ZDICTParams} instance for the specified memory address. */
    public static ZDICTParams create(long address) {
        return wrap(ZDICTParams.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTParams createSafe(long address) {
        return address == NULL ? null : wrap(ZDICTParams.class, address);
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZDICTParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ZDICTParams} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZDICTParams mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ZDICTParams} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZDICTParams callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ZDICTParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTParams mallocStack(MemoryStack stack) {
        return wrap(ZDICTParams.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZDICTParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTParams callocStack(MemoryStack stack) {
        return wrap(ZDICTParams.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTParams.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #compressionLevel}. */
    public static int ncompressionLevel(long struct) { return UNSAFE.getInt(null, struct + ZDICTParams.COMPRESSIONLEVEL); }
    /** Unsafe version of {@link #notificationLevel}. */
    public static int nnotificationLevel(long struct) { return UNSAFE.getInt(null, struct + ZDICTParams.NOTIFICATIONLEVEL); }
    /** Unsafe version of {@link #dictID}. */
    public static int ndictID(long struct) { return UNSAFE.getInt(null, struct + ZDICTParams.DICTID); }

    /** Unsafe version of {@link #compressionLevel(int) compressionLevel}. */
    public static void ncompressionLevel(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTParams.COMPRESSIONLEVEL, value); }
    /** Unsafe version of {@link #notificationLevel(int) notificationLevel}. */
    public static void nnotificationLevel(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTParams.NOTIFICATIONLEVEL, value); }
    /** Unsafe version of {@link #dictID(int) dictID}. */
    public static void ndictID(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTParams.DICTID, value); }

    // -----------------------------------

    /** An array of {@link ZDICTParams} structs. */
    public static class Buffer extends StructBuffer<ZDICTParams, Buffer> implements NativeResource {

        private static final ZDICTParams ELEMENT_FACTORY = ZDICTParams.create(-1L);

        /**
         * Creates a new {@code ZDICTParams.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZDICTParams#SIZEOF}, and its mark will be undefined.
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
        protected ZDICTParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code compressionLevel} field. */
        public int compressionLevel() { return ZDICTParams.ncompressionLevel(address()); }
        /** Returns the value of the {@code notificationLevel} field. */
        @NativeType("unsigned")
        public int notificationLevel() { return ZDICTParams.nnotificationLevel(address()); }
        /** Returns the value of the {@code dictID} field. */
        @NativeType("unsigned")
        public int dictID() { return ZDICTParams.ndictID(address()); }

        /** Sets the specified value to the {@code compressionLevel} field. */
        public ZDICTParams.Buffer compressionLevel(int value) { ZDICTParams.ncompressionLevel(address(), value); return this; }
        /** Sets the specified value to the {@code notificationLevel} field. */
        public ZDICTParams.Buffer notificationLevel(@NativeType("unsigned") int value) { ZDICTParams.nnotificationLevel(address(), value); return this; }
        /** Sets the specified value to the {@code dictID} field. */
        public ZDICTParams.Buffer dictID(@NativeType("unsigned") int value) { ZDICTParams.ndictID(address(), value); return this; }

    }

}