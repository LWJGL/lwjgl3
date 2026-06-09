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
 * struct XrStationaryReferenceSpaceGenerationIdResultEXT {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuid XrUuid} generationId;
 * }</code></pre>
 */
public class XrStationaryReferenceSpaceGenerationIdResultEXT extends Struct<XrStationaryReferenceSpaceGenerationIdResultEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GENERATIONID;

    static {
        XrUuid.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GENERATIONID = layout.offsetof(2);
    }

    protected XrStationaryReferenceSpaceGenerationIdResultEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrStationaryReferenceSpaceGenerationIdResultEXT create(long address, @Nullable ByteBuffer container) {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(address, container);
    }

    /**
     * Creates a {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrStationaryReferenceSpaceGenerationIdResultEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return a {@link XrUuid} view of the {@code generationId} field. */
    public XrUuid generationId() { return ngenerationId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTStationaryReferenceSpace#XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT} value to the {@code type} field. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT type$Default() { return type(EXTStationaryReferenceSpace.XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code generationId} field. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT generationId(XrUuid value) { ngenerationId(address(), value); return this; }
    /** Passes the {@code generationId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT generationId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(generationId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrStationaryReferenceSpaceGenerationIdResultEXT set(
        int type,
        long next,
        XrUuid generationId
    ) {
        type(type);
        next(next);
        generationId(generationId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrStationaryReferenceSpaceGenerationIdResultEXT set(XrStationaryReferenceSpaceGenerationIdResultEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT malloc() {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT calloc() {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance allocated with {@link BufferUtils}. */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance for the specified memory address. */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT create(long address) {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrStationaryReferenceSpaceGenerationIdResultEXT createSafe(long address) {
        return address == NULL ? null : new XrStationaryReferenceSpaceGenerationIdResultEXT(address, null);
    }

    /**
     * Returns a new {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT malloc(MemoryStack stack) {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT calloc(MemoryStack stack) {
        return new XrStationaryReferenceSpaceGenerationIdResultEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrStationaryReferenceSpaceGenerationIdResultEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrStationaryReferenceSpaceGenerationIdResultEXT.NEXT); }
    /** Unsafe version of {@link #generationId}. */
    public static XrUuid ngenerationId(long struct) { return XrUuid.create(struct + XrStationaryReferenceSpaceGenerationIdResultEXT.GENERATIONID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrStationaryReferenceSpaceGenerationIdResultEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrStationaryReferenceSpaceGenerationIdResultEXT.NEXT, value); }
    /** Unsafe version of {@link #generationId(XrUuid) generationId}. */
    public static void ngenerationId(long struct, XrUuid value) { memCopy(value.address(), struct + XrStationaryReferenceSpaceGenerationIdResultEXT.GENERATIONID, XrUuid.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrStationaryReferenceSpaceGenerationIdResultEXT} structs. */
    public static class Buffer extends StructBuffer<XrStationaryReferenceSpaceGenerationIdResultEXT, Buffer> implements NativeResource {

        private static final XrStationaryReferenceSpaceGenerationIdResultEXT ELEMENT_FACTORY = XrStationaryReferenceSpaceGenerationIdResultEXT.create(-1L);

        /**
         * Creates a new {@code XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrStationaryReferenceSpaceGenerationIdResultEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrStationaryReferenceSpaceGenerationIdResultEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrStationaryReferenceSpaceGenerationIdResultEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrStationaryReferenceSpaceGenerationIdResultEXT.nnext(address()); }
        /** @return a {@link XrUuid} view of the {@code generationId} field. */
        public XrUuid generationId() { return XrStationaryReferenceSpaceGenerationIdResultEXT.ngenerationId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer type(@NativeType("XrStructureType") int value) { XrStationaryReferenceSpaceGenerationIdResultEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTStationaryReferenceSpace#XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT} value to the {@code type} field. */
        public XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer type$Default() { return type(EXTStationaryReferenceSpace.XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer next(@NativeType("void *") long value) { XrStationaryReferenceSpaceGenerationIdResultEXT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code generationId} field. */
        public XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer generationId(XrUuid value) { XrStationaryReferenceSpaceGenerationIdResultEXT.ngenerationId(address(), value); return this; }
        /** Passes the {@code generationId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrStationaryReferenceSpaceGenerationIdResultEXT.Buffer generationId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(generationId()); return this; }

    }

}