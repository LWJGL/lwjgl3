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
 * struct XrFaceTrackerCreateInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrFaceExpressionSetFB faceExpressionSet;
 * }}</pre>
 */
public class XrFaceTrackerCreateInfoFB extends Struct<XrFaceTrackerCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FACEEXPRESSIONSET;

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
        FACEEXPRESSIONSET = layout.offsetof(2);
    }

    protected XrFaceTrackerCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceTrackerCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceTrackerCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrFaceTrackerCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceTrackerCreateInfoFB(ByteBuffer container) {
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
    @NativeType("XrFaceExpressionSetFB")
    public int faceExpressionSet() { return nfaceExpressionSet(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceTrackerCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_TRACKER_CREATE_INFO_FB TYPE_FACE_TRACKER_CREATE_INFO_FB} value to the {@code type} field. */
    public XrFaceTrackerCreateInfoFB type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_TRACKER_CREATE_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceTrackerCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code faceExpressionSet} field. */
    public XrFaceTrackerCreateInfoFB faceExpressionSet(@NativeType("XrFaceExpressionSetFB") int value) { nfaceExpressionSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceTrackerCreateInfoFB set(
        int type,
        long next,
        int faceExpressionSet
    ) {
        type(type);
        next(next);
        faceExpressionSet(faceExpressionSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceTrackerCreateInfoFB set(XrFaceTrackerCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfoFB malloc() {
        return new XrFaceTrackerCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceTrackerCreateInfoFB calloc() {
        return new XrFaceTrackerCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrFaceTrackerCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceTrackerCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceTrackerCreateInfoFB} instance for the specified memory address. */
    public static XrFaceTrackerCreateInfoFB create(long address) {
        return new XrFaceTrackerCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceTrackerCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrFaceTrackerCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceTrackerCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceTrackerCreateInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfoFB malloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackerCreateInfoFB calloc(MemoryStack stack) {
        return new XrFaceTrackerCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackerCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceTrackerCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #faceExpressionSet}. */
    public static int nfaceExpressionSet(long struct) { return memGetInt(struct + XrFaceTrackerCreateInfoFB.FACEEXPRESSIONSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceTrackerCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #faceExpressionSet(int) faceExpressionSet}. */
    public static void nfaceExpressionSet(long struct, int value) { memPutInt(struct + XrFaceTrackerCreateInfoFB.FACEEXPRESSIONSET, value); }

    // -----------------------------------

    /** An array of {@link XrFaceTrackerCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrFaceTrackerCreateInfoFB, Buffer> implements NativeResource {

        private static final XrFaceTrackerCreateInfoFB ELEMENT_FACTORY = XrFaceTrackerCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrFaceTrackerCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceTrackerCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceTrackerCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceTrackerCreateInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceTrackerCreateInfoFB.nnext(address()); }
        /** @return the value of the {@code faceExpressionSet} field. */
        @NativeType("XrFaceExpressionSetFB")
        public int faceExpressionSet() { return XrFaceTrackerCreateInfoFB.nfaceExpressionSet(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceTrackerCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceTrackerCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_TRACKER_CREATE_INFO_FB TYPE_FACE_TRACKER_CREATE_INFO_FB} value to the {@code type} field. */
        public XrFaceTrackerCreateInfoFB.Buffer type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_TRACKER_CREATE_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceTrackerCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrFaceTrackerCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code faceExpressionSet} field. */
        public XrFaceTrackerCreateInfoFB.Buffer faceExpressionSet(@NativeType("XrFaceExpressionSetFB") int value) { XrFaceTrackerCreateInfoFB.nfaceExpressionSet(address(), value); return this; }

    }

}