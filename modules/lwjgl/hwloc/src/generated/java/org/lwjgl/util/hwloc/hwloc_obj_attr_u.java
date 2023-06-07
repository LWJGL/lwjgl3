/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union struct hwloc_obj_attr_u {
 *     {@link hwloc_numanode_attr_s hwloc_numanode_attr_s} numanode;
 *     {@link hwloc_cache_attr_s hwloc_cache_attr_s} cache;
 *     {@link hwloc_group_attr_s hwloc_group_attr_s} group;
 *     {@link hwloc_pcidev_attr_s hwloc_pcidev_attr_s} pcidev;
 *     {@link hwloc_bridge_attr_s hwloc_bridge_attr_s} bridge;
 *     {@link hwloc_osdev_attr_s hwloc_osdev_attr_s} osdev;
 * }</code></pre>
 */
@NativeType("union struct hwloc_obj_attr_u")
public class hwloc_obj_attr_u extends Struct<hwloc_obj_attr_u> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMANODE,
        CACHE,
        GROUP,
        PCIDEV,
        BRIDGE,
        OSDEV;

    static {
        Layout layout = __union(
            __member(hwloc_numanode_attr_s.SIZEOF, hwloc_numanode_attr_s.ALIGNOF),
            __member(hwloc_cache_attr_s.SIZEOF, hwloc_cache_attr_s.ALIGNOF),
            __member(hwloc_group_attr_s.SIZEOF, hwloc_group_attr_s.ALIGNOF),
            __member(hwloc_pcidev_attr_s.SIZEOF, hwloc_pcidev_attr_s.ALIGNOF),
            __member(hwloc_bridge_attr_s.SIZEOF, hwloc_bridge_attr_s.ALIGNOF),
            __member(hwloc_osdev_attr_s.SIZEOF, hwloc_osdev_attr_s.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMANODE = layout.offsetof(0);
        CACHE = layout.offsetof(1);
        GROUP = layout.offsetof(2);
        PCIDEV = layout.offsetof(3);
        BRIDGE = layout.offsetof(4);
        OSDEV = layout.offsetof(5);
    }

    protected hwloc_obj_attr_u(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_obj_attr_u create(long address, @Nullable ByteBuffer container) {
        return new hwloc_obj_attr_u(address, container);
    }

    /**
     * Creates a {@code hwloc_obj_attr_u} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_obj_attr_u(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link hwloc_numanode_attr_s} view of the {@code numanode} field. */
    public hwloc_numanode_attr_s numanode() { return nnumanode(address()); }
    /** @return a {@link hwloc_cache_attr_s} view of the {@code cache} field. */
    public hwloc_cache_attr_s cache() { return ncache(address()); }
    /** @return a {@link hwloc_group_attr_s} view of the {@code group} field. */
    public hwloc_group_attr_s group() { return ngroup(address()); }
    /** @return a {@link hwloc_pcidev_attr_s} view of the {@code pcidev} field. */
    public hwloc_pcidev_attr_s pcidev() { return npcidev(address()); }
    /** @return a {@link hwloc_bridge_attr_s} view of the {@code bridge} field. */
    public hwloc_bridge_attr_s bridge() { return nbridge(address()); }
    /** @return a {@link hwloc_osdev_attr_s} view of the {@code osdev} field. */
    public hwloc_osdev_attr_s osdev() { return nosdev(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_obj_attr_u} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hwloc_obj_attr_u malloc() {
        return new hwloc_obj_attr_u(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hwloc_obj_attr_u} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hwloc_obj_attr_u calloc() {
        return new hwloc_obj_attr_u(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hwloc_obj_attr_u} instance allocated with {@link BufferUtils}. */
    public static hwloc_obj_attr_u create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hwloc_obj_attr_u(memAddress(container), container);
    }

    /** Returns a new {@code hwloc_obj_attr_u} instance for the specified memory address. */
    public static hwloc_obj_attr_u create(long address) {
        return new hwloc_obj_attr_u(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_obj_attr_u createSafe(long address) {
        return address == NULL ? null : new hwloc_obj_attr_u(address, null);
    }

    /**
     * Returns a new {@link hwloc_obj_attr_u.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj_attr_u.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj_attr_u.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hwloc_obj_attr_u.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_obj_attr_u.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hwloc_obj_attr_u} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_obj_attr_u malloc(MemoryStack stack) {
        return new hwloc_obj_attr_u(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hwloc_obj_attr_u} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_obj_attr_u calloc(MemoryStack stack) {
        return new hwloc_obj_attr_u(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hwloc_obj_attr_u.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_obj_attr_u.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_obj_attr_u.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numanode}. */
    public static hwloc_numanode_attr_s nnumanode(long struct) { return hwloc_numanode_attr_s.create(struct + hwloc_obj_attr_u.NUMANODE); }
    /** Unsafe version of {@link #cache}. */
    public static hwloc_cache_attr_s ncache(long struct) { return hwloc_cache_attr_s.create(struct + hwloc_obj_attr_u.CACHE); }
    /** Unsafe version of {@link #group}. */
    public static hwloc_group_attr_s ngroup(long struct) { return hwloc_group_attr_s.create(struct + hwloc_obj_attr_u.GROUP); }
    /** Unsafe version of {@link #pcidev}. */
    public static hwloc_pcidev_attr_s npcidev(long struct) { return hwloc_pcidev_attr_s.create(struct + hwloc_obj_attr_u.PCIDEV); }
    /** Unsafe version of {@link #bridge}. */
    public static hwloc_bridge_attr_s nbridge(long struct) { return hwloc_bridge_attr_s.create(struct + hwloc_obj_attr_u.BRIDGE); }
    /** Unsafe version of {@link #osdev}. */
    public static hwloc_osdev_attr_s nosdev(long struct) { return hwloc_osdev_attr_s.create(struct + hwloc_obj_attr_u.OSDEV); }

    // -----------------------------------

    /** An array of {@link hwloc_obj_attr_u} structs. */
    public static class Buffer extends StructBuffer<hwloc_obj_attr_u, Buffer> implements NativeResource {

        private static final hwloc_obj_attr_u ELEMENT_FACTORY = hwloc_obj_attr_u.create(-1L);

        /**
         * Creates a new {@code hwloc_obj_attr_u.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_obj_attr_u#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_obj_attr_u getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link hwloc_numanode_attr_s} view of the {@code numanode} field. */
        public hwloc_numanode_attr_s numanode() { return hwloc_obj_attr_u.nnumanode(address()); }
        /** @return a {@link hwloc_cache_attr_s} view of the {@code cache} field. */
        public hwloc_cache_attr_s cache() { return hwloc_obj_attr_u.ncache(address()); }
        /** @return a {@link hwloc_group_attr_s} view of the {@code group} field. */
        public hwloc_group_attr_s group() { return hwloc_obj_attr_u.ngroup(address()); }
        /** @return a {@link hwloc_pcidev_attr_s} view of the {@code pcidev} field. */
        public hwloc_pcidev_attr_s pcidev() { return hwloc_obj_attr_u.npcidev(address()); }
        /** @return a {@link hwloc_bridge_attr_s} view of the {@code bridge} field. */
        public hwloc_bridge_attr_s bridge() { return hwloc_obj_attr_u.nbridge(address()); }
        /** @return a {@link hwloc_osdev_attr_s} view of the {@code osdev} field. */
        public hwloc_osdev_attr_s osdev() { return hwloc_obj_attr_u.nosdev(address()); }

    }

}