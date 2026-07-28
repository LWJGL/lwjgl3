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
 * struct XrSystemSceneMeshingPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsSceneMeshing;
 * }}</pre>
 */
public class XrSystemSceneMeshingPropertiesANDROID extends Struct<XrSystemSceneMeshingPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSCENEMESHING;

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
        SUPPORTSSCENEMESHING = layout.offsetof(2);
    }

    protected XrSystemSceneMeshingPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSceneMeshingPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSceneMeshingPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemSceneMeshingPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSceneMeshingPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsSceneMeshing} field. */
    @NativeType("XrBool32")
    public boolean supportsSceneMeshing() { return nsupportsSceneMeshing(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemSceneMeshingPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemSceneMeshingPropertiesANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemSceneMeshingPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSceneMeshingPropertiesANDROID set(
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
    public XrSystemSceneMeshingPropertiesANDROID set(XrSystemSceneMeshingPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSceneMeshingPropertiesANDROID malloc() {
        return new XrSystemSceneMeshingPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSceneMeshingPropertiesANDROID calloc() {
        return new XrSystemSceneMeshingPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemSceneMeshingPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSceneMeshingPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemSceneMeshingPropertiesANDROID create(long address) {
        return new XrSystemSceneMeshingPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSceneMeshingPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemSceneMeshingPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSceneMeshingPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSceneMeshingPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemSceneMeshingPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSceneMeshingPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSceneMeshingPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemSceneMeshingPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSceneMeshingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSceneMeshingPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSceneMeshingPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSceneMeshingPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsSceneMeshing}. */
    public static int nsupportsSceneMeshing(long struct) { return memGetInt(struct + XrSystemSceneMeshingPropertiesANDROID.SUPPORTSSCENEMESHING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSceneMeshingPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSceneMeshingPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSceneMeshingPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemSceneMeshingPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemSceneMeshingPropertiesANDROID ELEMENT_FACTORY = XrSystemSceneMeshingPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemSceneMeshingPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSceneMeshingPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSceneMeshingPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSceneMeshingPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemSceneMeshingPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsSceneMeshing} field. */
        @NativeType("XrBool32")
        public boolean supportsSceneMeshing() { return XrSystemSceneMeshingPropertiesANDROID.nsupportsSceneMeshing(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemSceneMeshingPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSceneMeshingPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemSceneMeshingPropertiesANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemSceneMeshingPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemSceneMeshingPropertiesANDROID.nnext(address(), value); return this; }

    }

}