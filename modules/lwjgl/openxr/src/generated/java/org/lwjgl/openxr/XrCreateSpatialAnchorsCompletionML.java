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
 * struct XrCreateSpatialAnchorsCompletionML {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     uint32_t spaceCount;
 *     XrSpace * spaces;
 * }}</pre>
 */
public class XrCreateSpatialAnchorsCompletionML extends Struct<XrCreateSpatialAnchorsCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        SPACECOUNT,
        SPACES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        SPACECOUNT = layout.offsetof(3);
        SPACES = layout.offsetof(4);
    }

    protected XrCreateSpatialAnchorsCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateSpatialAnchorsCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrCreateSpatialAnchorsCompletionML(address, container);
    }

    /**
     * Creates a {@code XrCreateSpatialAnchorsCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateSpatialAnchorsCompletionML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code spaceCount} field. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
    @NativeType("XrSpace *")
    public @Nullable PointerBuffer spaces() { return nspaces(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateSpatialAnchorsCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchors#XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML} value to the {@code type} field. */
    public XrCreateSpatialAnchorsCompletionML type$Default() { return type(MLSpatialAnchors.XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateSpatialAnchorsCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrCreateSpatialAnchorsCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code spaceCount} field. */
    public XrCreateSpatialAnchorsCompletionML spaceCount(@NativeType("uint32_t") int value) { nspaceCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    public XrCreateSpatialAnchorsCompletionML spaces(@Nullable @NativeType("XrSpace *") PointerBuffer value) { nspaces(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateSpatialAnchorsCompletionML set(
        int type,
        long next,
        int futureResult,
        int spaceCount,
        @Nullable PointerBuffer spaces
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        spaceCount(spaceCount);
        spaces(spaces);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateSpatialAnchorsCompletionML set(XrCreateSpatialAnchorsCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialAnchorsCompletionML malloc() {
        return new XrCreateSpatialAnchorsCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialAnchorsCompletionML calloc() {
        return new XrCreateSpatialAnchorsCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrCreateSpatialAnchorsCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateSpatialAnchorsCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance for the specified memory address. */
    public static XrCreateSpatialAnchorsCompletionML create(long address) {
        return new XrCreateSpatialAnchorsCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateSpatialAnchorsCompletionML createSafe(long address) {
        return address == NULL ? null : new XrCreateSpatialAnchorsCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrCreateSpatialAnchorsCompletionML}. */
    public static XrCreateSpatialAnchorsCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrCreateSpatialAnchorsCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateSpatialAnchorsCompletionML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrCreateSpatialAnchorsCompletionML.Buffer}. */
    public static XrCreateSpatialAnchorsCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrCreateSpatialAnchorsCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialAnchorsCompletionML malloc(MemoryStack stack) {
        return new XrCreateSpatialAnchorsCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateSpatialAnchorsCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialAnchorsCompletionML calloc(MemoryStack stack) {
        return new XrCreateSpatialAnchorsCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialAnchorsCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialAnchorsCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateSpatialAnchorsCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateSpatialAnchorsCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrCreateSpatialAnchorsCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return memGetInt(struct + XrCreateSpatialAnchorsCompletionML.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static @Nullable PointerBuffer nspaces(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrCreateSpatialAnchorsCompletionML.SPACES), nspaceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateSpatialAnchorsCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateSpatialAnchorsCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrCreateSpatialAnchorsCompletionML.FUTURERESULT, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { memPutInt(struct + XrCreateSpatialAnchorsCompletionML.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrCreateSpatialAnchorsCompletionML.SPACES, memAddressSafe(value)); if (value != null) { nspaceCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrCreateSpatialAnchorsCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrCreateSpatialAnchorsCompletionML, Buffer> implements NativeResource {

        private static final XrCreateSpatialAnchorsCompletionML ELEMENT_FACTORY = XrCreateSpatialAnchorsCompletionML.create(-1L);

        /**
         * Creates a new {@code XrCreateSpatialAnchorsCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateSpatialAnchorsCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateSpatialAnchorsCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateSpatialAnchorsCompletionML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCreateSpatialAnchorsCompletionML.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrCreateSpatialAnchorsCompletionML.nfutureResult(address()); }
        /** @return the value of the {@code spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrCreateSpatialAnchorsCompletionML.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
        @NativeType("XrSpace *")
        public @Nullable PointerBuffer spaces() { return XrCreateSpatialAnchorsCompletionML.nspaces(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrCreateSpatialAnchorsCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchors#XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML} value to the {@code type} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer type$Default() { return type(MLSpatialAnchors.XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer next(@NativeType("void *") long value) { XrCreateSpatialAnchorsCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrCreateSpatialAnchorsCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code spaceCount} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer spaceCount(@NativeType("uint32_t") int value) { XrCreateSpatialAnchorsCompletionML.nspaceCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        public XrCreateSpatialAnchorsCompletionML.Buffer spaces(@Nullable @NativeType("XrSpace *") PointerBuffer value) { XrCreateSpatialAnchorsCompletionML.nspaces(address(), value); return this; }

    }

}