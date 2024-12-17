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
 * struct XrEventDataSpaceSetStatusCompleteFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 *     XrResult result;
 *     XrSpace space;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrSpaceComponentTypeFB componentType;
 *     XrBool32 enabled;
 * }}</pre>
 */
public class XrEventDataSpaceSetStatusCompleteFB extends Struct<XrEventDataSpaceSetStatusCompleteFB> implements NativeResource {

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
        COMPONENTTYPE,
        ENABLED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4),
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
        COMPONENTTYPE = layout.offsetof(6);
        ENABLED = layout.offsetof(7);
    }

    protected XrEventDataSpaceSetStatusCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceSetStatusCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceSetStatusCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceSetStatusCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceSetStatusCompleteFB(ByteBuffer container) {
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
    /** @return the value of the {@code componentType} field. */
    @NativeType("XrSpaceComponentTypeFB")
    public int componentType() { return ncomponentType(address()); }
    /** @return the value of the {@code enabled} field. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSpaceSetStatusCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB} value to the {@code type} field. */
    public XrEventDataSpaceSetStatusCompleteFB type$Default() { return type(FBSpatialEntity.XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSpaceSetStatusCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceSetStatusCompleteFB set(
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
    public XrEventDataSpaceSetStatusCompleteFB set(XrEventDataSpaceSetStatusCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceSetStatusCompleteFB malloc() {
        return new XrEventDataSpaceSetStatusCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceSetStatusCompleteFB calloc() {
        return new XrEventDataSpaceSetStatusCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceSetStatusCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceSetStatusCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceSetStatusCompleteFB create(long address) {
        return new XrEventDataSpaceSetStatusCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSpaceSetStatusCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceSetStatusCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceSetStatusCompleteFB}. */
    public static XrEventDataSpaceSetStatusCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceSetStatusCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSpaceSetStatusCompleteFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceSetStatusCompleteFB.Buffer}. */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceSetStatusCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceSetStatusCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceSetStatusCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceSetStatusCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceSetStatusCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceSetStatusCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSetStatusCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSetStatusCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSpaceSetStatusCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceSetStatusCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataSpaceSetStatusCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataSpaceSetStatusCompleteFB.RESULT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrEventDataSpaceSetStatusCompleteFB.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrEventDataSpaceSetStatusCompleteFB.UUID); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return memGetInt(struct + XrEventDataSpaceSetStatusCompleteFB.COMPONENTTYPE); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrEventDataSpaceSetStatusCompleteFB.ENABLED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSpaceSetStatusCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceSetStatusCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceSetStatusCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceSetStatusCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceSetStatusCompleteFB ELEMENT_FACTORY = XrEventDataSpaceSetStatusCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceSetStatusCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceSetStatusCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceSetStatusCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceSetStatusCompleteFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceSetStatusCompleteFB.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceSetStatusCompleteFB.nrequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceSetStatusCompleteFB.nresult(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrEventDataSpaceSetStatusCompleteFB.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrEventDataSpaceSetStatusCompleteFB.nuuid(address()); }
        /** @return the value of the {@code componentType} field. */
        @NativeType("XrSpaceComponentTypeFB")
        public int componentType() { return XrEventDataSpaceSetStatusCompleteFB.ncomponentType(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrEventDataSpaceSetStatusCompleteFB.nenabled(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSpaceSetStatusCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceSetStatusCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB} value to the {@code type} field. */
        public XrEventDataSpaceSetStatusCompleteFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSpaceSetStatusCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceSetStatusCompleteFB.nnext(address(), value); return this; }

    }

}