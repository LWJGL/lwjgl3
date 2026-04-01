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
 * <pre><code>
 * struct XrSceneMeshSnapshotCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     {@link XrBoxf XrBoxf} boundingBox;
 * }</code></pre>
 */
public class XrSceneMeshSnapshotCreateInfoANDROID extends Struct<XrSceneMeshSnapshotCreateInfoANDROID> implements NativeResource {

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
        BOUNDINGBOX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrBoxf.SIZEOF, XrBoxf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        BOUNDINGBOX = layout.offsetof(4);
    }

    protected XrSceneMeshSnapshotCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMeshSnapshotCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMeshSnapshotCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSceneMeshSnapshotCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshSnapshotCreateInfoANDROID(ByteBuffer container) {
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
    /** @return a {@link XrBoxf} view of the {@code boundingBox} field. */
    public XrBoxf boundingBox() { return nboundingBox(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrBoxf} to the {@code boundingBox} field. */
    public XrSceneMeshSnapshotCreateInfoANDROID boundingBox(XrBoxf value) { nboundingBox(address(), value); return this; }
    /** Passes the {@code boundingBox} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneMeshSnapshotCreateInfoANDROID boundingBox(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(boundingBox()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshSnapshotCreateInfoANDROID set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        XrBoxf boundingBox
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        boundingBox(boundingBox);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshSnapshotCreateInfoANDROID set(XrSceneMeshSnapshotCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshSnapshotCreateInfoANDROID malloc() {
        return new XrSceneMeshSnapshotCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshSnapshotCreateInfoANDROID calloc() {
        return new XrSceneMeshSnapshotCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshSnapshotCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMeshSnapshotCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance for the specified memory address. */
    public static XrSceneMeshSnapshotCreateInfoANDROID create(long address) {
        return new XrSceneMeshSnapshotCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMeshSnapshotCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSceneMeshSnapshotCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMeshSnapshotCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrSceneMeshSnapshotCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMeshSnapshotCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrSceneMeshSnapshotCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshSnapshotCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMeshSnapshotCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshSnapshotCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSceneMeshSnapshotCreateInfoANDROID.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSceneMeshSnapshotCreateInfoANDROID.TIME); }
    /** Unsafe version of {@link #boundingBox}. */
    public static XrBoxf nboundingBox(long struct) { return XrBoxf.create(struct + XrSceneMeshSnapshotCreateInfoANDROID.BOUNDINGBOX); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMeshSnapshotCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshSnapshotCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSceneMeshSnapshotCreateInfoANDROID.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSceneMeshSnapshotCreateInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #boundingBox(XrBoxf) boundingBox}. */
    public static void nboundingBox(long struct, XrBoxf value) { memCopy(value.address(), struct + XrSceneMeshSnapshotCreateInfoANDROID.BOUNDINGBOX, XrBoxf.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSceneMeshSnapshotCreateInfoANDROID.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSceneMeshSnapshotCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshSnapshotCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrSceneMeshSnapshotCreateInfoANDROID ELEMENT_FACTORY = XrSceneMeshSnapshotCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshSnapshotCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshSnapshotCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMeshSnapshotCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshSnapshotCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMeshSnapshotCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSceneMeshSnapshotCreateInfoANDROID.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSceneMeshSnapshotCreateInfoANDROID.ntime(address()); }
        /** @return a {@link XrBoxf} view of the {@code boundingBox} field. */
        public XrBoxf boundingBox() { return XrSceneMeshSnapshotCreateInfoANDROID.nboundingBox(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshSnapshotCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSceneMeshSnapshotCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer baseSpace(XrSpace value) { XrSceneMeshSnapshotCreateInfoANDROID.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrSceneMeshSnapshotCreateInfoANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrBoxf} to the {@code boundingBox} field. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer boundingBox(XrBoxf value) { XrSceneMeshSnapshotCreateInfoANDROID.nboundingBox(address(), value); return this; }
        /** Passes the {@code boundingBox} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneMeshSnapshotCreateInfoANDROID.Buffer boundingBox(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(boundingBox()); return this; }

    }

}