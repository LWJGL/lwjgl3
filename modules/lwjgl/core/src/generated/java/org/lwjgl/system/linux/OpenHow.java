/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Arguments for how {@code openat2(2)} should open the target path.
 * 
 * <p>If only {@code flags} and {@code @}mode are non-zero, then {@code openat2(2)} operates very similarly to {@code openat(2)}.</p>
 * 
 * <p>However, unlike {@code openat(2)}, unknown or invalid bits in {@code flags} result in {@code -EINVAL} rather than being silently ignored. {@code mode}
 * must be zero unless one of {@link FCNTL#O_CREAT}, {@link FCNTL#O_TMPFILE} are set.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct open_how {
 *     __u64 flags;
 *     __u64 mode;
 *     __u64 resolve;
 * }</code></pre>
 */
@NativeType("struct open_how")
public class OpenHow extends Struct<OpenHow> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        MODE,
        RESOLVE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        MODE = layout.offsetof(1);
        RESOLVE = layout.offsetof(2);
    }

    protected OpenHow(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OpenHow create(long address, @Nullable ByteBuffer container) {
        return new OpenHow(address, container);
    }

    /**
     * Creates a {@code OpenHow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpenHow(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("__u64")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("__u64")
    public long mode() { return nmode(address()); }
    /** @return the value of the {@code resolve} field. */
    @NativeType("__u64")
    public long resolve() { return nresolve(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public OpenHow flags(@NativeType("__u64") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public OpenHow mode(@NativeType("__u64") long value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code resolve} field. */
    public OpenHow resolve(@NativeType("__u64") long value) { nresolve(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OpenHow set(
        long flags,
        long mode,
        long resolve
    ) {
        flags(flags);
        mode(mode);
        resolve(resolve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OpenHow set(OpenHow src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OpenHow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpenHow malloc() {
        return new OpenHow(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OpenHow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpenHow calloc() {
        return new OpenHow(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OpenHow} instance allocated with {@link BufferUtils}. */
    public static OpenHow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OpenHow(memAddress(container), container);
    }

    /** Returns a new {@code OpenHow} instance for the specified memory address. */
    public static OpenHow create(long address) {
        return new OpenHow(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpenHow createSafe(long address) {
        return address == NULL ? null : new OpenHow(address, null);
    }

    /**
     * Returns a new {@link OpenHow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpenHow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpenHow.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OpenHow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpenHow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code OpenHow} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpenHow malloc(MemoryStack stack) {
        return new OpenHow(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OpenHow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpenHow calloc(MemoryStack stack) {
        return new OpenHow(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OpenHow.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpenHow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpenHow.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + OpenHow.FLAGS); }
    /** Unsafe version of {@link #mode}. */
    public static long nmode(long struct) { return UNSAFE.getLong(null, struct + OpenHow.MODE); }
    /** Unsafe version of {@link #resolve}. */
    public static long nresolve(long struct) { return UNSAFE.getLong(null, struct + OpenHow.RESOLVE); }

    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + OpenHow.FLAGS, value); }
    /** Unsafe version of {@link #mode(long) mode}. */
    public static void nmode(long struct, long value) { UNSAFE.putLong(null, struct + OpenHow.MODE, value); }
    /** Unsafe version of {@link #resolve(long) resolve}. */
    public static void nresolve(long struct, long value) { UNSAFE.putLong(null, struct + OpenHow.RESOLVE, value); }

    // -----------------------------------

    /** An array of {@link OpenHow} structs. */
    public static class Buffer extends StructBuffer<OpenHow, Buffer> implements NativeResource {

        private static final OpenHow ELEMENT_FACTORY = OpenHow.create(-1L);

        /**
         * Creates a new {@code OpenHow.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpenHow#SIZEOF}, and its mark will be undefined.</p>
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
        protected OpenHow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("__u64")
        public long flags() { return OpenHow.nflags(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("__u64")
        public long mode() { return OpenHow.nmode(address()); }
        /** @return the value of the {@code resolve} field. */
        @NativeType("__u64")
        public long resolve() { return OpenHow.nresolve(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public OpenHow.Buffer flags(@NativeType("__u64") long value) { OpenHow.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public OpenHow.Buffer mode(@NativeType("__u64") long value) { OpenHow.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code resolve} field. */
        public OpenHow.Buffer resolve(@NativeType("__u64") long value) { OpenHow.nresolve(address(), value); return this; }

    }

}