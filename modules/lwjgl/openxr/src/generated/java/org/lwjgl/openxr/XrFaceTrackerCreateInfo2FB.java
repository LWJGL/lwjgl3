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
 * struct XrFaceTrackerCreateInfo2FB {
 *     XrStructureType type;
 *     void const * next;
 *     XrFaceExpressionSet2FB faceExpressionSet;
 *     uint32_t requestedDataSourceCount;
 *     XrFaceTrackingDataSource2FB * requestedDataSources;
 * }}</pre>
 */
public class XrFaceTrackerCreateInfo2FB extends Struct<XrFaceTrackerCreateInfo2FB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FACEEXPRESSIONSET,
        REQUESTEDDATASOURCECOUNT,
        REQUESTEDDATASOURCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FACEEXPRESSIONSET = layout.offsetof(2);
        REQUESTEDDATASOURCECOUNT = layout.offsetof(3);
        REQUESTEDDATASOURCES = layout.offsetof(4);
    }

    protected XrFaceTrackerCreateInfo2FB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceTrackerCreateInfo2FB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceTrackerCreateInfo2FB(address, container);
    }

    /**
     * Creates a {@code XrFaceTrackerCreateInfo2FB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceTrackerCreateInfo2FB(ByteBuffer container) {
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
    /** @return the value of the {@code faceExpressionSet} field. */
    @NativeType("XrFaceExpressionSet2FB")
    public int faceExpressionSet() { return nfaceExpressionSet(address()); }
    /** @return the value of the {@code requestedDataSourceCount} field. */
    @NativeType("uint32_t")
    public int requestedDataSourceCount() { return nrequestedDataSourceCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code requestedDataSources} field. */
    @NativeType("XrFaceTrackingDataSource2FB *")
    public @Nullable IntBuffer requestedDataSources() { return nrequestedDataSources(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceTrackerCreateInfo2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB TYPE_FACE_TRACKER_CREATE_INFO2_FB} value to the {@code type} field. */
    public XrFaceTrackerCreateInfo2FB type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceTrackerCreateInfo2FB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code faceExpressionSet} field. */
    public XrFaceTrackerCreateInfo2FB faceExpressionSet(@NativeType("XrFaceExpressionSet2FB") int value) { nfaceExpressionSet(address(), value); return this; }
    /** Sets the specified value to the {@code requestedDataSourceCount} field. */
    public XrFaceTrackerCreateInfo2FB requestedDataSourceCount(@NativeType("uint32_t") int value) { nrequestedDataSourceCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code requestedDataSources} field. */
    public XrFaceTrackerCreateInfo2FB requestedDataSources(@Nullable @NativeType("XrFaceTrackingDataSource2FB *") IntBuffer value) { nrequestedDataSources(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceTrackerCreateInfo2FB set(
        int type,
        long next,
        int faceExpressionSet,
        int requestedDataSourceCount,
        @Nullable IntBuffer requestedDataSources
    ) {
        type(type);
        next(next);
        faceExpressionSet(faceExpressionSet);
        requestedDataSourceCount(requestedDataSourceCount);
        requestedDataSources(requestedDataSources);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceTrackerCreateInfo2FB set(XrFaceTrackerCreateInfo2FB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceTrackerCreateInfo2FB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfo2FB malloc() {
        return new XrFaceTrackerCreateInfo2FB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfo2FB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfo2FB calloc() {
        return new XrFaceTrackerCreateInfo2FB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfo2FB} instance allocated with {@link BufferUtils}. */
    public static XrFaceTrackerCreateInfo2FB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceTrackerCreateInfo2FB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfo2FB} instance for the specified memory address. */
    public static XrFaceTrackerCreateInfo2FB create(long address) {
        return new XrFaceTrackerCreateInfo2FB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceTrackerCreateInfo2FB createSafe(long address) {
        return address == NULL ? null : new XrFaceTrackerCreateInfo2FB(address, null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfo2FB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfo2FB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfo2FB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceTrackerCreateInfo2FB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceTrackerCreateInfo2FB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfo2FB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfo2FB malloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfo2FB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfo2FB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfo2FB calloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfo2FB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfo2FB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfo2FB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfo2FB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfo2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceTrackerCreateInfo2FB.NEXT); }
    /** Unsafe version of {@link #faceExpressionSet}. */
    public static int nfaceExpressionSet(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfo2FB.FACEEXPRESSIONSET); }
    /** Unsafe version of {@link #requestedDataSourceCount}. */
    public static int nrequestedDataSourceCount(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfo2FB.REQUESTEDDATASOURCECOUNT); }
    /** Unsafe version of {@link #requestedDataSources() requestedDataSources}. */
    public static @Nullable IntBuffer nrequestedDataSources(long struct) { return memIntBufferSafe(memGetAddress(struct + XrFaceTrackerCreateInfo2FB.REQUESTEDDATASOURCES), nrequestedDataSourceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfo2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceTrackerCreateInfo2FB.NEXT, value); }
    /** Unsafe version of {@link #faceExpressionSet(int) faceExpressionSet}. */
    public static void nfaceExpressionSet(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfo2FB.FACEEXPRESSIONSET, value); }
    /** Sets the specified value to the {@code requestedDataSourceCount} field of the specified {@code struct}. */
    public static void nrequestedDataSourceCount(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfo2FB.REQUESTEDDATASOURCECOUNT, value); }
    /** Unsafe version of {@link #requestedDataSources(IntBuffer) requestedDataSources}. */
    public static void nrequestedDataSources(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrFaceTrackerCreateInfo2FB.REQUESTEDDATASOURCES, memAddressSafe(value)); if (value != null) { nrequestedDataSourceCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrFaceTrackerCreateInfo2FB} structs. */
    public static class Buffer extends StructBuffer<XrFaceTrackerCreateInfo2FB, Buffer> implements NativeResource {

        private static final XrFaceTrackerCreateInfo2FB ELEMENT_FACTORY = XrFaceTrackerCreateInfo2FB.create(-1L);

        /**
         * Creates a new {@code XrFaceTrackerCreateInfo2FB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceTrackerCreateInfo2FB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceTrackerCreateInfo2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceTrackerCreateInfo2FB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceTrackerCreateInfo2FB.nnext(address()); }
        /** @return the value of the {@code faceExpressionSet} field. */
        @NativeType("XrFaceExpressionSet2FB")
        public int faceExpressionSet() { return XrFaceTrackerCreateInfo2FB.nfaceExpressionSet(address()); }
        /** @return the value of the {@code requestedDataSourceCount} field. */
        @NativeType("uint32_t")
        public int requestedDataSourceCount() { return XrFaceTrackerCreateInfo2FB.nrequestedDataSourceCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code requestedDataSources} field. */
        @NativeType("XrFaceTrackingDataSource2FB *")
        public @Nullable IntBuffer requestedDataSources() { return XrFaceTrackerCreateInfo2FB.nrequestedDataSources(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceTrackerCreateInfo2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking2#XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB TYPE_FACE_TRACKER_CREATE_INFO2_FB} value to the {@code type} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer type$Default() { return type(FBFaceTracking2.XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer next(@NativeType("void const *") long value) { XrFaceTrackerCreateInfo2FB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code faceExpressionSet} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer faceExpressionSet(@NativeType("XrFaceExpressionSet2FB") int value) { XrFaceTrackerCreateInfo2FB.nfaceExpressionSet(address(), value); return this; }
        /** Sets the specified value to the {@code requestedDataSourceCount} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer requestedDataSourceCount(@NativeType("uint32_t") int value) { XrFaceTrackerCreateInfo2FB.nrequestedDataSourceCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code requestedDataSources} field. */
        public XrFaceTrackerCreateInfo2FB.Buffer requestedDataSources(@Nullable @NativeType("XrFaceTrackingDataSource2FB *") IntBuffer value) { XrFaceTrackerCreateInfo2FB.nrequestedDataSources(address(), value); return this; }

    }

}