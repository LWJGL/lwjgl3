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
 * struct XrPassthroughColorLutUpdateInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrPassthroughColorLutDataMETA XrPassthroughColorLutDataMETA} data;
 * }}</pre>
 */
public class XrPassthroughColorLutUpdateInfoMETA extends Struct<XrPassthroughColorLutUpdateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPassthroughColorLutDataMETA.SIZEOF, XrPassthroughColorLutDataMETA.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected XrPassthroughColorLutUpdateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorLutUpdateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorLutUpdateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorLutUpdateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorLutUpdateInfoMETA(ByteBuffer container) {
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
    /** @return a {@link XrPassthroughColorLutDataMETA} view of the {@code data} field. */
    public XrPassthroughColorLutDataMETA data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorLutUpdateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META} value to the {@code type} field. */
    public XrPassthroughColorLutUpdateInfoMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorLutUpdateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@code data} field. */
    public XrPassthroughColorLutUpdateInfoMETA data(XrPassthroughColorLutDataMETA value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughColorLutUpdateInfoMETA data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorLutUpdateInfoMETA set(
        int type,
        long next,
        XrPassthroughColorLutDataMETA data
    ) {
        type(type);
        next(next);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorLutUpdateInfoMETA set(XrPassthroughColorLutUpdateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutUpdateInfoMETA malloc() {
        return new XrPassthroughColorLutUpdateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutUpdateInfoMETA calloc() {
        return new XrPassthroughColorLutUpdateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorLutUpdateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorLutUpdateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance for the specified memory address. */
    public static XrPassthroughColorLutUpdateInfoMETA create(long address) {
        return new XrPassthroughColorLutUpdateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughColorLutUpdateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorLutUpdateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughColorLutUpdateInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutUpdateInfoMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorLutUpdateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutUpdateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutUpdateInfoMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorLutUpdateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutUpdateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutUpdateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughColorLutUpdateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorLutUpdateInfoMETA.NEXT); }
    /** Unsafe version of {@link #data}. */
    public static XrPassthroughColorLutDataMETA ndata(long struct) { return XrPassthroughColorLutDataMETA.create(struct + XrPassthroughColorLutUpdateInfoMETA.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughColorLutUpdateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorLutUpdateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #data(XrPassthroughColorLutDataMETA) data}. */
    public static void ndata(long struct, XrPassthroughColorLutDataMETA value) { memCopy(value.address(), struct + XrPassthroughColorLutUpdateInfoMETA.DATA, XrPassthroughColorLutDataMETA.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrPassthroughColorLutDataMETA.validate(struct + XrPassthroughColorLutUpdateInfoMETA.DATA);
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorLutUpdateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorLutUpdateInfoMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorLutUpdateInfoMETA ELEMENT_FACTORY = XrPassthroughColorLutUpdateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorLutUpdateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorLutUpdateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorLutUpdateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorLutUpdateInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorLutUpdateInfoMETA.nnext(address()); }
        /** @return a {@link XrPassthroughColorLutDataMETA} view of the {@code data} field. */
        public XrPassthroughColorLutDataMETA data() { return XrPassthroughColorLutUpdateInfoMETA.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorLutUpdateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorLutUpdateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META} value to the {@code type} field. */
        public XrPassthroughColorLutUpdateInfoMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorLutUpdateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorLutUpdateInfoMETA.nnext(address(), value); return this; }
        /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@code data} field. */
        public XrPassthroughColorLutUpdateInfoMETA.Buffer data(XrPassthroughColorLutDataMETA value) { XrPassthroughColorLutUpdateInfoMETA.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughColorLutUpdateInfoMETA.Buffer data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    }

}