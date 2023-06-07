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
 * Result of request to create a new spatial anchor.
 * 
 * <h5>Description</h5>
 * 
 * <p>It describes the result of a request to create a new spatial anchor. Once this event is posted, it is the applications responsibility to take ownership of the {@code XrSpace}. The {@code XrSession} passed into {@link FBSpatialEntity#xrCreateSpatialAnchorFB CreateSpatialAnchorFB} is the parent handle of the newly created {@code XrSpace}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using {@link XrEventDataSpatialAnchorCreateCompleteFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntity#XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEventDataBaseHeader}, {@link XrEventDataBuffer}, {@link XrUuidEXT}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSpatialAnchorCreateCompleteFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 *     XrSpace {@link #space};
 *     {@link XrUuidEXT XrUuidEXT} {@link #uuid};
 * }</code></pre>
 */
public class XrEventDataSpatialAnchorCreateCompleteFB extends Struct<XrEventDataSpatialAnchorCreateCompleteFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT,
        SPACE,
        UUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
        SPACE = layout.offsetof(4);
        UUID = layout.offsetof(5);
    }

    protected XrEventDataSpatialAnchorCreateCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpatialAnchorCreateCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpatialAnchorCreateCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpatialAnchorCreateCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpatialAnchorCreateCompleteFB(ByteBuffer container) {
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
    /** the ID of the asynchronous request used to create a new spatial anchor. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that determines if the request succeeded or if an error occurred. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }
    /** the {@code XrSpace} handle to the newly created spatial anchor. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the UUID of the newly created spatial anchor. */
    public XrUuidEXT uuid() { return nuuid(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSpatialAnchorCreateCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB} value to the {@link #type} field. */
    public XrEventDataSpatialAnchorCreateCompleteFB type$Default() { return type(FBSpatialEntity.XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSpatialAnchorCreateCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpatialAnchorCreateCompleteFB set(
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
    public XrEventDataSpatialAnchorCreateCompleteFB set(XrEventDataSpatialAnchorCreateCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpatialAnchorCreateCompleteFB malloc() {
        return new XrEventDataSpatialAnchorCreateCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpatialAnchorCreateCompleteFB calloc() {
        return new XrEventDataSpatialAnchorCreateCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpatialAnchorCreateCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpatialAnchorCreateCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpatialAnchorCreateCompleteFB create(long address) {
        return new XrEventDataSpatialAnchorCreateCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpatialAnchorCreateCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpatialAnchorCreateCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpatialAnchorCreateCompleteFB}. */
    public static XrEventDataSpatialAnchorCreateCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpatialAnchorCreateCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpatialAnchorCreateCompleteFB.Buffer}. */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpatialAnchorCreateCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpatialAnchorCreateCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpatialAnchorCreateCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpatialAnchorCreateCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpatialAnchorCreateCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpatialAnchorCreateCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpatialAnchorCreateCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSpatialAnchorCreateCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpatialAnchorCreateCompleteFB.RESULT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrEventDataSpatialAnchorCreateCompleteFB.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrEventDataSpatialAnchorCreateCompleteFB.UUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSpatialAnchorCreateCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpatialAnchorCreateCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpatialAnchorCreateCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpatialAnchorCreateCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpatialAnchorCreateCompleteFB ELEMENT_FACTORY = XrEventDataSpatialAnchorCreateCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpatialAnchorCreateCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpatialAnchorCreateCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSpatialAnchorCreateCompleteFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpatialAnchorCreateCompleteFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSpatialAnchorCreateCompleteFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpatialAnchorCreateCompleteFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSpatialAnchorCreateCompleteFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpatialAnchorCreateCompleteFB.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataSpatialAnchorCreateCompleteFB#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpatialAnchorCreateCompleteFB.nresult(address()); }
        /** @return the value of the {@link XrEventDataSpatialAnchorCreateCompleteFB#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrEventDataSpatialAnchorCreateCompleteFB.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrEventDataSpatialAnchorCreateCompleteFB#uuid} field. */
        public XrUuidEXT uuid() { return XrEventDataSpatialAnchorCreateCompleteFB.nuuid(address()); }

        /** Sets the specified value to the {@link XrEventDataSpatialAnchorCreateCompleteFB#type} field. */
        public XrEventDataSpatialAnchorCreateCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpatialAnchorCreateCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB} value to the {@link XrEventDataSpatialAnchorCreateCompleteFB#type} field. */
        public XrEventDataSpatialAnchorCreateCompleteFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB); }
        /** Sets the specified value to the {@link XrEventDataSpatialAnchorCreateCompleteFB#next} field. */
        public XrEventDataSpatialAnchorCreateCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpatialAnchorCreateCompleteFB.nnext(address(), value); return this; }

    }

}