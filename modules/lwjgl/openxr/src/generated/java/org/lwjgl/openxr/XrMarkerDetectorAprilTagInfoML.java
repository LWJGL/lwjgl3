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
 * struct XrMarkerDetectorAprilTagInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrMarkerAprilTagDictML aprilTagDict;
 * }}</pre>
 */
public class XrMarkerDetectorAprilTagInfoML extends Struct<XrMarkerDetectorAprilTagInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        APRILTAGDICT;

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
        APRILTAGDICT = layout.offsetof(2);
    }

    protected XrMarkerDetectorAprilTagInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerDetectorAprilTagInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerDetectorAprilTagInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerDetectorAprilTagInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerDetectorAprilTagInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code aprilTagDict} field. */
    @NativeType("XrMarkerAprilTagDictML")
    public int aprilTagDict() { return naprilTagDict(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerDetectorAprilTagInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML} value to the {@code type} field. */
    public XrMarkerDetectorAprilTagInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerDetectorAprilTagInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code aprilTagDict} field. */
    public XrMarkerDetectorAprilTagInfoML aprilTagDict(@NativeType("XrMarkerAprilTagDictML") int value) { naprilTagDict(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerDetectorAprilTagInfoML set(
        int type,
        long next,
        int aprilTagDict
    ) {
        type(type);
        next(next);
        aprilTagDict(aprilTagDict);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerDetectorAprilTagInfoML set(XrMarkerDetectorAprilTagInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorAprilTagInfoML malloc() {
        return new XrMarkerDetectorAprilTagInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorAprilTagInfoML calloc() {
        return new XrMarkerDetectorAprilTagInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerDetectorAprilTagInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerDetectorAprilTagInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance for the specified memory address. */
    public static XrMarkerDetectorAprilTagInfoML create(long address) {
        return new XrMarkerDetectorAprilTagInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerDetectorAprilTagInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerDetectorAprilTagInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerDetectorAprilTagInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorAprilTagInfoML malloc(MemoryStack stack) {
        return new XrMarkerDetectorAprilTagInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerDetectorAprilTagInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorAprilTagInfoML calloc(MemoryStack stack) {
        return new XrMarkerDetectorAprilTagInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorAprilTagInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorAprilTagInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerDetectorAprilTagInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerDetectorAprilTagInfoML.NEXT); }
    /** Unsafe version of {@link #aprilTagDict}. */
    public static int naprilTagDict(long struct) { return memGetInt(struct + XrMarkerDetectorAprilTagInfoML.APRILTAGDICT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerDetectorAprilTagInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerDetectorAprilTagInfoML.NEXT, value); }
    /** Unsafe version of {@link #aprilTagDict(int) aprilTagDict}. */
    public static void naprilTagDict(long struct, int value) { memPutInt(struct + XrMarkerDetectorAprilTagInfoML.APRILTAGDICT, value); }

    // -----------------------------------

    /** An array of {@link XrMarkerDetectorAprilTagInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerDetectorAprilTagInfoML, Buffer> implements NativeResource {

        private static final XrMarkerDetectorAprilTagInfoML ELEMENT_FACTORY = XrMarkerDetectorAprilTagInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerDetectorAprilTagInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerDetectorAprilTagInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerDetectorAprilTagInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerDetectorAprilTagInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerDetectorAprilTagInfoML.nnext(address()); }
        /** @return the value of the {@code aprilTagDict} field. */
        @NativeType("XrMarkerAprilTagDictML")
        public int aprilTagDict() { return XrMarkerDetectorAprilTagInfoML.naprilTagDict(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMarkerDetectorAprilTagInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerDetectorAprilTagInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML} value to the {@code type} field. */
        public XrMarkerDetectorAprilTagInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMarkerDetectorAprilTagInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerDetectorAprilTagInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code aprilTagDict} field. */
        public XrMarkerDetectorAprilTagInfoML.Buffer aprilTagDict(@NativeType("XrMarkerAprilTagDictML") int value) { XrMarkerDetectorAprilTagInfoML.naprilTagDict(address(), value); return this; }

    }

}