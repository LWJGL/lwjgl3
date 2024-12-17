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
 * struct XrCoordinateSpaceCreateInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     {@link MLCoordinateFrameUID MLCoordinateFrameUID} cfuid;
 *     {@link XrPosef XrPosef} poseInCoordinateSpace;
 * }}</pre>
 */
public class XrCoordinateSpaceCreateInfoML extends Struct<XrCoordinateSpaceCreateInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CFUID,
        POSEINCOORDINATESPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(MLCoordinateFrameUID.SIZEOF, MLCoordinateFrameUID.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CFUID = layout.offsetof(2);
        POSEINCOORDINATESPACE = layout.offsetof(3);
    }

    protected XrCoordinateSpaceCreateInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCoordinateSpaceCreateInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrCoordinateSpaceCreateInfoML(address, container);
    }

    /**
     * Creates a {@code XrCoordinateSpaceCreateInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCoordinateSpaceCreateInfoML(ByteBuffer container) {
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
    /** @return a {@link MLCoordinateFrameUID} view of the {@code cfuid} field. */
    public MLCoordinateFrameUID cfuid() { return ncfuid(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInCoordinateSpace} field. */
    public XrPosef poseInCoordinateSpace() { return nposeInCoordinateSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCoordinateSpaceCreateInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLCompat#XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML TYPE_COORDINATE_SPACE_CREATE_INFO_ML} value to the {@code type} field. */
    public XrCoordinateSpaceCreateInfoML type$Default() { return type(MLCompat.XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrCoordinateSpaceCreateInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link MLCoordinateFrameUID} to the {@code cfuid} field. */
    public XrCoordinateSpaceCreateInfoML cfuid(MLCoordinateFrameUID value) { ncfuid(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInCoordinateSpace} field. */
    public XrCoordinateSpaceCreateInfoML poseInCoordinateSpace(XrPosef value) { nposeInCoordinateSpace(address(), value); return this; }
    /** Passes the {@code poseInCoordinateSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCoordinateSpaceCreateInfoML poseInCoordinateSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInCoordinateSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCoordinateSpaceCreateInfoML set(
        int type,
        long next,
        MLCoordinateFrameUID cfuid,
        XrPosef poseInCoordinateSpace
    ) {
        type(type);
        next(next);
        cfuid(cfuid);
        poseInCoordinateSpace(poseInCoordinateSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCoordinateSpaceCreateInfoML set(XrCoordinateSpaceCreateInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCoordinateSpaceCreateInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCoordinateSpaceCreateInfoML malloc() {
        return new XrCoordinateSpaceCreateInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCoordinateSpaceCreateInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCoordinateSpaceCreateInfoML calloc() {
        return new XrCoordinateSpaceCreateInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCoordinateSpaceCreateInfoML} instance allocated with {@link BufferUtils}. */
    public static XrCoordinateSpaceCreateInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCoordinateSpaceCreateInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrCoordinateSpaceCreateInfoML} instance for the specified memory address. */
    public static XrCoordinateSpaceCreateInfoML create(long address) {
        return new XrCoordinateSpaceCreateInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCoordinateSpaceCreateInfoML createSafe(long address) {
        return address == NULL ? null : new XrCoordinateSpaceCreateInfoML(address, null);
    }

    /**
     * Returns a new {@link XrCoordinateSpaceCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCoordinateSpaceCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCoordinateSpaceCreateInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCoordinateSpaceCreateInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCoordinateSpaceCreateInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCoordinateSpaceCreateInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCoordinateSpaceCreateInfoML malloc(MemoryStack stack) {
        return new XrCoordinateSpaceCreateInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCoordinateSpaceCreateInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCoordinateSpaceCreateInfoML calloc(MemoryStack stack) {
        return new XrCoordinateSpaceCreateInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCoordinateSpaceCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCoordinateSpaceCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCoordinateSpaceCreateInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCoordinateSpaceCreateInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCoordinateSpaceCreateInfoML.NEXT); }
    /** Unsafe version of {@link #cfuid}. */
    public static MLCoordinateFrameUID ncfuid(long struct) { return MLCoordinateFrameUID.create(struct + XrCoordinateSpaceCreateInfoML.CFUID); }
    /** Unsafe version of {@link #poseInCoordinateSpace}. */
    public static XrPosef nposeInCoordinateSpace(long struct) { return XrPosef.create(struct + XrCoordinateSpaceCreateInfoML.POSEINCOORDINATESPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCoordinateSpaceCreateInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCoordinateSpaceCreateInfoML.NEXT, value); }
    /** Unsafe version of {@link #cfuid(MLCoordinateFrameUID) cfuid}. */
    public static void ncfuid(long struct, MLCoordinateFrameUID value) { memCopy(value.address(), struct + XrCoordinateSpaceCreateInfoML.CFUID, MLCoordinateFrameUID.SIZEOF); }
    /** Unsafe version of {@link #poseInCoordinateSpace(XrPosef) poseInCoordinateSpace}. */
    public static void nposeInCoordinateSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrCoordinateSpaceCreateInfoML.POSEINCOORDINATESPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrCoordinateSpaceCreateInfoML} structs. */
    public static class Buffer extends StructBuffer<XrCoordinateSpaceCreateInfoML, Buffer> implements NativeResource {

        private static final XrCoordinateSpaceCreateInfoML ELEMENT_FACTORY = XrCoordinateSpaceCreateInfoML.create(-1L);

        /**
         * Creates a new {@code XrCoordinateSpaceCreateInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCoordinateSpaceCreateInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCoordinateSpaceCreateInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCoordinateSpaceCreateInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCoordinateSpaceCreateInfoML.nnext(address()); }
        /** @return a {@link MLCoordinateFrameUID} view of the {@code cfuid} field. */
        public MLCoordinateFrameUID cfuid() { return XrCoordinateSpaceCreateInfoML.ncfuid(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInCoordinateSpace} field. */
        public XrPosef poseInCoordinateSpace() { return XrCoordinateSpaceCreateInfoML.nposeInCoordinateSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCoordinateSpaceCreateInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrCoordinateSpaceCreateInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLCompat#XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML TYPE_COORDINATE_SPACE_CREATE_INFO_ML} value to the {@code type} field. */
        public XrCoordinateSpaceCreateInfoML.Buffer type$Default() { return type(MLCompat.XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrCoordinateSpaceCreateInfoML.Buffer next(@NativeType("void const *") long value) { XrCoordinateSpaceCreateInfoML.nnext(address(), value); return this; }
        /** Copies the specified {@link MLCoordinateFrameUID} to the {@code cfuid} field. */
        public XrCoordinateSpaceCreateInfoML.Buffer cfuid(MLCoordinateFrameUID value) { XrCoordinateSpaceCreateInfoML.ncfuid(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInCoordinateSpace} field. */
        public XrCoordinateSpaceCreateInfoML.Buffer poseInCoordinateSpace(XrPosef value) { XrCoordinateSpaceCreateInfoML.nposeInCoordinateSpace(address(), value); return this; }
        /** Passes the {@code poseInCoordinateSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCoordinateSpaceCreateInfoML.Buffer poseInCoordinateSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInCoordinateSpace()); return this; }

    }

}