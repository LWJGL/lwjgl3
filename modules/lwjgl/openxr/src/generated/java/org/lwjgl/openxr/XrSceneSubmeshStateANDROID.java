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
 * struct XrSceneSubmeshStateANDROID {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuid XrUuid} submeshId;
 *     XrTime lastUpdatedTime;
 *     {@link XrPosef XrPosef} submeshPoseInBaseSpace;
 *     {@link XrExtent3Df XrExtent3Df} bounds;
 * }</code></pre>
 */
public class XrSceneSubmeshStateANDROID extends Struct<XrSceneSubmeshStateANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUBMESHID,
        LASTUPDATEDTIME,
        SUBMESHPOSEINBASESPACE,
        BOUNDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent3Df.SIZEOF, XrExtent3Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUBMESHID = layout.offsetof(2);
        LASTUPDATEDTIME = layout.offsetof(3);
        SUBMESHPOSEINBASESPACE = layout.offsetof(4);
        BOUNDS = layout.offsetof(5);
    }

    protected XrSceneSubmeshStateANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneSubmeshStateANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSceneSubmeshStateANDROID(address, container);
    }

    /**
     * Creates a {@code XrSceneSubmeshStateANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneSubmeshStateANDROID(ByteBuffer container) {
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
    /** @return a {@link XrUuid} view of the {@code submeshId} field. */
    public XrUuid submeshId() { return nsubmeshId(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }
    /** @return a {@link XrPosef} view of the {@code submeshPoseInBaseSpace} field. */
    public XrPosef submeshPoseInBaseSpace() { return nsubmeshPoseInBaseSpace(address()); }
    /** @return a {@link XrExtent3Df} view of the {@code bounds} field. */
    public XrExtent3Df bounds() { return nbounds(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneSubmeshStateANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_SUBMESH_STATE_ANDROID TYPE_SCENE_SUBMESH_STATE_ANDROID} value to the {@code type} field. */
    public XrSceneSubmeshStateANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_SUBMESH_STATE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneSubmeshStateANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code submeshId} field. */
    public XrSceneSubmeshStateANDROID submeshId(XrUuid value) { nsubmeshId(address(), value); return this; }
    /** Passes the {@code submeshId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneSubmeshStateANDROID submeshId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(submeshId()); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrSceneSubmeshStateANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code submeshPoseInBaseSpace} field. */
    public XrSceneSubmeshStateANDROID submeshPoseInBaseSpace(XrPosef value) { nsubmeshPoseInBaseSpace(address(), value); return this; }
    /** Passes the {@code submeshPoseInBaseSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneSubmeshStateANDROID submeshPoseInBaseSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(submeshPoseInBaseSpace()); return this; }
    /** Copies the specified {@link XrExtent3Df} to the {@code bounds} field. */
    public XrSceneSubmeshStateANDROID bounds(XrExtent3Df value) { nbounds(address(), value); return this; }
    /** Passes the {@code bounds} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneSubmeshStateANDROID bounds(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(bounds()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneSubmeshStateANDROID set(
        int type,
        long next,
        XrUuid submeshId,
        long lastUpdatedTime,
        XrPosef submeshPoseInBaseSpace,
        XrExtent3Df bounds
    ) {
        type(type);
        next(next);
        submeshId(submeshId);
        lastUpdatedTime(lastUpdatedTime);
        submeshPoseInBaseSpace(submeshPoseInBaseSpace);
        bounds(bounds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneSubmeshStateANDROID set(XrSceneSubmeshStateANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneSubmeshStateANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneSubmeshStateANDROID malloc() {
        return new XrSceneSubmeshStateANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneSubmeshStateANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneSubmeshStateANDROID calloc() {
        return new XrSceneSubmeshStateANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneSubmeshStateANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSceneSubmeshStateANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneSubmeshStateANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneSubmeshStateANDROID} instance for the specified memory address. */
    public static XrSceneSubmeshStateANDROID create(long address) {
        return new XrSceneSubmeshStateANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneSubmeshStateANDROID createSafe(long address) {
        return address == NULL ? null : new XrSceneSubmeshStateANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSceneSubmeshStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshStateANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshStateANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneSubmeshStateANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneSubmeshStateANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneSubmeshStateANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSubmeshStateANDROID malloc(MemoryStack stack) {
        return new XrSceneSubmeshStateANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneSubmeshStateANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSubmeshStateANDROID calloc(MemoryStack stack) {
        return new XrSceneSubmeshStateANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneSubmeshStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshStateANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshStateANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneSubmeshStateANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneSubmeshStateANDROID.NEXT); }
    /** Unsafe version of {@link #submeshId}. */
    public static XrUuid nsubmeshId(long struct) { return XrUuid.create(struct + XrSceneSubmeshStateANDROID.SUBMESHID); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrSceneSubmeshStateANDROID.LASTUPDATEDTIME); }
    /** Unsafe version of {@link #submeshPoseInBaseSpace}. */
    public static XrPosef nsubmeshPoseInBaseSpace(long struct) { return XrPosef.create(struct + XrSceneSubmeshStateANDROID.SUBMESHPOSEINBASESPACE); }
    /** Unsafe version of {@link #bounds}. */
    public static XrExtent3Df nbounds(long struct) { return XrExtent3Df.create(struct + XrSceneSubmeshStateANDROID.BOUNDS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneSubmeshStateANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneSubmeshStateANDROID.NEXT, value); }
    /** Unsafe version of {@link #submeshId(XrUuid) submeshId}. */
    public static void nsubmeshId(long struct, XrUuid value) { memCopy(value.address(), struct + XrSceneSubmeshStateANDROID.SUBMESHID, XrUuid.SIZEOF); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrSceneSubmeshStateANDROID.LASTUPDATEDTIME, value); }
    /** Unsafe version of {@link #submeshPoseInBaseSpace(XrPosef) submeshPoseInBaseSpace}. */
    public static void nsubmeshPoseInBaseSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSceneSubmeshStateANDROID.SUBMESHPOSEINBASESPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #bounds(XrExtent3Df) bounds}. */
    public static void nbounds(long struct, XrExtent3Df value) { memCopy(value.address(), struct + XrSceneSubmeshStateANDROID.BOUNDS, XrExtent3Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSceneSubmeshStateANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSceneSubmeshStateANDROID, Buffer> implements NativeResource {

        private static final XrSceneSubmeshStateANDROID ELEMENT_FACTORY = XrSceneSubmeshStateANDROID.create(-1L);

        /**
         * Creates a new {@code XrSceneSubmeshStateANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneSubmeshStateANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneSubmeshStateANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneSubmeshStateANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSceneSubmeshStateANDROID.nnext(address()); }
        /** @return a {@link XrUuid} view of the {@code submeshId} field. */
        public XrUuid submeshId() { return XrSceneSubmeshStateANDROID.nsubmeshId(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrSceneSubmeshStateANDROID.nlastUpdatedTime(address()); }
        /** @return a {@link XrPosef} view of the {@code submeshPoseInBaseSpace} field. */
        public XrPosef submeshPoseInBaseSpace() { return XrSceneSubmeshStateANDROID.nsubmeshPoseInBaseSpace(address()); }
        /** @return a {@link XrExtent3Df} view of the {@code bounds} field. */
        public XrExtent3Df bounds() { return XrSceneSubmeshStateANDROID.nbounds(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneSubmeshStateANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSceneSubmeshStateANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_SUBMESH_STATE_ANDROID TYPE_SCENE_SUBMESH_STATE_ANDROID} value to the {@code type} field. */
        public XrSceneSubmeshStateANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_SUBMESH_STATE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneSubmeshStateANDROID.Buffer next(@NativeType("void *") long value) { XrSceneSubmeshStateANDROID.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code submeshId} field. */
        public XrSceneSubmeshStateANDROID.Buffer submeshId(XrUuid value) { XrSceneSubmeshStateANDROID.nsubmeshId(address(), value); return this; }
        /** Passes the {@code submeshId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneSubmeshStateANDROID.Buffer submeshId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(submeshId()); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrSceneSubmeshStateANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrSceneSubmeshStateANDROID.nlastUpdatedTime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code submeshPoseInBaseSpace} field. */
        public XrSceneSubmeshStateANDROID.Buffer submeshPoseInBaseSpace(XrPosef value) { XrSceneSubmeshStateANDROID.nsubmeshPoseInBaseSpace(address(), value); return this; }
        /** Passes the {@code submeshPoseInBaseSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneSubmeshStateANDROID.Buffer submeshPoseInBaseSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(submeshPoseInBaseSpace()); return this; }
        /** Copies the specified {@link XrExtent3Df} to the {@code bounds} field. */
        public XrSceneSubmeshStateANDROID.Buffer bounds(XrExtent3Df value) { XrSceneSubmeshStateANDROID.nbounds(address(), value); return this; }
        /** Passes the {@code bounds} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneSubmeshStateANDROID.Buffer bounds(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(bounds()); return this; }

    }

}