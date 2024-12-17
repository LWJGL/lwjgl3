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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrForceFeedbackCurlApplyLocationsMNDX {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t locationCount;
 *     {@link XrForceFeedbackCurlApplyLocationMNDX XrForceFeedbackCurlApplyLocationMNDX} * locations;
 * }}</pre>
 */
public class XrForceFeedbackCurlApplyLocationsMNDX extends Struct<XrForceFeedbackCurlApplyLocationsMNDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONCOUNT,
        LOCATIONS;

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
        LOCATIONCOUNT = layout.offsetof(2);
        LOCATIONS = layout.offsetof(3);
    }

    protected XrForceFeedbackCurlApplyLocationsMNDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrForceFeedbackCurlApplyLocationsMNDX create(long address, @Nullable ByteBuffer container) {
        return new XrForceFeedbackCurlApplyLocationsMNDX(address, container);
    }

    /**
     * Creates a {@code XrForceFeedbackCurlApplyLocationsMNDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrForceFeedbackCurlApplyLocationsMNDX(ByteBuffer container) {
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
    /** @return the value of the {@code locationCount} field. */
    @NativeType("uint32_t")
    public int locationCount() { return nlocationCount(address()); }
    /** @return a {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} view of the struct array pointed to by the {@code locations} field. */
    @NativeType("XrForceFeedbackCurlApplyLocationMNDX *")
    public XrForceFeedbackCurlApplyLocationMNDX.Buffer locations() { return nlocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrForceFeedbackCurlApplyLocationsMNDX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MNDXForceFeedbackCurl#XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX} value to the {@code type} field. */
    public XrForceFeedbackCurlApplyLocationsMNDX type$Default() { return type(MNDXForceFeedbackCurl.XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX); }
    /** Sets the specified value to the {@code next} field. */
    public XrForceFeedbackCurlApplyLocationsMNDX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} to the {@code locations} field. */
    public XrForceFeedbackCurlApplyLocationsMNDX locations(@NativeType("XrForceFeedbackCurlApplyLocationMNDX *") XrForceFeedbackCurlApplyLocationMNDX.Buffer value) { nlocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrForceFeedbackCurlApplyLocationsMNDX set(
        int type,
        long next,
        XrForceFeedbackCurlApplyLocationMNDX.Buffer locations
    ) {
        type(type);
        next(next);
        locations(locations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrForceFeedbackCurlApplyLocationsMNDX set(XrForceFeedbackCurlApplyLocationsMNDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrForceFeedbackCurlApplyLocationsMNDX malloc() {
        return new XrForceFeedbackCurlApplyLocationsMNDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrForceFeedbackCurlApplyLocationsMNDX calloc() {
        return new XrForceFeedbackCurlApplyLocationsMNDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance allocated with {@link BufferUtils}. */
    public static XrForceFeedbackCurlApplyLocationsMNDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrForceFeedbackCurlApplyLocationsMNDX(memAddress(container), container);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance for the specified memory address. */
    public static XrForceFeedbackCurlApplyLocationsMNDX create(long address) {
        return new XrForceFeedbackCurlApplyLocationsMNDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrForceFeedbackCurlApplyLocationsMNDX createSafe(long address) {
        return address == NULL ? null : new XrForceFeedbackCurlApplyLocationsMNDX(address, null);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrForceFeedbackCurlApplyLocationsMNDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX malloc(MemoryStack stack) {
        return new XrForceFeedbackCurlApplyLocationsMNDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrForceFeedbackCurlApplyLocationsMNDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX calloc(MemoryStack stack) {
        return new XrForceFeedbackCurlApplyLocationsMNDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationsMNDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrForceFeedbackCurlApplyLocationsMNDX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrForceFeedbackCurlApplyLocationsMNDX.NEXT); }
    /** Unsafe version of {@link #locationCount}. */
    public static int nlocationCount(long struct) { return memGetInt(struct + XrForceFeedbackCurlApplyLocationsMNDX.LOCATIONCOUNT); }
    /** Unsafe version of {@link #locations}. */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer nlocations(long struct) { return XrForceFeedbackCurlApplyLocationMNDX.create(memGetAddress(struct + XrForceFeedbackCurlApplyLocationsMNDX.LOCATIONS), nlocationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrForceFeedbackCurlApplyLocationsMNDX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrForceFeedbackCurlApplyLocationsMNDX.NEXT, value); }
    /** Sets the specified value to the {@code locationCount} field of the specified {@code struct}. */
    public static void nlocationCount(long struct, int value) { memPutInt(struct + XrForceFeedbackCurlApplyLocationsMNDX.LOCATIONCOUNT, value); }
    /** Unsafe version of {@link #locations(XrForceFeedbackCurlApplyLocationMNDX.Buffer) locations}. */
    public static void nlocations(long struct, XrForceFeedbackCurlApplyLocationMNDX.Buffer value) { memPutAddress(struct + XrForceFeedbackCurlApplyLocationsMNDX.LOCATIONS, value.address()); nlocationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrForceFeedbackCurlApplyLocationsMNDX.LOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrForceFeedbackCurlApplyLocationsMNDX} structs. */
    public static class Buffer extends StructBuffer<XrForceFeedbackCurlApplyLocationsMNDX, Buffer> implements NativeResource {

        private static final XrForceFeedbackCurlApplyLocationsMNDX ELEMENT_FACTORY = XrForceFeedbackCurlApplyLocationsMNDX.create(-1L);

        /**
         * Creates a new {@code XrForceFeedbackCurlApplyLocationsMNDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrForceFeedbackCurlApplyLocationsMNDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrForceFeedbackCurlApplyLocationsMNDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrForceFeedbackCurlApplyLocationsMNDX.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrForceFeedbackCurlApplyLocationsMNDX.nnext(address()); }
        /** @return the value of the {@code locationCount} field. */
        @NativeType("uint32_t")
        public int locationCount() { return XrForceFeedbackCurlApplyLocationsMNDX.nlocationCount(address()); }
        /** @return a {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} view of the struct array pointed to by the {@code locations} field. */
        @NativeType("XrForceFeedbackCurlApplyLocationMNDX *")
        public XrForceFeedbackCurlApplyLocationMNDX.Buffer locations() { return XrForceFeedbackCurlApplyLocationsMNDX.nlocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrForceFeedbackCurlApplyLocationsMNDX.Buffer type(@NativeType("XrStructureType") int value) { XrForceFeedbackCurlApplyLocationsMNDX.ntype(address(), value); return this; }
        /** Sets the {@link MNDXForceFeedbackCurl#XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX} value to the {@code type} field. */
        public XrForceFeedbackCurlApplyLocationsMNDX.Buffer type$Default() { return type(MNDXForceFeedbackCurl.XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX); }
        /** Sets the specified value to the {@code next} field. */
        public XrForceFeedbackCurlApplyLocationsMNDX.Buffer next(@NativeType("void const *") long value) { XrForceFeedbackCurlApplyLocationsMNDX.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} to the {@code locations} field. */
        public XrForceFeedbackCurlApplyLocationsMNDX.Buffer locations(@NativeType("XrForceFeedbackCurlApplyLocationMNDX *") XrForceFeedbackCurlApplyLocationMNDX.Buffer value) { XrForceFeedbackCurlApplyLocationsMNDX.nlocations(address(), value); return this; }

    }

}