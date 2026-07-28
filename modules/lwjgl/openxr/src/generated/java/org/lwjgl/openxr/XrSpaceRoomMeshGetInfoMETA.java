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
 * struct XrSpaceRoomMeshGetInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t recognizedSemanticLabelCount;
 *     XrSemanticLabelMETA const * recognizedSemanticLabels;
 * }}</pre>
 */
public class XrSpaceRoomMeshGetInfoMETA extends Struct<XrSpaceRoomMeshGetInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOGNIZEDSEMANTICLABELCOUNT,
        RECOGNIZEDSEMANTICLABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOGNIZEDSEMANTICLABELCOUNT = layout.offsetof(2);
        RECOGNIZEDSEMANTICLABELS = layout.offsetof(3);
    }

    protected XrSpaceRoomMeshGetInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceRoomMeshGetInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceRoomMeshGetInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceRoomMeshGetInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceRoomMeshGetInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code recognizedSemanticLabelCount} field. */
    @NativeType("uint32_t")
    public int recognizedSemanticLabelCount() { return nrecognizedSemanticLabelCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code recognizedSemanticLabels} field. */
    @NativeType("XrSemanticLabelMETA const *")
    public @Nullable IntBuffer recognizedSemanticLabels() { return nrecognizedSemanticLabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceRoomMeshGetInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_SPACE_ROOM_MESH_GET_INFO_META TYPE_SPACE_ROOM_MESH_GET_INFO_META} value to the {@code type} field. */
    public XrSpaceRoomMeshGetInfoMETA type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_SPACE_ROOM_MESH_GET_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceRoomMeshGetInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code recognizedSemanticLabelCount} field. */
    public XrSpaceRoomMeshGetInfoMETA recognizedSemanticLabelCount(@NativeType("uint32_t") int value) { nrecognizedSemanticLabelCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code recognizedSemanticLabels} field. */
    public XrSpaceRoomMeshGetInfoMETA recognizedSemanticLabels(@Nullable @NativeType("XrSemanticLabelMETA const *") IntBuffer value) { nrecognizedSemanticLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceRoomMeshGetInfoMETA set(
        int type,
        long next,
        int recognizedSemanticLabelCount,
        @Nullable IntBuffer recognizedSemanticLabels
    ) {
        type(type);
        next(next);
        recognizedSemanticLabelCount(recognizedSemanticLabelCount);
        recognizedSemanticLabels(recognizedSemanticLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceRoomMeshGetInfoMETA set(XrSpaceRoomMeshGetInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceRoomMeshGetInfoMETA malloc() {
        return new XrSpaceRoomMeshGetInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceRoomMeshGetInfoMETA calloc() {
        return new XrSpaceRoomMeshGetInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceRoomMeshGetInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceRoomMeshGetInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance for the specified memory address. */
    public static XrSpaceRoomMeshGetInfoMETA create(long address) {
        return new XrSpaceRoomMeshGetInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceRoomMeshGetInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceRoomMeshGetInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceRoomMeshGetInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceRoomMeshGetInfoMETA malloc(MemoryStack stack) {
        return new XrSpaceRoomMeshGetInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceRoomMeshGetInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceRoomMeshGetInfoMETA calloc(MemoryStack stack) {
        return new XrSpaceRoomMeshGetInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceRoomMeshGetInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceRoomMeshGetInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceRoomMeshGetInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceRoomMeshGetInfoMETA.NEXT); }
    /** Unsafe version of {@link #recognizedSemanticLabelCount}. */
    public static int nrecognizedSemanticLabelCount(long struct) { return memGetInt(struct + XrSpaceRoomMeshGetInfoMETA.RECOGNIZEDSEMANTICLABELCOUNT); }
    /** Unsafe version of {@link #recognizedSemanticLabels() recognizedSemanticLabels}. */
    public static @Nullable IntBuffer nrecognizedSemanticLabels(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpaceRoomMeshGetInfoMETA.RECOGNIZEDSEMANTICLABELS), nrecognizedSemanticLabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceRoomMeshGetInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceRoomMeshGetInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code recognizedSemanticLabelCount} field of the specified {@code struct}. */
    public static void nrecognizedSemanticLabelCount(long struct, int value) { memPutInt(struct + XrSpaceRoomMeshGetInfoMETA.RECOGNIZEDSEMANTICLABELCOUNT, value); }
    /** Unsafe version of {@link #recognizedSemanticLabels(IntBuffer) recognizedSemanticLabels}. */
    public static void nrecognizedSemanticLabels(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpaceRoomMeshGetInfoMETA.RECOGNIZEDSEMANTICLABELS, memAddressSafe(value)); if (value != null) { nrecognizedSemanticLabelCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpaceRoomMeshGetInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceRoomMeshGetInfoMETA, Buffer> implements NativeResource {

        private static final XrSpaceRoomMeshGetInfoMETA ELEMENT_FACTORY = XrSpaceRoomMeshGetInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceRoomMeshGetInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceRoomMeshGetInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceRoomMeshGetInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceRoomMeshGetInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceRoomMeshGetInfoMETA.nnext(address()); }
        /** @return the value of the {@code recognizedSemanticLabelCount} field. */
        @NativeType("uint32_t")
        public int recognizedSemanticLabelCount() { return XrSpaceRoomMeshGetInfoMETA.nrecognizedSemanticLabelCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code recognizedSemanticLabels} field. */
        @NativeType("XrSemanticLabelMETA const *")
        public @Nullable IntBuffer recognizedSemanticLabels() { return XrSpaceRoomMeshGetInfoMETA.nrecognizedSemanticLabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceRoomMeshGetInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceRoomMeshGetInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_SPACE_ROOM_MESH_GET_INFO_META TYPE_SPACE_ROOM_MESH_GET_INFO_META} value to the {@code type} field. */
        public XrSpaceRoomMeshGetInfoMETA.Buffer type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_SPACE_ROOM_MESH_GET_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceRoomMeshGetInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceRoomMeshGetInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code recognizedSemanticLabelCount} field. */
        public XrSpaceRoomMeshGetInfoMETA.Buffer recognizedSemanticLabelCount(@NativeType("uint32_t") int value) { XrSpaceRoomMeshGetInfoMETA.nrecognizedSemanticLabelCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code recognizedSemanticLabels} field. */
        public XrSpaceRoomMeshGetInfoMETA.Buffer recognizedSemanticLabels(@Nullable @NativeType("XrSemanticLabelMETA const *") IntBuffer value) { XrSpaceRoomMeshGetInfoMETA.nrecognizedSemanticLabels(address(), value); return this; }

    }

}