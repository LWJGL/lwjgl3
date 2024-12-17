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
 * struct XrGlobalDimmerFrameEndInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     float dimmerValue;
 *     XrGlobalDimmerFrameEndInfoFlagsML flags;
 * }}</pre>
 */
public class XrGlobalDimmerFrameEndInfoML extends Struct<XrGlobalDimmerFrameEndInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DIMMERVALUE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DIMMERVALUE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected XrGlobalDimmerFrameEndInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGlobalDimmerFrameEndInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrGlobalDimmerFrameEndInfoML(address, container);
    }

    /**
     * Creates a {@code XrGlobalDimmerFrameEndInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGlobalDimmerFrameEndInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code dimmerValue} field. */
    public float dimmerValue() { return ndimmerValue(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("XrGlobalDimmerFrameEndInfoFlagsML")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGlobalDimmerFrameEndInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLGlobalDimmer#XR_TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML} value to the {@code type} field. */
    public XrGlobalDimmerFrameEndInfoML type$Default() { return type(MLGlobalDimmer.XR_TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrGlobalDimmerFrameEndInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code dimmerValue} field. */
    public XrGlobalDimmerFrameEndInfoML dimmerValue(float value) { ndimmerValue(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrGlobalDimmerFrameEndInfoML flags(@NativeType("XrGlobalDimmerFrameEndInfoFlagsML") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGlobalDimmerFrameEndInfoML set(
        int type,
        long next,
        float dimmerValue,
        long flags
    ) {
        type(type);
        next(next);
        dimmerValue(dimmerValue);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGlobalDimmerFrameEndInfoML set(XrGlobalDimmerFrameEndInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGlobalDimmerFrameEndInfoML malloc() {
        return new XrGlobalDimmerFrameEndInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGlobalDimmerFrameEndInfoML calloc() {
        return new XrGlobalDimmerFrameEndInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance allocated with {@link BufferUtils}. */
    public static XrGlobalDimmerFrameEndInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGlobalDimmerFrameEndInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance for the specified memory address. */
    public static XrGlobalDimmerFrameEndInfoML create(long address) {
        return new XrGlobalDimmerFrameEndInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGlobalDimmerFrameEndInfoML createSafe(long address) {
        return address == NULL ? null : new XrGlobalDimmerFrameEndInfoML(address, null);
    }

    /**
     * Returns a new {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGlobalDimmerFrameEndInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGlobalDimmerFrameEndInfoML malloc(MemoryStack stack) {
        return new XrGlobalDimmerFrameEndInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGlobalDimmerFrameEndInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGlobalDimmerFrameEndInfoML calloc(MemoryStack stack) {
        return new XrGlobalDimmerFrameEndInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGlobalDimmerFrameEndInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGlobalDimmerFrameEndInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGlobalDimmerFrameEndInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGlobalDimmerFrameEndInfoML.NEXT); }
    /** Unsafe version of {@link #dimmerValue}. */
    public static float ndimmerValue(long struct) { return memGetFloat(struct + XrGlobalDimmerFrameEndInfoML.DIMMERVALUE); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrGlobalDimmerFrameEndInfoML.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGlobalDimmerFrameEndInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGlobalDimmerFrameEndInfoML.NEXT, value); }
    /** Unsafe version of {@link #dimmerValue(float) dimmerValue}. */
    public static void ndimmerValue(long struct, float value) { memPutFloat(struct + XrGlobalDimmerFrameEndInfoML.DIMMERVALUE, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrGlobalDimmerFrameEndInfoML.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrGlobalDimmerFrameEndInfoML} structs. */
    public static class Buffer extends StructBuffer<XrGlobalDimmerFrameEndInfoML, Buffer> implements NativeResource {

        private static final XrGlobalDimmerFrameEndInfoML ELEMENT_FACTORY = XrGlobalDimmerFrameEndInfoML.create(-1L);

        /**
         * Creates a new {@code XrGlobalDimmerFrameEndInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGlobalDimmerFrameEndInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGlobalDimmerFrameEndInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGlobalDimmerFrameEndInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGlobalDimmerFrameEndInfoML.nnext(address()); }
        /** @return the value of the {@code dimmerValue} field. */
        public float dimmerValue() { return XrGlobalDimmerFrameEndInfoML.ndimmerValue(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrGlobalDimmerFrameEndInfoFlagsML")
        public long flags() { return XrGlobalDimmerFrameEndInfoML.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGlobalDimmerFrameEndInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrGlobalDimmerFrameEndInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLGlobalDimmer#XR_TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML} value to the {@code type} field. */
        public XrGlobalDimmerFrameEndInfoML.Buffer type$Default() { return type(MLGlobalDimmer.XR_TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrGlobalDimmerFrameEndInfoML.Buffer next(@NativeType("void const *") long value) { XrGlobalDimmerFrameEndInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code dimmerValue} field. */
        public XrGlobalDimmerFrameEndInfoML.Buffer dimmerValue(float value) { XrGlobalDimmerFrameEndInfoML.ndimmerValue(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrGlobalDimmerFrameEndInfoML.Buffer flags(@NativeType("XrGlobalDimmerFrameEndInfoFlagsML") long value) { XrGlobalDimmerFrameEndInfoML.nflags(address(), value); return this; }

    }

}