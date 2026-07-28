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
 * struct XrUnpersistSpatialEntityCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialPersistenceContextResultEXT unpersistResult;
 * }}</pre>
 */
public class XrUnpersistSpatialEntityCompletionEXT extends Struct<XrUnpersistSpatialEntityCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        UNPERSISTRESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        UNPERSISTRESULT = layout.offsetof(3);
    }

    protected XrUnpersistSpatialEntityCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrUnpersistSpatialEntityCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrUnpersistSpatialEntityCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrUnpersistSpatialEntityCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUnpersistSpatialEntityCompletionEXT(ByteBuffer container) {
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
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code unpersistResult} field. */
    @NativeType("XrSpatialPersistenceContextResultEXT")
    public int unpersistResult() { return nunpersistResult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrUnpersistSpatialEntityCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT} value to the {@code type} field. */
    public XrUnpersistSpatialEntityCompletionEXT type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrUnpersistSpatialEntityCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrUnpersistSpatialEntityCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code unpersistResult} field. */
    public XrUnpersistSpatialEntityCompletionEXT unpersistResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { nunpersistResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrUnpersistSpatialEntityCompletionEXT set(
        int type,
        long next,
        int futureResult,
        int unpersistResult
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        unpersistResult(unpersistResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUnpersistSpatialEntityCompletionEXT set(XrUnpersistSpatialEntityCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUnpersistSpatialEntityCompletionEXT malloc() {
        return new XrUnpersistSpatialEntityCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUnpersistSpatialEntityCompletionEXT calloc() {
        return new XrUnpersistSpatialEntityCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrUnpersistSpatialEntityCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrUnpersistSpatialEntityCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance for the specified memory address. */
    public static XrUnpersistSpatialEntityCompletionEXT create(long address) {
        return new XrUnpersistSpatialEntityCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrUnpersistSpatialEntityCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrUnpersistSpatialEntityCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrUnpersistSpatialEntityCompletionEXT}. */
    public static XrUnpersistSpatialEntityCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrUnpersistSpatialEntityCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrUnpersistSpatialEntityCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrUnpersistSpatialEntityCompletionEXT.Buffer}. */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrUnpersistSpatialEntityCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUnpersistSpatialEntityCompletionEXT malloc(MemoryStack stack) {
        return new XrUnpersistSpatialEntityCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrUnpersistSpatialEntityCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUnpersistSpatialEntityCompletionEXT calloc(MemoryStack stack) {
        return new XrUnpersistSpatialEntityCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUnpersistSpatialEntityCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUnpersistSpatialEntityCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrUnpersistSpatialEntityCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrUnpersistSpatialEntityCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrUnpersistSpatialEntityCompletionEXT.FUTURERESULT); }
    /** Unsafe version of {@link #unpersistResult}. */
    public static int nunpersistResult(long struct) { return memGetInt(struct + XrUnpersistSpatialEntityCompletionEXT.UNPERSISTRESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrUnpersistSpatialEntityCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrUnpersistSpatialEntityCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrUnpersistSpatialEntityCompletionEXT.FUTURERESULT, value); }
    /** Unsafe version of {@link #unpersistResult(int) unpersistResult}. */
    public static void nunpersistResult(long struct, int value) { memPutInt(struct + XrUnpersistSpatialEntityCompletionEXT.UNPERSISTRESULT, value); }

    // -----------------------------------

    /** An array of {@link XrUnpersistSpatialEntityCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrUnpersistSpatialEntityCompletionEXT, Buffer> implements NativeResource {

        private static final XrUnpersistSpatialEntityCompletionEXT ELEMENT_FACTORY = XrUnpersistSpatialEntityCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrUnpersistSpatialEntityCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUnpersistSpatialEntityCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrUnpersistSpatialEntityCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrUnpersistSpatialEntityCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrUnpersistSpatialEntityCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrUnpersistSpatialEntityCompletionEXT.nfutureResult(address()); }
        /** @return the value of the {@code unpersistResult} field. */
        @NativeType("XrSpatialPersistenceContextResultEXT")
        public int unpersistResult() { return XrUnpersistSpatialEntityCompletionEXT.nunpersistResult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrUnpersistSpatialEntityCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrUnpersistSpatialEntityCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT} value to the {@code type} field. */
        public XrUnpersistSpatialEntityCompletionEXT.Buffer type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrUnpersistSpatialEntityCompletionEXT.Buffer next(@NativeType("void *") long value) { XrUnpersistSpatialEntityCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrUnpersistSpatialEntityCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrUnpersistSpatialEntityCompletionEXT.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code unpersistResult} field. */
        public XrUnpersistSpatialEntityCompletionEXT.Buffer unpersistResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { XrUnpersistSpatialEntityCompletionEXT.nunpersistResult(address(), value); return this; }

    }

}