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
 * struct hwloc_topology_cpubind_support {
 *     unsigned char set_thisproc_cpubind;
 *     unsigned char get_thisproc_cpubind;
 *     unsigned char set_proc_cpubind;
 *     unsigned char get_proc_cpubind;
 *     unsigned char set_thisthread_cpubind;
 *     unsigned char get_thisthread_cpubind;
 *     unsigned char set_thread_cpubind;
 *     unsigned char get_thread_cpubind;
 *     unsigned char get_thisproc_last_cpu_location;
 *     unsigned char get_proc_last_cpu_location;
 *     unsigned char get_thisthread_last_cpu_location;
 * }</code></pre>
 */
@NativeType("struct hwloc_topology_cpubind_support")
public class hwloc_topology_cpubind_support extends Struct<hwloc_topology_cpubind_support> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SET_THISPROC_CPUBIND,
        GET_THISPROC_CPUBIND,
        SET_PROC_CPUBIND,
        GET_PROC_CPUBIND,
        SET_THISTHREAD_CPUBIND,
        GET_THISTHREAD_CPUBIND,
        SET_THREAD_CPUBIND,
        GET_THREAD_CPUBIND,
        GET_THISPROC_LAST_CPU_LOCATION,
        GET_PROC_LAST_CPU_LOCATION,
        GET_THISTHREAD_LAST_CPU_LOCATION;

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
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SET_THISPROC_CPUBIND = layout.offsetof(0);
        GET_THISPROC_CPUBIND = layout.offsetof(1);
        SET_PROC_CPUBIND = layout.offsetof(2);
        GET_PROC_CPUBIND = layout.offsetof(3);
        SET_THISTHREAD_CPUBIND = layout.offsetof(4);
        GET_THISTHREAD_CPUBIND = layout.offsetof(5);
        SET_THREAD_CPUBIND = layout.offsetof(6);
        GET_THREAD_CPUBIND = layout.offsetof(7);
        GET_THISPROC_LAST_CPU_LOCATION = layout.offsetof(8);
        GET_PROC_LAST_CPU_LOCATION = layout.offsetof(9);
        GET_THISTHREAD_LAST_CPU_LOCATION = layout.offsetof(10);
    }

    protected hwloc_topology_cpubind_support(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_cpubind_support create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_cpubind_support(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_cpubind_support} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_cpubind_support(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code set_thisproc_cpubind} field. */
    @NativeType("unsigned char")
    public boolean set_thisproc_cpubind() { return nset_thisproc_cpubind(address()); }
    /** @return the value of the {@code get_thisproc_cpubind} field. */
    @NativeType("unsigned char")
    public boolean get_thisproc_cpubind() { return nget_thisproc_cpubind(address()); }
    /** @return the value of the {@code set_proc_cpubind} field. */
    @NativeType("unsigned char")
    public boolean set_proc_cpubind() { return nset_proc_cpubind(address()); }
    /** @return the value of the {@code get_proc_cpubind} field. */
    @NativeType("unsigned char")
    public boolean get_proc_cpubind() { return nget_proc_cpubind(address()); }
    /** @return the value of the {@code set_thisthread_cpubind} field. */
    @NativeType("unsigned char")
    public boolean set_thisthread_cpubind() { return nset_thisthread_cpubind(address()); }
    /** @return the value of the {@code get_thisthread_cpubind} field. */
    @NativeType("unsigned char")
    public boolean get_thisthread_cpubind() { return nget_thisthread_cpubind(address()); }
    /** @return the value of the {@code set_thread_cpubind} field. */
    @NativeType("unsigned char")
    public boolean set_thread_cpubind() { return nset_thread_cpubind(address()); }
    /** @return the value of the {@code get_thread_cpubind} field. */
    @NativeType("unsigned char")
    public boolean get_thread_cpubind() { return nget_thread_cpubind(address()); }
    /** @return the value of the {@code get_thisproc_last_cpu_location} field. */
    @NativeType("unsigned char")
    public boolean get_thisproc_last_cpu_location() { return nget_thisproc_last_cpu_location(address()); }
    /** @return the value of the {@code get_proc_last_cpu_location} field. */
    @NativeType("unsigned char")
    public boolean get_proc_last_cpu_location() { return nget_proc_last_cpu_location(address()); }
    /** @return the value of the {@code get_thisthread_last_cpu_location} field. */
    @NativeType("unsigned char")
    public boolean get_thisthread_last_cpu_location() { return nget_thisthread_last_cpu_location(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_cpubind_support} instance for the specified memory address. */
    public static hwloc_topology_cpubind_support create(long address) {
        return new hwloc_topology_cpubind_support(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_cpubind_support createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_cpubind_support(address, null);
    }

    /**
     * Create a {@link hwloc_topology_cpubind_support.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_cpubind_support.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_cpubind_support.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #set_thisproc_cpubind}. */
    public static boolean nset_thisproc_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.SET_THISPROC_CPUBIND) != 0; }
    /** Unsafe version of {@link #get_thisproc_cpubind}. */
    public static boolean nget_thisproc_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_THISPROC_CPUBIND) != 0; }
    /** Unsafe version of {@link #set_proc_cpubind}. */
    public static boolean nset_proc_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.SET_PROC_CPUBIND) != 0; }
    /** Unsafe version of {@link #get_proc_cpubind}. */
    public static boolean nget_proc_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_PROC_CPUBIND) != 0; }
    /** Unsafe version of {@link #set_thisthread_cpubind}. */
    public static boolean nset_thisthread_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.SET_THISTHREAD_CPUBIND) != 0; }
    /** Unsafe version of {@link #get_thisthread_cpubind}. */
    public static boolean nget_thisthread_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_THISTHREAD_CPUBIND) != 0; }
    /** Unsafe version of {@link #set_thread_cpubind}. */
    public static boolean nset_thread_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.SET_THREAD_CPUBIND) != 0; }
    /** Unsafe version of {@link #get_thread_cpubind}. */
    public static boolean nget_thread_cpubind(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_THREAD_CPUBIND) != 0; }
    /** Unsafe version of {@link #get_thisproc_last_cpu_location}. */
    public static boolean nget_thisproc_last_cpu_location(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_THISPROC_LAST_CPU_LOCATION) != 0; }
    /** Unsafe version of {@link #get_proc_last_cpu_location}. */
    public static boolean nget_proc_last_cpu_location(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_PROC_LAST_CPU_LOCATION) != 0; }
    /** Unsafe version of {@link #get_thisthread_last_cpu_location}. */
    public static boolean nget_thisthread_last_cpu_location(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_cpubind_support.GET_THISTHREAD_LAST_CPU_LOCATION) != 0; }

    // -----------------------------------

    /** An array of {@link hwloc_topology_cpubind_support} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_cpubind_support, Buffer> {

        private static final hwloc_topology_cpubind_support ELEMENT_FACTORY = hwloc_topology_cpubind_support.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_cpubind_support.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_cpubind_support#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_cpubind_support getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code set_thisproc_cpubind} field. */
        @NativeType("unsigned char")
        public boolean set_thisproc_cpubind() { return hwloc_topology_cpubind_support.nset_thisproc_cpubind(address()); }
        /** @return the value of the {@code get_thisproc_cpubind} field. */
        @NativeType("unsigned char")
        public boolean get_thisproc_cpubind() { return hwloc_topology_cpubind_support.nget_thisproc_cpubind(address()); }
        /** @return the value of the {@code set_proc_cpubind} field. */
        @NativeType("unsigned char")
        public boolean set_proc_cpubind() { return hwloc_topology_cpubind_support.nset_proc_cpubind(address()); }
        /** @return the value of the {@code get_proc_cpubind} field. */
        @NativeType("unsigned char")
        public boolean get_proc_cpubind() { return hwloc_topology_cpubind_support.nget_proc_cpubind(address()); }
        /** @return the value of the {@code set_thisthread_cpubind} field. */
        @NativeType("unsigned char")
        public boolean set_thisthread_cpubind() { return hwloc_topology_cpubind_support.nset_thisthread_cpubind(address()); }
        /** @return the value of the {@code get_thisthread_cpubind} field. */
        @NativeType("unsigned char")
        public boolean get_thisthread_cpubind() { return hwloc_topology_cpubind_support.nget_thisthread_cpubind(address()); }
        /** @return the value of the {@code set_thread_cpubind} field. */
        @NativeType("unsigned char")
        public boolean set_thread_cpubind() { return hwloc_topology_cpubind_support.nset_thread_cpubind(address()); }
        /** @return the value of the {@code get_thread_cpubind} field. */
        @NativeType("unsigned char")
        public boolean get_thread_cpubind() { return hwloc_topology_cpubind_support.nget_thread_cpubind(address()); }
        /** @return the value of the {@code get_thisproc_last_cpu_location} field. */
        @NativeType("unsigned char")
        public boolean get_thisproc_last_cpu_location() { return hwloc_topology_cpubind_support.nget_thisproc_last_cpu_location(address()); }
        /** @return the value of the {@code get_proc_last_cpu_location} field. */
        @NativeType("unsigned char")
        public boolean get_proc_last_cpu_location() { return hwloc_topology_cpubind_support.nget_proc_last_cpu_location(address()); }
        /** @return the value of the {@code get_thisthread_last_cpu_location} field. */
        @NativeType("unsigned char")
        public boolean get_thisthread_last_cpu_location() { return hwloc_topology_cpubind_support.nget_thisthread_last_cpu_location(address()); }

    }

}