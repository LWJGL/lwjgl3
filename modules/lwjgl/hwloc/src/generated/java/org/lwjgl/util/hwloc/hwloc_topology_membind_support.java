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
 * struct hwloc_topology_membind_support {
 *     unsigned char set_thisproc_membind;
 *     unsigned char get_thisproc_membind;
 *     unsigned char set_proc_membind;
 *     unsigned char get_proc_membind;
 *     unsigned char set_thisthread_membind;
 *     unsigned char get_thisthread_membind;
 *     unsigned char set_area_membind;
 *     unsigned char get_area_membind;
 *     unsigned char alloc_membind;
 *     unsigned char firsttouch_membind;
 *     unsigned char bind_membind;
 *     unsigned char interleave_membind;
 *     unsigned char nexttouch_membind;
 *     unsigned char migrate_membind;
 *     unsigned char get_area_memlocation;
 * }</code></pre>
 */
@NativeType("struct hwloc_topology_membind_support")
public class hwloc_topology_membind_support extends Struct<hwloc_topology_membind_support> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SET_THISPROC_MEMBIND,
        GET_THISPROC_MEMBIND,
        SET_PROC_MEMBIND,
        GET_PROC_MEMBIND,
        SET_THISTHREAD_MEMBIND,
        GET_THISTHREAD_MEMBIND,
        SET_AREA_MEMBIND,
        GET_AREA_MEMBIND,
        ALLOC_MEMBIND,
        FIRSTTOUCH_MEMBIND,
        BIND_MEMBIND,
        INTERLEAVE_MEMBIND,
        NEXTTOUCH_MEMBIND,
        MIGRATE_MEMBIND,
        GET_AREA_MEMLOCATION;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SET_THISPROC_MEMBIND = layout.offsetof(0);
        GET_THISPROC_MEMBIND = layout.offsetof(1);
        SET_PROC_MEMBIND = layout.offsetof(2);
        GET_PROC_MEMBIND = layout.offsetof(3);
        SET_THISTHREAD_MEMBIND = layout.offsetof(4);
        GET_THISTHREAD_MEMBIND = layout.offsetof(5);
        SET_AREA_MEMBIND = layout.offsetof(6);
        GET_AREA_MEMBIND = layout.offsetof(7);
        ALLOC_MEMBIND = layout.offsetof(8);
        FIRSTTOUCH_MEMBIND = layout.offsetof(9);
        BIND_MEMBIND = layout.offsetof(10);
        INTERLEAVE_MEMBIND = layout.offsetof(11);
        NEXTTOUCH_MEMBIND = layout.offsetof(12);
        MIGRATE_MEMBIND = layout.offsetof(13);
        GET_AREA_MEMLOCATION = layout.offsetof(14);
    }

    protected hwloc_topology_membind_support(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_membind_support create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_membind_support(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_membind_support} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_membind_support(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code set_thisproc_membind} field. */
    @NativeType("unsigned char")
    public boolean set_thisproc_membind() { return nset_thisproc_membind(address()); }
    /** @return the value of the {@code get_thisproc_membind} field. */
    @NativeType("unsigned char")
    public boolean get_thisproc_membind() { return nget_thisproc_membind(address()); }
    /** @return the value of the {@code set_proc_membind} field. */
    @NativeType("unsigned char")
    public boolean set_proc_membind() { return nset_proc_membind(address()); }
    /** @return the value of the {@code get_proc_membind} field. */
    @NativeType("unsigned char")
    public boolean get_proc_membind() { return nget_proc_membind(address()); }
    /** @return the value of the {@code set_thisthread_membind} field. */
    @NativeType("unsigned char")
    public boolean set_thisthread_membind() { return nset_thisthread_membind(address()); }
    /** @return the value of the {@code get_thisthread_membind} field. */
    @NativeType("unsigned char")
    public boolean get_thisthread_membind() { return nget_thisthread_membind(address()); }
    /** @return the value of the {@code set_area_membind} field. */
    @NativeType("unsigned char")
    public boolean set_area_membind() { return nset_area_membind(address()); }
    /** @return the value of the {@code get_area_membind} field. */
    @NativeType("unsigned char")
    public boolean get_area_membind() { return nget_area_membind(address()); }
    /** @return the value of the {@code alloc_membind} field. */
    @NativeType("unsigned char")
    public boolean alloc_membind() { return nalloc_membind(address()); }
    /** @return the value of the {@code firsttouch_membind} field. */
    @NativeType("unsigned char")
    public boolean firsttouch_membind() { return nfirsttouch_membind(address()); }
    /** @return the value of the {@code bind_membind} field. */
    @NativeType("unsigned char")
    public boolean bind_membind() { return nbind_membind(address()); }
    /** @return the value of the {@code interleave_membind} field. */
    @NativeType("unsigned char")
    public boolean interleave_membind() { return ninterleave_membind(address()); }
    /** @return the value of the {@code nexttouch_membind} field. */
    @NativeType("unsigned char")
    public boolean nexttouch_membind() { return nnexttouch_membind(address()); }
    /** @return the value of the {@code migrate_membind} field. */
    @NativeType("unsigned char")
    public boolean migrate_membind() { return nmigrate_membind(address()); }
    /** @return the value of the {@code get_area_memlocation} field. */
    @NativeType("unsigned char")
    public boolean get_area_memlocation() { return nget_area_memlocation(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_membind_support} instance for the specified memory address. */
    public static hwloc_topology_membind_support create(long address) {
        return new hwloc_topology_membind_support(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_membind_support createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_membind_support(address, null);
    }

    /**
     * Create a {@link hwloc_topology_membind_support.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_membind_support.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_membind_support.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #set_thisproc_membind}. */
    public static boolean nset_thisproc_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.SET_THISPROC_MEMBIND) != 0; }
    /** Unsafe version of {@link #get_thisproc_membind}. */
    public static boolean nget_thisproc_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.GET_THISPROC_MEMBIND) != 0; }
    /** Unsafe version of {@link #set_proc_membind}. */
    public static boolean nset_proc_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.SET_PROC_MEMBIND) != 0; }
    /** Unsafe version of {@link #get_proc_membind}. */
    public static boolean nget_proc_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.GET_PROC_MEMBIND) != 0; }
    /** Unsafe version of {@link #set_thisthread_membind}. */
    public static boolean nset_thisthread_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.SET_THISTHREAD_MEMBIND) != 0; }
    /** Unsafe version of {@link #get_thisthread_membind}. */
    public static boolean nget_thisthread_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.GET_THISTHREAD_MEMBIND) != 0; }
    /** Unsafe version of {@link #set_area_membind}. */
    public static boolean nset_area_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.SET_AREA_MEMBIND) != 0; }
    /** Unsafe version of {@link #get_area_membind}. */
    public static boolean nget_area_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.GET_AREA_MEMBIND) != 0; }
    /** Unsafe version of {@link #alloc_membind}. */
    public static boolean nalloc_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.ALLOC_MEMBIND) != 0; }
    /** Unsafe version of {@link #firsttouch_membind}. */
    public static boolean nfirsttouch_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.FIRSTTOUCH_MEMBIND) != 0; }
    /** Unsafe version of {@link #bind_membind}. */
    public static boolean nbind_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.BIND_MEMBIND) != 0; }
    /** Unsafe version of {@link #interleave_membind}. */
    public static boolean ninterleave_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.INTERLEAVE_MEMBIND) != 0; }
    /** Unsafe version of {@link #nexttouch_membind}. */
    public static boolean nnexttouch_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.NEXTTOUCH_MEMBIND) != 0; }
    /** Unsafe version of {@link #migrate_membind}. */
    public static boolean nmigrate_membind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.MIGRATE_MEMBIND) != 0; }
    /** Unsafe version of {@link #get_area_memlocation}. */
    public static boolean nget_area_memlocation(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_membind_support.GET_AREA_MEMLOCATION) != 0; }

    // -----------------------------------

    /** An array of {@link hwloc_topology_membind_support} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_membind_support, Buffer> {

        private static final hwloc_topology_membind_support ELEMENT_FACTORY = hwloc_topology_membind_support.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_membind_support.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_membind_support#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_membind_support getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code set_thisproc_membind} field. */
        @NativeType("unsigned char")
        public boolean set_thisproc_membind() { return hwloc_topology_membind_support.nset_thisproc_membind(address()); }
        /** @return the value of the {@code get_thisproc_membind} field. */
        @NativeType("unsigned char")
        public boolean get_thisproc_membind() { return hwloc_topology_membind_support.nget_thisproc_membind(address()); }
        /** @return the value of the {@code set_proc_membind} field. */
        @NativeType("unsigned char")
        public boolean set_proc_membind() { return hwloc_topology_membind_support.nset_proc_membind(address()); }
        /** @return the value of the {@code get_proc_membind} field. */
        @NativeType("unsigned char")
        public boolean get_proc_membind() { return hwloc_topology_membind_support.nget_proc_membind(address()); }
        /** @return the value of the {@code set_thisthread_membind} field. */
        @NativeType("unsigned char")
        public boolean set_thisthread_membind() { return hwloc_topology_membind_support.nset_thisthread_membind(address()); }
        /** @return the value of the {@code get_thisthread_membind} field. */
        @NativeType("unsigned char")
        public boolean get_thisthread_membind() { return hwloc_topology_membind_support.nget_thisthread_membind(address()); }
        /** @return the value of the {@code set_area_membind} field. */
        @NativeType("unsigned char")
        public boolean set_area_membind() { return hwloc_topology_membind_support.nset_area_membind(address()); }
        /** @return the value of the {@code get_area_membind} field. */
        @NativeType("unsigned char")
        public boolean get_area_membind() { return hwloc_topology_membind_support.nget_area_membind(address()); }
        /** @return the value of the {@code alloc_membind} field. */
        @NativeType("unsigned char")
        public boolean alloc_membind() { return hwloc_topology_membind_support.nalloc_membind(address()); }
        /** @return the value of the {@code firsttouch_membind} field. */
        @NativeType("unsigned char")
        public boolean firsttouch_membind() { return hwloc_topology_membind_support.nfirsttouch_membind(address()); }
        /** @return the value of the {@code bind_membind} field. */
        @NativeType("unsigned char")
        public boolean bind_membind() { return hwloc_topology_membind_support.nbind_membind(address()); }
        /** @return the value of the {@code interleave_membind} field. */
        @NativeType("unsigned char")
        public boolean interleave_membind() { return hwloc_topology_membind_support.ninterleave_membind(address()); }
        /** @return the value of the {@code nexttouch_membind} field. */
        @NativeType("unsigned char")
        public boolean nexttouch_membind() { return hwloc_topology_membind_support.nnexttouch_membind(address()); }
        /** @return the value of the {@code migrate_membind} field. */
        @NativeType("unsigned char")
        public boolean migrate_membind() { return hwloc_topology_membind_support.nmigrate_membind(address()); }
        /** @return the value of the {@code get_area_memlocation} field. */
        @NativeType("unsigned char")
        public boolean get_area_memlocation() { return hwloc_topology_membind_support.nget_area_memlocation(address()); }

    }

}