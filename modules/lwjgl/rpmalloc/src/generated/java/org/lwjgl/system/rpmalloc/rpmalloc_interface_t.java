/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct rpmalloc_interface_t {
 *     void * (* memory_map) (size_t size, size_t alignment, size_t * offset, size_t * mapped_size);
 *     int (* memory_commit) (void * address, size_t size);
 *     int (* memory_decommit) (void * address, size_t size);
 *     void (* memory_unmap) (void * address, size_t offset, size_t mapped_size);
 *     int (* map_fail_callback) (size_t size);
 *     void (* error_callback) (char const * message);
 * }}</pre>
 */
public class rpmalloc_interface_t extends Struct<rpmalloc_interface_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORY_MAP,
        MEMORY_COMMIT,
        MEMORY_DECOMMIT,
        MEMORY_UNMAP,
        MAP_FAIL_CALLBACK,
        ERROR_CALLBACK;

    static {
        java.util.Objects.requireNonNull(rpmalloc_interface_memory_mapI.DESCRIPTOR);
        java.util.Objects.requireNonNull(rpmalloc_interface_memory_commitI.DESCRIPTOR);
        java.util.Objects.requireNonNull(rpmalloc_interface_memory_decommitI.DESCRIPTOR);
        java.util.Objects.requireNonNull(rpmalloc_interface_memory_unmapI.DESCRIPTOR);
        java.util.Objects.requireNonNull(rpmalloc_interface_map_fail_callbackI.DESCRIPTOR);
        java.util.Objects.requireNonNull(rpmalloc_interface_error_callbackI.DESCRIPTOR);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORY_MAP = layout.offsetof(0);
        MEMORY_COMMIT = layout.offsetof(1);
        MEMORY_DECOMMIT = layout.offsetof(2);
        MEMORY_UNMAP = layout.offsetof(3);
        MAP_FAIL_CALLBACK = layout.offsetof(4);
        ERROR_CALLBACK = layout.offsetof(5);
    }

    protected rpmalloc_interface_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected rpmalloc_interface_t create(long address, @Nullable ByteBuffer container) {
        return new rpmalloc_interface_t(address, container);
    }

    /**
     * Creates a {@code rpmalloc_interface_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public rpmalloc_interface_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code memory_map} field. */
    @NativeType("void * (*) (size_t, size_t, size_t *, size_t *)")
    public @Nullable rpmalloc_interface_memory_map memory_map() { return nmemory_map(address()); }
    /** @return the value of the {@code memory_commit} field. */
    @NativeType("int (*) (void *, size_t)")
    public @Nullable rpmalloc_interface_memory_commit memory_commit() { return nmemory_commit(address()); }
    /** @return the value of the {@code memory_decommit} field. */
    @NativeType("int (*) (void *, size_t)")
    public @Nullable rpmalloc_interface_memory_decommit memory_decommit() { return nmemory_decommit(address()); }
    /** @return the value of the {@code memory_unmap} field. */
    @NativeType("void (*) (void *, size_t, size_t)")
    public @Nullable rpmalloc_interface_memory_unmap memory_unmap() { return nmemory_unmap(address()); }
    /** @return the value of the {@code map_fail_callback} field. */
    @NativeType("int (*) (size_t)")
    public @Nullable rpmalloc_interface_map_fail_callback map_fail_callback() { return nmap_fail_callback(address()); }
    /** @return the value of the {@code error_callback} field. */
    @NativeType("void (*) (char const *)")
    public @Nullable rpmalloc_interface_error_callback error_callback() { return nerror_callback(address()); }

    /** Sets the specified value to the {@code memory_map} field. */
    public rpmalloc_interface_t memory_map(@Nullable @NativeType("void * (*) (size_t, size_t, size_t *, size_t *)") rpmalloc_interface_memory_mapI value) { nmemory_map(address(), value); return this; }
    /** Sets the specified value to the {@code memory_commit} field. */
    public rpmalloc_interface_t memory_commit(@Nullable @NativeType("int (*) (void *, size_t)") rpmalloc_interface_memory_commitI value) { nmemory_commit(address(), value); return this; }
    /** Sets the specified value to the {@code memory_decommit} field. */
    public rpmalloc_interface_t memory_decommit(@Nullable @NativeType("int (*) (void *, size_t)") rpmalloc_interface_memory_decommitI value) { nmemory_decommit(address(), value); return this; }
    /** Sets the specified value to the {@code memory_unmap} field. */
    public rpmalloc_interface_t memory_unmap(@Nullable @NativeType("void (*) (void *, size_t, size_t)") rpmalloc_interface_memory_unmapI value) { nmemory_unmap(address(), value); return this; }
    /** Sets the specified value to the {@code map_fail_callback} field. */
    public rpmalloc_interface_t map_fail_callback(@Nullable @NativeType("int (*) (size_t)") rpmalloc_interface_map_fail_callbackI value) { nmap_fail_callback(address(), value); return this; }
    /** Sets the specified value to the {@code error_callback} field. */
    public rpmalloc_interface_t error_callback(@Nullable @NativeType("void (*) (char const *)") rpmalloc_interface_error_callbackI value) { nerror_callback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public rpmalloc_interface_t set(
        rpmalloc_interface_memory_mapI memory_map,
        rpmalloc_interface_memory_commitI memory_commit,
        rpmalloc_interface_memory_decommitI memory_decommit,
        rpmalloc_interface_memory_unmapI memory_unmap,
        rpmalloc_interface_map_fail_callbackI map_fail_callback,
        rpmalloc_interface_error_callbackI error_callback
    ) {
        memory_map(memory_map);
        memory_commit(memory_commit);
        memory_decommit(memory_decommit);
        memory_unmap(memory_unmap);
        map_fail_callback(map_fail_callback);
        error_callback(error_callback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public rpmalloc_interface_t set(rpmalloc_interface_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code rpmalloc_interface_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static rpmalloc_interface_t malloc() {
        return new rpmalloc_interface_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_interface_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static rpmalloc_interface_t calloc() {
        return new rpmalloc_interface_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_interface_t} instance allocated with {@link BufferUtils}. */
    public static rpmalloc_interface_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new rpmalloc_interface_t(memAddress(container), container);
    }

    /** Returns a new {@code rpmalloc_interface_t} instance for the specified memory address. */
    public static rpmalloc_interface_t create(long address) {
        return new rpmalloc_interface_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_t createSafe(long address) {
        return address == NULL ? null : new rpmalloc_interface_t(address, null);
    }

    /**
     * Returns a new {@code rpmalloc_interface_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_interface_t malloc(MemoryStack stack) {
        return new rpmalloc_interface_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code rpmalloc_interface_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_interface_t calloc(MemoryStack stack) {
        return new rpmalloc_interface_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memory_map}. */
    public static @Nullable rpmalloc_interface_memory_map nmemory_map(long struct) { return rpmalloc_interface_memory_map.createSafe(memGetAddress(struct + rpmalloc_interface_t.MEMORY_MAP)); }
    /** Unsafe version of {@link #memory_commit}. */
    public static @Nullable rpmalloc_interface_memory_commit nmemory_commit(long struct) { return rpmalloc_interface_memory_commit.createSafe(memGetAddress(struct + rpmalloc_interface_t.MEMORY_COMMIT)); }
    /** Unsafe version of {@link #memory_decommit}. */
    public static @Nullable rpmalloc_interface_memory_decommit nmemory_decommit(long struct) { return rpmalloc_interface_memory_decommit.createSafe(memGetAddress(struct + rpmalloc_interface_t.MEMORY_DECOMMIT)); }
    /** Unsafe version of {@link #memory_unmap}. */
    public static @Nullable rpmalloc_interface_memory_unmap nmemory_unmap(long struct) { return rpmalloc_interface_memory_unmap.createSafe(memGetAddress(struct + rpmalloc_interface_t.MEMORY_UNMAP)); }
    /** Unsafe version of {@link #map_fail_callback}. */
    public static @Nullable rpmalloc_interface_map_fail_callback nmap_fail_callback(long struct) { return rpmalloc_interface_map_fail_callback.createSafe(memGetAddress(struct + rpmalloc_interface_t.MAP_FAIL_CALLBACK)); }
    /** Unsafe version of {@link #error_callback}. */
    public static @Nullable rpmalloc_interface_error_callback nerror_callback(long struct) { return rpmalloc_interface_error_callback.createSafe(memGetAddress(struct + rpmalloc_interface_t.ERROR_CALLBACK)); }

    /** Unsafe version of {@link #memory_map(rpmalloc_interface_memory_mapI) memory_map}. */
    public static void nmemory_map(long struct, @Nullable rpmalloc_interface_memory_mapI value) { memPutAddress(struct + rpmalloc_interface_t.MEMORY_MAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #memory_commit(rpmalloc_interface_memory_commitI) memory_commit}. */
    public static void nmemory_commit(long struct, @Nullable rpmalloc_interface_memory_commitI value) { memPutAddress(struct + rpmalloc_interface_t.MEMORY_COMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #memory_decommit(rpmalloc_interface_memory_decommitI) memory_decommit}. */
    public static void nmemory_decommit(long struct, @Nullable rpmalloc_interface_memory_decommitI value) { memPutAddress(struct + rpmalloc_interface_t.MEMORY_DECOMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #memory_unmap(rpmalloc_interface_memory_unmapI) memory_unmap}. */
    public static void nmemory_unmap(long struct, @Nullable rpmalloc_interface_memory_unmapI value) { memPutAddress(struct + rpmalloc_interface_t.MEMORY_UNMAP, memAddressSafe(value)); }
    /** Unsafe version of {@link #map_fail_callback(rpmalloc_interface_map_fail_callbackI) map_fail_callback}. */
    public static void nmap_fail_callback(long struct, @Nullable rpmalloc_interface_map_fail_callbackI value) { memPutAddress(struct + rpmalloc_interface_t.MAP_FAIL_CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #error_callback(rpmalloc_interface_error_callbackI) error_callback}. */
    public static void nerror_callback(long struct, @Nullable rpmalloc_interface_error_callbackI value) { memPutAddress(struct + rpmalloc_interface_t.ERROR_CALLBACK, memAddressSafe(value)); }

}