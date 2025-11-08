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
 * <pre>{@code
 * struct glslang_version_t {
 *     int major;
 *     int minor;
 *     int patch;
 *     char const * flavor;
 * }}</pre>
 */
@NativeType("struct glslang_version_t")
public class GLSLangVersion extends Struct<GLSLangVersion> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAJOR,
        MINOR,
        PATCH,
        FLAVOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAJOR = layout.offsetof(0);
        MINOR = layout.offsetof(1);
        PATCH = layout.offsetof(2);
        FLAVOR = layout.offsetof(3);
    }

    protected GLSLangVersion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLangVersion create(long address, @Nullable ByteBuffer container) {
        return new GLSLangVersion(address, container);
    }

    /**
     * Creates a {@code GLSLangVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLangVersion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code major} field. */
    public int major() { return nmajor(address()); }
    /** @return the value of the {@code minor} field. */
    public int minor() { return nminor(address()); }
    /** @return the value of the {@code patch} field. */
    public int patch() { return npatch(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code flavor} field. */
    @NativeType("char const *")
    public ByteBuffer flavor() { return nflavor(address()); }
    /** @return the null-terminated string pointed to by the {@code flavor} field. */
    @NativeType("char const *")
    public String flavorString() { return nflavorString(address()); }

    // -----------------------------------

    /** Returns a new {@code GLSLangVersion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLangVersion malloc() {
        return new GLSLangVersion(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLangVersion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLangVersion calloc() {
        return new GLSLangVersion(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLangVersion} instance allocated with {@link BufferUtils}. */
    public static GLSLangVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangVersion(memAddress(container), container);
    }

    /** Returns a new {@code GLSLangVersion} instance for the specified memory address. */
    public static GLSLangVersion create(long address) {
        return new GLSLangVersion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLangVersion createSafe(long address) {
        return address == NULL ? null : new GLSLangVersion(address, null);
    }

    /**
     * Returns a new {@link GLSLangVersion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLangVersion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangVersion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLangVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLangVersion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLangVersion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangVersion malloc(MemoryStack stack) {
        return new GLSLangVersion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLangVersion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangVersion calloc(MemoryStack stack) {
        return new GLSLangVersion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLangVersion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangVersion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangVersion.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #major}. */
    public static int nmajor(long struct) { return memGetInt(struct + GLSLangVersion.MAJOR); }
    /** Unsafe version of {@link #minor}. */
    public static int nminor(long struct) { return memGetInt(struct + GLSLangVersion.MINOR); }
    /** Unsafe version of {@link #patch}. */
    public static int npatch(long struct) { return memGetInt(struct + GLSLangVersion.PATCH); }
    /** Unsafe version of {@link #flavor}. */
    public static ByteBuffer nflavor(long struct) { return memByteBufferNT1(memGetAddress(struct + GLSLangVersion.FLAVOR)); }
    /** Unsafe version of {@link #flavorString}. */
    public static String nflavorString(long struct) { return memASCII(memGetAddress(struct + GLSLangVersion.FLAVOR)); }

    // -----------------------------------

    /** An array of {@link GLSLangVersion} structs. */
    public static class Buffer extends StructBuffer<GLSLangVersion, Buffer> implements NativeResource {

        private static final GLSLangVersion ELEMENT_FACTORY = GLSLangVersion.create(-1L);

        /**
         * Creates a new {@code GLSLangVersion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLangVersion#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLSLangVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code major} field. */
        public int major() { return GLSLangVersion.nmajor(address()); }
        /** @return the value of the {@code minor} field. */
        public int minor() { return GLSLangVersion.nminor(address()); }
        /** @return the value of the {@code patch} field. */
        public int patch() { return GLSLangVersion.npatch(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code flavor} field. */
        @NativeType("char const *")
        public ByteBuffer flavor() { return GLSLangVersion.nflavor(address()); }
        /** @return the null-terminated string pointed to by the {@code flavor} field. */
        @NativeType("char const *")
        public String flavorString() { return GLSLangVersion.nflavorString(address()); }

    }

}