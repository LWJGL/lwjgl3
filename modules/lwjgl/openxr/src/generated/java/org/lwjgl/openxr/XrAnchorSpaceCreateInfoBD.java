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
 * struct XrAnchorSpaceCreateInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrAnchorBD anchor;
 *     {@link XrPosef XrPosef} poseInAnchorSpace;
 * }}</pre>
 */
public class XrAnchorSpaceCreateInfoBD extends Struct<XrAnchorSpaceCreateInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHOR,
        POSEINANCHORSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANCHOR = layout.offsetof(2);
        POSEINANCHORSPACE = layout.offsetof(3);
    }

    protected XrAnchorSpaceCreateInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAnchorSpaceCreateInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrAnchorSpaceCreateInfoBD(address, container);
    }

    /**
     * Creates a {@code XrAnchorSpaceCreateInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAnchorSpaceCreateInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code anchor} field. */
    @NativeType("XrAnchorBD")
    public long anchor() { return nanchor(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInAnchorSpace} field. */
    public XrPosef poseInAnchorSpace() { return nposeInAnchorSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAnchorSpaceCreateInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_ANCHOR_SPACE_CREATE_INFO_BD TYPE_ANCHOR_SPACE_CREATE_INFO_BD} value to the {@code type} field. */
    public XrAnchorSpaceCreateInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_ANCHOR_SPACE_CREATE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrAnchorSpaceCreateInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrAnchorSpaceCreateInfoBD anchor(XrAnchorBD value) { nanchor(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInAnchorSpace} field. */
    public XrAnchorSpaceCreateInfoBD poseInAnchorSpace(XrPosef value) { nposeInAnchorSpace(address(), value); return this; }
    /** Passes the {@code poseInAnchorSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrAnchorSpaceCreateInfoBD poseInAnchorSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInAnchorSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrAnchorSpaceCreateInfoBD set(
        int type,
        long next,
        XrAnchorBD anchor,
        XrPosef poseInAnchorSpace
    ) {
        type(type);
        next(next);
        anchor(anchor);
        poseInAnchorSpace(poseInAnchorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAnchorSpaceCreateInfoBD set(XrAnchorSpaceCreateInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAnchorSpaceCreateInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAnchorSpaceCreateInfoBD malloc() {
        return new XrAnchorSpaceCreateInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAnchorSpaceCreateInfoBD calloc() {
        return new XrAnchorSpaceCreateInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrAnchorSpaceCreateInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAnchorSpaceCreateInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoBD} instance for the specified memory address. */
    public static XrAnchorSpaceCreateInfoBD create(long address) {
        return new XrAnchorSpaceCreateInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAnchorSpaceCreateInfoBD createSafe(long address) {
        return address == NULL ? null : new XrAnchorSpaceCreateInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAnchorSpaceCreateInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAnchorSpaceCreateInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAnchorSpaceCreateInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSpaceCreateInfoBD malloc(MemoryStack stack) {
        return new XrAnchorSpaceCreateInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAnchorSpaceCreateInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSpaceCreateInfoBD calloc(MemoryStack stack) {
        return new XrAnchorSpaceCreateInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrAnchorSpaceCreateInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAnchorSpaceCreateInfoBD.NEXT); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrAnchorSpaceCreateInfoBD.ANCHOR); }
    /** Unsafe version of {@link #poseInAnchorSpace}. */
    public static XrPosef nposeInAnchorSpace(long struct) { return XrPosef.create(struct + XrAnchorSpaceCreateInfoBD.POSEINANCHORSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrAnchorSpaceCreateInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAnchorSpaceCreateInfoBD.NEXT, value); }
    /** Unsafe version of {@link #anchor(XrAnchorBD) anchor}. */
    public static void nanchor(long struct, XrAnchorBD value) { memPutAddress(struct + XrAnchorSpaceCreateInfoBD.ANCHOR, value.address()); }
    /** Unsafe version of {@link #poseInAnchorSpace(XrPosef) poseInAnchorSpace}. */
    public static void nposeInAnchorSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrAnchorSpaceCreateInfoBD.POSEINANCHORSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrAnchorSpaceCreateInfoBD.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrAnchorSpaceCreateInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrAnchorSpaceCreateInfoBD, Buffer> implements NativeResource {

        private static final XrAnchorSpaceCreateInfoBD ELEMENT_FACTORY = XrAnchorSpaceCreateInfoBD.create(-1L);

        /**
         * Creates a new {@code XrAnchorSpaceCreateInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAnchorSpaceCreateInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAnchorSpaceCreateInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAnchorSpaceCreateInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrAnchorSpaceCreateInfoBD.nnext(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrAnchorBD")
        public long anchor() { return XrAnchorSpaceCreateInfoBD.nanchor(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInAnchorSpace} field. */
        public XrPosef poseInAnchorSpace() { return XrAnchorSpaceCreateInfoBD.nposeInAnchorSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAnchorSpaceCreateInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrAnchorSpaceCreateInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_ANCHOR_SPACE_CREATE_INFO_BD TYPE_ANCHOR_SPACE_CREATE_INFO_BD} value to the {@code type} field. */
        public XrAnchorSpaceCreateInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_ANCHOR_SPACE_CREATE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrAnchorSpaceCreateInfoBD.Buffer next(@NativeType("void const *") long value) { XrAnchorSpaceCreateInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrAnchorSpaceCreateInfoBD.Buffer anchor(XrAnchorBD value) { XrAnchorSpaceCreateInfoBD.nanchor(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInAnchorSpace} field. */
        public XrAnchorSpaceCreateInfoBD.Buffer poseInAnchorSpace(XrPosef value) { XrAnchorSpaceCreateInfoBD.nposeInAnchorSpace(address(), value); return this; }
        /** Passes the {@code poseInAnchorSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrAnchorSpaceCreateInfoBD.Buffer poseInAnchorSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInAnchorSpace()); return this; }

    }

}