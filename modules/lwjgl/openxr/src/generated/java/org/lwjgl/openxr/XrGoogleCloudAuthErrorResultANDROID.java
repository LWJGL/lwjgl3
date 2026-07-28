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
 * struct XrGoogleCloudAuthErrorResultANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrGoogleCloudAuthErrorANDROID error;
 * }}</pre>
 */
public class XrGoogleCloudAuthErrorResultANDROID extends Struct<XrGoogleCloudAuthErrorResultANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ERROR;

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
        ERROR = layout.offsetof(2);
    }

    protected XrGoogleCloudAuthErrorResultANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGoogleCloudAuthErrorResultANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGoogleCloudAuthErrorResultANDROID(address, container);
    }

    /**
     * Creates a {@code XrGoogleCloudAuthErrorResultANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGoogleCloudAuthErrorResultANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code error} field. */
    @NativeType("XrGoogleCloudAuthErrorANDROID")
    public int error() { return nerror(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGoogleCloudAuthErrorResultANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID} value to the {@code type} field. */
    public XrGoogleCloudAuthErrorResultANDROID type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGoogleCloudAuthErrorResultANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code error} field. */
    public XrGoogleCloudAuthErrorResultANDROID error(@NativeType("XrGoogleCloudAuthErrorANDROID") int value) { nerror(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGoogleCloudAuthErrorResultANDROID set(
        int type,
        long next,
        int error
    ) {
        type(type);
        next(next);
        error(error);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGoogleCloudAuthErrorResultANDROID set(XrGoogleCloudAuthErrorResultANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthErrorResultANDROID malloc() {
        return new XrGoogleCloudAuthErrorResultANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthErrorResultANDROID calloc() {
        return new XrGoogleCloudAuthErrorResultANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGoogleCloudAuthErrorResultANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGoogleCloudAuthErrorResultANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance for the specified memory address. */
    public static XrGoogleCloudAuthErrorResultANDROID create(long address) {
        return new XrGoogleCloudAuthErrorResultANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGoogleCloudAuthErrorResultANDROID createSafe(long address) {
        return address == NULL ? null : new XrGoogleCloudAuthErrorResultANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGoogleCloudAuthErrorResultANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthErrorResultANDROID malloc(MemoryStack stack) {
        return new XrGoogleCloudAuthErrorResultANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthErrorResultANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthErrorResultANDROID calloc(MemoryStack stack) {
        return new XrGoogleCloudAuthErrorResultANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthErrorResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthErrorResultANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGoogleCloudAuthErrorResultANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGoogleCloudAuthErrorResultANDROID.NEXT); }
    /** Unsafe version of {@link #error}. */
    public static int nerror(long struct) { return memGetInt(struct + XrGoogleCloudAuthErrorResultANDROID.ERROR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGoogleCloudAuthErrorResultANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGoogleCloudAuthErrorResultANDROID.NEXT, value); }
    /** Unsafe version of {@link #error(int) error}. */
    public static void nerror(long struct, int value) { memPutInt(struct + XrGoogleCloudAuthErrorResultANDROID.ERROR, value); }

    // -----------------------------------

    /** An array of {@link XrGoogleCloudAuthErrorResultANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGoogleCloudAuthErrorResultANDROID, Buffer> implements NativeResource {

        private static final XrGoogleCloudAuthErrorResultANDROID ELEMENT_FACTORY = XrGoogleCloudAuthErrorResultANDROID.create(-1L);

        /**
         * Creates a new {@code XrGoogleCloudAuthErrorResultANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGoogleCloudAuthErrorResultANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGoogleCloudAuthErrorResultANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGoogleCloudAuthErrorResultANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrGoogleCloudAuthErrorResultANDROID.nnext(address()); }
        /** @return the value of the {@code error} field. */
        @NativeType("XrGoogleCloudAuthErrorANDROID")
        public int error() { return XrGoogleCloudAuthErrorResultANDROID.nerror(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGoogleCloudAuthErrorResultANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGoogleCloudAuthErrorResultANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID} value to the {@code type} field. */
        public XrGoogleCloudAuthErrorResultANDROID.Buffer type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGoogleCloudAuthErrorResultANDROID.Buffer next(@NativeType("void *") long value) { XrGoogleCloudAuthErrorResultANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code error} field. */
        public XrGoogleCloudAuthErrorResultANDROID.Buffer error(@NativeType("XrGoogleCloudAuthErrorANDROID") int value) { XrGoogleCloudAuthErrorResultANDROID.nerror(address(), value); return this; }

    }

}