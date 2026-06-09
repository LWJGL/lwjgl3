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
 * struct ExrCommandBufferCreateInfo {
 *     ExrDecoder decoder;
 *     ExrEncoder encoder;
 *     uint32_t max_commands;
 *     uint32_t flags;
 * }}</pre>
 */
public class ExrCommandBufferCreateInfo extends Struct<ExrCommandBufferCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DECODER,
        ENCODER,
        MAX_COMMANDS,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DECODER = layout.offsetof(0);
        ENCODER = layout.offsetof(1);
        MAX_COMMANDS = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected ExrCommandBufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrCommandBufferCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrCommandBufferCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrCommandBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrCommandBufferCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code decoder} field. */
    @NativeType("ExrDecoder")
    public long decoder() { return ndecoder(address()); }
    /** @return the value of the {@code encoder} field. */
    @NativeType("ExrEncoder")
    public long encoder() { return nencoder(address()); }
    /** @return the value of the {@code max_commands} field. */
    @NativeType("uint32_t")
    public int max_commands() { return nmax_commands(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code decoder} field. */
    public ExrCommandBufferCreateInfo decoder(@NativeType("ExrDecoder") long value) { ndecoder(address(), value); return this; }
    /** Sets the specified value to the {@code encoder} field. */
    public ExrCommandBufferCreateInfo encoder(@NativeType("ExrEncoder") long value) { nencoder(address(), value); return this; }
    /** Sets the specified value to the {@code max_commands} field. */
    public ExrCommandBufferCreateInfo max_commands(@NativeType("uint32_t") int value) { nmax_commands(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrCommandBufferCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrCommandBufferCreateInfo set(
        long decoder,
        long encoder,
        int max_commands,
        int flags
    ) {
        decoder(decoder);
        encoder(encoder);
        max_commands(max_commands);
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
    public ExrCommandBufferCreateInfo set(ExrCommandBufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrCommandBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrCommandBufferCreateInfo malloc() {
        return new ExrCommandBufferCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrCommandBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrCommandBufferCreateInfo calloc() {
        return new ExrCommandBufferCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrCommandBufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrCommandBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrCommandBufferCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrCommandBufferCreateInfo} instance for the specified memory address. */
    public static ExrCommandBufferCreateInfo create(long address) {
        return new ExrCommandBufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrCommandBufferCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrCommandBufferCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrCommandBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrCommandBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrCommandBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrCommandBufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrCommandBufferCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrCommandBufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrCommandBufferCreateInfo malloc(MemoryStack stack) {
        return new ExrCommandBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrCommandBufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrCommandBufferCreateInfo calloc(MemoryStack stack) {
        return new ExrCommandBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrCommandBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrCommandBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrCommandBufferCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #decoder}. */
    public static long ndecoder(long struct) { return memGetAddress(struct + ExrCommandBufferCreateInfo.DECODER); }
    /** Unsafe version of {@link #encoder}. */
    public static long nencoder(long struct) { return memGetAddress(struct + ExrCommandBufferCreateInfo.ENCODER); }
    /** Unsafe version of {@link #max_commands}. */
    public static int nmax_commands(long struct) { return memGetInt(struct + ExrCommandBufferCreateInfo.MAX_COMMANDS); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrCommandBufferCreateInfo.FLAGS); }

    /** Unsafe version of {@link #decoder(long) decoder}. */
    public static void ndecoder(long struct, long value) { memPutAddress(struct + ExrCommandBufferCreateInfo.DECODER, check(value)); }
    /** Unsafe version of {@link #encoder(long) encoder}. */
    public static void nencoder(long struct, long value) { memPutAddress(struct + ExrCommandBufferCreateInfo.ENCODER, value); }
    /** Unsafe version of {@link #max_commands(int) max_commands}. */
    public static void nmax_commands(long struct, int value) { memPutInt(struct + ExrCommandBufferCreateInfo.MAX_COMMANDS, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrCommandBufferCreateInfo.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrCommandBufferCreateInfo.DECODER));
    }

    // -----------------------------------

    /** An array of {@link ExrCommandBufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrCommandBufferCreateInfo, Buffer> implements NativeResource {

        private static final ExrCommandBufferCreateInfo ELEMENT_FACTORY = ExrCommandBufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrCommandBufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrCommandBufferCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrCommandBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code decoder} field. */
        @NativeType("ExrDecoder")
        public long decoder() { return ExrCommandBufferCreateInfo.ndecoder(address()); }
        /** @return the value of the {@code encoder} field. */
        @NativeType("ExrEncoder")
        public long encoder() { return ExrCommandBufferCreateInfo.nencoder(address()); }
        /** @return the value of the {@code max_commands} field. */
        @NativeType("uint32_t")
        public int max_commands() { return ExrCommandBufferCreateInfo.nmax_commands(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrCommandBufferCreateInfo.nflags(address()); }

        /** Sets the specified value to the {@code decoder} field. */
        public ExrCommandBufferCreateInfo.Buffer decoder(@NativeType("ExrDecoder") long value) { ExrCommandBufferCreateInfo.ndecoder(address(), value); return this; }
        /** Sets the specified value to the {@code encoder} field. */
        public ExrCommandBufferCreateInfo.Buffer encoder(@NativeType("ExrEncoder") long value) { ExrCommandBufferCreateInfo.nencoder(address(), value); return this; }
        /** Sets the specified value to the {@code max_commands} field. */
        public ExrCommandBufferCreateInfo.Buffer max_commands(@NativeType("uint32_t") int value) { ExrCommandBufferCreateInfo.nmax_commands(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrCommandBufferCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrCommandBufferCreateInfo.nflags(address(), value); return this; }

    }

}