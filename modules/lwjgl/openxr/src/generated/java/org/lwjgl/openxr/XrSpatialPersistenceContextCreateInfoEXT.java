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
 * <pre>{@code
 * struct XrSpatialPersistenceContextCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialPersistenceScopeEXT scope;
 * }}</pre>
 */
public class XrSpatialPersistenceContextCreateInfoEXT extends Struct<XrSpatialPersistenceContextCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SCOPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SCOPE = layout.offsetof(2);
    }

    protected XrSpatialPersistenceContextCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialPersistenceContextCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialPersistenceContextCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialPersistenceContextCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialPersistenceContextCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code scope} field. */
    @NativeType("XrSpatialPersistenceScopeEXT")
    public int scope() { return nscope(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialPersistenceContextCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialPersistenceContextCreateInfoEXT type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialPersistenceContextCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code scope} field. */
    public XrSpatialPersistenceContextCreateInfoEXT scope(@NativeType("XrSpatialPersistenceScopeEXT") int value) { nscope(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialPersistenceContextCreateInfoEXT set(
        int type,
        long next,
        int scope
    ) {
        type(type);
        next(next);
        scope(scope);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialPersistenceContextCreateInfoEXT set(XrSpatialPersistenceContextCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialPersistenceContextCreateInfoEXT malloc() {
        return new XrSpatialPersistenceContextCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialPersistenceContextCreateInfoEXT calloc() {
        return new XrSpatialPersistenceContextCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialPersistenceContextCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialPersistenceContextCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialPersistenceContextCreateInfoEXT create(long address) {
        return new XrSpatialPersistenceContextCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialPersistenceContextCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialPersistenceContextCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialPersistenceContextCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPersistenceContextCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialPersistenceContextCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialPersistenceContextCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPersistenceContextCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialPersistenceContextCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceContextCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialPersistenceContextCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialPersistenceContextCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return memGetInt(struct + XrSpatialPersistenceContextCreateInfoEXT.SCOPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialPersistenceContextCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialPersistenceContextCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #scope(int) scope}. */
    public static void nscope(long struct, int value) { memPutInt(struct + XrSpatialPersistenceContextCreateInfoEXT.SCOPE, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialPersistenceContextCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialPersistenceContextCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialPersistenceContextCreateInfoEXT ELEMENT_FACTORY = XrSpatialPersistenceContextCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialPersistenceContextCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialPersistenceContextCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialPersistenceContextCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialPersistenceContextCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialPersistenceContextCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code scope} field. */
        @NativeType("XrSpatialPersistenceScopeEXT")
        public int scope() { return XrSpatialPersistenceContextCreateInfoEXT.nscope(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialPersistenceContextCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialPersistenceContextCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistence#XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialPersistenceContextCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialPersistence.XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialPersistenceContextCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialPersistenceContextCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code scope} field. */
        public XrSpatialPersistenceContextCreateInfoEXT.Buffer scope(@NativeType("XrSpatialPersistenceScopeEXT") int value) { XrSpatialPersistenceContextCreateInfoEXT.nscope(address(), value); return this; }

    }

}