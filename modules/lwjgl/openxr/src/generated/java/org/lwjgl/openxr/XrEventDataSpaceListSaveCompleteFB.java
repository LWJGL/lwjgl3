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
 * Describes the completion of a save list operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>This completion event indicates that a request to save a list of {@code XrSpace} objects has completed. The application <b>can</b> use {@code result} to check if the request was successful or if an error occurred.</p>
 * 
 * <h5>Result Codes</h5>
 * 
 * <dl>
 * <dt>On success, the value of this parameter is</dt>
 * <dd><ul>
 * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
 * </ul></dd>
 * <dt>On failure, the value of this parameter is</dt>
 * <dd><ul>
 * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB ERROR_SPACE_MAPPING_INSUFFICIENT_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_LOCALIZATION_FAILED_FB ERROR_SPACE_LOCALIZATION_FAILED_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}</li>
 * <li>{@link FBSpatialEntitySharing#XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to using {@link XrEventDataSpaceListSaveCompleteFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityStorageBatch#XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSpaceListSaveCompleteFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 * }</code></pre>
 */
public class XrEventDataSpaceListSaveCompleteFB extends Struct<XrEventDataSpaceListSaveCompleteFB> implements NativeResource {

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

    protected XrEventDataSpaceListSaveCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceListSaveCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceListSaveCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceListSaveCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceListSaveCompleteFB(ByteBuffer container) {
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
    /** the ID of the asynchronous request to save an entity. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that describes whether the request succeeded or if an error occurred. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSpaceListSaveCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorageBatch#XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB} value to the {@link #type} field. */
    public XrEventDataSpaceListSaveCompleteFB type$Default() { return type(FBSpatialEntityStorageBatch.XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSpaceListSaveCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceListSaveCompleteFB set(
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
    public XrEventDataSpaceListSaveCompleteFB set(XrEventDataSpaceListSaveCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceListSaveCompleteFB malloc() {
        return new XrEventDataSpaceListSaveCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceListSaveCompleteFB calloc() {
        return new XrEventDataSpaceListSaveCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceListSaveCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceListSaveCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceListSaveCompleteFB create(long address) {
        return new XrEventDataSpaceListSaveCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceListSaveCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceListSaveCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceListSaveCompleteFB}. */
    public static XrEventDataSpaceListSaveCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceListSaveCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceListSaveCompleteFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceListSaveCompleteFB.Buffer}. */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceListSaveCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceListSaveCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceListSaveCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceListSaveCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceListSaveCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceListSaveCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceListSaveCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceListSaveCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceListSaveCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceListSaveCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSpaceListSaveCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceListSaveCompleteFB.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSpaceListSaveCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceListSaveCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceListSaveCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceListSaveCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceListSaveCompleteFB ELEMENT_FACTORY = XrEventDataSpaceListSaveCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceListSaveCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceListSaveCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceListSaveCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSpaceListSaveCompleteFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceListSaveCompleteFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSpaceListSaveCompleteFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceListSaveCompleteFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSpaceListSaveCompleteFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceListSaveCompleteFB.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataSpaceListSaveCompleteFB#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceListSaveCompleteFB.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataSpaceListSaveCompleteFB#type} field. */
        public XrEventDataSpaceListSaveCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceListSaveCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorageBatch#XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB} value to the {@link XrEventDataSpaceListSaveCompleteFB#type} field. */
        public XrEventDataSpaceListSaveCompleteFB.Buffer type$Default() { return type(FBSpatialEntityStorageBatch.XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB); }
        /** Sets the specified value to the {@link XrEventDataSpaceListSaveCompleteFB#next} field. */
        public XrEventDataSpaceListSaveCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceListSaveCompleteFB.nnext(address(), value); return this; }

    }

}