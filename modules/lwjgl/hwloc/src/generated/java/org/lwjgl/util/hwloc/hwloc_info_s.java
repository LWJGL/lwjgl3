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
 * struct hwloc_info_s {
 *     char * name;
 *     char * value;
 * }</code></pre>
 */
@NativeType("struct hwloc_info_s")
public class hwloc_info_s extends Struct<hwloc_info_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected hwloc_info_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_info_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_info_s(address, container);
    }

    /**
     * Creates a {@code hwloc_info_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_info_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char *")
    public ByteBuffer value() { return nvalue(address()); }
    /** @return the null-terminated string pointed to by the {@code value} field. */
    @NativeType("char *")
    public String valueString() { return nvalueString(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_info_s} instance for the specified memory address. */
    public static hwloc_info_s create(long address) {
        return new hwloc_info_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_info_s createSafe(long address) {
        return address == NULL ? null : new hwloc_info_s(address, null);
    }

    /**
     * Create a {@link hwloc_info_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_info_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_info_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_info_s.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + hwloc_info_s.NAME)); }
    /** Unsafe version of {@link #value}. */
    public static ByteBuffer nvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_info_s.VALUE)); }
    /** Unsafe version of {@link #valueString}. */
    public static String nvalueString(long struct) { return memASCII(memGetAddress(struct + hwloc_info_s.VALUE)); }

    // -----------------------------------

    /** An array of {@link hwloc_info_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_info_s, Buffer> {

        private static final hwloc_info_s ELEMENT_FACTORY = hwloc_info_s.create(-1L);

        /**
         * Creates a new {@code hwloc_info_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_info_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_info_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return hwloc_info_s.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return hwloc_info_s.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char *")
        public ByteBuffer value() { return hwloc_info_s.nvalue(address()); }
        /** @return the null-terminated string pointed to by the {@code value} field. */
        @NativeType("char *")
        public String valueString() { return hwloc_info_s.nvalueString(address()); }

    }

}