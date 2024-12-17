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
 * struct XrSystemHeadsetIdPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuidEXT XrUuidEXT} id;
 * }}</pre>
 */
public class XrSystemHeadsetIdPropertiesMETA extends Struct<XrSystemHeadsetIdPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ID = layout.offsetof(2);
    }

    protected XrSystemHeadsetIdPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemHeadsetIdPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemHeadsetIdPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemHeadsetIdPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHeadsetIdPropertiesMETA(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code id} field. */
    public XrUuidEXT id() { return nid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemHeadsetIdPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAHeadsetId#XR_TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemHeadsetIdPropertiesMETA type$Default() { return type(METAHeadsetId.XR_TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemHeadsetIdPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHeadsetIdPropertiesMETA set(
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
    public XrSystemHeadsetIdPropertiesMETA set(XrSystemHeadsetIdPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHeadsetIdPropertiesMETA malloc() {
        return new XrSystemHeadsetIdPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHeadsetIdPropertiesMETA calloc() {
        return new XrSystemHeadsetIdPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemHeadsetIdPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemHeadsetIdPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance for the specified memory address. */
    public static XrSystemHeadsetIdPropertiesMETA create(long address) {
        return new XrSystemHeadsetIdPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemHeadsetIdPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemHeadsetIdPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemHeadsetIdPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHeadsetIdPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemHeadsetIdPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemHeadsetIdPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHeadsetIdPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemHeadsetIdPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHeadsetIdPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHeadsetIdPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemHeadsetIdPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHeadsetIdPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #id}. */
    public static XrUuidEXT nid(long struct) { return XrUuidEXT.create(struct + XrSystemHeadsetIdPropertiesMETA.ID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemHeadsetIdPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHeadsetIdPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHeadsetIdPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemHeadsetIdPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemHeadsetIdPropertiesMETA ELEMENT_FACTORY = XrSystemHeadsetIdPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemHeadsetIdPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHeadsetIdPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemHeadsetIdPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHeadsetIdPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHeadsetIdPropertiesMETA.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code id} field. */
        public XrUuidEXT id() { return XrSystemHeadsetIdPropertiesMETA.nid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemHeadsetIdPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHeadsetIdPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAHeadsetId#XR_TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemHeadsetIdPropertiesMETA.Buffer type$Default() { return type(METAHeadsetId.XR_TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemHeadsetIdPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemHeadsetIdPropertiesMETA.nnext(address(), value); return this; }

    }

}