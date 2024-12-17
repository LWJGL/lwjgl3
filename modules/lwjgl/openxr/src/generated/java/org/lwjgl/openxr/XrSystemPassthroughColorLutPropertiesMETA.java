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
 * struct XrSystemPassthroughColorLutPropertiesMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t maxColorLutResolution;
 * }}</pre>
 */
public class XrSystemPassthroughColorLutPropertiesMETA extends Struct<XrSystemPassthroughColorLutPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAXCOLORLUTRESOLUTION;

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
        MAXCOLORLUTRESOLUTION = layout.offsetof(2);
    }

    protected XrSystemPassthroughColorLutPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPassthroughColorLutPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPassthroughColorLutPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemPassthroughColorLutPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughColorLutPropertiesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code maxColorLutResolution} field. */
    @NativeType("uint32_t")
    public int maxColorLutResolution() { return nmaxColorLutResolution(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPassthroughColorLutPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemPassthroughColorLutPropertiesMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPassthroughColorLutPropertiesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughColorLutPropertiesMETA set(
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
    public XrSystemPassthroughColorLutPropertiesMETA set(XrSystemPassthroughColorLutPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughColorLutPropertiesMETA malloc() {
        return new XrSystemPassthroughColorLutPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughColorLutPropertiesMETA calloc() {
        return new XrSystemPassthroughColorLutPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughColorLutPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPassthroughColorLutPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance for the specified memory address. */
    public static XrSystemPassthroughColorLutPropertiesMETA create(long address) {
        return new XrSystemPassthroughColorLutPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemPassthroughColorLutPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemPassthroughColorLutPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemPassthroughColorLutPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughColorLutPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemPassthroughColorLutPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughColorLutPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemPassthroughColorLutPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemPassthroughColorLutPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughColorLutPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #maxColorLutResolution}. */
    public static int nmaxColorLutResolution(long struct) { return memGetInt(struct + XrSystemPassthroughColorLutPropertiesMETA.MAXCOLORLUTRESOLUTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemPassthroughColorLutPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughColorLutPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughColorLutPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughColorLutPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemPassthroughColorLutPropertiesMETA ELEMENT_FACTORY = XrSystemPassthroughColorLutPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughColorLutPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPassthroughColorLutPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughColorLutPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemPassthroughColorLutPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code maxColorLutResolution} field. */
        @NativeType("uint32_t")
        public int maxColorLutResolution() { return XrSystemPassthroughColorLutPropertiesMETA.nmaxColorLutResolution(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughColorLutPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer next(@NativeType("void const *") long value) { XrSystemPassthroughColorLutPropertiesMETA.nnext(address(), value); return this; }

    }

}