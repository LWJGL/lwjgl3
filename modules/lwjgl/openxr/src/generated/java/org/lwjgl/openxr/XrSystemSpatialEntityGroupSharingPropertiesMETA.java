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
 * struct XrSystemSpatialEntityGroupSharingPropertiesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsSpatialEntityGroupSharing;
 * }}</pre>
 */
public class XrSystemSpatialEntityGroupSharingPropertiesMETA extends Struct<XrSystemSpatialEntityGroupSharingPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPATIALENTITYGROUPSHARING;

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
        SUPPORTSSPATIALENTITYGROUPSHARING = layout.offsetof(2);
    }

    protected XrSystemSpatialEntityGroupSharingPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpatialEntityGroupSharingPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpatialEntityGroupSharingPropertiesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code supportsSpatialEntityGroupSharing} field. */
    @NativeType("XrBool32")
    public boolean supportsSpatialEntityGroupSharing() { return nsupportsSpatialEntityGroupSharing(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemSpatialEntityGroupSharingPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META} value to the {@code type} field. */
    public XrSystemSpatialEntityGroupSharingPropertiesMETA type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemSpatialEntityGroupSharingPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpatialEntityGroupSharingPropertiesMETA set(
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
    public XrSystemSpatialEntityGroupSharingPropertiesMETA set(XrSystemSpatialEntityGroupSharingPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA malloc() {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA calloc() {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance for the specified memory address. */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA create(long address) {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSpatialEntityGroupSharingPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemSpatialEntityGroupSharingPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemSpatialEntityGroupSharingPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSpatialEntityGroupSharingPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpatialEntityGroupSharingPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsSpatialEntityGroupSharing}. */
    public static int nsupportsSpatialEntityGroupSharing(long struct) { return memGetInt(struct + XrSystemSpatialEntityGroupSharingPropertiesMETA.SUPPORTSSPATIALENTITYGROUPSHARING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSpatialEntityGroupSharingPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpatialEntityGroupSharingPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpatialEntityGroupSharingPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpatialEntityGroupSharingPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemSpatialEntityGroupSharingPropertiesMETA ELEMENT_FACTORY = XrSystemSpatialEntityGroupSharingPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpatialEntityGroupSharingPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpatialEntityGroupSharingPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpatialEntityGroupSharingPropertiesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemSpatialEntityGroupSharingPropertiesMETA.nnext(address()); }
        /** @return the value of the {@code supportsSpatialEntityGroupSharing} field. */
        @NativeType("XrBool32")
        public boolean supportsSpatialEntityGroupSharing() { return XrSystemSpatialEntityGroupSharingPropertiesMETA.nsupportsSpatialEntityGroupSharing(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpatialEntityGroupSharingPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META} value to the {@code type} field. */
        public XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemSpatialEntityGroupSharingPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemSpatialEntityGroupSharingPropertiesMETA.nnext(address(), value); return this; }

    }

}