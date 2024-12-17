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
 * struct XrSpaceGroupUuidFilterInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuid XrUuid} groupUuid;
 * }}</pre>
 */
public class XrSpaceGroupUuidFilterInfoMETA extends Struct<XrSpaceGroupUuidFilterInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GROUPUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GROUPUUID = layout.offsetof(2);
    }

    protected XrSpaceGroupUuidFilterInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceGroupUuidFilterInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceGroupUuidFilterInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceGroupUuidFilterInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceGroupUuidFilterInfoMETA(ByteBuffer container) {
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
    /** @return a {@link XrUuid} view of the {@code groupUuid} field. */
    public XrUuid groupUuid() { return ngroupUuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceGroupUuidFilterInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META TYPE_SPACE_GROUP_UUID_FILTER_INFO_META} value to the {@code type} field. */
    public XrSpaceGroupUuidFilterInfoMETA type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceGroupUuidFilterInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code groupUuid} field. */
    public XrSpaceGroupUuidFilterInfoMETA groupUuid(XrUuid value) { ngroupUuid(address(), value); return this; }
    /** Passes the {@code groupUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceGroupUuidFilterInfoMETA groupUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(groupUuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceGroupUuidFilterInfoMETA set(
        int type,
        long next,
        XrUuid groupUuid
    ) {
        type(type);
        next(next);
        groupUuid(groupUuid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceGroupUuidFilterInfoMETA set(XrSpaceGroupUuidFilterInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceGroupUuidFilterInfoMETA malloc() {
        return new XrSpaceGroupUuidFilterInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceGroupUuidFilterInfoMETA calloc() {
        return new XrSpaceGroupUuidFilterInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceGroupUuidFilterInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceGroupUuidFilterInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance for the specified memory address. */
    public static XrSpaceGroupUuidFilterInfoMETA create(long address) {
        return new XrSpaceGroupUuidFilterInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceGroupUuidFilterInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceGroupUuidFilterInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceGroupUuidFilterInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceGroupUuidFilterInfoMETA malloc(MemoryStack stack) {
        return new XrSpaceGroupUuidFilterInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceGroupUuidFilterInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceGroupUuidFilterInfoMETA calloc(MemoryStack stack) {
        return new XrSpaceGroupUuidFilterInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceGroupUuidFilterInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceGroupUuidFilterInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceGroupUuidFilterInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceGroupUuidFilterInfoMETA.NEXT); }
    /** Unsafe version of {@link #groupUuid}. */
    public static XrUuid ngroupUuid(long struct) { return XrUuid.create(struct + XrSpaceGroupUuidFilterInfoMETA.GROUPUUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceGroupUuidFilterInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceGroupUuidFilterInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #groupUuid(XrUuid) groupUuid}. */
    public static void ngroupUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrSpaceGroupUuidFilterInfoMETA.GROUPUUID, XrUuid.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpaceGroupUuidFilterInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceGroupUuidFilterInfoMETA, Buffer> implements NativeResource {

        private static final XrSpaceGroupUuidFilterInfoMETA ELEMENT_FACTORY = XrSpaceGroupUuidFilterInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceGroupUuidFilterInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceGroupUuidFilterInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceGroupUuidFilterInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceGroupUuidFilterInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceGroupUuidFilterInfoMETA.nnext(address()); }
        /** @return a {@link XrUuid} view of the {@code groupUuid} field. */
        public XrUuid groupUuid() { return XrSpaceGroupUuidFilterInfoMETA.ngroupUuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceGroupUuidFilterInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceGroupUuidFilterInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META TYPE_SPACE_GROUP_UUID_FILTER_INFO_META} value to the {@code type} field. */
        public XrSpaceGroupUuidFilterInfoMETA.Buffer type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceGroupUuidFilterInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceGroupUuidFilterInfoMETA.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code groupUuid} field. */
        public XrSpaceGroupUuidFilterInfoMETA.Buffer groupUuid(XrUuid value) { XrSpaceGroupUuidFilterInfoMETA.ngroupUuid(address(), value); return this; }
        /** Passes the {@code groupUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceGroupUuidFilterInfoMETA.Buffer groupUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(groupUuid()); return this; }

    }

}