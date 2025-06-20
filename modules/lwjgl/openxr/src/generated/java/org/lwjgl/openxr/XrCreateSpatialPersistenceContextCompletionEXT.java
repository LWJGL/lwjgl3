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
 * struct XrCreateSpatialPersistenceContextCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialPersistenceContextResultEXT createResult;
 *     XrSpatialPersistenceContextEXT persistenceContext;
 * }}</pre>
 */
public class XrCreateSpatialPersistenceContextCompletionEXT extends Struct<XrCreateSpatialPersistenceContextCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        CREATERESULT,
        PERSISTENCECONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        CREATERESULT = layout.offsetof(3);
        PERSISTENCECONTEXT = layout.offsetof(4);
    }

    protected XrCreateSpatialPersistenceContextCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateSpatialPersistenceContextCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrCreateSpatialPersistenceContextCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrCreateSpatialPersistenceContextCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateSpatialPersistenceContextCompletionEXT(ByteBuffer container) {
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
    /** @return the value of the {@code createResult} field. */
    @NativeType("XrSpatialPersistenceContextResultEXT")
    public int createResult() { return ncreateResult(address()); }
    /** @return the value of the {@code persistenceContext} field. */
    @NativeType("XrSpatialPersistenceContextEXT")
    public long persistenceContext() { return npersistenceContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPersistence#XR_TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT} value to the {@code type} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT type$Default() { return type(EXTSpatialPersistence.XR_TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code createResult} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT createResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { ncreateResult(address(), value); return this; }
    /** Sets the specified value to the {@code persistenceContext} field. */
    public XrCreateSpatialPersistenceContextCompletionEXT persistenceContext(XrSpatialPersistenceContextEXT value) { npersistenceContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateSpatialPersistenceContextCompletionEXT set(
        int type,
        long next,
        int futureResult,
        int createResult,
        XrSpatialPersistenceContextEXT persistenceContext
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        createResult(createResult);
        persistenceContext(persistenceContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateSpatialPersistenceContextCompletionEXT set(XrCreateSpatialPersistenceContextCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialPersistenceContextCompletionEXT malloc() {
        return new XrCreateSpatialPersistenceContextCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialPersistenceContextCompletionEXT calloc() {
        return new XrCreateSpatialPersistenceContextCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrCreateSpatialPersistenceContextCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateSpatialPersistenceContextCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance for the specified memory address. */
    public static XrCreateSpatialPersistenceContextCompletionEXT create(long address) {
        return new XrCreateSpatialPersistenceContextCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateSpatialPersistenceContextCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrCreateSpatialPersistenceContextCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrCreateSpatialPersistenceContextCompletionEXT}. */
    public static XrCreateSpatialPersistenceContextCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrCreateSpatialPersistenceContextCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateSpatialPersistenceContextCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrCreateSpatialPersistenceContextCompletionEXT.Buffer}. */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrCreateSpatialPersistenceContextCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT malloc(MemoryStack stack) {
        return new XrCreateSpatialPersistenceContextCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateSpatialPersistenceContextCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT calloc(MemoryStack stack) {
        return new XrCreateSpatialPersistenceContextCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialPersistenceContextCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateSpatialPersistenceContextCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.FUTURERESULT); }
    /** Unsafe version of {@link #createResult}. */
    public static int ncreateResult(long struct) { return memGetInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.CREATERESULT); }
    /** Unsafe version of {@link #persistenceContext}. */
    public static long npersistenceContext(long struct) { return memGetAddress(struct + XrCreateSpatialPersistenceContextCompletionEXT.PERSISTENCECONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateSpatialPersistenceContextCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.FUTURERESULT, value); }
    /** Unsafe version of {@link #createResult(int) createResult}. */
    public static void ncreateResult(long struct, int value) { memPutInt(struct + XrCreateSpatialPersistenceContextCompletionEXT.CREATERESULT, value); }
    /** Unsafe version of {@link #persistenceContext(XrSpatialPersistenceContextEXT) persistenceContext}. */
    public static void npersistenceContext(long struct, XrSpatialPersistenceContextEXT value) { memPutAddress(struct + XrCreateSpatialPersistenceContextCompletionEXT.PERSISTENCECONTEXT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCreateSpatialPersistenceContextCompletionEXT.PERSISTENCECONTEXT));
    }

    // -----------------------------------

    /** An array of {@link XrCreateSpatialPersistenceContextCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrCreateSpatialPersistenceContextCompletionEXT, Buffer> implements NativeResource {

        private static final XrCreateSpatialPersistenceContextCompletionEXT ELEMENT_FACTORY = XrCreateSpatialPersistenceContextCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateSpatialPersistenceContextCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateSpatialPersistenceContextCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateSpatialPersistenceContextCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCreateSpatialPersistenceContextCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrCreateSpatialPersistenceContextCompletionEXT.nfutureResult(address()); }
        /** @return the value of the {@code createResult} field. */
        @NativeType("XrSpatialPersistenceContextResultEXT")
        public int createResult() { return XrCreateSpatialPersistenceContextCompletionEXT.ncreateResult(address()); }
        /** @return the value of the {@code persistenceContext} field. */
        @NativeType("XrSpatialPersistenceContextEXT")
        public long persistenceContext() { return XrCreateSpatialPersistenceContextCompletionEXT.npersistenceContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrCreateSpatialPersistenceContextCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPersistence#XR_TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT} value to the {@code type} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer type$Default() { return type(EXTSpatialPersistence.XR_TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer next(@NativeType("void *") long value) { XrCreateSpatialPersistenceContextCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrCreateSpatialPersistenceContextCompletionEXT.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code createResult} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer createResult(@NativeType("XrSpatialPersistenceContextResultEXT") int value) { XrCreateSpatialPersistenceContextCompletionEXT.ncreateResult(address(), value); return this; }
        /** Sets the specified value to the {@code persistenceContext} field. */
        public XrCreateSpatialPersistenceContextCompletionEXT.Buffer persistenceContext(XrSpatialPersistenceContextEXT value) { XrCreateSpatialPersistenceContextCompletionEXT.npersistenceContext(address(), value); return this; }

    }

}