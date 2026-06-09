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
 * struct ExrErrorInfo {
 *     ExrResult code;
 *     char const * message;
 *     char const * context;
 *     uint64_t byte_position;
 *     int32_t line_number;
 *     char const * source_file;
 * }}</pre>
 */
public class ExrErrorInfo extends Struct<ExrErrorInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CODE,
        MESSAGE,
        CONTEXT,
        BYTE_POSITION,
        LINE_NUMBER,
        SOURCE_FILE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CODE = layout.offsetof(0);
        MESSAGE = layout.offsetof(1);
        CONTEXT = layout.offsetof(2);
        BYTE_POSITION = layout.offsetof(3);
        LINE_NUMBER = layout.offsetof(4);
        SOURCE_FILE = layout.offsetof(5);
    }

    protected ExrErrorInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrErrorInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrErrorInfo(address, container);
    }

    /**
     * Creates a {@code ExrErrorInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrErrorInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code code} field. */
    @NativeType("ExrResult")
    public int code() { return ncode(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public ByteBuffer message() { return nmessage(address()); }
    /** @return the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public String messageString() { return nmessageString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code context} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer context() { return ncontext(address()); }
    /** @return the null-terminated string pointed to by the {@code context} field. */
    @NativeType("char const *")
    public @Nullable String contextString() { return ncontextString(address()); }
    /** @return the value of the {@code byte_position} field. */
    @NativeType("uint64_t")
    public long byte_position() { return nbyte_position(address()); }
    /** @return the value of the {@code line_number} field. */
    @NativeType("int32_t")
    public int line_number() { return nline_number(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source_file} field. */
    @NativeType("char const *")
    public ByteBuffer source_file() { return nsource_file(address()); }
    /** @return the null-terminated string pointed to by the {@code source_file} field. */
    @NativeType("char const *")
    public String source_fileString() { return nsource_fileString(address()); }

    /** Sets the specified value to the {@code code} field. */
    public ExrErrorInfo code(@NativeType("ExrResult") int value) { ncode(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code message} field. */
    public ExrErrorInfo message(@NativeType("char const *") ByteBuffer value) { nmessage(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code context} field. */
    public ExrErrorInfo context(@Nullable @NativeType("char const *") ByteBuffer value) { ncontext(address(), value); return this; }
    /** Sets the specified value to the {@code byte_position} field. */
    public ExrErrorInfo byte_position(@NativeType("uint64_t") long value) { nbyte_position(address(), value); return this; }
    /** Sets the specified value to the {@code line_number} field. */
    public ExrErrorInfo line_number(@NativeType("int32_t") int value) { nline_number(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code source_file} field. */
    public ExrErrorInfo source_file(@NativeType("char const *") ByteBuffer value) { nsource_file(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrErrorInfo set(
        int code,
        ByteBuffer message,
        @Nullable ByteBuffer context,
        long byte_position,
        int line_number,
        ByteBuffer source_file
    ) {
        code(code);
        message(message);
        context(context);
        byte_position(byte_position);
        line_number(line_number);
        source_file(source_file);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrErrorInfo set(ExrErrorInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrErrorInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrErrorInfo malloc() {
        return new ExrErrorInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrErrorInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrErrorInfo calloc() {
        return new ExrErrorInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrErrorInfo} instance allocated with {@link BufferUtils}. */
    public static ExrErrorInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrErrorInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrErrorInfo} instance for the specified memory address. */
    public static ExrErrorInfo create(long address) {
        return new ExrErrorInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrErrorInfo createSafe(long address) {
        return address == NULL ? null : new ExrErrorInfo(address, null);
    }

    /**
     * Returns a new {@link ExrErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrErrorInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrErrorInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrErrorInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrErrorInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrErrorInfo malloc(MemoryStack stack) {
        return new ExrErrorInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrErrorInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrErrorInfo calloc(MemoryStack stack) {
        return new ExrErrorInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrErrorInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #code}. */
    public static int ncode(long struct) { return memGetInt(struct + ExrErrorInfo.CODE); }
    /** Unsafe version of {@link #message}. */
    public static ByteBuffer nmessage(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrErrorInfo.MESSAGE)); }
    /** Unsafe version of {@link #messageString}. */
    public static String nmessageString(long struct) { return memASCII(memGetAddress(struct + ExrErrorInfo.MESSAGE)); }
    /** Unsafe version of {@link #context}. */
    public static @Nullable ByteBuffer ncontext(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + ExrErrorInfo.CONTEXT)); }
    /** Unsafe version of {@link #contextString}. */
    public static @Nullable String ncontextString(long struct) { return memASCIISafe(memGetAddress(struct + ExrErrorInfo.CONTEXT)); }
    /** Unsafe version of {@link #byte_position}. */
    public static long nbyte_position(long struct) { return memGetLong(struct + ExrErrorInfo.BYTE_POSITION); }
    /** Unsafe version of {@link #line_number}. */
    public static int nline_number(long struct) { return memGetInt(struct + ExrErrorInfo.LINE_NUMBER); }
    /** Unsafe version of {@link #source_file}. */
    public static ByteBuffer nsource_file(long struct) { return memByteBufferNT1(memGetAddress(struct + ExrErrorInfo.SOURCE_FILE)); }
    /** Unsafe version of {@link #source_fileString}. */
    public static String nsource_fileString(long struct) { return memUTF8(memGetAddress(struct + ExrErrorInfo.SOURCE_FILE)); }

    /** Unsafe version of {@link #code(int) code}. */
    public static void ncode(long struct, int value) { memPutInt(struct + ExrErrorInfo.CODE, value); }
    /** Unsafe version of {@link #message(ByteBuffer) message}. */
    public static void nmessage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrErrorInfo.MESSAGE, memAddress(value));
    }
    /** Unsafe version of {@link #context(ByteBuffer) context}. */
    public static void ncontext(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + ExrErrorInfo.CONTEXT, memAddressSafe(value));
    }
    /** Unsafe version of {@link #byte_position(long) byte_position}. */
    public static void nbyte_position(long struct, long value) { memPutLong(struct + ExrErrorInfo.BYTE_POSITION, value); }
    /** Unsafe version of {@link #line_number(int) line_number}. */
    public static void nline_number(long struct, int value) { memPutInt(struct + ExrErrorInfo.LINE_NUMBER, value); }
    /** Unsafe version of {@link #source_file(ByteBuffer) source_file}. */
    public static void nsource_file(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + ExrErrorInfo.SOURCE_FILE, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrErrorInfo.MESSAGE));
        check(memGetAddress(struct + ExrErrorInfo.SOURCE_FILE));
    }

    // -----------------------------------

    /** An array of {@link ExrErrorInfo} structs. */
    public static class Buffer extends StructBuffer<ExrErrorInfo, Buffer> implements NativeResource {

        private static final ExrErrorInfo ELEMENT_FACTORY = ExrErrorInfo.create(-1L);

        /**
         * Creates a new {@code ExrErrorInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrErrorInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrErrorInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code code} field. */
        @NativeType("ExrResult")
        public int code() { return ExrErrorInfo.ncode(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public ByteBuffer message() { return ExrErrorInfo.nmessage(address()); }
        /** @return the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public String messageString() { return ExrErrorInfo.nmessageString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code context} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer context() { return ExrErrorInfo.ncontext(address()); }
        /** @return the null-terminated string pointed to by the {@code context} field. */
        @NativeType("char const *")
        public @Nullable String contextString() { return ExrErrorInfo.ncontextString(address()); }
        /** @return the value of the {@code byte_position} field. */
        @NativeType("uint64_t")
        public long byte_position() { return ExrErrorInfo.nbyte_position(address()); }
        /** @return the value of the {@code line_number} field. */
        @NativeType("int32_t")
        public int line_number() { return ExrErrorInfo.nline_number(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source_file} field. */
        @NativeType("char const *")
        public ByteBuffer source_file() { return ExrErrorInfo.nsource_file(address()); }
        /** @return the null-terminated string pointed to by the {@code source_file} field. */
        @NativeType("char const *")
        public String source_fileString() { return ExrErrorInfo.nsource_fileString(address()); }

        /** Sets the specified value to the {@code code} field. */
        public ExrErrorInfo.Buffer code(@NativeType("ExrResult") int value) { ExrErrorInfo.ncode(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code message} field. */
        public ExrErrorInfo.Buffer message(@NativeType("char const *") ByteBuffer value) { ExrErrorInfo.nmessage(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code context} field. */
        public ExrErrorInfo.Buffer context(@Nullable @NativeType("char const *") ByteBuffer value) { ExrErrorInfo.ncontext(address(), value); return this; }
        /** Sets the specified value to the {@code byte_position} field. */
        public ExrErrorInfo.Buffer byte_position(@NativeType("uint64_t") long value) { ExrErrorInfo.nbyte_position(address(), value); return this; }
        /** Sets the specified value to the {@code line_number} field. */
        public ExrErrorInfo.Buffer line_number(@NativeType("int32_t") int value) { ExrErrorInfo.nline_number(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code source_file} field. */
        public ExrErrorInfo.Buffer source_file(@NativeType("char const *") ByteBuffer value) { ExrErrorInfo.nsource_file(address(), value); return this; }

    }

}