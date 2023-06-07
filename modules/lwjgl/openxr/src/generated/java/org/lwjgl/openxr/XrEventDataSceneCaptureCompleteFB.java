/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event which occurs after a scene capture operation completes.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEventDataSceneCaptureCompleteFB} structure is used by an application to instruct the system what to look for during a scene capture.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSceneCapture XR_FB_scene_capture} extension <b>must</b> be enabled prior to using {@link XrEventDataSceneCaptureCompleteFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSceneCapture#XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSceneCaptureCompleteFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the ID of the asynchronous query request. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that indicates if the request succeeded or if an error occurred. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSceneCaptureCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSceneCapture#XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB} value to the {@link #type} field. */
    public XrEventDataSceneCaptureCompleteFB type$Default() { return type(FBSceneCapture.XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSceneCaptureCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #requestId} field. */
    public XrEventDataSceneCaptureCompleteFB requestId(@NativeType("XrAsyncRequestIdFB") long value) { nrequestId(address(), value); return this; }
    /** Sets the specified value to the {@link #result} field. */
    public XrEventDataSceneCaptureCompleteFB result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSceneCaptureCompleteFB set(
        int type,
        long next,
        long requestId,
        int result
    ) {
        type(type);
        next(next);
        requestId(requestId);
        result(result);

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
    @Nullable
    public static XrEventDataSceneCaptureCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSceneCaptureCompleteFB(address, null);
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
    @Nullable
    public static XrEventDataSceneCaptureCompleteFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSceneCaptureCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSceneCaptureCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSceneCaptureCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSceneCaptureCompleteFB.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSceneCaptureCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSceneCaptureCompleteFB.NEXT, value); }
    /** Unsafe version of {@link #requestId(long) requestId}. */
    public static void nrequestId(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataSceneCaptureCompleteFB.REQUESTID, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSceneCaptureCompleteFB.RESULT, value); }

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
        protected XrEventDataSceneCaptureCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSceneCaptureCompleteFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSceneCaptureCompleteFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSceneCaptureCompleteFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSceneCaptureCompleteFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSceneCaptureCompleteFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSceneCaptureCompleteFB.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataSceneCaptureCompleteFB#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSceneCaptureCompleteFB.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataSceneCaptureCompleteFB#type} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSceneCaptureCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSceneCapture#XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB} value to the {@link XrEventDataSceneCaptureCompleteFB#type} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer type$Default() { return type(FBSceneCapture.XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB); }
        /** Sets the specified value to the {@link XrEventDataSceneCaptureCompleteFB#next} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSceneCaptureCompleteFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataSceneCaptureCompleteFB#requestId} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer requestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataSceneCaptureCompleteFB.nrequestId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataSceneCaptureCompleteFB#result} field. */
        public XrEventDataSceneCaptureCompleteFB.Buffer result(@NativeType("XrResult") int value) { XrEventDataSceneCaptureCompleteFB.nresult(address(), value); return this; }

    }

}