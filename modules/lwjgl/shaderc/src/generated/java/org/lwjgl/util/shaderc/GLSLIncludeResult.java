/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct glsl_include_result_t {
 *     char const * header_name;
 *     char const * header_data;
 *     size_t header_length;
 * }}</pre>
 */
@NativeType("struct glsl_include_result_t")
public class GLSLIncludeResult extends Struct<GLSLIncludeResult> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER_NAME,
        HEADER_DATA,
        HEADER_LENGTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER_NAME = layout.offsetof(0);
        HEADER_DATA = layout.offsetof(1);
        HEADER_LENGTH = layout.offsetof(2);
    }

    protected GLSLIncludeResult(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLIncludeResult create(long address, @Nullable ByteBuffer container) {
        return new GLSLIncludeResult(address, container);
    }

    /**
     * Creates a {@code GLSLIncludeResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLIncludeResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code header_name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer header_name() { return nheader_name(address()); }
    /** @return the null-terminated string pointed to by the {@code header_name} field. */
    @NativeType("char const *")
    public @Nullable String header_nameString() { return nheader_nameString(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code header_data} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer header_data() { return nheader_data(address()); }
    /** @return the value of the {@code header_length} field. */
    @NativeType("size_t")
    public long header_length() { return nheader_length(address()); }

    /** Sets the address of the specified encoded string to the {@code header_name} field. */
    public GLSLIncludeResult header_name(@Nullable @NativeType("char const *") ByteBuffer value) { nheader_name(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code header_data} field. */
    public GLSLIncludeResult header_data(@Nullable @NativeType("char const *") ByteBuffer value) { nheader_data(address(), value); return this; }
    /** Sets the specified value to the {@code header_length} field. */
    public GLSLIncludeResult header_length(@NativeType("size_t") long value) { nheader_length(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLIncludeResult set(
        @Nullable ByteBuffer header_name,
        @Nullable ByteBuffer header_data,
        long header_length
    ) {
        header_name(header_name);
        header_data(header_data);
        header_length(header_length);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLIncludeResult set(GLSLIncludeResult src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLIncludeResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLIncludeResult malloc() {
        return new GLSLIncludeResult(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLIncludeResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLIncludeResult calloc() {
        return new GLSLIncludeResult(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLIncludeResult} instance allocated with {@link BufferUtils}. */
    public static GLSLIncludeResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLIncludeResult(memAddress(container), container);
    }

    /** Returns a new {@code GLSLIncludeResult} instance for the specified memory address. */
    public static GLSLIncludeResult create(long address) {
        return new GLSLIncludeResult(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLIncludeResult createSafe(long address) {
        return address == NULL ? null : new GLSLIncludeResult(address, null);
    }

    /**
     * Returns a new {@link GLSLIncludeResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLIncludeResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLIncludeResult.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLIncludeResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLIncludeResult malloc(MemoryStack stack) {
        return new GLSLIncludeResult(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLIncludeResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLIncludeResult calloc(MemoryStack stack) {
        return new GLSLIncludeResult(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLIncludeResult.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #header_name}. */
    public static @Nullable ByteBuffer nheader_name(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + GLSLIncludeResult.HEADER_NAME)); }
    /** Unsafe version of {@link #header_nameString}. */
    public static @Nullable String nheader_nameString(long struct) { return memUTF8Safe(memGetAddress(struct + GLSLIncludeResult.HEADER_NAME)); }
    /** Unsafe version of {@link #header_data() header_data}. */
    public static @Nullable ByteBuffer nheader_data(long struct) { return memByteBufferSafe(memGetAddress(struct + GLSLIncludeResult.HEADER_DATA), (int)nheader_length(struct)); }
    /** Unsafe version of {@link #header_length}. */
    public static long nheader_length(long struct) { return memGetAddress(struct + GLSLIncludeResult.HEADER_LENGTH); }

    /** Unsafe version of {@link #header_name(ByteBuffer) header_name}. */
    public static void nheader_name(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + GLSLIncludeResult.HEADER_NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #header_data(ByteBuffer) header_data}. */
    public static void nheader_data(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + GLSLIncludeResult.HEADER_DATA, memAddressSafe(value)); nheader_length(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code header_length} field of the specified {@code struct}. */
    public static void nheader_length(long struct, long value) { memPutAddress(struct + GLSLIncludeResult.HEADER_LENGTH, value); }

    // -----------------------------------

    /** An array of {@link GLSLIncludeResult} structs. */
    public static class Buffer extends StructBuffer<GLSLIncludeResult, Buffer> implements NativeResource {

        private static final GLSLIncludeResult ELEMENT_FACTORY = GLSLIncludeResult.create(-1L);

        /**
         * Creates a new {@code GLSLIncludeResult.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLIncludeResult#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLIncludeResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code header_name} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer header_name() { return GLSLIncludeResult.nheader_name(address()); }
        /** @return the null-terminated string pointed to by the {@code header_name} field. */
        @NativeType("char const *")
        public @Nullable String header_nameString() { return GLSLIncludeResult.nheader_nameString(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code header_data} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer header_data() { return GLSLIncludeResult.nheader_data(address()); }
        /** @return the value of the {@code header_length} field. */
        @NativeType("size_t")
        public long header_length() { return GLSLIncludeResult.nheader_length(address()); }

        /** Sets the address of the specified encoded string to the {@code header_name} field. */
        public GLSLIncludeResult.Buffer header_name(@Nullable @NativeType("char const *") ByteBuffer value) { GLSLIncludeResult.nheader_name(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code header_data} field. */
        public GLSLIncludeResult.Buffer header_data(@Nullable @NativeType("char const *") ByteBuffer value) { GLSLIncludeResult.nheader_data(address(), value); return this; }
        /** Sets the specified value to the {@code header_length} field. */
        public GLSLIncludeResult.Buffer header_length(@NativeType("size_t") long value) { GLSLIncludeResult.nheader_length(address(), value); return this; }

    }

}