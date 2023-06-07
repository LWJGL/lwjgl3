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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct flock64 {
 *     short {@link #l_type};
 *     short {@link #l_whence};
 *     off_t {@link #l_start};
 *     off_t {@link #l_len};
 *     pid_t {@link #l_pid};
 * }</code></pre>
 */
@NativeType("struct flock64")
public class Flock extends Struct<Flock> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        L_TYPE,
        L_WHENCE,
        L_START,
        L_LEN,
        L_PID;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        L_TYPE = layout.offsetof(0);
        L_WHENCE = layout.offsetof(1);
        L_START = layout.offsetof(2);
        L_LEN = layout.offsetof(3);
        L_PID = layout.offsetof(4);
    }

    protected Flock(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected Flock create(long address, @Nullable ByteBuffer container) {
        return new Flock(address, container);
    }

    /**
     * Creates a {@code Flock} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Flock(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** type of lock. One of:<br><table><tr><td>{@link FCNTL#F_RDLCK}</td><td>{@link FCNTL#F_WRLCK}</td><td>{@link FCNTL#F_UNLCK}</td></tr></table> */
    public short l_type() { return nl_type(address()); }
    /** where {@code l_start} is relative to (like {@code lseek}) */
    public short l_whence() { return nl_whence(address()); }
    /** offset where the lock begins */
    @NativeType("off_t")
    public long l_start() { return nl_start(address()); }
    /** size of the locked area; zero means until EOF */
    @NativeType("off_t")
    public long l_len() { return nl_len(address()); }
    /** process holding the lock */
    @NativeType("pid_t")
    public int l_pid() { return nl_pid(address()); }

    /** Sets the specified value to the {@link #l_type} field. */
    public Flock l_type(short value) { nl_type(address(), value); return this; }
    /** Sets the specified value to the {@link #l_whence} field. */
    public Flock l_whence(short value) { nl_whence(address(), value); return this; }
    /** Sets the specified value to the {@link #l_start} field. */
    public Flock l_start(@NativeType("off_t") long value) { nl_start(address(), value); return this; }
    /** Sets the specified value to the {@link #l_len} field. */
    public Flock l_len(@NativeType("off_t") long value) { nl_len(address(), value); return this; }
    /** Sets the specified value to the {@link #l_pid} field. */
    public Flock l_pid(@NativeType("pid_t") int value) { nl_pid(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Flock set(
        short l_type,
        short l_whence,
        long l_start,
        long l_len,
        int l_pid
    ) {
        l_type(l_type);
        l_whence(l_whence);
        l_start(l_start);
        l_len(l_len);
        l_pid(l_pid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Flock set(Flock src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Flock} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Flock malloc() {
        return new Flock(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code Flock} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Flock calloc() {
        return new Flock(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code Flock} instance allocated with {@link BufferUtils}. */
    public static Flock create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Flock(memAddress(container), container);
    }

    /** Returns a new {@code Flock} instance for the specified memory address. */
    public static Flock create(long address) {
        return new Flock(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Flock createSafe(long address) {
        return address == NULL ? null : new Flock(address, null);
    }

    /**
     * Returns a new {@link Flock.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Flock.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Flock.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Flock.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Flock.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code Flock} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Flock malloc(MemoryStack stack) {
        return new Flock(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code Flock} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Flock calloc(MemoryStack stack) {
        return new Flock(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Flock.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Flock.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Flock.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #l_type}. */
    public static short nl_type(long struct) { return UNSAFE.getShort(null, struct + Flock.L_TYPE); }
    /** Unsafe version of {@link #l_whence}. */
    public static short nl_whence(long struct) { return UNSAFE.getShort(null, struct + Flock.L_WHENCE); }
    /** Unsafe version of {@link #l_start}. */
    public static long nl_start(long struct) { return UNSAFE.getLong(null, struct + Flock.L_START); }
    /** Unsafe version of {@link #l_len}. */
    public static long nl_len(long struct) { return UNSAFE.getLong(null, struct + Flock.L_LEN); }
    /** Unsafe version of {@link #l_pid}. */
    public static int nl_pid(long struct) { return UNSAFE.getInt(null, struct + Flock.L_PID); }

    /** Unsafe version of {@link #l_type(short) l_type}. */
    public static void nl_type(long struct, short value) { UNSAFE.putShort(null, struct + Flock.L_TYPE, value); }
    /** Unsafe version of {@link #l_whence(short) l_whence}. */
    public static void nl_whence(long struct, short value) { UNSAFE.putShort(null, struct + Flock.L_WHENCE, value); }
    /** Unsafe version of {@link #l_start(long) l_start}. */
    public static void nl_start(long struct, long value) { UNSAFE.putLong(null, struct + Flock.L_START, value); }
    /** Unsafe version of {@link #l_len(long) l_len}. */
    public static void nl_len(long struct, long value) { UNSAFE.putLong(null, struct + Flock.L_LEN, value); }
    /** Unsafe version of {@link #l_pid(int) l_pid}. */
    public static void nl_pid(long struct, int value) { UNSAFE.putInt(null, struct + Flock.L_PID, value); }

    // -----------------------------------

    /** An array of {@link Flock} structs. */
    public static class Buffer extends StructBuffer<Flock, Buffer> implements NativeResource {

        private static final Flock ELEMENT_FACTORY = Flock.create(-1L);

        /**
         * Creates a new {@code Flock.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Flock#SIZEOF}, and its mark will be undefined.</p>
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
        protected Flock getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link Flock#l_type} field. */
        public short l_type() { return Flock.nl_type(address()); }
        /** @return the value of the {@link Flock#l_whence} field. */
        public short l_whence() { return Flock.nl_whence(address()); }
        /** @return the value of the {@link Flock#l_start} field. */
        @NativeType("off_t")
        public long l_start() { return Flock.nl_start(address()); }
        /** @return the value of the {@link Flock#l_len} field. */
        @NativeType("off_t")
        public long l_len() { return Flock.nl_len(address()); }
        /** @return the value of the {@link Flock#l_pid} field. */
        @NativeType("pid_t")
        public int l_pid() { return Flock.nl_pid(address()); }

        /** Sets the specified value to the {@link Flock#l_type} field. */
        public Flock.Buffer l_type(short value) { Flock.nl_type(address(), value); return this; }
        /** Sets the specified value to the {@link Flock#l_whence} field. */
        public Flock.Buffer l_whence(short value) { Flock.nl_whence(address(), value); return this; }
        /** Sets the specified value to the {@link Flock#l_start} field. */
        public Flock.Buffer l_start(@NativeType("off_t") long value) { Flock.nl_start(address(), value); return this; }
        /** Sets the specified value to the {@link Flock#l_len} field. */
        public Flock.Buffer l_len(@NativeType("off_t") long value) { Flock.nl_len(address(), value); return this; }
        /** Sets the specified value to the {@link Flock#l_pid} field. */
        public Flock.Buffer l_pid(@NativeType("pid_t") int value) { Flock.nl_pid(address(), value); return this; }

    }

}