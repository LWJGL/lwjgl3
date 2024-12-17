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
 * struct XrEventDataSpaceEraseCompleteFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 *     XrResult result;
 *     XrSpace space;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrSpaceStorageLocationFB location;
 * }}</pre>
 */
public class XrEventDataSpaceEraseCompleteFB extends Struct<XrEventDataSpaceEraseCompleteFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT,
        SPACE,
        UUID,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
        SPACE = layout.offsetof(4);
        UUID = layout.offsetof(5);
        LOCATION = layout.offsetof(6);
    }

    protected XrEventDataSpaceEraseCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceEraseCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceEraseCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceEraseCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceEraseCompleteFB(ByteBuffer container) {
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
    /** @return the value of the {@code requestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** @return the value of the {@code location} field. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSpaceEraseCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB} value to the {@code type} field. */
    public XrEventDataSpaceEraseCompleteFB type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSpaceEraseCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceEraseCompleteFB set(
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
    public XrEventDataSpaceEraseCompleteFB set(XrEventDataSpaceEraseCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceEraseCompleteFB malloc() {
        return new XrEventDataSpaceEraseCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceEraseCompleteFB calloc() {
        return new XrEventDataSpaceEraseCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceEraseCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceEraseCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceEraseCompleteFB create(long address) {
        return new XrEventDataSpaceEraseCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSpaceEraseCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceEraseCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceEraseCompleteFB}. */
    public static XrEventDataSpaceEraseCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceEraseCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSpaceEraseCompleteFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceEraseCompleteFB.Buffer}. */
    public static XrEventDataSpaceEraseCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceEraseCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceEraseCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceEraseCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceEraseCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceEraseCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceEraseCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceEraseCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceEraseCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSpaceEraseCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceEraseCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataSpaceEraseCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataSpaceEraseCompleteFB.RESULT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrEventDataSpaceEraseCompleteFB.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrEventDataSpaceEraseCompleteFB.UUID); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + XrEventDataSpaceEraseCompleteFB.LOCATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSpaceEraseCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceEraseCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceEraseCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceEraseCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceEraseCompleteFB ELEMENT_FACTORY = XrEventDataSpaceEraseCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceEraseCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceEraseCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceEraseCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceEraseCompleteFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceEraseCompleteFB.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceEraseCompleteFB.nrequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceEraseCompleteFB.nresult(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrEventDataSpaceEraseCompleteFB.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrEventDataSpaceEraseCompleteFB.nuuid(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrEventDataSpaceEraseCompleteFB.nlocation(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSpaceEraseCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceEraseCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB} value to the {@code type} field. */
        public XrEventDataSpaceEraseCompleteFB.Buffer type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSpaceEraseCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceEraseCompleteFB.nnext(address(), value); return this; }

    }

}