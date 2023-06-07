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
 * struct hwloc_topology_diff_obj_attr_string_s {
 *     hwloc_topology_diff_obj_attr_type_t type;
 *     char * name;
 *     char * oldvalue;
 *     char * newvalue;
 * }</code></pre>
 */
public class hwloc_topology_diff_obj_attr_string_s extends Struct<hwloc_topology_diff_obj_attr_string_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NAME,
        OLDVALUE,
        NEWVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NAME = layout.offsetof(1);
        OLDVALUE = layout.offsetof(2);
        NEWVALUE = layout.offsetof(3);
    }

    protected hwloc_topology_diff_obj_attr_string_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_diff_obj_attr_string_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_diff_obj_attr_string_s(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_diff_obj_attr_string_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_diff_obj_attr_string_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("hwloc_topology_diff_obj_attr_type_t")
    public int type() { return ntype(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code oldvalue} field. */
    @NativeType("char *")
    public ByteBuffer oldvalue() { return noldvalue(address()); }
    /** @return the null-terminated string pointed to by the {@code oldvalue} field. */
    @NativeType("char *")
    public String oldvalueString() { return noldvalueString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code newvalue} field. */
    @NativeType("char *")
    public ByteBuffer newvalue() { return nnewvalue(address()); }
    /** @return the null-terminated string pointed to by the {@code newvalue} field. */
    @NativeType("char *")
    public String newvalueString() { return nnewvalueString(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_diff_obj_attr_string_s} instance for the specified memory address. */
    public static hwloc_topology_diff_obj_attr_string_s create(long address) {
        return new hwloc_topology_diff_obj_attr_string_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_obj_attr_string_s createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_diff_obj_attr_string_s(address, null);
    }

    /**
     * Create a {@link hwloc_topology_diff_obj_attr_string_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_diff_obj_attr_string_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_obj_attr_string_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_obj_attr_string_s.TYPE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.NAME)); }
    /** Unsafe version of {@link #oldvalue}. */
    public static ByteBuffer noldvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.OLDVALUE)); }
    /** Unsafe version of {@link #oldvalueString}. */
    public static String noldvalueString(long struct) { return memASCII(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.OLDVALUE)); }
    /** Unsafe version of {@link #newvalue}. */
    public static ByteBuffer nnewvalue(long struct) { return memByteBufferNT1(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.NEWVALUE)); }
    /** Unsafe version of {@link #newvalueString}. */
    public static String nnewvalueString(long struct) { return memASCII(memGetAddress(struct + hwloc_topology_diff_obj_attr_string_s.NEWVALUE)); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_diff_obj_attr_string_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_diff_obj_attr_string_s, Buffer> {

        private static final hwloc_topology_diff_obj_attr_string_s ELEMENT_FACTORY = hwloc_topology_diff_obj_attr_string_s.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_diff_obj_attr_string_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_diff_obj_attr_string_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_diff_obj_attr_string_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("hwloc_topology_diff_obj_attr_type_t")
        public int type() { return hwloc_topology_diff_obj_attr_string_s.ntype(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public ByteBuffer name() { return hwloc_topology_diff_obj_attr_string_s.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char *")
        public String nameString() { return hwloc_topology_diff_obj_attr_string_s.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code oldvalue} field. */
        @NativeType("char *")
        public ByteBuffer oldvalue() { return hwloc_topology_diff_obj_attr_string_s.noldvalue(address()); }
        /** @return the null-terminated string pointed to by the {@code oldvalue} field. */
        @NativeType("char *")
        public String oldvalueString() { return hwloc_topology_diff_obj_attr_string_s.noldvalueString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code newvalue} field. */
        @NativeType("char *")
        public ByteBuffer newvalue() { return hwloc_topology_diff_obj_attr_string_s.nnewvalue(address()); }
        /** @return the null-terminated string pointed to by the {@code newvalue} field. */
        @NativeType("char *")
        public String newvalueString() { return hwloc_topology_diff_obj_attr_string_s.nnewvalueString(address()); }

    }

}