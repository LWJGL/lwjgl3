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
 * struct XrCreateTrackableImageDatabaseCompletionANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrTrackableImageDatabaseANDROID database;
 * }}</pre>
 */
public class XrCreateTrackableImageDatabaseCompletionANDROID extends Struct<XrCreateTrackableImageDatabaseCompletionANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        DATABASE;

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
        FUTURERESULT = layout.offsetof(2);
        DATABASE = layout.offsetof(3);
    }

    protected XrCreateTrackableImageDatabaseCompletionANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateTrackableImageDatabaseCompletionANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(address, container);
    }

    /**
     * Creates a {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateTrackableImageDatabaseCompletionANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code database} field. */
    @NativeType("XrTrackableImageDatabaseANDROID")
    public long database() { return ndatabase(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateTrackableImageDatabaseCompletionANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID} value to the {@code type} field. */
    public XrCreateTrackableImageDatabaseCompletionANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateTrackableImageDatabaseCompletionANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrCreateTrackableImageDatabaseCompletionANDROID futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code database} field. */
    public XrCreateTrackableImageDatabaseCompletionANDROID database(XrTrackableImageDatabaseANDROID value) { ndatabase(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateTrackableImageDatabaseCompletionANDROID set(
        int type,
        long next,
        int futureResult,
        XrTrackableImageDatabaseANDROID database
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        database(database);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateTrackableImageDatabaseCompletionANDROID set(XrCreateTrackableImageDatabaseCompletionANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID malloc() {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID calloc() {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance allocated with {@link BufferUtils}. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateTrackableImageDatabaseCompletionANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance for the specified memory address. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID create(long address) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateTrackableImageDatabaseCompletionANDROID createSafe(long address) {
        return address == NULL ? null : new XrCreateTrackableImageDatabaseCompletionANDROID(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrCreateTrackableImageDatabaseCompletionANDROID}. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrCreateTrackableImageDatabaseCompletionANDROID.Buffer}. */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID malloc(MemoryStack stack) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID calloc(MemoryStack stack) {
        return new XrCreateTrackableImageDatabaseCompletionANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateTrackableImageDatabaseCompletionANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateTrackableImageDatabaseCompletionANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateTrackableImageDatabaseCompletionANDROID.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrCreateTrackableImageDatabaseCompletionANDROID.FUTURERESULT); }
    /** Unsafe version of {@link #database}. */
    public static long ndatabase(long struct) { return memGetAddress(struct + XrCreateTrackableImageDatabaseCompletionANDROID.DATABASE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateTrackableImageDatabaseCompletionANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateTrackableImageDatabaseCompletionANDROID.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrCreateTrackableImageDatabaseCompletionANDROID.FUTURERESULT, value); }
    /** Unsafe version of {@link #database(XrTrackableImageDatabaseANDROID) database}. */
    public static void ndatabase(long struct, XrTrackableImageDatabaseANDROID value) { memPutAddress(struct + XrCreateTrackableImageDatabaseCompletionANDROID.DATABASE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCreateTrackableImageDatabaseCompletionANDROID.DATABASE));
    }

    // -----------------------------------

    /** An array of {@link XrCreateTrackableImageDatabaseCompletionANDROID} structs. */
    public static class Buffer extends StructBuffer<XrCreateTrackableImageDatabaseCompletionANDROID, Buffer> implements NativeResource {

        private static final XrCreateTrackableImageDatabaseCompletionANDROID ELEMENT_FACTORY = XrCreateTrackableImageDatabaseCompletionANDROID.create(-1L);

        /**
         * Creates a new {@code XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateTrackableImageDatabaseCompletionANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateTrackableImageDatabaseCompletionANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateTrackableImageDatabaseCompletionANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCreateTrackableImageDatabaseCompletionANDROID.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrCreateTrackableImageDatabaseCompletionANDROID.nfutureResult(address()); }
        /** @return the value of the {@code database} field. */
        @NativeType("XrTrackableImageDatabaseANDROID")
        public long database() { return XrCreateTrackableImageDatabaseCompletionANDROID.ndatabase(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateTrackableImageDatabaseCompletionANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrCreateTrackableImageDatabaseCompletionANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID} value to the {@code type} field. */
        public XrCreateTrackableImageDatabaseCompletionANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateTrackableImageDatabaseCompletionANDROID.Buffer next(@NativeType("void *") long value) { XrCreateTrackableImageDatabaseCompletionANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrCreateTrackableImageDatabaseCompletionANDROID.Buffer futureResult(@NativeType("XrResult") int value) { XrCreateTrackableImageDatabaseCompletionANDROID.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code database} field. */
        public XrCreateTrackableImageDatabaseCompletionANDROID.Buffer database(XrTrackableImageDatabaseANDROID value) { XrCreateTrackableImageDatabaseCompletionANDROID.ndatabase(address(), value); return this; }

    }

}