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
 * struct XrSceneComponentParentFilterInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuidMSFT XrUuidMSFT} parentId;
 * }}</pre>
 */
public class XrSceneComponentParentFilterInfoMSFT extends Struct<XrSceneComponentParentFilterInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARENTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidMSFT.SIZEOF, XrUuidMSFT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PARENTID = layout.offsetof(2);
    }

    protected XrSceneComponentParentFilterInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneComponentParentFilterInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneComponentParentFilterInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneComponentParentFilterInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentParentFilterInfoMSFT(ByteBuffer container) {
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
    /** @return a {@link XrUuidMSFT} view of the {@code parentId} field. */
    public XrUuidMSFT parentId() { return nparentId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneComponentParentFilterInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT} value to the {@code type} field. */
    public XrSceneComponentParentFilterInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneComponentParentFilterInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidMSFT} to the {@code parentId} field. */
    public XrSceneComponentParentFilterInfoMSFT parentId(XrUuidMSFT value) { nparentId(address(), value); return this; }
    /** Passes the {@code parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneComponentParentFilterInfoMSFT parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentParentFilterInfoMSFT set(
        int type,
        long next,
        XrUuidMSFT parentId
    ) {
        type(type);
        next(next);
        parentId(parentId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentParentFilterInfoMSFT set(XrSceneComponentParentFilterInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentParentFilterInfoMSFT malloc() {
        return new XrSceneComponentParentFilterInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentParentFilterInfoMSFT calloc() {
        return new XrSceneComponentParentFilterInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentParentFilterInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneComponentParentFilterInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance for the specified memory address. */
    public static XrSceneComponentParentFilterInfoMSFT create(long address) {
        return new XrSceneComponentParentFilterInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneComponentParentFilterInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneComponentParentFilterInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneComponentParentFilterInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentParentFilterInfoMSFT malloc(MemoryStack stack) {
        return new XrSceneComponentParentFilterInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneComponentParentFilterInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentParentFilterInfoMSFT calloc(MemoryStack stack) {
        return new XrSceneComponentParentFilterInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentParentFilterInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentParentFilterInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneComponentParentFilterInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentParentFilterInfoMSFT.NEXT); }
    /** Unsafe version of {@link #parentId}. */
    public static XrUuidMSFT nparentId(long struct) { return XrUuidMSFT.create(struct + XrSceneComponentParentFilterInfoMSFT.PARENTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneComponentParentFilterInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentParentFilterInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #parentId(XrUuidMSFT) parentId}. */
    public static void nparentId(long struct, XrUuidMSFT value) { memCopy(value.address(), struct + XrSceneComponentParentFilterInfoMSFT.PARENTID, XrUuidMSFT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSceneComponentParentFilterInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentParentFilterInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentParentFilterInfoMSFT ELEMENT_FACTORY = XrSceneComponentParentFilterInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentParentFilterInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentParentFilterInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneComponentParentFilterInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentParentFilterInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneComponentParentFilterInfoMSFT.nnext(address()); }
        /** @return a {@link XrUuidMSFT} view of the {@code parentId} field. */
        public XrUuidMSFT parentId() { return XrSceneComponentParentFilterInfoMSFT.nparentId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentParentFilterInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT} value to the {@code type} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneComponentParentFilterInfoMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidMSFT} to the {@code parentId} field. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer parentId(XrUuidMSFT value) { XrSceneComponentParentFilterInfoMSFT.nparentId(address(), value); return this; }
        /** Passes the {@code parentId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneComponentParentFilterInfoMSFT.Buffer parentId(java.util.function.Consumer<XrUuidMSFT> consumer) { consumer.accept(parentId()); return this; }

    }

}