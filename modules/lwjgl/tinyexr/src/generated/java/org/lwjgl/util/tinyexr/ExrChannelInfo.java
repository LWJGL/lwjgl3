/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ExrChannelInfo {
 *     char const * name;
 *     uint32_t pixel_type;
 *     int32_t x_sampling;
 *     int32_t y_sampling;
 *     uint8_t p_linear;
 *     uint8_t reserved[3];
 * }}</pre>
 */
public class ExrChannelInfo extends Struct<ExrChannelInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        PIXEL_TYPE,
        X_SAMPLING,
        Y_SAMPLING,
        P_LINEAR,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __array(1, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        PIXEL_TYPE = layout.offsetof(1);
        X_SAMPLING = layout.offsetof(2);
        Y_SAMPLING = layout.offsetof(3);
        P_LINEAR = layout.offsetof(4);
        RESERVED = layout.offsetof(5);
    }

    protected ExrChannelInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrChannelInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrChannelInfo(address, container);
    }

    /**
     * Creates a {@code ExrChannelInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrChannelInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code pixel_type} field. */
    @NativeType("uint32_t")
    public int pixel_type() { return npixel_type(address()); }
    /** @return the value of the {@code x_sampling} field. */
    @NativeType("int32_t")
    public int x_sampling() { return nx_sampling(address()); }
    /** @return the value of the {@code y_sampling} field. */
    @NativeType("int32_t")
    public int y_sampling() { return ny_sampling(address()); }
    /** @return the value of the {@code p_linear} field. */
    @NativeType("uint8_t")
    public byte p_linear() { return np_linear(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public ExrChannelInfo name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code pixel_type} field. */
    public ExrChannelInfo pixel_type(@NativeType("uint32_t") int value) { npixel_type(address(), value); return this; }
    /** Sets the specified value to the {@code x_sampling} field. */
    public ExrChannelInfo x_sampling(@NativeType("int32_t") int value) { nx_sampling(address(), value); return this; }
    /** Sets the specified value to the {@code y_sampling} field. */
    public ExrChannelInfo y_sampling(@NativeType("int32_t") int value) { ny_sampling(address(), value); return this; }
    /** Sets the specified value to the {@code p_linear} field. */
    public ExrChannelInfo p_linear(@NativeType("uint8_t") byte value) { np_linear(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrChannelInfo set(
        ByteBuffer name,
        int pixel_type,
        int x_sampling,
        int y_sampling,
        byte p_linear
    ) {
        name(name);
        pixel_type(pixel_type);
        x_sampling(x_sampling);
        y_sampling(y_sampling);
        p_linear(p_linear);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrChannelInfo set(ExrChannelInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrChannelInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrChannelInfo malloc() {
        return new ExrChannelInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrChannelInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrChannelInfo calloc() {
        return new ExrChannelInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrChannelInfo} instance allocated with {@link BufferUtils}. */
    public static ExrChannelInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrChannelInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrChannelInfo} instance for the specified memory address. */
    public static ExrChannelInfo create(long address) {
        return new ExrChannelInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrChannelInfo createSafe(long address) {
        return address == NULL ? null : new ExrChannelInfo(address, null);
    }

    /**
     * Returns a new {@link ExrChannelInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrChannelInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrChannelInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrChannelInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrChannelInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrChannelInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrChannelInfo malloc(MemoryStack stack) {
        return new ExrChannelInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrChannelInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrChannelInfo calloc(MemoryStack stack) {
        return new ExrChannelInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrChannelInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrChannelInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrChannelInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrChannelInfo.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + ExrChannelInfo.NAME)); }
    /** Unsafe version of {@link #pixel_type}. */
    public static int npixel_type(long struct) { return memGetInt(struct + ExrChannelInfo.PIXEL_TYPE); }
    /** Unsafe version of {@link #x_sampling}. */
    public static int nx_sampling(long struct) { return memGetInt(struct + ExrChannelInfo.X_SAMPLING); }
    /** Unsafe version of {@link #y_sampling}. */
    public static int ny_sampling(long struct) { return memGetInt(struct + ExrChannelInfo.Y_SAMPLING); }
    /** Unsafe version of {@link #p_linear}. */
    public static byte np_linear(long struct) { return memGetByte(struct + ExrChannelInfo.P_LINEAR); }
    static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + ExrChannelInfo.RESERVED, 3); }
    static byte nreserved(long struct, int index) {
        return memGetByte(struct + ExrChannelInfo.RESERVED + check(index, 3) * 1);
    }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrChannelInfo.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #pixel_type(int) pixel_type}. */
    public static void npixel_type(long struct, int value) { memPutInt(struct + ExrChannelInfo.PIXEL_TYPE, value); }
    /** Unsafe version of {@link #x_sampling(int) x_sampling}. */
    public static void nx_sampling(long struct, int value) { memPutInt(struct + ExrChannelInfo.X_SAMPLING, value); }
    /** Unsafe version of {@link #y_sampling(int) y_sampling}. */
    public static void ny_sampling(long struct, int value) { memPutInt(struct + ExrChannelInfo.Y_SAMPLING, value); }
    /** Unsafe version of {@link #p_linear(byte) p_linear}. */
    public static void np_linear(long struct, byte value) { memPutByte(struct + ExrChannelInfo.P_LINEAR, value); }
    static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + ExrChannelInfo.RESERVED, value.remaining() * 1);
    }
    static void nreserved(long struct, int index, byte value) {
        memPutByte(struct + ExrChannelInfo.RESERVED + check(index, 3) * 1, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrChannelInfo.NAME));
    }

    // -----------------------------------

    /** An array of {@link ExrChannelInfo} structs. */
    public static class Buffer extends StructBuffer<ExrChannelInfo, Buffer> implements NativeResource {

        private static final ExrChannelInfo ELEMENT_FACTORY = ExrChannelInfo.create(-1L);

        /**
         * Creates a new {@code ExrChannelInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrChannelInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrChannelInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return ExrChannelInfo.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return ExrChannelInfo.nnameString(address()); }
        /** @return the value of the {@code pixel_type} field. */
        @NativeType("uint32_t")
        public int pixel_type() { return ExrChannelInfo.npixel_type(address()); }
        /** @return the value of the {@code x_sampling} field. */
        @NativeType("int32_t")
        public int x_sampling() { return ExrChannelInfo.nx_sampling(address()); }
        /** @return the value of the {@code y_sampling} field. */
        @NativeType("int32_t")
        public int y_sampling() { return ExrChannelInfo.ny_sampling(address()); }
        /** @return the value of the {@code p_linear} field. */
        @NativeType("uint8_t")
        public byte p_linear() { return ExrChannelInfo.np_linear(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public ExrChannelInfo.Buffer name(@NativeType("char const *") ByteBuffer value) { ExrChannelInfo.nname(address(), value); return this; }
        /** Sets the specified value to the {@code pixel_type} field. */
        public ExrChannelInfo.Buffer pixel_type(@NativeType("uint32_t") int value) { ExrChannelInfo.npixel_type(address(), value); return this; }
        /** Sets the specified value to the {@code x_sampling} field. */
        public ExrChannelInfo.Buffer x_sampling(@NativeType("int32_t") int value) { ExrChannelInfo.nx_sampling(address(), value); return this; }
        /** Sets the specified value to the {@code y_sampling} field. */
        public ExrChannelInfo.Buffer y_sampling(@NativeType("int32_t") int value) { ExrChannelInfo.ny_sampling(address(), value); return this; }
        /** Sets the specified value to the {@code p_linear} field. */
        public ExrChannelInfo.Buffer p_linear(@NativeType("uint8_t") byte value) { ExrChannelInfo.np_linear(address(), value); return this; }

    }

}