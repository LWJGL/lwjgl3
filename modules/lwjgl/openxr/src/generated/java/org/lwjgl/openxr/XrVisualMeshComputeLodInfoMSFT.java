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
 * struct XrVisualMeshComputeLodInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrMeshComputeLodMSFT lod;
 * }}</pre>
 */
public class XrVisualMeshComputeLodInfoMSFT extends Struct<XrVisualMeshComputeLodInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOD;

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
        LOD = layout.offsetof(2);
    }

    protected XrVisualMeshComputeLodInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVisualMeshComputeLodInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrVisualMeshComputeLodInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrVisualMeshComputeLodInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVisualMeshComputeLodInfoMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code lod} field. */
    @NativeType("XrMeshComputeLodMSFT")
    public int lod() { return nlod(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVisualMeshComputeLodInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT} value to the {@code type} field. */
    public XrVisualMeshComputeLodInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrVisualMeshComputeLodInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code lod} field. */
    public XrVisualMeshComputeLodInfoMSFT lod(@NativeType("XrMeshComputeLodMSFT") int value) { nlod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVisualMeshComputeLodInfoMSFT set(
        int type,
        long next,
        int lod
    ) {
        type(type);
        next(next);
        lod(lod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVisualMeshComputeLodInfoMSFT set(XrVisualMeshComputeLodInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVisualMeshComputeLodInfoMSFT malloc() {
        return new XrVisualMeshComputeLodInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVisualMeshComputeLodInfoMSFT calloc() {
        return new XrVisualMeshComputeLodInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrVisualMeshComputeLodInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVisualMeshComputeLodInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance for the specified memory address. */
    public static XrVisualMeshComputeLodInfoMSFT create(long address) {
        return new XrVisualMeshComputeLodInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVisualMeshComputeLodInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrVisualMeshComputeLodInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVisualMeshComputeLodInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisualMeshComputeLodInfoMSFT malloc(MemoryStack stack) {
        return new XrVisualMeshComputeLodInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVisualMeshComputeLodInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisualMeshComputeLodInfoMSFT calloc(MemoryStack stack) {
        return new XrVisualMeshComputeLodInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisualMeshComputeLodInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisualMeshComputeLodInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVisualMeshComputeLodInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVisualMeshComputeLodInfoMSFT.NEXT); }
    /** Unsafe version of {@link #lod}. */
    public static int nlod(long struct) { return memGetInt(struct + XrVisualMeshComputeLodInfoMSFT.LOD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVisualMeshComputeLodInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVisualMeshComputeLodInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #lod(int) lod}. */
    public static void nlod(long struct, int value) { memPutInt(struct + XrVisualMeshComputeLodInfoMSFT.LOD, value); }

    // -----------------------------------

    /** An array of {@link XrVisualMeshComputeLodInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrVisualMeshComputeLodInfoMSFT, Buffer> implements NativeResource {

        private static final XrVisualMeshComputeLodInfoMSFT ELEMENT_FACTORY = XrVisualMeshComputeLodInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrVisualMeshComputeLodInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVisualMeshComputeLodInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVisualMeshComputeLodInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVisualMeshComputeLodInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVisualMeshComputeLodInfoMSFT.nnext(address()); }
        /** @return the value of the {@code lod} field. */
        @NativeType("XrMeshComputeLodMSFT")
        public int lod() { return XrVisualMeshComputeLodInfoMSFT.nlod(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrVisualMeshComputeLodInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT} value to the {@code type} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrVisualMeshComputeLodInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code lod} field. */
        public XrVisualMeshComputeLodInfoMSFT.Buffer lod(@NativeType("XrMeshComputeLodMSFT") int value) { XrVisualMeshComputeLodInfoMSFT.nlod(address(), value); return this; }

    }

}