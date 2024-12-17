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
 * struct XrSpatialAnchorsPublishCompletionDetailsML {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t resultCount;
 *     {@link XrSpatialAnchorCompletionResultML XrSpatialAnchorCompletionResultML} * results;
 * }}</pre>
 */
public class XrSpatialAnchorsPublishCompletionDetailsML extends Struct<XrSpatialAnchorsPublishCompletionDetailsML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RESULTCOUNT,
        RESULTS;

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
        RESULTCOUNT = layout.offsetof(2);
        RESULTS = layout.offsetof(3);
    }

    protected XrSpatialAnchorsPublishCompletionDetailsML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsPublishCompletionDetailsML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsPublishCompletionDetailsML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsPublishCompletionDetailsML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsPublishCompletionDetailsML(ByteBuffer container) {
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
    /** @return the value of the {@code resultCount} field. */
    @NativeType("uint32_t")
    public int resultCount() { return nresultCount(address()); }
    /** @return a {@link XrSpatialAnchorCompletionResultML.Buffer} view of the struct array pointed to by the {@code results} field. */
    @NativeType("XrSpatialAnchorCompletionResultML *")
    public XrSpatialAnchorCompletionResultML.Buffer results() { return nresults(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsPublishCompletionDetailsML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML} value to the {@code type} field. */
    public XrSpatialAnchorsPublishCompletionDetailsML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsPublishCompletionDetailsML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@code results} field. */
    public XrSpatialAnchorsPublishCompletionDetailsML results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { nresults(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsPublishCompletionDetailsML set(
        int type,
        long next,
        XrSpatialAnchorCompletionResultML.Buffer results
    ) {
        type(type);
        next(next);
        results(results);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsPublishCompletionDetailsML set(XrSpatialAnchorsPublishCompletionDetailsML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishCompletionDetailsML malloc() {
        return new XrSpatialAnchorsPublishCompletionDetailsML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishCompletionDetailsML calloc() {
        return new XrSpatialAnchorsPublishCompletionDetailsML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsPublishCompletionDetailsML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsPublishCompletionDetailsML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance for the specified memory address. */
    public static XrSpatialAnchorsPublishCompletionDetailsML create(long address) {
        return new XrSpatialAnchorsPublishCompletionDetailsML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsPublishCompletionDetailsML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsPublishCompletionDetailsML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsPublishCompletionDetailsML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishCompletionDetailsML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishCompletionDetailsML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishCompletionDetailsML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionDetailsML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishCompletionDetailsML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsPublishCompletionDetailsML.NEXT); }
    /** Unsafe version of {@link #resultCount}. */
    public static int nresultCount(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishCompletionDetailsML.RESULTCOUNT); }
    /** Unsafe version of {@link #results}. */
    public static XrSpatialAnchorCompletionResultML.Buffer nresults(long struct) { return XrSpatialAnchorCompletionResultML.create(memGetAddress(struct + XrSpatialAnchorsPublishCompletionDetailsML.RESULTS), nresultCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishCompletionDetailsML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsPublishCompletionDetailsML.NEXT, value); }
    /** Sets the specified value to the {@code resultCount} field of the specified {@code struct}. */
    public static void nresultCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishCompletionDetailsML.RESULTCOUNT, value); }
    /** Unsafe version of {@link #results(XrSpatialAnchorCompletionResultML.Buffer) results}. */
    public static void nresults(long struct, XrSpatialAnchorCompletionResultML.Buffer value) { memPutAddress(struct + XrSpatialAnchorsPublishCompletionDetailsML.RESULTS, value.address()); nresultCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsPublishCompletionDetailsML.RESULTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsPublishCompletionDetailsML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsPublishCompletionDetailsML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsPublishCompletionDetailsML ELEMENT_FACTORY = XrSpatialAnchorsPublishCompletionDetailsML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsPublishCompletionDetailsML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsPublishCompletionDetailsML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsPublishCompletionDetailsML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsPublishCompletionDetailsML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsPublishCompletionDetailsML.nnext(address()); }
        /** @return the value of the {@code resultCount} field. */
        @NativeType("uint32_t")
        public int resultCount() { return XrSpatialAnchorsPublishCompletionDetailsML.nresultCount(address()); }
        /** @return a {@link XrSpatialAnchorCompletionResultML.Buffer} view of the struct array pointed to by the {@code results} field. */
        @NativeType("XrSpatialAnchorCompletionResultML *")
        public XrSpatialAnchorCompletionResultML.Buffer results() { return XrSpatialAnchorsPublishCompletionDetailsML.nresults(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsPublishCompletionDetailsML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsPublishCompletionDetailsML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML} value to the {@code type} field. */
        public XrSpatialAnchorsPublishCompletionDetailsML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsPublishCompletionDetailsML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsPublishCompletionDetailsML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialAnchorCompletionResultML.Buffer} to the {@code results} field. */
        public XrSpatialAnchorsPublishCompletionDetailsML.Buffer results(@NativeType("XrSpatialAnchorCompletionResultML *") XrSpatialAnchorCompletionResultML.Buffer value) { XrSpatialAnchorsPublishCompletionDetailsML.nresults(address(), value); return this; }

    }

}