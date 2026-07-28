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
 * <pre><code>
 * struct XrSpaceDiscoveryInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t filterCount;
 *     {@link XrSpaceFilterBaseHeaderMETA XrSpaceFilterBaseHeaderMETA} const * const * filters;
 * }</code></pre>
 */
public class XrSpaceDiscoveryInfoMETA extends Struct<XrSpaceDiscoveryInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FILTERCOUNT,
        FILTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FILTERCOUNT = layout.offsetof(2);
        FILTERS = layout.offsetof(3);
    }

    protected XrSpaceDiscoveryInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceDiscoveryInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceDiscoveryInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceDiscoveryInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceDiscoveryInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code filterCount} field. */
    @NativeType("uint32_t")
    public int filterCount() { return nfilterCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code filters} field. */
    @NativeType("XrSpaceFilterBaseHeaderMETA const * const *")
    public @Nullable PointerBuffer filters() { return nfilters(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceDiscoveryInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_DISCOVERY_INFO_META TYPE_SPACE_DISCOVERY_INFO_META} value to the {@code type} field. */
    public XrSpaceDiscoveryInfoMETA type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_DISCOVERY_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceDiscoveryInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code filterCount} field. */
    public XrSpaceDiscoveryInfoMETA filterCount(@NativeType("uint32_t") int value) { nfilterCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code filters} field. */
    public XrSpaceDiscoveryInfoMETA filters(@Nullable @NativeType("XrSpaceFilterBaseHeaderMETA const * const *") PointerBuffer value) { nfilters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceDiscoveryInfoMETA set(
        int type,
        long next,
        int filterCount,
        @Nullable PointerBuffer filters
    ) {
        type(type);
        next(next);
        filterCount(filterCount);
        filters(filters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceDiscoveryInfoMETA set(XrSpaceDiscoveryInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceDiscoveryInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryInfoMETA malloc() {
        return new XrSpaceDiscoveryInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryInfoMETA calloc() {
        return new XrSpaceDiscoveryInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceDiscoveryInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceDiscoveryInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceDiscoveryInfoMETA} instance for the specified memory address. */
    public static XrSpaceDiscoveryInfoMETA create(long address) {
        return new XrSpaceDiscoveryInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceDiscoveryInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceDiscoveryInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceDiscoveryInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceDiscoveryInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryInfoMETA malloc(MemoryStack stack) {
        return new XrSpaceDiscoveryInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryInfoMETA calloc(MemoryStack stack) {
        return new XrSpaceDiscoveryInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceDiscoveryInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceDiscoveryInfoMETA.NEXT); }
    /** Unsafe version of {@link #filterCount}. */
    public static int nfilterCount(long struct) { return memGetInt(struct + XrSpaceDiscoveryInfoMETA.FILTERCOUNT); }
    /** Unsafe version of {@link #filters() filters}. */
    public static @Nullable PointerBuffer nfilters(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrSpaceDiscoveryInfoMETA.FILTERS), nfilterCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceDiscoveryInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceDiscoveryInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code filterCount} field of the specified {@code struct}. */
    public static void nfilterCount(long struct, int value) { memPutInt(struct + XrSpaceDiscoveryInfoMETA.FILTERCOUNT, value); }
    /** Unsafe version of {@link #filters(PointerBuffer) filters}. */
    public static void nfilters(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrSpaceDiscoveryInfoMETA.FILTERS, memAddressSafe(value)); if (value != null) { nfilterCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpaceDiscoveryInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceDiscoveryInfoMETA, Buffer> implements NativeResource {

        private static final XrSpaceDiscoveryInfoMETA ELEMENT_FACTORY = XrSpaceDiscoveryInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceDiscoveryInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceDiscoveryInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceDiscoveryInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceDiscoveryInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceDiscoveryInfoMETA.nnext(address()); }
        /** @return the value of the {@code filterCount} field. */
        @NativeType("uint32_t")
        public int filterCount() { return XrSpaceDiscoveryInfoMETA.nfilterCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code filters} field. */
        @NativeType("XrSpaceFilterBaseHeaderMETA const * const *")
        public @Nullable PointerBuffer filters() { return XrSpaceDiscoveryInfoMETA.nfilters(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceDiscoveryInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceDiscoveryInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_DISCOVERY_INFO_META TYPE_SPACE_DISCOVERY_INFO_META} value to the {@code type} field. */
        public XrSpaceDiscoveryInfoMETA.Buffer type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_DISCOVERY_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceDiscoveryInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceDiscoveryInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code filterCount} field. */
        public XrSpaceDiscoveryInfoMETA.Buffer filterCount(@NativeType("uint32_t") int value) { XrSpaceDiscoveryInfoMETA.nfilterCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code filters} field. */
        public XrSpaceDiscoveryInfoMETA.Buffer filters(@Nullable @NativeType("XrSpaceFilterBaseHeaderMETA const * const *") PointerBuffer value) { XrSpaceDiscoveryInfoMETA.nfilters(address(), value); return this; }

    }

}