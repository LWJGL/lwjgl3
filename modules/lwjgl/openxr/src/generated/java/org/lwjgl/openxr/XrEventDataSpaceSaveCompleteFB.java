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
 * Describes the result of a save operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The save result event contains the success of the save/write operation to the specified location, as well as the {@code XrSpace} handle on which the save operation was attempted on, the unique UUID, and the triggered async request ID from the initial calling function.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using {@link XrEventDataSpaceSaveCompleteFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityStorage#XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSpaceSaveCompleteFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 *     XrSpace {@link #space};
 *     {@link XrUuidEXT XrUuidEXT} {@link #uuid};
 *     XrSpaceStorageLocationFB {@link #location};
 * }</code></pre>
 */
public class XrEventDataSpaceSaveCompleteFB extends Struct<XrEventDataSpaceSaveCompleteFB> implements NativeResource {

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
        UUID,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
        SPACE = layout.offsetof(4);
        UUID = layout.offsetof(5);
        LOCATION = layout.offsetof(6);
    }

    protected XrEventDataSpaceSaveCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceSaveCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceSaveCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceSaveCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceSaveCompleteFB(ByteBuffer container) {
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
    /** the spatial entity being saved. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the UUID for the spatial entity being saved. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** the location of the spatial entity being saved. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSpaceSaveCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB} value to the {@link #type} field. */
    public XrEventDataSpaceSaveCompleteFB type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSpaceSaveCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceSaveCompleteFB set(
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
    public XrEventDataSpaceSaveCompleteFB set(XrEventDataSpaceSaveCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceSaveCompleteFB malloc() {
        return new XrEventDataSpaceSaveCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceSaveCompleteFB calloc() {
        return new XrEventDataSpaceSaveCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceSaveCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceSaveCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceSaveCompleteFB create(long address) {
        return new XrEventDataSpaceSaveCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceSaveCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceSaveCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceSaveCompleteFB}. */
    public static XrEventDataSpaceSaveCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceSaveCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceSaveCompleteFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceSaveCompleteFB.Buffer}. */
    public static XrEventDataSpaceSaveCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceSaveCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceSaveCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceSaveCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceSaveCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceSaveCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceSaveCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceSaveCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceSaveCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceSaveCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceSaveCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSpaceSaveCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceSaveCompleteFB.RESULT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrEventDataSpaceSaveCompleteFB.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrEventDataSpaceSaveCompleteFB.UUID); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceSaveCompleteFB.LOCATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSpaceSaveCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceSaveCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceSaveCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceSaveCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceSaveCompleteFB ELEMENT_FACTORY = XrEventDataSpaceSaveCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceSaveCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceSaveCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceSaveCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceSaveCompleteFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceSaveCompleteFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceSaveCompleteFB.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceSaveCompleteFB.nresult(address()); }
        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrEventDataSpaceSaveCompleteFB.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrEventDataSpaceSaveCompleteFB#uuid} field. */
        public XrUuidEXT uuid() { return XrEventDataSpaceSaveCompleteFB.nuuid(address()); }
        /** @return the value of the {@link XrEventDataSpaceSaveCompleteFB#location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrEventDataSpaceSaveCompleteFB.nlocation(address()); }

        /** Sets the specified value to the {@link XrEventDataSpaceSaveCompleteFB#type} field. */
        public XrEventDataSpaceSaveCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceSaveCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB} value to the {@link XrEventDataSpaceSaveCompleteFB#type} field. */
        public XrEventDataSpaceSaveCompleteFB.Buffer type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB); }
        /** Sets the specified value to the {@link XrEventDataSpaceSaveCompleteFB#next} field. */
        public XrEventDataSpaceSaveCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceSaveCompleteFB.nnext(address(), value); return this; }

    }

}