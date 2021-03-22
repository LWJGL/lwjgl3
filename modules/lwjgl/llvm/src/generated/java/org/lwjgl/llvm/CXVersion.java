/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes a version number of the form {@code major.minor.subminor}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXVersion {
 *     int {@link #Major};
 *     int {@link #Minor};
 *     int {@link #Subminor};
 * }</code></pre>
 */
public class CXVersion extends Struct {

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

    /** the major version number, e.g., the '10' in '10.7.3'. A negative value indicates that there is no version number at all. */
    public int Major() { return nMajor(address()); }
    /** the minor version number, e.g., the '7' in '10.7.3'. This value will be negative if no minor version number was provided, e.g., for version '10'. */
    public int Minor() { return nMinor(address()); }
    /**
     * the subminor version number, e.g., the '3' in '10.7.3'. This value will be negative if no minor or subminor version number was provided, e.g., in
     * version '10' or '10.7'.
     */
    public int Subminor() { return nSubminor(address()); }

    // -----------------------------------

    /** Returns a new {@code CXVersion} instance for the specified memory address. */
    public static CXVersion create(long address) {
        return wrap(CXVersion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXVersion createSafe(long address) {
        return address == NULL ? null : wrap(CXVersion.class, address);
    }

    /**
     * Create a {@link CXVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXVersion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXVersion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Major}. */
    public static int nMajor(long struct) { return UNSAFE.getInt(null, struct + CXVersion.MAJOR); }
    /** Unsafe version of {@link #Minor}. */
    public static int nMinor(long struct) { return UNSAFE.getInt(null, struct + CXVersion.MINOR); }
    /** Unsafe version of {@link #Subminor}. */
    public static int nSubminor(long struct) { return UNSAFE.getInt(null, struct + CXVersion.SUBMINOR); }

    // -----------------------------------

    /** An array of {@link CXVersion} structs. */
    public static class Buffer extends StructBuffer<CXVersion, Buffer> {

        private static final CXVersion ELEMENT_FACTORY = CXVersion.create(-1L);

        /**
         * Creates a new {@code CXVersion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXVersion#SIZEOF}, and its mark will be undefined.
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
        protected CXVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXVersion#Major} field. */
        public int Major() { return CXVersion.nMajor(address()); }
        /** @return the value of the {@link CXVersion#Minor} field. */
        public int Minor() { return CXVersion.nMinor(address()); }
        /** @return the value of the {@link CXVersion#Subminor} field. */
        public int Subminor() { return CXVersion.nSubminor(address()); }

    }

}