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
 * share spatial entity complete event.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension <b>must</b> be enabled prior to using {@link XrEventDataShareSpacesCompleteMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METASpatialEntitySharing#XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METASpatialEntitySharing#xrShareSpacesMETA ShareSpacesMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataShareSpacesCompleteMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 * }</code></pre>
 */
public class XrEventDataShareSpacesCompleteMETA extends Struct<XrEventDataShareSpacesCompleteMETA> implements NativeResource {

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

    protected XrEventDataShareSpacesCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataShareSpacesCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataShareSpacesCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataShareSpacesCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataShareSpacesCompleteMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrAsyncRequestIdFB} that identifies which request this event is referring to. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that specifies the request result. The valid {@code result} values are: {@link XR10#XR_SUCCESS SUCCESS}, {@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}, {@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}, and {@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataShareSpacesCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntitySharing#XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META} value to the {@link #type} field. */
    public XrEventDataShareSpacesCompleteMETA type$Default() { return type(METASpatialEntitySharing.XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataShareSpacesCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #requestId} field. */
    public XrEventDataShareSpacesCompleteMETA requestId(@NativeType("XrAsyncRequestIdFB") long value) { nrequestId(address(), value); return this; }
    /** Sets the specified value to the {@link #result} field. */
    public XrEventDataShareSpacesCompleteMETA result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataShareSpacesCompleteMETA set(
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
    public XrEventDataShareSpacesCompleteMETA set(XrEventDataShareSpacesCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataShareSpacesCompleteMETA malloc() {
        return new XrEventDataShareSpacesCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataShareSpacesCompleteMETA calloc() {
        return new XrEventDataShareSpacesCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataShareSpacesCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataShareSpacesCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance for the specified memory address. */
    public static XrEventDataShareSpacesCompleteMETA create(long address) {
        return new XrEventDataShareSpacesCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataShareSpacesCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataShareSpacesCompleteMETA(address, null);
    }

    /**
     * Returns a new {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataShareSpacesCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataShareSpacesCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataShareSpacesCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataShareSpacesCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataShareSpacesCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataShareSpacesCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataShareSpacesCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataShareSpacesCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataShareSpacesCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataShareSpacesCompleteMETA.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataShareSpacesCompleteMETA.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataShareSpacesCompleteMETA.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataShareSpacesCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataShareSpacesCompleteMETA.NEXT, value); }
    /** Unsafe version of {@link #requestId(long) requestId}. */
    public static void nrequestId(long struct, long value) { memPutLong(struct + XrEventDataShareSpacesCompleteMETA.REQUESTID, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + XrEventDataShareSpacesCompleteMETA.RESULT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataShareSpacesCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataShareSpacesCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataShareSpacesCompleteMETA ELEMENT_FACTORY = XrEventDataShareSpacesCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataShareSpacesCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataShareSpacesCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataShareSpacesCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataShareSpacesCompleteMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataShareSpacesCompleteMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataShareSpacesCompleteMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataShareSpacesCompleteMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataShareSpacesCompleteMETA#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataShareSpacesCompleteMETA.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataShareSpacesCompleteMETA#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataShareSpacesCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataShareSpacesCompleteMETA#type} field. */
        public XrEventDataShareSpacesCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataShareSpacesCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntitySharing#XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META} value to the {@link XrEventDataShareSpacesCompleteMETA#type} field. */
        public XrEventDataShareSpacesCompleteMETA.Buffer type$Default() { return type(METASpatialEntitySharing.XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META); }
        /** Sets the specified value to the {@link XrEventDataShareSpacesCompleteMETA#next} field. */
        public XrEventDataShareSpacesCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataShareSpacesCompleteMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataShareSpacesCompleteMETA#requestId} field. */
        public XrEventDataShareSpacesCompleteMETA.Buffer requestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataShareSpacesCompleteMETA.nrequestId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataShareSpacesCompleteMETA#result} field. */
        public XrEventDataShareSpacesCompleteMETA.Buffer result(@NativeType("XrResult") int value) { XrEventDataShareSpacesCompleteMETA.nresult(address(), value); return this; }

    }

}