/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hwloc_group_attr_s {
 *     unsigned depth;
 *     unsigned kind;
 *     unsigned subkind;
 *     unsigned char dont_merge;
 * }</code></pre>
 */
public class hwloc_group_attr_s extends Struct<hwloc_group_attr_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEPTH,
        KIND,
        SUBKIND,
        DONT_MERGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEPTH = layout.offsetof(0);
        KIND = layout.offsetof(1);
        SUBKIND = layout.offsetof(2);
        DONT_MERGE = layout.offsetof(3);
    }

    protected hwloc_group_attr_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_group_attr_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_group_attr_s(address, container);
    }

    /**
     * Creates a {@code hwloc_group_attr_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_group_attr_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code depth} field. */
    @NativeType("unsigned")
    public int depth() { return ndepth(address()); }
    /** @return the value of the {@code kind} field. */
    @NativeType("unsigned")
    public int kind() { return nkind(address()); }
    /** @return the value of the {@code subkind} field. */
    @NativeType("unsigned")
    public int subkind() { return nsubkind(address()); }
    /** @return the value of the {@code dont_merge} field. */
    @NativeType("unsigned char")
    public boolean dont_merge() { return ndont_merge(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_group_attr_s} instance for the specified memory address. */
    public static hwloc_group_attr_s create(long address) {
        return new hwloc_group_attr_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_group_attr_s createSafe(long address) {
        return address == NULL ? null : new hwloc_group_attr_s(address, null);
    }

    /**
     * Create a {@link hwloc_group_attr_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_group_attr_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_group_attr_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + hwloc_group_attr_s.DEPTH); }
    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + hwloc_group_attr_s.KIND); }
    /** Unsafe version of {@link #subkind}. */
    public static int nsubkind(long struct) { return UNSAFE.getInt(null, struct + hwloc_group_attr_s.SUBKIND); }
    /** Unsafe version of {@link #dont_merge}. */
    public static boolean ndont_merge(long struct) { return UNSAFE.getByte(null, struct + hwloc_group_attr_s.DONT_MERGE) != 0; }

    // -----------------------------------

    /** An array of {@link hwloc_group_attr_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_group_attr_s, Buffer> {

        private static final hwloc_group_attr_s ELEMENT_FACTORY = hwloc_group_attr_s.create(-1L);

        /**
         * Creates a new {@code hwloc_group_attr_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_group_attr_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_group_attr_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code depth} field. */
        @NativeType("unsigned")
        public int depth() { return hwloc_group_attr_s.ndepth(address()); }
        /** @return the value of the {@code kind} field. */
        @NativeType("unsigned")
        public int kind() { return hwloc_group_attr_s.nkind(address()); }
        /** @return the value of the {@code subkind} field. */
        @NativeType("unsigned")
        public int subkind() { return hwloc_group_attr_s.nsubkind(address()); }
        /** @return the value of the {@code dont_merge} field. */
        @NativeType("unsigned char")
        public boolean dont_merge() { return hwloc_group_attr_s.ndont_merge(address()); }

    }

}