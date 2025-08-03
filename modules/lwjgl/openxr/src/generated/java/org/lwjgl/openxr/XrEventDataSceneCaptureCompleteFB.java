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
 * struct XrEventDataSceneCaptureCompleteFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 *     XrResult result;
 * }}</pre>
 */
public class XrEventDataSceneCaptureCompleteFB extends Struct<XrEventDataSceneCaptureCompleteFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    protected XrEventDataSceneCaptureCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSceneCaptureCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSceneCaptureCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSceneCaptureCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSceneCaptureCompleteFB(ByteBuffer container) {
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
    /** @return the value of the {@code requestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSceneCaptureCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSceneCapture#XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB} value to the {@code type} field. */
    public XrEventDataSceneCaptureCompleteFB type$Default() { return type(FBSceneCapture.XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSceneCaptureCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSceneCaptureCompleteFB set(
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
    public XrEventDataSceneCaptureCompleteFB set(XrEventDataSceneCaptureCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSceneCaptureCompleteFB malloc() {
        return new XrEventDataSceneCaptureCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSceneCaptureCompleteFB calloc() {
        return new XrEventDataSceneCaptureCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSceneCaptureCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSceneCaptureCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance for the specified memory address. */
    public static XrEventDataSceneCaptureCompleteFB create(long address) {
        return new XrEventDataSceneCaptureCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSceneCaptureCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSceneCaptureCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSceneCaptureCompleteFB}. */
    public static XrEventDataSceneCaptureCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSceneCaptureCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSceneCaptureCompleteFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSceneCaptureCompleteFB.Buffer}. */
    public static XrEventDataSceneCaptureCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSceneCaptureCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSceneCaptureCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSceneCaptureCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSceneCaptureCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSceneCaptureCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSceneCaptureCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSceneCaptureCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSceneCaptureCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSceneCaptureCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSceneCaptureCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataSceneCaptureCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataSceneCaptureCompleteFB.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSceneCaptureCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSceneCaptureCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSceneCaptureCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSceneCaptureCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSceneCaptureCompleteFB ELEMENT_FACTORY = XrEventDataSceneCaptureCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSceneCaptureCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSceneCaptureCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSceneCaptureCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSceneCaptureCompleteFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSceneCaptureCompleteFB.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSceneCaptureCompleteFB.nrequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSceneCaptureCompleteFB.nresult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSceneCaptureCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSceneCapture#XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB} value to the {@code type} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer type$Default() { return type(FBSceneCapture.XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSceneCaptureCompleteFB.nnext(address(), value); return this; }

    }

}