/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_iccp {
 *     char profile_name[80];
 *     size_t profile_len;
 *     char * profile;
 * }}</pre>
 */
@NativeType("struct spng_iccp")
public class SpngIccp extends Struct<SpngIccp> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROFILE_NAME,
        PROFILE_LEN,
        PROFILE;

    static {
        Layout layout = __struct(
            __array(1, 80),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROFILE_NAME = layout.offsetof(0);
        PROFILE_LEN = layout.offsetof(1);
        PROFILE = layout.offsetof(2);
    }

    protected SpngIccp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngIccp create(long address, @Nullable ByteBuffer container) {
        return new SpngIccp(address, container);
    }

    /**
     * Creates a {@code SpngIccp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngIccp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code profile_name} field. */
    @NativeType("char[80]")
    public ByteBuffer profile_name() { return nprofile_name(address()); }
    /** @return the value at the specified index of the {@code profile_name} field. */
    @NativeType("char")
    public byte profile_name(int index) { return nprofile_name(address(), index); }
    /** @return the value of the {@code profile_len} field. */
    @NativeType("size_t")
    public long profile_len() { return nprofile_len(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code profile} field. */
    @NativeType("char *")
    public ByteBuffer profile(int capacity) { return nprofile(address(), capacity); }

    /** Copies the specified {@link ByteBuffer} to the {@code profile_name} field. */
    public SpngIccp profile_name(@NativeType("char[80]") ByteBuffer value) { nprofile_name(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code profile_name} field. */
    public SpngIccp profile_name(int index, @NativeType("char") byte value) { nprofile_name(address(), index, value); return this; }
    /** Sets the specified value to the {@code profile_len} field. */
    public SpngIccp profile_len(@NativeType("size_t") long value) { nprofile_len(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code profile} field. */
    public SpngIccp profile(@NativeType("char *") ByteBuffer value) { nprofile(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngIccp set(
        ByteBuffer profile_name,
        long profile_len,
        ByteBuffer profile
    ) {
        profile_name(profile_name);
        profile_len(profile_len);
        profile(profile);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngIccp set(SpngIccp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngIccp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngIccp malloc() {
        return new SpngIccp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngIccp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngIccp calloc() {
        return new SpngIccp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngIccp} instance allocated with {@link BufferUtils}. */
    public static SpngIccp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngIccp(memAddress(container), container);
    }

    /** Returns a new {@code SpngIccp} instance for the specified memory address. */
    public static SpngIccp create(long address) {
        return new SpngIccp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngIccp createSafe(long address) {
        return address == NULL ? null : new SpngIccp(address, null);
    }

    /**
     * Returns a new {@link SpngIccp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngIccp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngIccp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngIccp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngIccp.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngIccp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngIccp malloc(MemoryStack stack) {
        return new SpngIccp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngIccp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngIccp calloc(MemoryStack stack) {
        return new SpngIccp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngIccp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngIccp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngIccp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #profile_name}. */
    public static ByteBuffer nprofile_name(long struct) { return memByteBuffer(struct + SpngIccp.PROFILE_NAME, 80); }
    /** Unsafe version of {@link #profile_name(int) profile_name}. */
    public static byte nprofile_name(long struct, int index) {
        return memGetByte(struct + SpngIccp.PROFILE_NAME + check(index, 80) * 1);
    }
    /** Unsafe version of {@link #profile_len}. */
    public static long nprofile_len(long struct) { return memGetAddress(struct + SpngIccp.PROFILE_LEN); }
    /** Unsafe version of {@link #profile(int) profile}. */
    public static ByteBuffer nprofile(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngIccp.PROFILE), capacity); }

    /** Unsafe version of {@link #profile_name(ByteBuffer) profile_name}. */
    public static void nprofile_name(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 80); }
        memCopy(memAddress(value), struct + SpngIccp.PROFILE_NAME, value.remaining() * 1);
    }
    /** Unsafe version of {@link #profile_name(int, byte) profile_name}. */
    public static void nprofile_name(long struct, int index, byte value) {
        memPutByte(struct + SpngIccp.PROFILE_NAME + check(index, 80) * 1, value);
    }
    /** Unsafe version of {@link #profile_len(long) profile_len}. */
    public static void nprofile_len(long struct, long value) { memPutAddress(struct + SpngIccp.PROFILE_LEN, value); }
    /** Unsafe version of {@link #profile(ByteBuffer) profile}. */
    public static void nprofile(long struct, ByteBuffer value) { memPutAddress(struct + SpngIccp.PROFILE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngIccp.PROFILE));
    }

    // -----------------------------------

    /** An array of {@link SpngIccp} structs. */
    public static class Buffer extends StructBuffer<SpngIccp, Buffer> implements NativeResource {

        private static final SpngIccp ELEMENT_FACTORY = SpngIccp.create(-1L);

        /**
         * Creates a new {@code SpngIccp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngIccp#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngIccp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code profile_name} field. */
        @NativeType("char[80]")
        public ByteBuffer profile_name() { return SpngIccp.nprofile_name(address()); }
        /** @return the value at the specified index of the {@code profile_name} field. */
        @NativeType("char")
        public byte profile_name(int index) { return SpngIccp.nprofile_name(address(), index); }
        /** @return the value of the {@code profile_len} field. */
        @NativeType("size_t")
        public long profile_len() { return SpngIccp.nprofile_len(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code profile} field. */
        @NativeType("char *")
        public ByteBuffer profile(int capacity) { return SpngIccp.nprofile(address(), capacity); }

        /** Copies the specified {@link ByteBuffer} to the {@code profile_name} field. */
        public SpngIccp.Buffer profile_name(@NativeType("char[80]") ByteBuffer value) { SpngIccp.nprofile_name(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code profile_name} field. */
        public SpngIccp.Buffer profile_name(int index, @NativeType("char") byte value) { SpngIccp.nprofile_name(address(), index, value); return this; }
        /** Sets the specified value to the {@code profile_len} field. */
        public SpngIccp.Buffer profile_len(@NativeType("size_t") long value) { SpngIccp.nprofile_len(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code profile} field. */
        public SpngIccp.Buffer profile(@NativeType("char *") ByteBuffer value) { SpngIccp.nprofile(address(), value); return this; }

    }

}