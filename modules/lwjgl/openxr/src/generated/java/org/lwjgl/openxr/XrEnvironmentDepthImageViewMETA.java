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
 * struct XrEnvironmentDepthImageViewMETA {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrFovf XrFovf} fov;
 *     {@link XrPosef XrPosef} pose;
 * }}</pre>
 */
public class XrEnvironmentDepthImageViewMETA extends Struct<XrEnvironmentDepthImageViewMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FOV,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FOV = layout.offsetof(2);
        POSE = layout.offsetof(3);
    }

    protected XrEnvironmentDepthImageViewMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthImageViewMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthImageViewMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthImageViewMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthImageViewMETA(ByteBuffer container) {
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
    /** @return a {@link XrFovf} view of the {@code fov} field. */
    public XrFovf fov() { return nfov(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentDepthImageViewMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META} value to the {@code type} field. */
    public XrEnvironmentDepthImageViewMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentDepthImageViewMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrFovf} to the {@code fov} field. */
    public XrEnvironmentDepthImageViewMETA fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@code fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentDepthImageViewMETA fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrEnvironmentDepthImageViewMETA pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentDepthImageViewMETA pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthImageViewMETA set(
        int type,
        long next,
        XrFovf fov,
        XrPosef pose
    ) {
        type(type);
        next(next);
        fov(fov);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthImageViewMETA set(XrEnvironmentDepthImageViewMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthImageViewMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageViewMETA malloc() {
        return new XrEnvironmentDepthImageViewMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageViewMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageViewMETA calloc() {
        return new XrEnvironmentDepthImageViewMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageViewMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthImageViewMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthImageViewMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthImageViewMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthImageViewMETA create(long address) {
        return new XrEnvironmentDepthImageViewMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentDepthImageViewMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthImageViewMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageViewMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageViewMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageViewMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthImageViewMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentDepthImageViewMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageViewMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageViewMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageViewMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageViewMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageViewMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageViewMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageViewMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageViewMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageViewMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentDepthImageViewMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthImageViewMETA.NEXT); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrEnvironmentDepthImageViewMETA.FOV); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrEnvironmentDepthImageViewMETA.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentDepthImageViewMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthImageViewMETA.NEXT, value); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrEnvironmentDepthImageViewMETA.FOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrEnvironmentDepthImageViewMETA.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthImageViewMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthImageViewMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthImageViewMETA ELEMENT_FACTORY = XrEnvironmentDepthImageViewMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthImageViewMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthImageViewMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthImageViewMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthImageViewMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentDepthImageViewMETA.nnext(address()); }
        /** @return a {@link XrFovf} view of the {@code fov} field. */
        public XrFovf fov() { return XrEnvironmentDepthImageViewMETA.nfov(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrEnvironmentDepthImageViewMETA.npose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentDepthImageViewMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthImageViewMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META} value to the {@code type} field. */
        public XrEnvironmentDepthImageViewMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentDepthImageViewMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentDepthImageViewMETA.nnext(address(), value); return this; }
        /** Copies the specified {@link XrFovf} to the {@code fov} field. */
        public XrEnvironmentDepthImageViewMETA.Buffer fov(XrFovf value) { XrEnvironmentDepthImageViewMETA.nfov(address(), value); return this; }
        /** Passes the {@code fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentDepthImageViewMETA.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrEnvironmentDepthImageViewMETA.Buffer pose(XrPosef value) { XrEnvironmentDepthImageViewMETA.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentDepthImageViewMETA.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}