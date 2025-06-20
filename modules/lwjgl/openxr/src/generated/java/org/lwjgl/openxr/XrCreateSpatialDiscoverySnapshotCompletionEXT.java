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
 * struct XrCreateSpatialDiscoverySnapshotCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialSnapshotEXT snapshot;
 * }}</pre>
 */
public class XrCreateSpatialDiscoverySnapshotCompletionEXT extends Struct<XrCreateSpatialDiscoverySnapshotCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        SNAPSHOT;

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
        FUTURERESULT = layout.offsetof(2);
        SNAPSHOT = layout.offsetof(3);
    }

    protected XrCreateSpatialDiscoverySnapshotCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateSpatialDiscoverySnapshotCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT(ByteBuffer container) {
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
    /** @return the value of the {@code snapshot} field. */
    @NativeType("XrSpatialSnapshotEXT")
    public @Nullable long snapshot() { return nsnapshot(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT} value to the {@code type} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT snapshot(@Nullable XrSpatialSnapshotEXT value) { nsnapshot(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT set(
        int type,
        long next,
        int futureResult,
        XrSpatialSnapshotEXT snapshot
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        snapshot(snapshot);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateSpatialDiscoverySnapshotCompletionEXT set(XrCreateSpatialDiscoverySnapshotCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT malloc() {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT calloc() {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance for the specified memory address. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT create(long address) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateSpatialDiscoverySnapshotCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrCreateSpatialDiscoverySnapshotCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrCreateSpatialDiscoverySnapshotCompletionEXT}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT malloc(MemoryStack stack) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT calloc(MemoryStack stack) {
        return new XrCreateSpatialDiscoverySnapshotCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.FUTURERESULT); }
    /** Unsafe version of {@link #snapshot}. */
    public static long nsnapshot(long struct) { return memGetAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.SNAPSHOT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.FUTURERESULT, value); }
    /** Unsafe version of {@link #snapshot(XrSpatialSnapshotEXT) snapshot}. */
    public static void nsnapshot(long struct, @Nullable XrSpatialSnapshotEXT value) { memPutAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionEXT.SNAPSHOT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link XrCreateSpatialDiscoverySnapshotCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrCreateSpatialDiscoverySnapshotCompletionEXT, Buffer> implements NativeResource {

        private static final XrCreateSpatialDiscoverySnapshotCompletionEXT ELEMENT_FACTORY = XrCreateSpatialDiscoverySnapshotCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateSpatialDiscoverySnapshotCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateSpatialDiscoverySnapshotCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateSpatialDiscoverySnapshotCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCreateSpatialDiscoverySnapshotCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrCreateSpatialDiscoverySnapshotCompletionEXT.nfutureResult(address()); }
        /** @return the value of the {@code snapshot} field. */
        @NativeType("XrSpatialSnapshotEXT")
        public @Nullable long snapshot() { return XrCreateSpatialDiscoverySnapshotCompletionEXT.nsnapshot(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrCreateSpatialDiscoverySnapshotCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT} value to the {@code type} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer next(@NativeType("void *") long value) { XrCreateSpatialDiscoverySnapshotCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrCreateSpatialDiscoverySnapshotCompletionEXT.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code snapshot} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Buffer snapshot(@Nullable XrSpatialSnapshotEXT value) { XrCreateSpatialDiscoverySnapshotCompletionEXT.nsnapshot(address(), value); return this; }

    }

}