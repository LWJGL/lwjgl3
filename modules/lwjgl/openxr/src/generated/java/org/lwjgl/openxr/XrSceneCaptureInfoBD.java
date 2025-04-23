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
 * struct XrSceneCaptureInfoBD {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSceneCaptureInfoBD extends Struct<XrSceneCaptureInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSceneCaptureInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneCaptureInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSceneCaptureInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSceneCaptureInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneCaptureInfoBD(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSceneCaptureInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialScene#XR_TYPE_SCENE_CAPTURE_INFO_BD TYPE_SCENE_CAPTURE_INFO_BD} value to the {@code type} field. */
    public XrSceneCaptureInfoBD type$Default() { return type(BDSpatialScene.XR_TYPE_SCENE_CAPTURE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneCaptureInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneCaptureInfoBD set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneCaptureInfoBD set(XrSceneCaptureInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneCaptureInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneCaptureInfoBD malloc() {
        return new XrSceneCaptureInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneCaptureInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneCaptureInfoBD calloc() {
        return new XrSceneCaptureInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneCaptureInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSceneCaptureInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneCaptureInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneCaptureInfoBD} instance for the specified memory address. */
    public static XrSceneCaptureInfoBD create(long address) {
        return new XrSceneCaptureInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneCaptureInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSceneCaptureInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSceneCaptureInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneCaptureInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneCaptureInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneCaptureInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneCaptureInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneCaptureInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneCaptureInfoBD malloc(MemoryStack stack) {
        return new XrSceneCaptureInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneCaptureInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneCaptureInfoBD calloc(MemoryStack stack) {
        return new XrSceneCaptureInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneCaptureInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneCaptureInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneCaptureInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneCaptureInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneCaptureInfoBD.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneCaptureInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneCaptureInfoBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSceneCaptureInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSceneCaptureInfoBD, Buffer> implements NativeResource {

        private static final XrSceneCaptureInfoBD ELEMENT_FACTORY = XrSceneCaptureInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSceneCaptureInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneCaptureInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneCaptureInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneCaptureInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneCaptureInfoBD.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneCaptureInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSceneCaptureInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialScene#XR_TYPE_SCENE_CAPTURE_INFO_BD TYPE_SCENE_CAPTURE_INFO_BD} value to the {@code type} field. */
        public XrSceneCaptureInfoBD.Buffer type$Default() { return type(BDSpatialScene.XR_TYPE_SCENE_CAPTURE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneCaptureInfoBD.Buffer next(@NativeType("void const *") long value) { XrSceneCaptureInfoBD.nnext(address(), value); return this; }

    }

}