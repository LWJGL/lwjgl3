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
 * struct XrCreateSpatialDiscoverySnapshotCompletionInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     XrFutureEXT future;
 * }}</pre>
 */
public class XrCreateSpatialDiscoverySnapshotCompletionInfoEXT extends Struct<XrCreateSpatialDiscoverySnapshotCompletionInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        FUTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        FUTURE = layout.offsetof(4);
    }

    protected XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateSpatialDiscoverySnapshotCompletionInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code future} field. */
    @NativeType("XrFutureEXT")
    public long future() { return nfuture(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT} value to the {@code type} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code future} field. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT future(@NativeType("XrFutureEXT") long value) { nfuture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        long future
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        future(future);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT set(XrCreateSpatialDiscoverySnapshotCompletionInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT malloc() {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT calloc() {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance for the specified memory address. */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT create(long address) {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateSpatialDiscoverySnapshotCompletionInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT malloc(MemoryStack stack) {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT calloc(MemoryStack stack) {
        return new XrCreateSpatialDiscoverySnapshotCompletionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.TIME); }
    /** Unsafe version of {@link #future}. */
    public static long nfuture(long struct) { return memGetLong(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.FUTURE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.TIME, value); }
    /** Unsafe version of {@link #future(long) future}. */
    public static void nfuture(long struct, long value) { memPutLong(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.FUTURE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrCreateSpatialDiscoverySnapshotCompletionInfoEXT, Buffer> implements NativeResource {

        private static final XrCreateSpatialDiscoverySnapshotCompletionInfoEXT ELEMENT_FACTORY = XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateSpatialDiscoverySnapshotCompletionInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateSpatialDiscoverySnapshotCompletionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.ntime(address()); }
        /** @return the value of the {@code future} field. */
        @NativeType("XrFutureEXT")
        public long future() { return XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nfuture(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT} value to the {@code type} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer next(@NativeType("void const *") long value) { XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer baseSpace(XrSpace value) { XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code future} field. */
        public XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.Buffer future(@NativeType("XrFutureEXT") long value) { XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.nfuture(address(), value); return this; }

    }

}