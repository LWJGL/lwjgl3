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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXStringSet {
 *     {@link CXString CXString} * Strings;
 *     unsigned Count;
 * }</code></pre>
 */
public class CXStringSet extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STRINGS,
        COUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STRINGS = layout.offsetof(0);
        COUNT = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXStringSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXStringSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXString.Buffer} view of the struct array pointed to by the {@code Strings} field. */
    @NativeType("CXString *")
    public CXString.Buffer Strings() { return nStrings(address()); }
    /** @return the value of the {@code Count} field. */
    @NativeType("unsigned")
    public int Count() { return nCount(address()); }

    // -----------------------------------

    /** Returns a new {@code CXStringSet} instance for the specified memory address. */
    public static CXStringSet create(long address) {
        return wrap(CXStringSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXStringSet createSafe(long address) {
        return address == NULL ? null : wrap(CXStringSet.class, address);
    }

    /**
     * Create a {@link CXStringSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXStringSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXStringSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Strings}. */
    public static CXString.Buffer nStrings(long struct) { return CXString.create(memGetAddress(struct + CXStringSet.STRINGS), nCount(struct)); }
    /** Unsafe version of {@link #Count}. */
    public static int nCount(long struct) { return UNSAFE.getInt(null, struct + CXStringSet.COUNT); }

    // -----------------------------------

    /** An array of {@link CXStringSet} structs. */
    public static class Buffer extends StructBuffer<CXStringSet, Buffer> {

        private static final CXStringSet ELEMENT_FACTORY = CXStringSet.create(-1L);

        /**
         * Creates a new {@code CXStringSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXStringSet#SIZEOF}, and its mark will be undefined.
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
        protected CXStringSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXString.Buffer} view of the struct array pointed to by the {@code Strings} field. */
        @NativeType("CXString *")
        public CXString.Buffer Strings() { return CXStringSet.nStrings(address()); }
        /** @return the value of the {@code Count} field. */
        @NativeType("unsigned")
        public int Count() { return CXStringSet.nCount(address()); }

    }

}