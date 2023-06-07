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
 * Structure describing a generic socket address.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct sockaddr {
 *     sa_family_t {@link #sa_family};
 *     char {@link #sa_data}[14];
 * }</code></pre>
 */
@NativeType("struct sockaddr")
public class Sockaddr extends Struct<Sockaddr> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SA_FAMILY,
        SA_DATA;

    static {
        Layout layout = __struct(
            __member(2),
            __array(1, 14)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SA_FAMILY = layout.offsetof(0);
        SA_DATA = layout.offsetof(1);
    }

    protected Sockaddr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected Sockaddr create(long address, @Nullable ByteBuffer container) {
        return new Sockaddr(address, container);
    }

    /**
     * Creates a {@code Sockaddr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Sockaddr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** address family and length */
    @NativeType("sa_family_t")
    public short sa_family() { return nsa_family(address()); }
    /** address data */
    @NativeType("char[14]")
    public ByteBuffer sa_data() { return nsa_data(address()); }
    /** address data */
    @NativeType("char")
    public byte sa_data(int index) { return nsa_data(address(), index); }

    /** Sets the specified value to the {@link #sa_family} field. */
    public Sockaddr sa_family(@NativeType("sa_family_t") short value) { nsa_family(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #sa_data} field. */
    public Sockaddr sa_data(@NativeType("char[14]") ByteBuffer value) { nsa_data(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #sa_data} field. */
    public Sockaddr sa_data(int index, @NativeType("char") byte value) { nsa_data(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public Sockaddr set(
        short sa_family,
        ByteBuffer sa_data
    ) {
        sa_family(sa_family);
        sa_data(sa_data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Sockaddr set(Sockaddr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Sockaddr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Sockaddr malloc() {
        return new Sockaddr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code Sockaddr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Sockaddr calloc() {
        return new Sockaddr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code Sockaddr} instance allocated with {@link BufferUtils}. */
    public static Sockaddr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Sockaddr(memAddress(container), container);
    }

    /** Returns a new {@code Sockaddr} instance for the specified memory address. */
    public static Sockaddr create(long address) {
        return new Sockaddr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Sockaddr createSafe(long address) {
        return address == NULL ? null : new Sockaddr(address, null);
    }

    /**
     * Returns a new {@link Sockaddr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Sockaddr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Sockaddr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Sockaddr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Sockaddr.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code Sockaddr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Sockaddr malloc(MemoryStack stack) {
        return new Sockaddr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code Sockaddr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Sockaddr calloc(MemoryStack stack) {
        return new Sockaddr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Sockaddr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Sockaddr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Sockaddr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sa_family}. */
    public static short nsa_family(long struct) { return UNSAFE.getShort(null, struct + Sockaddr.SA_FAMILY); }
    /** Unsafe version of {@link #sa_data}. */
    public static ByteBuffer nsa_data(long struct) { return memByteBuffer(struct + Sockaddr.SA_DATA, 14); }
    /** Unsafe version of {@link #sa_data(int) sa_data}. */
    public static byte nsa_data(long struct, int index) {
        return UNSAFE.getByte(null, struct + Sockaddr.SA_DATA + check(index, 14) * 1);
    }

    /** Unsafe version of {@link #sa_family(short) sa_family}. */
    public static void nsa_family(long struct, short value) { UNSAFE.putShort(null, struct + Sockaddr.SA_FAMILY, value); }
    /** Unsafe version of {@link #sa_data(ByteBuffer) sa_data}. */
    public static void nsa_data(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 14); }
        memCopy(memAddress(value), struct + Sockaddr.SA_DATA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #sa_data(int, byte) sa_data}. */
    public static void nsa_data(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + Sockaddr.SA_DATA + check(index, 14) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link Sockaddr} structs. */
    public static class Buffer extends StructBuffer<Sockaddr, Buffer> implements NativeResource {

        private static final Sockaddr ELEMENT_FACTORY = Sockaddr.create(-1L);

        /**
         * Creates a new {@code Sockaddr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Sockaddr#SIZEOF}, and its mark will be undefined.</p>
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
        protected Sockaddr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link Sockaddr#sa_family} field. */
        @NativeType("sa_family_t")
        public short sa_family() { return Sockaddr.nsa_family(address()); }
        /** @return a {@link ByteBuffer} view of the {@link Sockaddr#sa_data} field. */
        @NativeType("char[14]")
        public ByteBuffer sa_data() { return Sockaddr.nsa_data(address()); }
        /** @return the value at the specified index of the {@link Sockaddr#sa_data} field. */
        @NativeType("char")
        public byte sa_data(int index) { return Sockaddr.nsa_data(address(), index); }

        /** Sets the specified value to the {@link Sockaddr#sa_family} field. */
        public Sockaddr.Buffer sa_family(@NativeType("sa_family_t") short value) { Sockaddr.nsa_family(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link Sockaddr#sa_data} field. */
        public Sockaddr.Buffer sa_data(@NativeType("char[14]") ByteBuffer value) { Sockaddr.nsa_data(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link Sockaddr#sa_data} field. */
        public Sockaddr.Buffer sa_data(int index, @NativeType("char") byte value) { Sockaddr.nsa_data(address(), index, value); return this; }

    }

}