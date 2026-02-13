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
 * struct XrFutureCompletionBaseHeaderEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 * }}</pre>
 */
public class XrFutureCompletionBaseHeaderEXT extends Struct<XrFutureCompletionBaseHeaderEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT;

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
        FUTURERESULT = layout.offsetof(2);
    }

    protected XrFutureCompletionBaseHeaderEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFutureCompletionBaseHeaderEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFutureCompletionBaseHeaderEXT(address, container);
    }

    /**
     * Creates a {@code XrFutureCompletionBaseHeaderEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFutureCompletionBaseHeaderEXT(ByteBuffer container) {
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
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFutureCompletionBaseHeaderEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrFutureCompletionBaseHeaderEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrFutureCompletionBaseHeaderEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFutureCompletionBaseHeaderEXT set(
        int type,
        long next,
        int futureResult
    ) {
        type(type);
        next(next);
        futureResult(futureResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFutureCompletionBaseHeaderEXT set(XrFutureCompletionBaseHeaderEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFutureCompletionBaseHeaderEXT malloc() {
        return new XrFutureCompletionBaseHeaderEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFutureCompletionBaseHeaderEXT calloc() {
        return new XrFutureCompletionBaseHeaderEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance allocated with {@link BufferUtils}. */
    public static XrFutureCompletionBaseHeaderEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFutureCompletionBaseHeaderEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance for the specified memory address. */
    public static XrFutureCompletionBaseHeaderEXT create(long address) {
        return new XrFutureCompletionBaseHeaderEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFutureCompletionBaseHeaderEXT createSafe(long address) {
        return address == NULL ? null : new XrFutureCompletionBaseHeaderEXT(address, null);
    }

    /** Upcasts the specified {@code XrCreateSpatialAnchorsCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrCreateSpatialAnchorsCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialAnchorsQueryCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSpatialAnchorsQueryCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialAnchorsPublishCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSpatialAnchorsPublishCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialAnchorsDeleteCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSpatialAnchorsDeleteCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSpatialAnchorsUpdateExpirationCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSenseDataQueryCompletionBD} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSenseDataQueryCompletionBD value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrFutureCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrFutureCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrSpatialAnchorCreateCompletionBD} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrSpatialAnchorCreateCompletionBD value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrWorldMeshStateRequestCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrWorldMeshStateRequestCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrWorldMeshRequestCompletionML} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrWorldMeshRequestCompletionML value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCreateTrackableImageDatabaseCompletionANDROID} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrCreateTrackableImageDatabaseCompletionANDROID value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCreateSpatialContextCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrCreateSpatialContextCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrCreateSpatialDiscoverySnapshotCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrCreateSpatialPersistenceContextCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrCreateSpatialPersistenceContextCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrPersistSpatialEntityCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrPersistSpatialEntityCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrUnpersistSpatialEntityCompletionEXT} instance to {@code XrFutureCompletionBaseHeaderEXT}. */
    public static XrFutureCompletionBaseHeaderEXT create(XrUnpersistSpatialEntityCompletionEXT value) {
        return new XrFutureCompletionBaseHeaderEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFutureCompletionBaseHeaderEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrCreateSpatialAnchorsCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrCreateSpatialAnchorsCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialAnchorsQueryCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSpatialAnchorsQueryCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialAnchorsPublishCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSpatialAnchorsPublishCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialAnchorsDeleteCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSpatialAnchorsDeleteCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSpatialAnchorsUpdateExpirationCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSenseDataQueryCompletionBD.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSenseDataQueryCompletionBD.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrFutureCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrFutureCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrSpatialAnchorCreateCompletionBD.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrSpatialAnchorCreateCompletionBD.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrWorldMeshStateRequestCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrWorldMeshStateRequestCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrWorldMeshRequestCompletionML.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrWorldMeshRequestCompletionML.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCreateTrackableImageDatabaseCompletionANDROID.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrCreateTrackableImageDatabaseCompletionANDROID.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCreateSpatialContextCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrCreateSpatialContextCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrCreateSpatialPersistenceContextCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrCreateSpatialPersistenceContextCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrPersistSpatialEntityCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrPersistSpatialEntityCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrUnpersistSpatialEntityCompletionEXT.Buffer} instance to {@code XrFutureCompletionBaseHeaderEXT.Buffer}. */
    public static XrFutureCompletionBaseHeaderEXT.Buffer create(XrUnpersistSpatialEntityCompletionEXT.Buffer value) {
        return new XrFutureCompletionBaseHeaderEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCompletionBaseHeaderEXT malloc(MemoryStack stack) {
        return new XrFutureCompletionBaseHeaderEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFutureCompletionBaseHeaderEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCompletionBaseHeaderEXT calloc(MemoryStack stack) {
        return new XrFutureCompletionBaseHeaderEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionBaseHeaderEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionBaseHeaderEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFutureCompletionBaseHeaderEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFutureCompletionBaseHeaderEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrFutureCompletionBaseHeaderEXT.FUTURERESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFutureCompletionBaseHeaderEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFutureCompletionBaseHeaderEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrFutureCompletionBaseHeaderEXT.FUTURERESULT, value); }

    // -----------------------------------

    /** An array of {@link XrFutureCompletionBaseHeaderEXT} structs. */
    public static class Buffer extends StructBuffer<XrFutureCompletionBaseHeaderEXT, Buffer> implements NativeResource {

        private static final XrFutureCompletionBaseHeaderEXT ELEMENT_FACTORY = XrFutureCompletionBaseHeaderEXT.create(-1L);

        /**
         * Creates a new {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFutureCompletionBaseHeaderEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFutureCompletionBaseHeaderEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFutureCompletionBaseHeaderEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFutureCompletionBaseHeaderEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrFutureCompletionBaseHeaderEXT.nfutureResult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFutureCompletionBaseHeaderEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFutureCompletionBaseHeaderEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrFutureCompletionBaseHeaderEXT.Buffer next(@NativeType("void *") long value) { XrFutureCompletionBaseHeaderEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrFutureCompletionBaseHeaderEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrFutureCompletionBaseHeaderEXT.nfutureResult(address(), value); return this; }

    }

}