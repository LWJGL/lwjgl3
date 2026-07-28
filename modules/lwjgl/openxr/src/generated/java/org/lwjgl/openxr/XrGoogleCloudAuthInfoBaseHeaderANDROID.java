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
 * struct XrGoogleCloudAuthInfoBaseHeaderANDROID {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrGoogleCloudAuthInfoBaseHeaderANDROID extends Struct<XrGoogleCloudAuthInfoBaseHeaderANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrGoogleCloudAuthInfoBaseHeaderANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGoogleCloudAuthInfoBaseHeaderANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(address, container);
    }

    /**
     * Creates a {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrGoogleCloudAuthErrorResultANDROID} value to the {@code next} chain. */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID next(XrGoogleCloudAuthErrorResultANDROID value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGoogleCloudAuthInfoBaseHeaderANDROID set(XrGoogleCloudAuthInfoBaseHeaderANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID malloc() {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID calloc() {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance for the specified memory address. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID create(long address) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGoogleCloudAuthInfoBaseHeaderANDROID createSafe(long address) {
        return address == NULL ? null : new XrGoogleCloudAuthInfoBaseHeaderANDROID(address, null);
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID create(XrGoogleCloudAuthInfoApiKeyANDROID value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoTokenANDROID} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID create(XrGoogleCloudAuthInfoTokenANDROID value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoKeylessANDROID} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID create(XrGoogleCloudAuthInfoKeylessANDROID value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer create(XrGoogleCloudAuthInfoApiKeyANDROID.Buffer value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer create(XrGoogleCloudAuthInfoTokenANDROID.Buffer value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrGoogleCloudAuthInfoKeylessANDROID.Buffer} instance to {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer}. */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer create(XrGoogleCloudAuthInfoKeylessANDROID.Buffer value) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID malloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID calloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoBaseHeaderANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGoogleCloudAuthInfoBaseHeaderANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGoogleCloudAuthInfoBaseHeaderANDROID.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGoogleCloudAuthInfoBaseHeaderANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGoogleCloudAuthInfoBaseHeaderANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrGoogleCloudAuthInfoBaseHeaderANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGoogleCloudAuthInfoBaseHeaderANDROID, Buffer> implements NativeResource {

        private static final XrGoogleCloudAuthInfoBaseHeaderANDROID ELEMENT_FACTORY = XrGoogleCloudAuthInfoBaseHeaderANDROID.create(-1L);

        /**
         * Creates a new {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGoogleCloudAuthInfoBaseHeaderANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGoogleCloudAuthInfoBaseHeaderANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGoogleCloudAuthInfoBaseHeaderANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGoogleCloudAuthInfoBaseHeaderANDROID.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGoogleCloudAuthInfoBaseHeaderANDROID.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer next(@NativeType("void const *") long value) { XrGoogleCloudAuthInfoBaseHeaderANDROID.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrGoogleCloudAuthErrorResultANDROID} value to the {@code next} chain. */
        public XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer next(XrGoogleCloudAuthErrorResultANDROID value) { return this.next(value.next(this.next()).address()); }

    }

}