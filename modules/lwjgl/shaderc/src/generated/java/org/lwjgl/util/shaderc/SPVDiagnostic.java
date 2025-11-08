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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct spv_diagnostic_t {
 *     {@link SPVPosition spv_position_t} position;
 *     char * error;
 *     bool isTextSource;
 * }</code></pre>
 */
@NativeType("struct spv_diagnostic_t")
public class SPVDiagnostic extends Struct<SPVDiagnostic> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        ERROR,
        ISTEXTSOURCE;

    static {
        Layout layout = __struct(
            __member(SPVPosition.SIZEOF, SPVPosition.ALIGNOF),
            __member(POINTER_SIZE),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        ERROR = layout.offsetof(1);
        ISTEXTSOURCE = layout.offsetof(2);
    }

    protected SPVDiagnostic(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVDiagnostic create(long address, @Nullable ByteBuffer container) {
        return new SPVDiagnostic(address, container);
    }

    /**
     * Creates a {@code SPVDiagnostic} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVDiagnostic(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SPVPosition} view of the {@code position} field. */
    @NativeType("spv_position_t")
    public SPVPosition position$() { return nposition$(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code error} field. */
    @NativeType("char *")
    public ByteBuffer error() { return nerror(address()); }
    /** @return the null-terminated string pointed to by the {@code error} field. */
    @NativeType("char *")
    public String errorString() { return nerrorString(address()); }
    /** @return the value of the {@code isTextSource} field. */
    @NativeType("bool")
    public boolean isTextSource() { return nisTextSource(address()); }

    // -----------------------------------

    /** Returns a new {@code SPVDiagnostic} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVDiagnostic malloc() {
        return new SPVDiagnostic(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVDiagnostic} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVDiagnostic calloc() {
        return new SPVDiagnostic(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVDiagnostic} instance allocated with {@link BufferUtils}. */
    public static SPVDiagnostic create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVDiagnostic(memAddress(container), container);
    }

    /** Returns a new {@code SPVDiagnostic} instance for the specified memory address. */
    public static SPVDiagnostic create(long address) {
        return new SPVDiagnostic(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVDiagnostic createSafe(long address) {
        return address == NULL ? null : new SPVDiagnostic(address, null);
    }

    /**
     * Returns a new {@link SPVDiagnostic.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVDiagnostic.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVDiagnostic.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVDiagnostic.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVDiagnostic.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVDiagnostic} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVDiagnostic malloc(MemoryStack stack) {
        return new SPVDiagnostic(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVDiagnostic} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVDiagnostic calloc(MemoryStack stack) {
        return new SPVDiagnostic(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVDiagnostic.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVDiagnostic.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVDiagnostic.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static SPVPosition nposition$(long struct) { return SPVPosition.create(struct + SPVDiagnostic.POSITION); }
    /** Unsafe version of {@link #error}. */
    public static ByteBuffer nerror(long struct) { return memByteBufferNT1(memGetAddress(struct + SPVDiagnostic.ERROR)); }
    /** Unsafe version of {@link #errorString}. */
    public static String nerrorString(long struct) { return memUTF8(memGetAddress(struct + SPVDiagnostic.ERROR)); }
    /** Unsafe version of {@link #isTextSource}. */
    public static boolean nisTextSource(long struct) { return memGetByte(struct + SPVDiagnostic.ISTEXTSOURCE) != 0; }

    // -----------------------------------

    /** An array of {@link SPVDiagnostic} structs. */
    public static class Buffer extends StructBuffer<SPVDiagnostic, Buffer> implements NativeResource {

        private static final SPVDiagnostic ELEMENT_FACTORY = SPVDiagnostic.create(-1L);

        /**
         * Creates a new {@code SPVDiagnostic.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVDiagnostic#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVDiagnostic getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SPVPosition} view of the {@code position} field. */
        @NativeType("spv_position_t")
        public SPVPosition position$() { return SPVDiagnostic.nposition$(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code error} field. */
        @NativeType("char *")
        public ByteBuffer error() { return SPVDiagnostic.nerror(address()); }
        /** @return the null-terminated string pointed to by the {@code error} field. */
        @NativeType("char *")
        public String errorString() { return SPVDiagnostic.nerrorString(address()); }
        /** @return the value of the {@code isTextSource} field. */
        @NativeType("bool")
        public boolean isTextSource() { return SPVDiagnostic.nisTextSource(address()); }

    }

}