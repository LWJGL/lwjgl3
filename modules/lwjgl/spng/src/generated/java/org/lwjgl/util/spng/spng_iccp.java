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
public class spng_iccp extends Struct<spng_iccp> implements NativeResource {

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

    protected spng_iccp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_iccp create(long address, @Nullable ByteBuffer container) {
        return new spng_iccp(address, container);
    }

    /**
     * Creates a {@code spng_iccp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_iccp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code profile_name} field. */
    @NativeType("char[80]")
    public ByteBuffer profile_name() { return nprofile_name(address()); }
    /** @return the null-terminated string stored in the {@code profile_name} field. */
    @NativeType("char[80]")
    public String profile_nameString() { return nprofile_nameString(address()); }
    /** @return the value of the {@code profile_len} field. */
    @NativeType("size_t")
    public long profile_len() { return nprofile_len(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code profile} field. */
    @NativeType("char *")
    public ByteBuffer profile() { return nprofile(address()); }

    /** Copies the specified encoded string to the {@code profile_name} field. */
    public spng_iccp profile_name(@NativeType("char[80]") ByteBuffer value) { nprofile_name(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code profile} field. */
    public spng_iccp profile(@NativeType("char *") ByteBuffer value) { nprofile(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_iccp set(
        ByteBuffer profile_name,
        ByteBuffer profile
    ) {
        profile_name(profile_name);
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
    public spng_iccp set(spng_iccp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_iccp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_iccp malloc() {
        return new spng_iccp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_iccp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_iccp calloc() {
        return new spng_iccp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_iccp} instance allocated with {@link BufferUtils}. */
    public static spng_iccp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_iccp(memAddress(container), container);
    }

    /** Returns a new {@code spng_iccp} instance for the specified memory address. */
    public static spng_iccp create(long address) {
        return new spng_iccp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_iccp createSafe(long address) {
        return address == NULL ? null : new spng_iccp(address, null);
    }

    /**
     * Returns a new {@link spng_iccp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_iccp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_iccp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_iccp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_iccp.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_iccp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_iccp malloc(MemoryStack stack) {
        return new spng_iccp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_iccp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_iccp calloc(MemoryStack stack) {
        return new spng_iccp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_iccp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_iccp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_iccp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #profile_name}. */
    public static ByteBuffer nprofile_name(long struct) { return memByteBuffer(struct + spng_iccp.PROFILE_NAME, 80); }
    /** Unsafe version of {@link #profile_nameString}. */
    public static String nprofile_nameString(long struct) { return memASCII(struct + spng_iccp.PROFILE_NAME); }
    /** Unsafe version of {@link #profile_len}. */
    public static long nprofile_len(long struct) { return memGetAddress(struct + spng_iccp.PROFILE_LEN); }
    /** Unsafe version of {@link #profile() profile}. */
    public static ByteBuffer nprofile(long struct) { return memByteBuffer(memGetAddress(struct + spng_iccp.PROFILE), (int)nprofile_len(struct)); }

    /** Unsafe version of {@link #profile_name(ByteBuffer) profile_name}. */
    public static void nprofile_name(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 80);
        }
        memCopy(memAddress(value), struct + spng_iccp.PROFILE_NAME, value.remaining());
    }
    /** Sets the specified value to the {@code profile_len} field of the specified {@code struct}. */
    public static void nprofile_len(long struct, long value) { memPutAddress(struct + spng_iccp.PROFILE_LEN, value); }
    /** Unsafe version of {@link #profile(ByteBuffer) profile}. */
    public static void nprofile(long struct, ByteBuffer value) { memPutAddress(struct + spng_iccp.PROFILE, memAddress(value)); nprofile_len(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + spng_iccp.PROFILE));
    }

    // -----------------------------------

    /** An array of {@link spng_iccp} structs. */
    public static class Buffer extends StructBuffer<spng_iccp, Buffer> implements NativeResource {

        private static final spng_iccp ELEMENT_FACTORY = spng_iccp.create(-1L);

        /**
         * Creates a new {@code spng_iccp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_iccp#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_iccp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code profile_name} field. */
        @NativeType("char[80]")
        public ByteBuffer profile_name() { return spng_iccp.nprofile_name(address()); }
        /** @return the null-terminated string stored in the {@code profile_name} field. */
        @NativeType("char[80]")
        public String profile_nameString() { return spng_iccp.nprofile_nameString(address()); }
        /** @return the value of the {@code profile_len} field. */
        @NativeType("size_t")
        public long profile_len() { return spng_iccp.nprofile_len(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code profile} field. */
        @NativeType("char *")
        public ByteBuffer profile() { return spng_iccp.nprofile(address()); }

        /** Copies the specified encoded string to the {@code profile_name} field. */
        public spng_iccp.Buffer profile_name(@NativeType("char[80]") ByteBuffer value) { spng_iccp.nprofile_name(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code profile} field. */
        public spng_iccp.Buffer profile(@NativeType("char *") ByteBuffer value) { spng_iccp.nprofile(address(), value); return this; }

    }

}