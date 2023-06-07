/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring {
 *     {@link IOURingSQ struct io_uring_sq} sq;
 *     {@link IOURingCQ struct io_uring_cq} cq;
 *     unsigned int flags;
 *     int ring_fd;
 *     unsigned int features;
 *     int enter_ring_fd;
 *     __u8 int_flags;
 *     __u8 pad[3];
 *     unsigned pad2;
 * }</code></pre>
 */
@NativeType("struct io_uring")
public class IOURing extends Struct<IOURing> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SQ,
        CQ,
        FLAGS,
        RING_FD,
        FEATURES,
        ENTER_RING_FD,
        INT_FLAGS,
        PAD,
        PAD2;

    static {
        Layout layout = __struct(
            __member(IOURingSQ.SIZEOF, IOURingSQ.ALIGNOF),
            __member(IOURingCQ.SIZEOF, IOURingCQ.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __array(1, 3),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SQ = layout.offsetof(0);
        CQ = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RING_FD = layout.offsetof(3);
        FEATURES = layout.offsetof(4);
        ENTER_RING_FD = layout.offsetof(5);
        INT_FLAGS = layout.offsetof(6);
        PAD = layout.offsetof(7);
        PAD2 = layout.offsetof(8);
    }

    protected IOURing(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURing create(long address, @Nullable ByteBuffer container) {
        return new IOURing(address, container);
    }

    /**
     * Creates a {@code IOURing} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURing(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IOURingSQ} view of the {@code sq} field. */
    @NativeType("struct io_uring_sq")
    public IOURingSQ sq() { return nsq(address()); }
    /** @return a {@link IOURingCQ} view of the {@code cq} field. */
    @NativeType("struct io_uring_cq")
    public IOURingCQ cq() { return ncq(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code ring_fd} field. */
    public int ring_fd() { return nring_fd(address()); }
    /** @return the value of the {@code features} field. */
    @NativeType("unsigned int")
    public int features() { return nfeatures(address()); }
    /** @return the value of the {@code enter_ring_fd} field. */
    public int enter_ring_fd() { return nenter_ring_fd(address()); }
    /** @return the value of the {@code int_flags} field. */
    @NativeType("__u8")
    public byte int_flags() { return nint_flags(address()); }

    /** Copies the specified {@link IOURingSQ} to the {@code sq} field. */
    public IOURing sq(@NativeType("struct io_uring_sq") IOURingSQ value) { nsq(address(), value); return this; }
    /** Passes the {@code sq} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURing sq(java.util.function.Consumer<IOURingSQ> consumer) { consumer.accept(sq()); return this; }
    /** Copies the specified {@link IOURingCQ} to the {@code cq} field. */
    public IOURing cq(@NativeType("struct io_uring_cq") IOURingCQ value) { ncq(address(), value); return this; }
    /** Passes the {@code cq} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURing cq(java.util.function.Consumer<IOURingCQ> consumer) { consumer.accept(cq()); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURing flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code ring_fd} field. */
    public IOURing ring_fd(int value) { nring_fd(address(), value); return this; }
    /** Sets the specified value to the {@code features} field. */
    public IOURing features(@NativeType("unsigned int") int value) { nfeatures(address(), value); return this; }
    /** Sets the specified value to the {@code enter_ring_fd} field. */
    public IOURing enter_ring_fd(int value) { nenter_ring_fd(address(), value); return this; }
    /** Sets the specified value to the {@code int_flags} field. */
    public IOURing int_flags(@NativeType("__u8") byte value) { nint_flags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURing set(
        IOURingSQ sq,
        IOURingCQ cq,
        int flags,
        int ring_fd,
        int features,
        int enter_ring_fd,
        byte int_flags
    ) {
        sq(sq);
        cq(cq);
        flags(flags);
        ring_fd(ring_fd);
        features(features);
        enter_ring_fd(enter_ring_fd);
        int_flags(int_flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURing set(IOURing src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURing} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURing malloc() {
        return new IOURing(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURing} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURing calloc() {
        return new IOURing(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURing} instance allocated with {@link BufferUtils}. */
    public static IOURing create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURing(memAddress(container), container);
    }

    /** Returns a new {@code IOURing} instance for the specified memory address. */
    public static IOURing create(long address) {
        return new IOURing(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURing createSafe(long address) {
        return address == NULL ? null : new IOURing(address, null);
    }

    /**
     * Returns a new {@link IOURing.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURing.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURing.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURing.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURing.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURing} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURing malloc(MemoryStack stack) {
        return new IOURing(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURing} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURing calloc(MemoryStack stack) {
        return new IOURing(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURing.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURing.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURing.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sq}. */
    public static IOURingSQ nsq(long struct) { return IOURingSQ.create(struct + IOURing.SQ); }
    /** Unsafe version of {@link #cq}. */
    public static IOURingCQ ncq(long struct) { return IOURingCQ.create(struct + IOURing.CQ); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOURing.FLAGS); }
    /** Unsafe version of {@link #ring_fd}. */
    public static int nring_fd(long struct) { return UNSAFE.getInt(null, struct + IOURing.RING_FD); }
    /** Unsafe version of {@link #features}. */
    public static int nfeatures(long struct) { return UNSAFE.getInt(null, struct + IOURing.FEATURES); }
    /** Unsafe version of {@link #enter_ring_fd}. */
    public static int nenter_ring_fd(long struct) { return UNSAFE.getInt(null, struct + IOURing.ENTER_RING_FD); }
    /** Unsafe version of {@link #int_flags}. */
    public static byte nint_flags(long struct) { return UNSAFE.getByte(null, struct + IOURing.INT_FLAGS); }
    public static ByteBuffer npad(long struct) { return memByteBuffer(struct + IOURing.PAD, 3); }
    public static byte npad(long struct, int index) {
        return UNSAFE.getByte(null, struct + IOURing.PAD + check(index, 3) * 1);
    }
    public static int npad2(long struct) { return UNSAFE.getInt(null, struct + IOURing.PAD2); }

    /** Unsafe version of {@link #sq(IOURingSQ) sq}. */
    public static void nsq(long struct, IOURingSQ value) { memCopy(value.address(), struct + IOURing.SQ, IOURingSQ.SIZEOF); }
    /** Unsafe version of {@link #cq(IOURingCQ) cq}. */
    public static void ncq(long struct, IOURingCQ value) { memCopy(value.address(), struct + IOURing.CQ, IOURingCQ.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOURing.FLAGS, value); }
    /** Unsafe version of {@link #ring_fd(int) ring_fd}. */
    public static void nring_fd(long struct, int value) { UNSAFE.putInt(null, struct + IOURing.RING_FD, value); }
    /** Unsafe version of {@link #features(int) features}. */
    public static void nfeatures(long struct, int value) { UNSAFE.putInt(null, struct + IOURing.FEATURES, value); }
    /** Unsafe version of {@link #enter_ring_fd(int) enter_ring_fd}. */
    public static void nenter_ring_fd(long struct, int value) { UNSAFE.putInt(null, struct + IOURing.ENTER_RING_FD, value); }
    /** Unsafe version of {@link #int_flags(byte) int_flags}. */
    public static void nint_flags(long struct, byte value) { UNSAFE.putByte(null, struct + IOURing.INT_FLAGS, value); }
    public static void npad(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURing.PAD, value.remaining() * 1);
    }
    public static void npad(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + IOURing.PAD + check(index, 3) * 1, value);
    }
    public static void npad2(long struct, int value) { UNSAFE.putInt(null, struct + IOURing.PAD2, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        IOURingSQ.validate(struct + IOURing.SQ);
        IOURingCQ.validate(struct + IOURing.CQ);
    }

    // -----------------------------------

    /** An array of {@link IOURing} structs. */
    public static class Buffer extends StructBuffer<IOURing, Buffer> implements NativeResource {

        private static final IOURing ELEMENT_FACTORY = IOURing.create(-1L);

        /**
         * Creates a new {@code IOURing.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURing#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURing getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IOURingSQ} view of the {@code sq} field. */
        @NativeType("struct io_uring_sq")
        public IOURingSQ sq() { return IOURing.nsq(address()); }
        /** @return a {@link IOURingCQ} view of the {@code cq} field. */
        @NativeType("struct io_uring_cq")
        public IOURingCQ cq() { return IOURing.ncq(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned int")
        public int flags() { return IOURing.nflags(address()); }
        /** @return the value of the {@code ring_fd} field. */
        public int ring_fd() { return IOURing.nring_fd(address()); }
        /** @return the value of the {@code features} field. */
        @NativeType("unsigned int")
        public int features() { return IOURing.nfeatures(address()); }
        /** @return the value of the {@code enter_ring_fd} field. */
        public int enter_ring_fd() { return IOURing.nenter_ring_fd(address()); }
        /** @return the value of the {@code int_flags} field. */
        @NativeType("__u8")
        public byte int_flags() { return IOURing.nint_flags(address()); }

        /** Copies the specified {@link IOURingSQ} to the {@code sq} field. */
        public IOURing.Buffer sq(@NativeType("struct io_uring_sq") IOURingSQ value) { IOURing.nsq(address(), value); return this; }
        /** Passes the {@code sq} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURing.Buffer sq(java.util.function.Consumer<IOURingSQ> consumer) { consumer.accept(sq()); return this; }
        /** Copies the specified {@link IOURingCQ} to the {@code cq} field. */
        public IOURing.Buffer cq(@NativeType("struct io_uring_cq") IOURingCQ value) { IOURing.ncq(address(), value); return this; }
        /** Passes the {@code cq} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURing.Buffer cq(java.util.function.Consumer<IOURingCQ> consumer) { consumer.accept(cq()); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURing.Buffer flags(@NativeType("unsigned int") int value) { IOURing.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code ring_fd} field. */
        public IOURing.Buffer ring_fd(int value) { IOURing.nring_fd(address(), value); return this; }
        /** Sets the specified value to the {@code features} field. */
        public IOURing.Buffer features(@NativeType("unsigned int") int value) { IOURing.nfeatures(address(), value); return this; }
        /** Sets the specified value to the {@code enter_ring_fd} field. */
        public IOURing.Buffer enter_ring_fd(int value) { IOURing.nenter_ring_fd(address(), value); return this; }
        /** Sets the specified value to the {@code int_flags} field. */
        public IOURing.Buffer int_flags(@NativeType("__u8") byte value) { IOURing.nint_flags(address(), value); return this; }

    }

}