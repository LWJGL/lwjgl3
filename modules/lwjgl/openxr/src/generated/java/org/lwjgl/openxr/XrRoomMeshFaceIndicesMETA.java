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
 * struct XrRoomMeshFaceIndicesMETA {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     uint32_t * indices;
 * }}</pre>
 */
public class XrRoomMeshFaceIndicesMETA extends Struct<XrRoomMeshFaceIndicesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

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
        INDEXCAPACITYINPUT = layout.offsetof(2);
        INDEXCOUNTOUTPUT = layout.offsetof(3);
        INDICES = layout.offsetof(4);
    }

    protected XrRoomMeshFaceIndicesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRoomMeshFaceIndicesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrRoomMeshFaceIndicesMETA(address, container);
    }

    /**
     * Creates a {@code XrRoomMeshFaceIndicesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRoomMeshFaceIndicesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code indexCapacityInput} field. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** @return the value of the {@code indexCountOutput} field. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint32_t *")
    public @Nullable IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRoomMeshFaceIndicesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_ROOM_MESH_FACE_INDICES_META TYPE_ROOM_MESH_FACE_INDICES_META} value to the {@code type} field. */
    public XrRoomMeshFaceIndicesMETA type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_ROOM_MESH_FACE_INDICES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrRoomMeshFaceIndicesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code indexCapacityInput} field. */
    public XrRoomMeshFaceIndicesMETA indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code indexCountOutput} field. */
    public XrRoomMeshFaceIndicesMETA indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
    public XrRoomMeshFaceIndicesMETA indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRoomMeshFaceIndicesMETA set(
        int type,
        long next,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable IntBuffer indices
    ) {
        type(type);
        next(next);
        indexCapacityInput(indexCapacityInput);
        indexCountOutput(indexCountOutput);
        indices(indices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRoomMeshFaceIndicesMETA set(XrRoomMeshFaceIndicesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRoomMeshFaceIndicesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRoomMeshFaceIndicesMETA malloc() {
        return new XrRoomMeshFaceIndicesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshFaceIndicesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRoomMeshFaceIndicesMETA calloc() {
        return new XrRoomMeshFaceIndicesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshFaceIndicesMETA} instance allocated with {@link BufferUtils}. */
    public static XrRoomMeshFaceIndicesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRoomMeshFaceIndicesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrRoomMeshFaceIndicesMETA} instance for the specified memory address. */
    public static XrRoomMeshFaceIndicesMETA create(long address) {
        return new XrRoomMeshFaceIndicesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRoomMeshFaceIndicesMETA createSafe(long address) {
        return address == NULL ? null : new XrRoomMeshFaceIndicesMETA(address, null);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceIndicesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceIndicesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceIndicesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRoomMeshFaceIndicesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRoomMeshFaceIndicesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRoomMeshFaceIndicesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshFaceIndicesMETA malloc(MemoryStack stack) {
        return new XrRoomMeshFaceIndicesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRoomMeshFaceIndicesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshFaceIndicesMETA calloc(MemoryStack stack) {
        return new XrRoomMeshFaceIndicesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceIndicesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceIndicesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceIndicesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRoomMeshFaceIndicesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRoomMeshFaceIndicesMETA.NEXT); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrRoomMeshFaceIndicesMETA.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrRoomMeshFaceIndicesMETA.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrRoomMeshFaceIndicesMETA.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRoomMeshFaceIndicesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRoomMeshFaceIndicesMETA.NEXT, value); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { memPutInt(struct + XrRoomMeshFaceIndicesMETA.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { memPutInt(struct + XrRoomMeshFaceIndicesMETA.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrRoomMeshFaceIndicesMETA.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRoomMeshFaceIndicesMETA} structs. */
    public static class Buffer extends StructBuffer<XrRoomMeshFaceIndicesMETA, Buffer> implements NativeResource {

        private static final XrRoomMeshFaceIndicesMETA ELEMENT_FACTORY = XrRoomMeshFaceIndicesMETA.create(-1L);

        /**
         * Creates a new {@code XrRoomMeshFaceIndicesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRoomMeshFaceIndicesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRoomMeshFaceIndicesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRoomMeshFaceIndicesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRoomMeshFaceIndicesMETA.nnext(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrRoomMeshFaceIndicesMETA.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrRoomMeshFaceIndicesMETA.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint32_t *")
        public @Nullable IntBuffer indices() { return XrRoomMeshFaceIndicesMETA.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrRoomMeshFaceIndicesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_ROOM_MESH_FACE_INDICES_META TYPE_ROOM_MESH_FACE_INDICES_META} value to the {@code type} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_ROOM_MESH_FACE_INDICES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer next(@NativeType("void *") long value) { XrRoomMeshFaceIndicesMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code indexCapacityInput} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrRoomMeshFaceIndicesMETA.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code indexCountOutput} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrRoomMeshFaceIndicesMETA.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
        public XrRoomMeshFaceIndicesMETA.Buffer indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { XrRoomMeshFaceIndicesMETA.nindices(address(), value); return this; }

    }

}