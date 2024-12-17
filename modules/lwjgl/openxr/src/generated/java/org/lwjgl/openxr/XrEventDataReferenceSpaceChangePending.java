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
 * struct XrEventDataReferenceSpaceChangePending {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrReferenceSpaceType referenceSpaceType;
 *     XrTime changeTime;
 *     XrBool32 poseValid;
 *     {@link XrPosef XrPosef} poseInPreviousSpace;
 * }}</pre>
 */
public class XrEventDataReferenceSpaceChangePending extends Struct<XrEventDataReferenceSpaceChangePending> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        REFERENCESPACETYPE,
        CHANGETIME,
        POSEVALID,
        POSEINPREVIOUSSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        REFERENCESPACETYPE = layout.offsetof(3);
        CHANGETIME = layout.offsetof(4);
        POSEVALID = layout.offsetof(5);
        POSEINPREVIOUSSPACE = layout.offsetof(6);
    }

    protected XrEventDataReferenceSpaceChangePending(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataReferenceSpaceChangePending create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataReferenceSpaceChangePending(address, container);
    }

    /**
     * Creates a {@code XrEventDataReferenceSpaceChangePending} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataReferenceSpaceChangePending(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** @return the value of the {@code referenceSpaceType} field. */
    @NativeType("XrReferenceSpaceType")
    public int referenceSpaceType() { return nreferenceSpaceType(address()); }
    /** @return the value of the {@code changeTime} field. */
    @NativeType("XrTime")
    public long changeTime() { return nchangeTime(address()); }
    /** @return the value of the {@code poseValid} field. */
    @NativeType("XrBool32")
    public boolean poseValid() { return nposeValid(address()) != 0; }
    /** @return a {@link XrPosef} view of the {@code poseInPreviousSpace} field. */
    public XrPosef poseInPreviousSpace() { return nposeInPreviousSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataReferenceSpaceChangePending type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING} value to the {@code type} field. */
    public XrEventDataReferenceSpaceChangePending type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataReferenceSpaceChangePending next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataReferenceSpaceChangePending set(
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
    public XrEventDataReferenceSpaceChangePending set(XrEventDataReferenceSpaceChangePending src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending malloc() {
        return new XrEventDataReferenceSpaceChangePending(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataReferenceSpaceChangePending calloc() {
        return new XrEventDataReferenceSpaceChangePending(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated with {@link BufferUtils}. */
    public static XrEventDataReferenceSpaceChangePending create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataReferenceSpaceChangePending(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataReferenceSpaceChangePending} instance for the specified memory address. */
    public static XrEventDataReferenceSpaceChangePending create(long address) {
        return new XrEventDataReferenceSpaceChangePending(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataReferenceSpaceChangePending createSafe(long address) {
        return address == NULL ? null : new XrEventDataReferenceSpaceChangePending(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataReferenceSpaceChangePending}. */
    public static XrEventDataReferenceSpaceChangePending create(XrEventDataBaseHeader value) {
        return new XrEventDataReferenceSpaceChangePending(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataReferenceSpaceChangePending.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataReferenceSpaceChangePending.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataReferenceSpaceChangePending.Buffer}. */
    public static XrEventDataReferenceSpaceChangePending.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataReferenceSpaceChangePending.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending malloc(MemoryStack stack) {
        return new XrEventDataReferenceSpaceChangePending(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataReferenceSpaceChangePending} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataReferenceSpaceChangePending calloc(MemoryStack stack) {
        return new XrEventDataReferenceSpaceChangePending(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataReferenceSpaceChangePending.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataReferenceSpaceChangePending.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataReferenceSpaceChangePending.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataReferenceSpaceChangePending.SESSION); }
    /** Unsafe version of {@link #referenceSpaceType}. */
    public static int nreferenceSpaceType(long struct) { return memGetInt(struct + XrEventDataReferenceSpaceChangePending.REFERENCESPACETYPE); }
    /** Unsafe version of {@link #changeTime}. */
    public static long nchangeTime(long struct) { return memGetLong(struct + XrEventDataReferenceSpaceChangePending.CHANGETIME); }
    /** Unsafe version of {@link #poseValid}. */
    public static int nposeValid(long struct) { return memGetInt(struct + XrEventDataReferenceSpaceChangePending.POSEVALID); }
    /** Unsafe version of {@link #poseInPreviousSpace}. */
    public static XrPosef nposeInPreviousSpace(long struct) { return XrPosef.create(struct + XrEventDataReferenceSpaceChangePending.POSEINPREVIOUSSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataReferenceSpaceChangePending.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataReferenceSpaceChangePending.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataReferenceSpaceChangePending} structs. */
    public static class Buffer extends StructBuffer<XrEventDataReferenceSpaceChangePending, Buffer> implements NativeResource {

        private static final XrEventDataReferenceSpaceChangePending ELEMENT_FACTORY = XrEventDataReferenceSpaceChangePending.create(-1L);

        /**
         * Creates a new {@code XrEventDataReferenceSpaceChangePending.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataReferenceSpaceChangePending#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataReferenceSpaceChangePending getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataReferenceSpaceChangePending.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataReferenceSpaceChangePending.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataReferenceSpaceChangePending.nsession(address()); }
        /** @return the value of the {@code referenceSpaceType} field. */
        @NativeType("XrReferenceSpaceType")
        public int referenceSpaceType() { return XrEventDataReferenceSpaceChangePending.nreferenceSpaceType(address()); }
        /** @return the value of the {@code changeTime} field. */
        @NativeType("XrTime")
        public long changeTime() { return XrEventDataReferenceSpaceChangePending.nchangeTime(address()); }
        /** @return the value of the {@code poseValid} field. */
        @NativeType("XrBool32")
        public boolean poseValid() { return XrEventDataReferenceSpaceChangePending.nposeValid(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@code poseInPreviousSpace} field. */
        public XrPosef poseInPreviousSpace() { return XrEventDataReferenceSpaceChangePending.nposeInPreviousSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataReferenceSpaceChangePending.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING} value to the {@code type} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_REFERENCE_SPACE_CHANGE_PENDING); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataReferenceSpaceChangePending.Buffer next(@NativeType("void const *") long value) { XrEventDataReferenceSpaceChangePending.nnext(address(), value); return this; }

    }

}