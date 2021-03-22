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
 * Identifies an array of ranges.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXSourceRangeList {
 *     unsigned {@link #count};
 *     {@link CXSourceRange CXSourceRange} * {@link #ranges};
 * }</code></pre>
 */
public class CXSourceRangeList extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COUNT,
        RANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COUNT = layout.offsetof(0);
        RANGES = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXSourceRangeList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXSourceRangeList(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of ranges in the {@code ranges} array */
    @NativeType("unsigned")
    public int count() { return ncount(address()); }
    /** an array of {@code CXSourceRange}s. */
    @NativeType("CXSourceRange *")
    public CXSourceRange.Buffer ranges() { return nranges(address()); }

    // -----------------------------------

    /** Returns a new {@code CXSourceRangeList} instance for the specified memory address. */
    public static CXSourceRangeList create(long address) {
        return wrap(CXSourceRangeList.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXSourceRangeList createSafe(long address) {
        return address == NULL ? null : wrap(CXSourceRangeList.class, address);
    }

    /**
     * Create a {@link CXSourceRangeList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXSourceRangeList.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXSourceRangeList.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + CXSourceRangeList.COUNT); }
    /** Unsafe version of {@link #ranges}. */
    public static CXSourceRange.Buffer nranges(long struct) { return CXSourceRange.create(memGetAddress(struct + CXSourceRangeList.RANGES), ncount(struct)); }

    // -----------------------------------

    /** An array of {@link CXSourceRangeList} structs. */
    public static class Buffer extends StructBuffer<CXSourceRangeList, Buffer> {

        private static final CXSourceRangeList ELEMENT_FACTORY = CXSourceRangeList.create(-1L);

        /**
         * Creates a new {@code CXSourceRangeList.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXSourceRangeList#SIZEOF}, and its mark will be undefined.
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
        protected CXSourceRangeList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXSourceRangeList#count} field. */
        @NativeType("unsigned")
        public int count() { return CXSourceRangeList.ncount(address()); }
        /** @return a {@link CXSourceRange.Buffer} view of the struct array pointed to by the {@link CXSourceRangeList#ranges} field. */
        @NativeType("CXSourceRange *")
        public CXSourceRange.Buffer ranges() { return CXSourceRangeList.nranges(address()); }

    }

}