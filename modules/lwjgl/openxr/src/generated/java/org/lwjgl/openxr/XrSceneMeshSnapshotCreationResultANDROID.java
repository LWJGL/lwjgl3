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
 * struct XrSceneMeshSnapshotCreationResultANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSceneMeshSnapshotANDROID snapshot;
 *     XrSceneMeshTrackingStateANDROID trackingState;
 * }}</pre>
 */
public class XrSceneMeshSnapshotCreationResultANDROID extends Struct<XrSceneMeshSnapshotCreationResultANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SNAPSHOT,
        TRACKINGSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SNAPSHOT = layout.offsetof(2);
        TRACKINGSTATE = layout.offsetof(3);
    }

    protected XrSceneMeshSnapshotCreationResultANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMeshSnapshotCreationResultANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMeshSnapshotCreationResultANDROID(address, container);
    }

    /**
     * Creates a {@code XrSceneMeshSnapshotCreationResultANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshSnapshotCreationResultANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code snapshot} field. */
    @NativeType("XrSceneMeshSnapshotANDROID")
    public long snapshot() { return nsnapshot(address()); }
    /** @return the value of the {@code trackingState} field. */
    @NativeType("XrSceneMeshTrackingStateANDROID")
    public int trackingState() { return ntrackingState(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneMeshSnapshotCreationResultANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID} value to the {@code type} field. */
    public XrSceneMeshSnapshotCreationResultANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneMeshSnapshotCreationResultANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot} field. */
    public XrSceneMeshSnapshotCreationResultANDROID snapshot(XrSceneMeshSnapshotANDROID value) { nsnapshot(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrSceneMeshSnapshotCreationResultANDROID trackingState(@NativeType("XrSceneMeshTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshSnapshotCreationResultANDROID set(
        int type,
        long next,
        XrSceneMeshSnapshotANDROID snapshot,
        int trackingState
    ) {
        type(type);
        next(next);
        snapshot(snapshot);
        trackingState(trackingState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshSnapshotCreationResultANDROID set(XrSceneMeshSnapshotCreationResultANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshSnapshotCreationResultANDROID malloc() {
        return new XrSceneMeshSnapshotCreationResultANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshSnapshotCreationResultANDROID calloc() {
        return new XrSceneMeshSnapshotCreationResultANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshSnapshotCreationResultANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMeshSnapshotCreationResultANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance for the specified memory address. */
    public static XrSceneMeshSnapshotCreationResultANDROID create(long address) {
        return new XrSceneMeshSnapshotCreationResultANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMeshSnapshotCreationResultANDROID createSafe(long address) {
        return address == NULL ? null : new XrSceneMeshSnapshotCreationResultANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMeshSnapshotCreationResultANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshSnapshotCreationResultANDROID malloc(MemoryStack stack) {
        return new XrSceneMeshSnapshotCreationResultANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMeshSnapshotCreationResultANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshSnapshotCreationResultANDROID calloc(MemoryStack stack) {
        return new XrSceneMeshSnapshotCreationResultANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreationResultANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMeshSnapshotCreationResultANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshSnapshotCreationResultANDROID.NEXT); }
    /** Unsafe version of {@link #snapshot}. */
    public static long nsnapshot(long struct) { return memGetAddress(struct + XrSceneMeshSnapshotCreationResultANDROID.SNAPSHOT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrSceneMeshSnapshotCreationResultANDROID.TRACKINGSTATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMeshSnapshotCreationResultANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshSnapshotCreationResultANDROID.NEXT, value); }
    /** Unsafe version of {@link #snapshot(XrSceneMeshSnapshotANDROID) snapshot}. */
    public static void nsnapshot(long struct, XrSceneMeshSnapshotANDROID value) { memPutAddress(struct + XrSceneMeshSnapshotCreationResultANDROID.SNAPSHOT, value.address()); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrSceneMeshSnapshotCreationResultANDROID.TRACKINGSTATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSceneMeshSnapshotCreationResultANDROID.SNAPSHOT));
    }

    // -----------------------------------

    /** An array of {@link XrSceneMeshSnapshotCreationResultANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshSnapshotCreationResultANDROID, Buffer> implements NativeResource {

        private static final XrSceneMeshSnapshotCreationResultANDROID ELEMENT_FACTORY = XrSceneMeshSnapshotCreationResultANDROID.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshSnapshotCreationResultANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshSnapshotCreationResultANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMeshSnapshotCreationResultANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshSnapshotCreationResultANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMeshSnapshotCreationResultANDROID.nnext(address()); }
        /** @return the value of the {@code snapshot} field. */
        @NativeType("XrSceneMeshSnapshotANDROID")
        public long snapshot() { return XrSceneMeshSnapshotCreationResultANDROID.nsnapshot(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrSceneMeshTrackingStateANDROID")
        public int trackingState() { return XrSceneMeshSnapshotCreationResultANDROID.ntrackingState(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneMeshSnapshotCreationResultANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshSnapshotCreationResultANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID} value to the {@code type} field. */
        public XrSceneMeshSnapshotCreationResultANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneMeshSnapshotCreationResultANDROID.Buffer next(@NativeType("void const *") long value) { XrSceneMeshSnapshotCreationResultANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code snapshot} field. */
        public XrSceneMeshSnapshotCreationResultANDROID.Buffer snapshot(XrSceneMeshSnapshotANDROID value) { XrSceneMeshSnapshotCreationResultANDROID.nsnapshot(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrSceneMeshSnapshotCreationResultANDROID.Buffer trackingState(@NativeType("XrSceneMeshTrackingStateANDROID") int value) { XrSceneMeshSnapshotCreationResultANDROID.ntrackingState(address(), value); return this; }

    }

}