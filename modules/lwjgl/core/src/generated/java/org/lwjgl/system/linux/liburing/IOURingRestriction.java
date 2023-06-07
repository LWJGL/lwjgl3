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
 * struct io_uring_restriction {
 *     __u16 opcode;
 *     union {
 *         __u8 register_op;
 *         __u8 sqe_op;
 *         __u8 sqe_flags;
 *     };
 *     __u8 resv;
 *     __u32 resv2[3];
 * }</code></pre>
 */
@NativeType("struct io_uring_restriction")
public class IOURingRestriction extends Struct<IOURingRestriction> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPCODE,
        REGISTER_OP,
        SQE_OP,
        SQE_FLAGS,
        RESV,
        RESV2;

    static {
        Layout layout = __struct(
            __member(2),
            __union(
                __member(1),
                __member(1),
                __member(1)
            ),
            __member(1),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPCODE = layout.offsetof(0);
        REGISTER_OP = layout.offsetof(2);
        SQE_OP = layout.offsetof(3);
        SQE_FLAGS = layout.offsetof(4);
        RESV = layout.offsetof(5);
        RESV2 = layout.offsetof(6);
    }

    protected IOURingRestriction(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingRestriction create(long address, @Nullable ByteBuffer container) {
        return new IOURingRestriction(address, container);
    }

    /**
     * Creates a {@code IOURingRestriction} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRestriction(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code opcode} field. */
    @NativeType("__u16")
    public short opcode() { return nopcode(address()); }
    /** @return the value of the {@code register_op} field. */
    @NativeType("__u8")
    public byte register_op() { return nregister_op(address()); }
    /** @return the value of the {@code sqe_op} field. */
    @NativeType("__u8")
    public byte sqe_op() { return nsqe_op(address()); }
    /** @return the value of the {@code sqe_flags} field. */
    @NativeType("__u8")
    public byte sqe_flags() { return nsqe_flags(address()); }

    /** Sets the specified value to the {@code opcode} field. */
    public IOURingRestriction opcode(@NativeType("__u16") short value) { nopcode(address(), value); return this; }
    /** Sets the specified value to the {@code register_op} field. */
    public IOURingRestriction register_op(@NativeType("__u8") byte value) { nregister_op(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_op} field. */
    public IOURingRestriction sqe_op(@NativeType("__u8") byte value) { nsqe_op(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_flags} field. */
    public IOURingRestriction sqe_flags(@NativeType("__u8") byte value) { nsqe_flags(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingRestriction set(IOURingRestriction src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRestriction} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRestriction malloc() {
        return new IOURingRestriction(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingRestriction} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRestriction calloc() {
        return new IOURingRestriction(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingRestriction} instance allocated with {@link BufferUtils}. */
    public static IOURingRestriction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRestriction(memAddress(container), container);
    }

    /** Returns a new {@code IOURingRestriction} instance for the specified memory address. */
    public static IOURingRestriction create(long address) {
        return new IOURingRestriction(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRestriction createSafe(long address) {
        return address == NULL ? null : new IOURingRestriction(address, null);
    }

    /**
     * Returns a new {@link IOURingRestriction.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRestriction.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRestriction.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingRestriction.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRestriction.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingRestriction} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRestriction malloc(MemoryStack stack) {
        return new IOURingRestriction(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingRestriction} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRestriction calloc(MemoryStack stack) {
        return new IOURingRestriction(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingRestriction.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRestriction.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRestriction.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #opcode}. */
    public static short nopcode(long struct) { return UNSAFE.getShort(null, struct + IOURingRestriction.OPCODE); }
    /** Unsafe version of {@link #register_op}. */
    public static byte nregister_op(long struct) { return UNSAFE.getByte(null, struct + IOURingRestriction.REGISTER_OP); }
    /** Unsafe version of {@link #sqe_op}. */
    public static byte nsqe_op(long struct) { return UNSAFE.getByte(null, struct + IOURingRestriction.SQE_OP); }
    /** Unsafe version of {@link #sqe_flags}. */
    public static byte nsqe_flags(long struct) { return UNSAFE.getByte(null, struct + IOURingRestriction.SQE_FLAGS); }
    public static byte nresv(long struct) { return UNSAFE.getByte(null, struct + IOURingRestriction.RESV); }
    public static IntBuffer nresv2(long struct) { return memIntBuffer(struct + IOURingRestriction.RESV2, 3); }
    public static int nresv2(long struct, int index) {
        return UNSAFE.getInt(null, struct + IOURingRestriction.RESV2 + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #opcode(short) opcode}. */
    public static void nopcode(long struct, short value) { UNSAFE.putShort(null, struct + IOURingRestriction.OPCODE, value); }
    /** Unsafe version of {@link #register_op(byte) register_op}. */
    public static void nregister_op(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingRestriction.REGISTER_OP, value); }
    /** Unsafe version of {@link #sqe_op(byte) sqe_op}. */
    public static void nsqe_op(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingRestriction.SQE_OP, value); }
    /** Unsafe version of {@link #sqe_flags(byte) sqe_flags}. */
    public static void nsqe_flags(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingRestriction.SQE_FLAGS, value); }
    public static void nresv(long struct, byte value) { UNSAFE.putByte(null, struct + IOURingRestriction.RESV, value); }
    public static void nresv2(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingRestriction.RESV2, value.remaining() * 4);
    }
    public static void nresv2(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + IOURingRestriction.RESV2 + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingRestriction} structs. */
    public static class Buffer extends StructBuffer<IOURingRestriction, Buffer> implements NativeResource {

        private static final IOURingRestriction ELEMENT_FACTORY = IOURingRestriction.create(-1L);

        /**
         * Creates a new {@code IOURingRestriction.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRestriction#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingRestriction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code opcode} field. */
        @NativeType("__u16")
        public short opcode() { return IOURingRestriction.nopcode(address()); }
        /** @return the value of the {@code register_op} field. */
        @NativeType("__u8")
        public byte register_op() { return IOURingRestriction.nregister_op(address()); }
        /** @return the value of the {@code sqe_op} field. */
        @NativeType("__u8")
        public byte sqe_op() { return IOURingRestriction.nsqe_op(address()); }
        /** @return the value of the {@code sqe_flags} field. */
        @NativeType("__u8")
        public byte sqe_flags() { return IOURingRestriction.nsqe_flags(address()); }

        /** Sets the specified value to the {@code opcode} field. */
        public IOURingRestriction.Buffer opcode(@NativeType("__u16") short value) { IOURingRestriction.nopcode(address(), value); return this; }
        /** Sets the specified value to the {@code register_op} field. */
        public IOURingRestriction.Buffer register_op(@NativeType("__u8") byte value) { IOURingRestriction.nregister_op(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_op} field. */
        public IOURingRestriction.Buffer sqe_op(@NativeType("__u8") byte value) { IOURingRestriction.nsqe_op(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_flags} field. */
        public IOURingRestriction.Buffer sqe_flags(@NativeType("__u8") byte value) { IOURingRestriction.nsqe_flags(address(), value); return this; }

    }

}