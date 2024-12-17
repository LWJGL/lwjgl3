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
 * struct XrPassthroughColorLutCreateInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughColorLutChannelsMETA channels;
 *     uint32_t resolution;
 *     {@link XrPassthroughColorLutDataMETA XrPassthroughColorLutDataMETA} data;
 * }}</pre>
 */
public class XrPassthroughColorLutCreateInfoMETA extends Struct<XrPassthroughColorLutCreateInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CHANNELS,
        RESOLUTION,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(XrPassthroughColorLutDataMETA.SIZEOF, XrPassthroughColorLutDataMETA.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CHANNELS = layout.offsetof(2);
        RESOLUTION = layout.offsetof(3);
        DATA = layout.offsetof(4);
    }

    protected XrPassthroughColorLutCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorLutCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorLutCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorLutCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorLutCreateInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code channels} field. */
    @NativeType("XrPassthroughColorLutChannelsMETA")
    public int channels() { return nchannels(address()); }
    /** @return the value of the {@code resolution} field. */
    @NativeType("uint32_t")
    public int resolution() { return nresolution(address()); }
    /** @return a {@link XrPassthroughColorLutDataMETA} view of the {@code data} field. */
    public XrPassthroughColorLutDataMETA data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorLutCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META} value to the {@code type} field. */
    public XrPassthroughColorLutCreateInfoMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorLutCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code channels} field. */
    public XrPassthroughColorLutCreateInfoMETA channels(@NativeType("XrPassthroughColorLutChannelsMETA") int value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code resolution} field. */
    public XrPassthroughColorLutCreateInfoMETA resolution(@NativeType("uint32_t") int value) { nresolution(address(), value); return this; }
    /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@code data} field. */
    public XrPassthroughColorLutCreateInfoMETA data(XrPassthroughColorLutDataMETA value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughColorLutCreateInfoMETA data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorLutCreateInfoMETA set(
        int type,
        long next,
        int channels,
        int resolution,
        XrPassthroughColorLutDataMETA data
    ) {
        type(type);
        next(next);
        channels(channels);
        resolution(resolution);
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
    public XrPassthroughColorLutCreateInfoMETA set(XrPassthroughColorLutCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutCreateInfoMETA malloc() {
        return new XrPassthroughColorLutCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutCreateInfoMETA calloc() {
        return new XrPassthroughColorLutCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorLutCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorLutCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance for the specified memory address. */
    public static XrPassthroughColorLutCreateInfoMETA create(long address) {
        return new XrPassthroughColorLutCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughColorLutCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorLutCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughColorLutCreateInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutCreateInfoMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorLutCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutCreateInfoMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorLutCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughColorLutCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorLutCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #channels}. */
    public static int nchannels(long struct) { return memGetInt(struct + XrPassthroughColorLutCreateInfoMETA.CHANNELS); }
    /** Unsafe version of {@link #resolution}. */
    public static int nresolution(long struct) { return memGetInt(struct + XrPassthroughColorLutCreateInfoMETA.RESOLUTION); }
    /** Unsafe version of {@link #data}. */
    public static XrPassthroughColorLutDataMETA ndata(long struct) { return XrPassthroughColorLutDataMETA.create(struct + XrPassthroughColorLutCreateInfoMETA.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughColorLutCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorLutCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #channels(int) channels}. */
    public static void nchannels(long struct, int value) { memPutInt(struct + XrPassthroughColorLutCreateInfoMETA.CHANNELS, value); }
    /** Unsafe version of {@link #resolution(int) resolution}. */
    public static void nresolution(long struct, int value) { memPutInt(struct + XrPassthroughColorLutCreateInfoMETA.RESOLUTION, value); }
    /** Unsafe version of {@link #data(XrPassthroughColorLutDataMETA) data}. */
    public static void ndata(long struct, XrPassthroughColorLutDataMETA value) { memCopy(value.address(), struct + XrPassthroughColorLutCreateInfoMETA.DATA, XrPassthroughColorLutDataMETA.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        XrPassthroughColorLutDataMETA.validate(struct + XrPassthroughColorLutCreateInfoMETA.DATA);
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorLutCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorLutCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorLutCreateInfoMETA ELEMENT_FACTORY = XrPassthroughColorLutCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorLutCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorLutCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorLutCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorLutCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorLutCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@code channels} field. */
        @NativeType("XrPassthroughColorLutChannelsMETA")
        public int channels() { return XrPassthroughColorLutCreateInfoMETA.nchannels(address()); }
        /** @return the value of the {@code resolution} field. */
        @NativeType("uint32_t")
        public int resolution() { return XrPassthroughColorLutCreateInfoMETA.nresolution(address()); }
        /** @return a {@link XrPassthroughColorLutDataMETA} view of the {@code data} field. */
        public XrPassthroughColorLutDataMETA data() { return XrPassthroughColorLutCreateInfoMETA.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorLutCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META} value to the {@code type} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorLutCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code channels} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer channels(@NativeType("XrPassthroughColorLutChannelsMETA") int value) { XrPassthroughColorLutCreateInfoMETA.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code resolution} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer resolution(@NativeType("uint32_t") int value) { XrPassthroughColorLutCreateInfoMETA.nresolution(address(), value); return this; }
        /** Copies the specified {@link XrPassthroughColorLutDataMETA} to the {@code data} field. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer data(XrPassthroughColorLutDataMETA value) { XrPassthroughColorLutCreateInfoMETA.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughColorLutCreateInfoMETA.Buffer data(java.util.function.Consumer<XrPassthroughColorLutDataMETA> consumer) { consumer.accept(data()); return this; }

    }

}