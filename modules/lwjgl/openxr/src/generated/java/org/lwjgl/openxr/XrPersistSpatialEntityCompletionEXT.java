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
 * struct XrPersistSpatialEntityCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialPersistenceContextResultEXT persistResult;
 *     {@link XrUuid XrUuid} persistUuid;
 * }</code></pre>
 */
public class XrPersistSpatialEntityCompletionEXT extends Struct<XrPersistSpatialEntityCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        PERSISTRESULT,
        PERSISTUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        PERSISTRESULT = layout.offsetof(3);
        PERSISTUUID = layout.offsetof(4);
    }

    protected XrPersistSpatialEntityCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPersistSpatialEntityCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPersistSpatialEntityCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrPersistSpatialEntityCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPersistSpatialEntityCompletionEXT(ByteBuffer container) {
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
    /** @return the value of the {@code persistResult} field. */
    @NativeType("XrSpatialPersistenceContextResultEXT")
    public int persistResult() { return npersistResult(address()); }
    /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
    public XrUuid persistUuid() { return npersistUuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPersistSpatialEntityCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT} value to the {@code type} field. */
    public XrPersistSpatialEntityCompletionEXT type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrPersistSpatialEntityCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrPersistSpatialEntityCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code persistResult} field. */
    public XrPersistSpatialEntityCompletionEXT persistResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { npersistResult(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
    public XrPersistSpatialEntityCompletionEXT persistUuid(XrUuid value) { npersistUuid(address(), value); return this; }
    /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPersistSpatialEntityCompletionEXT persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPersistSpatialEntityCompletionEXT set(
        int type,
        long next,
        int futureResult,
        int persistResult,
        XrUuid persistUuid
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        persistResult(persistResult);
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
    public XrPersistSpatialEntityCompletionEXT set(XrPersistSpatialEntityCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPersistSpatialEntityCompletionEXT malloc() {
        return new XrPersistSpatialEntityCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPersistSpatialEntityCompletionEXT calloc() {
        return new XrPersistSpatialEntityCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrPersistSpatialEntityCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPersistSpatialEntityCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance for the specified memory address. */
    public static XrPersistSpatialEntityCompletionEXT create(long address) {
        return new XrPersistSpatialEntityCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPersistSpatialEntityCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrPersistSpatialEntityCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrPersistSpatialEntityCompletionEXT}. */
    public static XrPersistSpatialEntityCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrPersistSpatialEntityCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPersistSpatialEntityCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrPersistSpatialEntityCompletionEXT.Buffer}. */
    public static XrPersistSpatialEntityCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrPersistSpatialEntityCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistSpatialEntityCompletionEXT malloc(MemoryStack stack) {
        return new XrPersistSpatialEntityCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPersistSpatialEntityCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistSpatialEntityCompletionEXT calloc(MemoryStack stack) {
        return new XrPersistSpatialEntityCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistSpatialEntityCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistSpatialEntityCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPersistSpatialEntityCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPersistSpatialEntityCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrPersistSpatialEntityCompletionEXT.FUTURERESULT); }
    /** Unsafe version of {@link #persistResult}. */
    public static int npersistResult(long struct) { return memGetInt(struct + XrPersistSpatialEntityCompletionEXT.PERSISTRESULT); }
    /** Unsafe version of {@link #persistUuid}. */
    public static XrUuid npersistUuid(long struct) { return XrUuid.create(struct + XrPersistSpatialEntityCompletionEXT.PERSISTUUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPersistSpatialEntityCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPersistSpatialEntityCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrPersistSpatialEntityCompletionEXT.FUTURERESULT, value); }
    /** Unsafe version of {@link #persistResult(int) persistResult}. */
    public static void npersistResult(long struct, int value) { memPutInt(struct + XrPersistSpatialEntityCompletionEXT.PERSISTRESULT, value); }
    /** Unsafe version of {@link #persistUuid(XrUuid) persistUuid}. */
    public static void npersistUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrPersistSpatialEntityCompletionEXT.PERSISTUUID, XrUuid.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrPersistSpatialEntityCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrPersistSpatialEntityCompletionEXT, Buffer> implements NativeResource {

        private static final XrPersistSpatialEntityCompletionEXT ELEMENT_FACTORY = XrPersistSpatialEntityCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrPersistSpatialEntityCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPersistSpatialEntityCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPersistSpatialEntityCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPersistSpatialEntityCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPersistSpatialEntityCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrPersistSpatialEntityCompletionEXT.nfutureResult(address()); }
        /** @return the value of the {@code persistResult} field. */
        @NativeType("XrSpatialPersistenceContextResultEXT")
        public int persistResult() { return XrPersistSpatialEntityCompletionEXT.npersistResult(address()); }
        /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
        public XrUuid persistUuid() { return XrPersistSpatialEntityCompletionEXT.npersistUuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPersistSpatialEntityCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistenceOperations#XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT} value to the {@code type} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer type$Default() { return type(EXTSpatialPersistenceOperations.XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer next(@NativeType("void *") long value) { XrPersistSpatialEntityCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrPersistSpatialEntityCompletionEXT.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code persistResult} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer persistResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { XrPersistSpatialEntityCompletionEXT.npersistResult(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
        public XrPersistSpatialEntityCompletionEXT.Buffer persistUuid(XrUuid value) { XrPersistSpatialEntityCompletionEXT.npersistUuid(address(), value); return this; }
        /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPersistSpatialEntityCompletionEXT.Buffer persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }

    }

}