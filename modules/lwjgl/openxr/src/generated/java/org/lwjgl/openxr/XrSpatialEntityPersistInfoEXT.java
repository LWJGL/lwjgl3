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
 * <pre>{@code
 * struct XrSpatialEntityPersistInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialContextEXT spatialContext;
 *     XrSpatialEntityIdEXT spatialEntityId;
 * }}</pre>
 */
public class XrSpatialEntityPersistInfoEXT extends Struct<XrSpatialEntityPersistInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPATIALCONTEXT,
        SPATIALENTITYID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPATIALCONTEXT = layout.offsetof(2);
        SPATIALENTITYID = layout.offsetof(3);
    }

    protected XrSpatialEntityPersistInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityPersistInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityPersistInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityPersistInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityPersistInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code spatialContext} field. */
    @NativeType("XrSpatialContextEXT")
    public long spatialContext() { return nspatialContext(address()); }
    /** @return the value of the {@code spatialEntityId} field. */
    @NativeType("XrSpatialEntityIdEXT")
    public long spatialEntityId() { return nspatialEntityId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityPersistInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT} value to the {@code type} field. */
    public XrSpatialEntityPersistInfoEXT type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityPersistInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code spatialContext} field. */
    public XrSpatialEntityPersistInfoEXT spatialContext(XrSpatialContextEXT value) { nspatialContext(address(), value); return this; }
    /** Sets the specified value to the {@code spatialEntityId} field. */
    public XrSpatialEntityPersistInfoEXT spatialEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { nspatialEntityId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityPersistInfoEXT set(
        int type,
        long next,
        XrSpatialContextEXT spatialContext,
        long spatialEntityId
    ) {
        type(type);
        next(next);
        spatialContext(spatialContext);
        spatialEntityId(spatialEntityId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityPersistInfoEXT set(XrSpatialEntityPersistInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityPersistInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityPersistInfoEXT malloc() {
        return new XrSpatialEntityPersistInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityPersistInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityPersistInfoEXT calloc() {
        return new XrSpatialEntityPersistInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityPersistInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityPersistInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityPersistInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityPersistInfoEXT} instance for the specified memory address. */
    public static XrSpatialEntityPersistInfoEXT create(long address) {
        return new XrSpatialEntityPersistInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityPersistInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityPersistInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityPersistInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityPersistInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityPersistInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityPersistInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityPersistInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityPersistInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityPersistInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialEntityPersistInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityPersistInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityPersistInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialEntityPersistInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityPersistInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityPersistInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityPersistInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityPersistInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityPersistInfoEXT.NEXT); }
    /** Unsafe version of {@link #spatialContext}. */
    public static long nspatialContext(long struct) { return memGetAddress(struct + XrSpatialEntityPersistInfoEXT.SPATIALCONTEXT); }
    /** Unsafe version of {@link #spatialEntityId}. */
    public static long nspatialEntityId(long struct) { return memGetLong(struct + XrSpatialEntityPersistInfoEXT.SPATIALENTITYID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityPersistInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityPersistInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #spatialContext(XrSpatialContextEXT) spatialContext}. */
    public static void nspatialContext(long struct, XrSpatialContextEXT value) { memPutAddress(struct + XrSpatialEntityPersistInfoEXT.SPATIALCONTEXT, value.address()); }
    /** Unsafe version of {@link #spatialEntityId(long) spatialEntityId}. */
    public static void nspatialEntityId(long struct, long value) { memPutLong(struct + XrSpatialEntityPersistInfoEXT.SPATIALENTITYID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialEntityPersistInfoEXT.SPATIALCONTEXT));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityPersistInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityPersistInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialEntityPersistInfoEXT ELEMENT_FACTORY = XrSpatialEntityPersistInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityPersistInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityPersistInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityPersistInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityPersistInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityPersistInfoEXT.nnext(address()); }
        /** @return the value of the {@code spatialContext} field. */
        @NativeType("XrSpatialContextEXT")
        public long spatialContext() { return XrSpatialEntityPersistInfoEXT.nspatialContext(address()); }
        /** @return the value of the {@code spatialEntityId} field. */
        @NativeType("XrSpatialEntityIdEXT")
        public long spatialEntityId() { return XrSpatialEntityPersistInfoEXT.nspatialEntityId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityPersistInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityPersistInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT} value to the {@code type} field. */
        public XrSpatialEntityPersistInfoEXT.Buffer type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityPersistInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityPersistInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code spatialContext} field. */
        public XrSpatialEntityPersistInfoEXT.Buffer spatialContext(XrSpatialContextEXT value) { XrSpatialEntityPersistInfoEXT.nspatialContext(address(), value); return this; }
        /** Sets the specified value to the {@code spatialEntityId} field. */
        public XrSpatialEntityPersistInfoEXT.Buffer spatialEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { XrSpatialEntityPersistInfoEXT.nspatialEntityId(address(), value); return this; }

    }

}