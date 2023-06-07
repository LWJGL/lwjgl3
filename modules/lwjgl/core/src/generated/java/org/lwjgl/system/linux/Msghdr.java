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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct msghdr {
 *     void * {@link #msg_name};
 *     socklen_t {@link #msg_namelen};
 *     {@link IOVec struct iovec} * {@link #msg_iov};
 *     size_t {@link #msg_iovlen};
 *     void * {@link #msg_control};
 *     size_t {@link #msg_controllen};
 *     int {@link #msg_flags};
 * }</code></pre>
 */
@NativeType("struct msghdr")
public class Msghdr extends Struct<Msghdr> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MSG_NAME,
        MSG_NAMELEN,
        MSG_IOV,
        MSG_IOVLEN,
        MSG_CONTROL,
        MSG_CONTROLLEN,
        MSG_FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MSG_NAME = layout.offsetof(0);
        MSG_NAMELEN = layout.offsetof(1);
        MSG_IOV = layout.offsetof(2);
        MSG_IOVLEN = layout.offsetof(3);
        MSG_CONTROL = layout.offsetof(4);
        MSG_CONTROLLEN = layout.offsetof(5);
        MSG_FLAGS = layout.offsetof(6);
    }

    protected Msghdr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected Msghdr create(long address, @Nullable ByteBuffer container) {
        return new Msghdr(address, container);
    }

    /**
     * Creates a {@code Msghdr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Msghdr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** address to send to/receive from */
    @NativeType("void *")
    public ByteBuffer msg_name() { return nmsg_name(address()); }
    /** length of {@code address} data */
    @NativeType("socklen_t")
    public int msg_namelen() { return nmsg_namelen(address()); }
    /** vector of data to send/receive into */
    @NativeType("struct iovec *")
    public IOVec.Buffer msg_iov() { return nmsg_iov(address()); }
    /** number of elements in the vector */
    @NativeType("size_t")
    public long msg_iovlen() { return nmsg_iovlen(address()); }
    /** ancillary data (eg BSD filedesc passing) */
    @NativeType("void *")
    public ByteBuffer msg_control() { return nmsg_control(address()); }
    /** ancillary data buffer length */
    @NativeType("size_t")
    public long msg_controllen() { return nmsg_controllen(address()); }
    /** flags on received message */
    public int msg_flags() { return nmsg_flags(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #msg_name} field. */
    public Msghdr msg_name(@NativeType("void *") ByteBuffer value) { nmsg_name(address(), value); return this; }
    /** Sets the address of the specified {@link IOVec.Buffer} to the {@link #msg_iov} field. */
    public Msghdr msg_iov(@NativeType("struct iovec *") IOVec.Buffer value) { nmsg_iov(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #msg_control} field. */
    public Msghdr msg_control(@NativeType("void *") ByteBuffer value) { nmsg_control(address(), value); return this; }
    /** Sets the specified value to the {@link #msg_flags} field. */
    public Msghdr msg_flags(int value) { nmsg_flags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Msghdr set(
        ByteBuffer msg_name,
        IOVec.Buffer msg_iov,
        ByteBuffer msg_control,
        int msg_flags
    ) {
        msg_name(msg_name);
        msg_iov(msg_iov);
        msg_control(msg_control);
        msg_flags(msg_flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Msghdr set(Msghdr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Msghdr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Msghdr malloc() {
        return new Msghdr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code Msghdr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Msghdr calloc() {
        return new Msghdr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code Msghdr} instance allocated with {@link BufferUtils}. */
    public static Msghdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Msghdr(memAddress(container), container);
    }

    /** Returns a new {@code Msghdr} instance for the specified memory address. */
    public static Msghdr create(long address) {
        return new Msghdr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Msghdr createSafe(long address) {
        return address == NULL ? null : new Msghdr(address, null);
    }

    /**
     * Returns a new {@link Msghdr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Msghdr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Msghdr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Msghdr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Msghdr.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code Msghdr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Msghdr malloc(MemoryStack stack) {
        return new Msghdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code Msghdr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Msghdr calloc(MemoryStack stack) {
        return new Msghdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Msghdr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Msghdr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Msghdr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #msg_name() msg_name}. */
    public static ByteBuffer nmsg_name(long struct) { return memByteBuffer(memGetAddress(struct + Msghdr.MSG_NAME), nmsg_namelen(struct)); }
    /** Unsafe version of {@link #msg_namelen}. */
    public static int nmsg_namelen(long struct) { return UNSAFE.getInt(null, struct + Msghdr.MSG_NAMELEN); }
    /** Unsafe version of {@link #msg_iov}. */
    public static IOVec.Buffer nmsg_iov(long struct) { return IOVec.create(memGetAddress(struct + Msghdr.MSG_IOV), (int)nmsg_iovlen(struct)); }
    /** Unsafe version of {@link #msg_iovlen}. */
    public static long nmsg_iovlen(long struct) { return memGetAddress(struct + Msghdr.MSG_IOVLEN); }
    /** Unsafe version of {@link #msg_control() msg_control}. */
    public static ByteBuffer nmsg_control(long struct) { return memByteBuffer(memGetAddress(struct + Msghdr.MSG_CONTROL), (int)nmsg_controllen(struct)); }
    /** Unsafe version of {@link #msg_controllen}. */
    public static long nmsg_controllen(long struct) { return memGetAddress(struct + Msghdr.MSG_CONTROLLEN); }
    /** Unsafe version of {@link #msg_flags}. */
    public static int nmsg_flags(long struct) { return UNSAFE.getInt(null, struct + Msghdr.MSG_FLAGS); }

    /** Unsafe version of {@link #msg_name(ByteBuffer) msg_name}. */
    public static void nmsg_name(long struct, ByteBuffer value) { memPutAddress(struct + Msghdr.MSG_NAME, memAddress(value)); nmsg_namelen(struct, value.remaining()); }
    /** Sets the specified value to the {@code msg_namelen} field of the specified {@code struct}. */
    public static void nmsg_namelen(long struct, int value) { UNSAFE.putInt(null, struct + Msghdr.MSG_NAMELEN, value); }
    /** Unsafe version of {@link #msg_iov(IOVec.Buffer) msg_iov}. */
    public static void nmsg_iov(long struct, IOVec.Buffer value) { memPutAddress(struct + Msghdr.MSG_IOV, value.address()); nmsg_iovlen(struct, value.remaining()); }
    /** Sets the specified value to the {@code msg_iovlen} field of the specified {@code struct}. */
    public static void nmsg_iovlen(long struct, long value) { memPutAddress(struct + Msghdr.MSG_IOVLEN, value); }
    /** Unsafe version of {@link #msg_control(ByteBuffer) msg_control}. */
    public static void nmsg_control(long struct, ByteBuffer value) { memPutAddress(struct + Msghdr.MSG_CONTROL, memAddress(value)); nmsg_controllen(struct, value.remaining()); }
    /** Sets the specified value to the {@code msg_controllen} field of the specified {@code struct}. */
    public static void nmsg_controllen(long struct, long value) { memPutAddress(struct + Msghdr.MSG_CONTROLLEN, value); }
    /** Unsafe version of {@link #msg_flags(int) msg_flags}. */
    public static void nmsg_flags(long struct, int value) { UNSAFE.putInt(null, struct + Msghdr.MSG_FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + Msghdr.MSG_NAME));
        check(memGetAddress(struct + Msghdr.MSG_IOV));
        check(memGetAddress(struct + Msghdr.MSG_CONTROL));
    }

    // -----------------------------------

    /** An array of {@link Msghdr} structs. */
    public static class Buffer extends StructBuffer<Msghdr, Buffer> implements NativeResource {

        private static final Msghdr ELEMENT_FACTORY = Msghdr.create(-1L);

        /**
         * Creates a new {@code Msghdr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Msghdr#SIZEOF}, and its mark will be undefined.</p>
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
        protected Msghdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link Msghdr#msg_name} field. */
        @NativeType("void *")
        public ByteBuffer msg_name() { return Msghdr.nmsg_name(address()); }
        /** @return the value of the {@link Msghdr#msg_namelen} field. */
        @NativeType("socklen_t")
        public int msg_namelen() { return Msghdr.nmsg_namelen(address()); }
        /** @return a {@link IOVec.Buffer} view of the struct array pointed to by the {@link Msghdr#msg_iov} field. */
        @NativeType("struct iovec *")
        public IOVec.Buffer msg_iov() { return Msghdr.nmsg_iov(address()); }
        /** @return the value of the {@link Msghdr#msg_iovlen} field. */
        @NativeType("size_t")
        public long msg_iovlen() { return Msghdr.nmsg_iovlen(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link Msghdr#msg_control} field. */
        @NativeType("void *")
        public ByteBuffer msg_control() { return Msghdr.nmsg_control(address()); }
        /** @return the value of the {@link Msghdr#msg_controllen} field. */
        @NativeType("size_t")
        public long msg_controllen() { return Msghdr.nmsg_controllen(address()); }
        /** @return the value of the {@link Msghdr#msg_flags} field. */
        public int msg_flags() { return Msghdr.nmsg_flags(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link Msghdr#msg_name} field. */
        public Msghdr.Buffer msg_name(@NativeType("void *") ByteBuffer value) { Msghdr.nmsg_name(address(), value); return this; }
        /** Sets the address of the specified {@link IOVec.Buffer} to the {@link Msghdr#msg_iov} field. */
        public Msghdr.Buffer msg_iov(@NativeType("struct iovec *") IOVec.Buffer value) { Msghdr.nmsg_iov(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link Msghdr#msg_control} field. */
        public Msghdr.Buffer msg_control(@NativeType("void *") ByteBuffer value) { Msghdr.nmsg_control(address(), value); return this; }
        /** Sets the specified value to the {@link Msghdr#msg_flags} field. */
        public Msghdr.Buffer msg_flags(int value) { Msghdr.nmsg_flags(address(), value); return this; }

    }

}