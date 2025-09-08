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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrSpatialEntityUnpersistInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuid XrUuid} persistUuid;
 * }</code></pre>
 */
public class XrSpatialEntityUnpersistInfoEXT extends Struct<XrSpatialEntityUnpersistInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PERSISTUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PERSISTUUID = layout.offsetof(2);
    }

    protected XrSpatialEntityUnpersistInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityUnpersistInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityUnpersistInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityUnpersistInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityUnpersistInfoEXT(ByteBuffer container) {
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
    /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
    public XrUuid persistUuid() { return npersistUuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityUnpersistInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT} value to the {@code type} field. */
    public XrSpatialEntityUnpersistInfoEXT type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityUnpersistInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
    public XrSpatialEntityUnpersistInfoEXT persistUuid(XrUuid value) { npersistUuid(address(), value); return this; }
    /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityUnpersistInfoEXT persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityUnpersistInfoEXT set(
        int type,
        long next,
        XrUuid persistUuid
    ) {
        type(type);
        next(next);
        persistUuid(persistUuid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityUnpersistInfoEXT set(XrSpatialEntityUnpersistInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityUnpersistInfoEXT malloc() {
        return new XrSpatialEntityUnpersistInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityUnpersistInfoEXT calloc() {
        return new XrSpatialEntityUnpersistInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityUnpersistInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityUnpersistInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance for the specified memory address. */
    public static XrSpatialEntityUnpersistInfoEXT create(long address) {
        return new XrSpatialEntityUnpersistInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityUnpersistInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityUnpersistInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityUnpersistInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityUnpersistInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialEntityUnpersistInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityUnpersistInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityUnpersistInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialEntityUnpersistInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityUnpersistInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityUnpersistInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityUnpersistInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityUnpersistInfoEXT.NEXT); }
    /** Unsafe version of {@link #persistUuid}. */
    public static XrUuid npersistUuid(long struct) { return XrUuid.create(struct + XrSpatialEntityUnpersistInfoEXT.PERSISTUUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityUnpersistInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityUnpersistInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #persistUuid(XrUuid) persistUuid}. */
    public static void npersistUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrSpatialEntityUnpersistInfoEXT.PERSISTUUID, XrUuid.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityUnpersistInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityUnpersistInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialEntityUnpersistInfoEXT ELEMENT_FACTORY = XrSpatialEntityUnpersistInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityUnpersistInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityUnpersistInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityUnpersistInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityUnpersistInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityUnpersistInfoEXT.nnext(address()); }
        /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
        public XrUuid persistUuid() { return XrSpatialEntityUnpersistInfoEXT.npersistUuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityUnpersistInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityUnpersistInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT} value to the {@code type} field. */
        public XrSpatialEntityUnpersistInfoEXT.Buffer type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityUnpersistInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityUnpersistInfoEXT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
        public XrSpatialEntityUnpersistInfoEXT.Buffer persistUuid(XrUuid value) { XrSpatialEntityUnpersistInfoEXT.npersistUuid(address(), value); return this; }
        /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityUnpersistInfoEXT.Buffer persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }

    }

}