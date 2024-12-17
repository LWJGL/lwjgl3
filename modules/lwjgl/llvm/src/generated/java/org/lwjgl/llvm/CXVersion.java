/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct CXVersion {
 *     int Major;
 *     int Minor;
 *     int Subminor;
 * }}</pre>
 */
public class CXVersion extends Struct<CXVersion> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAJOR,
        MINOR,
        SUBMINOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAJOR = layout.offsetof(0);
        MINOR = layout.offsetof(1);
        SUBMINOR = layout.offsetof(2);
    }

    protected CXVersion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXVersion create(long address, @Nullable ByteBuffer container) {
        return new CXVersion(address, container);
    }

    /**
     * Creates a {@code CXVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXVersion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Major} field. */
    public int Major() { return nMajor(address()); }
    /** @return the value of the {@code Minor} field. */
    public int Minor() { return nMinor(address()); }
    /** @return the value of the {@code Subminor} field. */
    public int Subminor() { return nSubminor(address()); }

    // -----------------------------------

    /** Returns a new {@code CXVersion} instance for the specified memory address. */
    public static CXVersion create(long address) {
        return new CXVersion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXVersion createSafe(long address) {
        return address == NULL ? null : new CXVersion(address, null);
    }

    /**
     * Create a {@link CXVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXVersion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXVersion.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Major}. */
    public static int nMajor(long struct) { return memGetInt(struct + CXVersion.MAJOR); }
    /** Unsafe version of {@link #Minor}. */
    public static int nMinor(long struct) { return memGetInt(struct + CXVersion.MINOR); }
    /** Unsafe version of {@link #Subminor}. */
    public static int nSubminor(long struct) { return memGetInt(struct + CXVersion.SUBMINOR); }

    // -----------------------------------

    /** An array of {@link CXVersion} structs. */
    public static class Buffer extends StructBuffer<CXVersion, Buffer> {

        private static final CXVersion ELEMENT_FACTORY = CXVersion.create(-1L);

        /**
         * Creates a new {@code CXVersion.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXVersion#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Major} field. */
        public int Major() { return CXVersion.nMajor(address()); }
        /** @return the value of the {@code Minor} field. */
        public int Minor() { return CXVersion.nMinor(address()); }
        /** @return the value of the {@code Subminor} field. */
        public int Subminor() { return CXVersion.nSubminor(address()); }

    }

}