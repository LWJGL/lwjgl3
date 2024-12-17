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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrVirtualKeyboardLocationInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrVirtualKeyboardLocationTypeMETA locationType;
 *     XrSpace space;
 *     {@link XrPosef XrPosef} poseInSpace;
 *     float scale;
 * }}</pre>
 */
public class XrVirtualKeyboardLocationInfoMETA extends Struct<XrVirtualKeyboardLocationInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONTYPE,
        SPACE,
        POSEINSPACE,
        SCALE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATIONTYPE = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        POSEINSPACE = layout.offsetof(4);
        SCALE = layout.offsetof(5);
    }

    protected XrVirtualKeyboardLocationInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVirtualKeyboardLocationInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrVirtualKeyboardLocationInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrVirtualKeyboardLocationInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVirtualKeyboardLocationInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code locationType} field. */
    @NativeType("XrVirtualKeyboardLocationTypeMETA")
    public int locationType() { return nlocationType(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInSpace} field. */
    public XrPosef poseInSpace() { return nposeInSpace(address()); }
    /** @return the value of the {@code scale} field. */
    public float scale() { return nscale(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVirtualKeyboardLocationInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META} value to the {@code type} field. */
    public XrVirtualKeyboardLocationInfoMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrVirtualKeyboardLocationInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code locationType} field. */
    public XrVirtualKeyboardLocationInfoMETA locationType(@NativeType("XrVirtualKeyboardLocationTypeMETA") int value) { nlocationType(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrVirtualKeyboardLocationInfoMETA space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInSpace} field. */
    public XrVirtualKeyboardLocationInfoMETA poseInSpace(XrPosef value) { nposeInSpace(address(), value); return this; }
    /** Passes the {@code poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrVirtualKeyboardLocationInfoMETA poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public XrVirtualKeyboardLocationInfoMETA scale(float value) { nscale(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVirtualKeyboardLocationInfoMETA set(
        int type,
        long next,
        int locationType,
        XrSpace space,
        XrPosef poseInSpace,
        float scale
    ) {
        type(type);
        next(next);
        locationType(locationType);
        space(space);
        poseInSpace(poseInSpace);
        scale(scale);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVirtualKeyboardLocationInfoMETA set(XrVirtualKeyboardLocationInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardLocationInfoMETA malloc() {
        return new XrVirtualKeyboardLocationInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVirtualKeyboardLocationInfoMETA calloc() {
        return new XrVirtualKeyboardLocationInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrVirtualKeyboardLocationInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVirtualKeyboardLocationInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance for the specified memory address. */
    public static XrVirtualKeyboardLocationInfoMETA create(long address) {
        return new XrVirtualKeyboardLocationInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVirtualKeyboardLocationInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrVirtualKeyboardLocationInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVirtualKeyboardLocationInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardLocationInfoMETA malloc(MemoryStack stack) {
        return new XrVirtualKeyboardLocationInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVirtualKeyboardLocationInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVirtualKeyboardLocationInfoMETA calloc(MemoryStack stack) {
        return new XrVirtualKeyboardLocationInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVirtualKeyboardLocationInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVirtualKeyboardLocationInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVirtualKeyboardLocationInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVirtualKeyboardLocationInfoMETA.NEXT); }
    /** Unsafe version of {@link #locationType}. */
    public static int nlocationType(long struct) { return memGetInt(struct + XrVirtualKeyboardLocationInfoMETA.LOCATIONTYPE); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrVirtualKeyboardLocationInfoMETA.SPACE); }
    /** Unsafe version of {@link #poseInSpace}. */
    public static XrPosef nposeInSpace(long struct) { return XrPosef.create(struct + XrVirtualKeyboardLocationInfoMETA.POSEINSPACE); }
    /** Unsafe version of {@link #scale}. */
    public static float nscale(long struct) { return memGetFloat(struct + XrVirtualKeyboardLocationInfoMETA.SCALE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVirtualKeyboardLocationInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVirtualKeyboardLocationInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #locationType(int) locationType}. */
    public static void nlocationType(long struct, int value) { memPutInt(struct + XrVirtualKeyboardLocationInfoMETA.LOCATIONTYPE, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrVirtualKeyboardLocationInfoMETA.SPACE, value.address()); }
    /** Unsafe version of {@link #poseInSpace(XrPosef) poseInSpace}. */
    public static void nposeInSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrVirtualKeyboardLocationInfoMETA.POSEINSPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #scale(float) scale}. */
    public static void nscale(long struct, float value) { memPutFloat(struct + XrVirtualKeyboardLocationInfoMETA.SCALE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVirtualKeyboardLocationInfoMETA.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrVirtualKeyboardLocationInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrVirtualKeyboardLocationInfoMETA, Buffer> implements NativeResource {

        private static final XrVirtualKeyboardLocationInfoMETA ELEMENT_FACTORY = XrVirtualKeyboardLocationInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrVirtualKeyboardLocationInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVirtualKeyboardLocationInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVirtualKeyboardLocationInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVirtualKeyboardLocationInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVirtualKeyboardLocationInfoMETA.nnext(address()); }
        /** @return the value of the {@code locationType} field. */
        @NativeType("XrVirtualKeyboardLocationTypeMETA")
        public int locationType() { return XrVirtualKeyboardLocationInfoMETA.nlocationType(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrVirtualKeyboardLocationInfoMETA.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInSpace} field. */
        public XrPosef poseInSpace() { return XrVirtualKeyboardLocationInfoMETA.nposeInSpace(address()); }
        /** @return the value of the {@code scale} field. */
        public float scale() { return XrVirtualKeyboardLocationInfoMETA.nscale(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrVirtualKeyboardLocationInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META} value to the {@code type} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer next(@NativeType("void const *") long value) { XrVirtualKeyboardLocationInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code locationType} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer locationType(@NativeType("XrVirtualKeyboardLocationTypeMETA") int value) { XrVirtualKeyboardLocationInfoMETA.nlocationType(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer space(XrSpace value) { XrVirtualKeyboardLocationInfoMETA.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInSpace} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer poseInSpace(XrPosef value) { XrVirtualKeyboardLocationInfoMETA.nposeInSpace(address(), value); return this; }
        /** Passes the {@code poseInSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer poseInSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInSpace()); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public XrVirtualKeyboardLocationInfoMETA.Buffer scale(float value) { XrVirtualKeyboardLocationInfoMETA.nscale(address(), value); return this; }

    }

}