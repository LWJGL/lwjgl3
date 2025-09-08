/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrSpatialDiscoveryPersistenceUuidFilterEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t persistedUuidCount;
 *     {@link XrUuid XrUuid} const * persistedUuids;
 * }</code></pre>
 */
public class XrSpatialDiscoveryPersistenceUuidFilterEXT extends Struct<XrSpatialDiscoveryPersistenceUuidFilterEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PERSISTEDUUIDCOUNT,
        PERSISTEDUUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PERSISTEDUUIDCOUNT = layout.offsetof(2);
        PERSISTEDUUIDS = layout.offsetof(3);
    }

    protected XrSpatialDiscoveryPersistenceUuidFilterEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialDiscoveryPersistenceUuidFilterEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code persistedUuidCount} field. */
    @NativeType("uint32_t")
    public int persistedUuidCount() { return npersistedUuidCount(address()); }
    /** @return a {@link XrUuid.Buffer} view of the struct array pointed to by the {@code persistedUuids} field. */
    @NativeType("XrUuid const *")
    public XrUuid.Buffer persistedUuids() { return npersistedUuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT} value to the {@code type} field. */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuid.Buffer} to the {@code persistedUuids} field. */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT persistedUuids(@NativeType("XrUuid const *") XrUuid.Buffer value) { npersistedUuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT set(
        int type,
        long next,
        XrUuid.Buffer persistedUuids
    ) {
        type(type);
        next(next);
        persistedUuids(persistedUuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialDiscoveryPersistenceUuidFilterEXT set(XrSpatialDiscoveryPersistenceUuidFilterEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT malloc() {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT calloc() {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance for the specified memory address. */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT create(long address) {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialDiscoveryPersistenceUuidFilterEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialDiscoveryPersistenceUuidFilterEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT malloc(MemoryStack stack) {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT calloc(MemoryStack stack) {
        return new XrSpatialDiscoveryPersistenceUuidFilterEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.NEXT); }
    /** Unsafe version of {@link #persistedUuidCount}. */
    public static int npersistedUuidCount(long struct) { return memGetInt(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.PERSISTEDUUIDCOUNT); }
    /** Unsafe version of {@link #persistedUuids}. */
    public static XrUuid.Buffer npersistedUuids(long struct) { return XrUuid.create(memGetAddress(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.PERSISTEDUUIDS), npersistedUuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.NEXT, value); }
    /** Sets the specified value to the {@code persistedUuidCount} field of the specified {@code struct}. */
    public static void npersistedUuidCount(long struct, int value) { memPutInt(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.PERSISTEDUUIDCOUNT, value); }
    /** Unsafe version of {@link #persistedUuids(XrUuid.Buffer) persistedUuids}. */
    public static void npersistedUuids(long struct, XrUuid.Buffer value) { memPutAddress(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.PERSISTEDUUIDS, value.address()); npersistedUuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialDiscoveryPersistenceUuidFilterEXT.PERSISTEDUUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialDiscoveryPersistenceUuidFilterEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialDiscoveryPersistenceUuidFilterEXT, Buffer> implements NativeResource {

        private static final XrSpatialDiscoveryPersistenceUuidFilterEXT ELEMENT_FACTORY = XrSpatialDiscoveryPersistenceUuidFilterEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialDiscoveryPersistenceUuidFilterEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSpatialDiscoveryPersistenceUuidFilterEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialDiscoveryPersistenceUuidFilterEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialDiscoveryPersistenceUuidFilterEXT.nnext(address()); }
        /** @return the value of the {@code persistedUuidCount} field. */
        @NativeType("uint32_t")
        public int persistedUuidCount() { return XrSpatialDiscoveryPersistenceUuidFilterEXT.npersistedUuidCount(address()); }
        /** @return a {@link XrUuid.Buffer} view of the struct array pointed to by the {@code persistedUuids} field. */
        @NativeType("XrUuid const *")
        public XrUuid.Buffer persistedUuids() { return XrSpatialDiscoveryPersistenceUuidFilterEXT.npersistedUuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialDiscoveryPersistenceUuidFilterEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT} value to the {@code type} field. */
        public XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialDiscoveryPersistenceUuidFilterEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuid.Buffer} to the {@code persistedUuids} field. */
        public XrSpatialDiscoveryPersistenceUuidFilterEXT.Buffer persistedUuids(@NativeType("XrUuid const *") XrUuid.Buffer value) { XrSpatialDiscoveryPersistenceUuidFilterEXT.npersistedUuids(address(), value); return this; }

    }

}