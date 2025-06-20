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
 * struct XrSpatialBufferGetInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialBufferIdEXT bufferId;
 * }}</pre>
 */
public class XrSpatialBufferGetInfoEXT extends Struct<XrSpatialBufferGetInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BUFFERID = layout.offsetof(2);
    }

    protected XrSpatialBufferGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialBufferGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialBufferGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialBufferGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialBufferGetInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code bufferId} field. */
    @NativeType("XrSpatialBufferIdEXT")
    public long bufferId() { return nbufferId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialBufferGetInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_BUFFER_GET_INFO_EXT TYPE_SPATIAL_BUFFER_GET_INFO_EXT} value to the {@code type} field. */
    public XrSpatialBufferGetInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_BUFFER_GET_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialBufferGetInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferId} field. */
    public XrSpatialBufferGetInfoEXT bufferId(@NativeType("XrSpatialBufferIdEXT") long value) { nbufferId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialBufferGetInfoEXT set(
        int type,
        long next,
        long bufferId
    ) {
        type(type);
        next(next);
        bufferId(bufferId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialBufferGetInfoEXT set(XrSpatialBufferGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialBufferGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialBufferGetInfoEXT malloc() {
        return new XrSpatialBufferGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBufferGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialBufferGetInfoEXT calloc() {
        return new XrSpatialBufferGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBufferGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialBufferGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialBufferGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialBufferGetInfoEXT} instance for the specified memory address. */
    public static XrSpatialBufferGetInfoEXT create(long address) {
        return new XrSpatialBufferGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialBufferGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialBufferGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialBufferGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBufferGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBufferGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialBufferGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialBufferGetInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialBufferGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBufferGetInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialBufferGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialBufferGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBufferGetInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialBufferGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialBufferGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBufferGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBufferGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialBufferGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialBufferGetInfoEXT.NEXT); }
    /** Unsafe version of {@link #bufferId}. */
    public static long nbufferId(long struct) { return memGetLong(struct + XrSpatialBufferGetInfoEXT.BUFFERID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialBufferGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialBufferGetInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #bufferId(long) bufferId}. */
    public static void nbufferId(long struct, long value) { memPutLong(struct + XrSpatialBufferGetInfoEXT.BUFFERID, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialBufferGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialBufferGetInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialBufferGetInfoEXT ELEMENT_FACTORY = XrSpatialBufferGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialBufferGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialBufferGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialBufferGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialBufferGetInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialBufferGetInfoEXT.nnext(address()); }
        /** @return the value of the {@code bufferId} field. */
        @NativeType("XrSpatialBufferIdEXT")
        public long bufferId() { return XrSpatialBufferGetInfoEXT.nbufferId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialBufferGetInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialBufferGetInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_BUFFER_GET_INFO_EXT TYPE_SPATIAL_BUFFER_GET_INFO_EXT} value to the {@code type} field. */
        public XrSpatialBufferGetInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_BUFFER_GET_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialBufferGetInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialBufferGetInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferId} field. */
        public XrSpatialBufferGetInfoEXT.Buffer bufferId(@NativeType("XrSpatialBufferIdEXT") long value) { XrSpatialBufferGetInfoEXT.nbufferId(address(), value); return this; }

    }

}