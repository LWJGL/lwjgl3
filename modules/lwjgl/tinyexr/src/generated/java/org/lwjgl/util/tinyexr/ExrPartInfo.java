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
 * struct ExrPartInfo {
 *     char const * name;
 *     char const * type_string;
 *     uint32_t part_type;
 *     int32_t width;
 *     int32_t height;
 *     uint32_t num_channels;
 *     uint32_t compression;
 *     uint32_t flags;
 * }}</pre>
 */
public class ExrPartInfo extends Struct<ExrPartInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE_STRING,
        PART_TYPE,
        WIDTH,
        HEIGHT,
        NUM_CHANNELS,
        COMPRESSION,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE_STRING = layout.offsetof(1);
        PART_TYPE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
        NUM_CHANNELS = layout.offsetof(5);
        COMPRESSION = layout.offsetof(6);
        FLAGS = layout.offsetof(7);
    }

    protected ExrPartInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrPartInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrPartInfo(address, container);
    }

    /**
     * Creates a {@code ExrPartInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrPartInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public @Nullable String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code type_string} field. */
    @NativeType("char const *")
    public ByteBuffer type_string() { return ntype_string(address()); }
    /** @return the null-terminated string pointed to by the {@code type_string} field. */
    @NativeType("char const *")
    public String type_stringString() { return ntype_stringString(address()); }
    /** @return the value of the {@code part_type} field. */
    @NativeType("uint32_t")
    public int part_type() { return npart_type(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("int32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code num_channels} field. */
    @NativeType("uint32_t")
    public int num_channels() { return nnum_channels(address()); }
    /** @return the value of the {@code compression} field. */
    @NativeType("uint32_t")
    public int compression() { return ncompression(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public ExrPartInfo name(@Nullable @NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code type_string} field. */
    public ExrPartInfo type_string(@NativeType("char const *") ByteBuffer value) { ntype_string(address(), value); return this; }
    /** Sets the specified value to the {@code part_type} field. */
    public ExrPartInfo part_type(@NativeType("uint32_t") int value) { npart_type(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ExrPartInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ExrPartInfo height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public ExrPartInfo num_channels(@NativeType("uint32_t") int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@code compression} field. */
    public ExrPartInfo compression(@NativeType("uint32_t") int value) { ncompression(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrPartInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrPartInfo set(
        @Nullable ByteBuffer name,
        ByteBuffer type_string,
        int part_type,
        int width,
        int height,
        int num_channels,
        int compression,
        int flags
    ) {
        name(name);
        type_string(type_string);
        part_type(part_type);
        width(width);
        height(height);
        num_channels(num_channels);
        compression(compression);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrPartInfo set(ExrPartInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrPartInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrPartInfo malloc() {
        return new ExrPartInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrPartInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrPartInfo calloc() {
        return new ExrPartInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrPartInfo} instance allocated with {@link BufferUtils}. */
    public static ExrPartInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrPartInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrPartInfo} instance for the specified memory address. */
    public static ExrPartInfo create(long address) {
        return new ExrPartInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrPartInfo createSafe(long address) {
        return address == NULL ? null : new ExrPartInfo(address, null);
    }

    /**
     * Returns a new {@link ExrPartInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrPartInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrPartInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrPartInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrPartInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrPartInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrPartInfo malloc(MemoryStack stack) {
        return new ExrPartInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrPartInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrPartInfo calloc(MemoryStack stack) {
        return new ExrPartInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrPartInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrPartInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrPartInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static @Nullable ByteBuffer nname(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + ExrPartInfo.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static @Nullable String nnameString(long struct) { return memASCIISafe(memGetAddress(struct + ExrPartInfo.NAME)); }
    /** Unsafe version of {@link #type_string}. */
    public static ByteBuffer ntype_string(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrPartInfo.TYPE_STRING)); }
    /** Unsafe version of {@link #type_stringString}. */
    public static String ntype_stringString(long struct) { return memASCII(memGetAddress(struct + ExrPartInfo.TYPE_STRING)); }
    /** Unsafe version of {@link #part_type}. */
    public static int npart_type(long struct) { return memGetInt(struct + ExrPartInfo.PART_TYPE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrPartInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ExrPartInfo.HEIGHT); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + ExrPartInfo.NUM_CHANNELS); }
    /** Unsafe version of {@link #compression}. */
    public static int ncompression(long struct) { return memGetInt(struct + ExrPartInfo.COMPRESSION); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrPartInfo.FLAGS); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + ExrPartInfo.NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #type_string(ByteBuffer) type_string}. */
    public static void ntype_string(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrPartInfo.TYPE_STRING, memAddress(value));
    }
    /** Unsafe version of {@link #part_type(int) part_type}. */
    public static void npart_type(long struct, int value) { memPutInt(struct + ExrPartInfo.PART_TYPE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrPartInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ExrPartInfo.HEIGHT, value); }
    /** Unsafe version of {@link #num_channels(int) num_channels}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + ExrPartInfo.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #compression(int) compression}. */
    public static void ncompression(long struct, int value) { memPutInt(struct + ExrPartInfo.COMPRESSION, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrPartInfo.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrPartInfo.TYPE_STRING));
    }

    // -----------------------------------

    /** An array of {@link ExrPartInfo} structs. */
    public static class Buffer extends StructBuffer<ExrPartInfo, Buffer> implements NativeResource {

        private static final ExrPartInfo ELEMENT_FACTORY = ExrPartInfo.create(-1L);

        /**
         * Creates a new {@code ExrPartInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrPartInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrPartInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer name() { return ExrPartInfo.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public @Nullable String nameString() { return ExrPartInfo.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code type_string} field. */
        @NativeType("char const *")
        public ByteBuffer type_string() { return ExrPartInfo.ntype_string(address()); }
        /** @return the null-terminated string pointed to by the {@code type_string} field. */
        @NativeType("char const *")
        public String type_stringString() { return ExrPartInfo.ntype_stringString(address()); }
        /** @return the value of the {@code part_type} field. */
        @NativeType("uint32_t")
        public int part_type() { return ExrPartInfo.npart_type(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrPartInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("int32_t")
        public int height() { return ExrPartInfo.nheight(address()); }
        /** @return the value of the {@code num_channels} field. */
        @NativeType("uint32_t")
        public int num_channels() { return ExrPartInfo.nnum_channels(address()); }
        /** @return the value of the {@code compression} field. */
        @NativeType("uint32_t")
        public int compression() { return ExrPartInfo.ncompression(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrPartInfo.nflags(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public ExrPartInfo.Buffer name(@Nullable @NativeType("char const *") ByteBuffer value) { ExrPartInfo.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code type_string} field. */
        public ExrPartInfo.Buffer type_string(@NativeType("char const *") ByteBuffer value) { ExrPartInfo.ntype_string(address(), value); return this; }
        /** Sets the specified value to the {@code part_type} field. */
        public ExrPartInfo.Buffer part_type(@NativeType("uint32_t") int value) { ExrPartInfo.npart_type(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ExrPartInfo.Buffer width(@NativeType("int32_t") int value) { ExrPartInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ExrPartInfo.Buffer height(@NativeType("int32_t") int value) { ExrPartInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public ExrPartInfo.Buffer num_channels(@NativeType("uint32_t") int value) { ExrPartInfo.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@code compression} field. */
        public ExrPartInfo.Buffer compression(@NativeType("uint32_t") int value) { ExrPartInfo.ncompression(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrPartInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrPartInfo.nflags(address(), value); return this; }

    }

}