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
 * struct XrColocationAdvertisementStopInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrColocationAdvertisementStopInfoMETA extends Struct<XrColocationAdvertisementStopInfoMETA> implements NativeResource {

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

    protected XrColocationAdvertisementStopInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColocationAdvertisementStopInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrColocationAdvertisementStopInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrColocationAdvertisementStopInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColocationAdvertisementStopInfoMETA(ByteBuffer container) {
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
    public XrColocationAdvertisementStopInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META} value to the {@code type} field. */
    public XrColocationAdvertisementStopInfoMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrColocationAdvertisementStopInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColocationAdvertisementStopInfoMETA set(
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
    public XrColocationAdvertisementStopInfoMETA set(XrColocationAdvertisementStopInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStopInfoMETA malloc() {
        return new XrColocationAdvertisementStopInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStopInfoMETA calloc() {
        return new XrColocationAdvertisementStopInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrColocationAdvertisementStopInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColocationAdvertisementStopInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance for the specified memory address. */
    public static XrColocationAdvertisementStopInfoMETA create(long address) {
        return new XrColocationAdvertisementStopInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColocationAdvertisementStopInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrColocationAdvertisementStopInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColocationAdvertisementStopInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStopInfoMETA malloc(MemoryStack stack) {
        return new XrColocationAdvertisementStopInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStopInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStopInfoMETA calloc(MemoryStack stack) {
        return new XrColocationAdvertisementStopInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStopInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStopInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrColocationAdvertisementStopInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrColocationAdvertisementStopInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrColocationAdvertisementStopInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrColocationAdvertisementStopInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrColocationAdvertisementStopInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrColocationAdvertisementStopInfoMETA, Buffer> implements NativeResource {

        private static final XrColocationAdvertisementStopInfoMETA ELEMENT_FACTORY = XrColocationAdvertisementStopInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrColocationAdvertisementStopInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColocationAdvertisementStopInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColocationAdvertisementStopInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrColocationAdvertisementStopInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrColocationAdvertisementStopInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrColocationAdvertisementStopInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrColocationAdvertisementStopInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META} value to the {@code type} field. */
        public XrColocationAdvertisementStopInfoMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrColocationAdvertisementStopInfoMETA.Buffer next(@NativeType("void const *") long value) { XrColocationAdvertisementStopInfoMETA.nnext(address(), value); return this; }

    }

}