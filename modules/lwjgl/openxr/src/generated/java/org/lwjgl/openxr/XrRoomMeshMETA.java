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
 * <pre><code>
 * struct XrRoomMeshMETA {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector3f XrVector3f} * vertices;
 *     uint32_t faceCapacityInput;
 *     uint32_t faceCountOutput;
 *     {@link XrRoomMeshFaceMETA XrRoomMeshFaceMETA} * faces;
 * }</code></pre>
 */
public class XrRoomMeshMETA extends Struct<XrRoomMeshMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES,
        FACECAPACITYINPUT,
        FACECOUNTOUTPUT,
        FACES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        VERTEXCAPACITYINPUT = layout.offsetof(2);
        VERTEXCOUNTOUTPUT = layout.offsetof(3);
        VERTICES = layout.offsetof(4);
        FACECAPACITYINPUT = layout.offsetof(5);
        FACECOUNTOUTPUT = layout.offsetof(6);
        FACES = layout.offsetof(7);
    }

    protected XrRoomMeshMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRoomMeshMETA create(long address, @Nullable ByteBuffer container) {
        return new XrRoomMeshMETA(address, container);
    }

    /**
     * Creates a {@code XrRoomMeshMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRoomMeshMETA(ByteBuffer container) {
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
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertices() { return nvertices(address()); }
    /** @return the value of the {@code faceCapacityInput} field. */
    @NativeType("uint32_t")
    public int faceCapacityInput() { return nfaceCapacityInput(address()); }
    /** @return the value of the {@code faceCountOutput} field. */
    @NativeType("uint32_t")
    public int faceCountOutput() { return nfaceCountOutput(address()); }
    /** @return a {@link XrRoomMeshFaceMETA.Buffer} view of the struct array pointed to by the {@code faces} field. */
    @NativeType("XrRoomMeshFaceMETA *")
    public XrRoomMeshFaceMETA.@Nullable Buffer faces() { return nfaces(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRoomMeshMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_ROOM_MESH_META TYPE_ROOM_MESH_META} value to the {@code type} field. */
    public XrRoomMeshMETA type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_ROOM_MESH_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrRoomMeshMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrRoomMeshMETA vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrRoomMeshMETA vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
    public XrRoomMeshMETA vertices(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertices(address(), value); return this; }
    /** Sets the specified value to the {@code faceCapacityInput} field. */
    public XrRoomMeshMETA faceCapacityInput(@NativeType("uint32_t") int value) { nfaceCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code faceCountOutput} field. */
    public XrRoomMeshMETA faceCountOutput(@NativeType("uint32_t") int value) { nfaceCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrRoomMeshFaceMETA.Buffer} to the {@code faces} field. */
    public XrRoomMeshMETA faces(@NativeType("XrRoomMeshFaceMETA *") XrRoomMeshFaceMETA.@Nullable Buffer value) { nfaces(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRoomMeshMETA set(
        int type,
        long next,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector3f.@Nullable Buffer vertices,
        int faceCapacityInput,
        int faceCountOutput,
        XrRoomMeshFaceMETA.@Nullable Buffer faces
    ) {
        type(type);
        next(next);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);
        faceCapacityInput(faceCapacityInput);
        faceCountOutput(faceCountOutput);
        faces(faces);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRoomMeshMETA set(XrRoomMeshMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRoomMeshMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRoomMeshMETA malloc() {
        return new XrRoomMeshMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRoomMeshMETA calloc() {
        return new XrRoomMeshMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshMETA} instance allocated with {@link BufferUtils}. */
    public static XrRoomMeshMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRoomMeshMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrRoomMeshMETA} instance for the specified memory address. */
    public static XrRoomMeshMETA create(long address) {
        return new XrRoomMeshMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRoomMeshMETA createSafe(long address) {
        return address == NULL ? null : new XrRoomMeshMETA(address, null);
    }

    /**
     * Returns a new {@link XrRoomMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRoomMeshMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRoomMeshMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRoomMeshMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshMETA malloc(MemoryStack stack) {
        return new XrRoomMeshMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRoomMeshMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshMETA calloc(MemoryStack stack) {
        return new XrRoomMeshMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRoomMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRoomMeshMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRoomMeshMETA.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrRoomMeshMETA.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrRoomMeshMETA.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.@Nullable Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrRoomMeshMETA.VERTICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #faceCapacityInput}. */
    public static int nfaceCapacityInput(long struct) { return memGetInt(struct + XrRoomMeshMETA.FACECAPACITYINPUT); }
    /** Unsafe version of {@link #faceCountOutput}. */
    public static int nfaceCountOutput(long struct) { return memGetInt(struct + XrRoomMeshMETA.FACECOUNTOUTPUT); }
    /** Unsafe version of {@link #faces}. */
    public static XrRoomMeshFaceMETA.@Nullable Buffer nfaces(long struct) { return XrRoomMeshFaceMETA.createSafe(memGetAddress(struct + XrRoomMeshMETA.FACES), nfaceCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRoomMeshMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRoomMeshMETA.NEXT, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrRoomMeshMETA.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrRoomMeshMETA.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrRoomMeshMETA.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }
    /** Sets the specified value to the {@code faceCapacityInput} field of the specified {@code struct}. */
    public static void nfaceCapacityInput(long struct, int value) { memPutInt(struct + XrRoomMeshMETA.FACECAPACITYINPUT, value); }
    /** Unsafe version of {@link #faceCountOutput(int) faceCountOutput}. */
    public static void nfaceCountOutput(long struct, int value) { memPutInt(struct + XrRoomMeshMETA.FACECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #faces(XrRoomMeshFaceMETA.Buffer) faces}. */
    public static void nfaces(long struct, XrRoomMeshFaceMETA.@Nullable Buffer value) { memPutAddress(struct + XrRoomMeshMETA.FACES, memAddressSafe(value)); if (value != null) { nfaceCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRoomMeshMETA} structs. */
    public static class Buffer extends StructBuffer<XrRoomMeshMETA, Buffer> implements NativeResource {

        private static final XrRoomMeshMETA ELEMENT_FACTORY = XrRoomMeshMETA.create(-1L);

        /**
         * Creates a new {@code XrRoomMeshMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRoomMeshMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRoomMeshMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRoomMeshMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRoomMeshMETA.nnext(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrRoomMeshMETA.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrRoomMeshMETA.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertices() { return XrRoomMeshMETA.nvertices(address()); }
        /** @return the value of the {@code faceCapacityInput} field. */
        @NativeType("uint32_t")
        public int faceCapacityInput() { return XrRoomMeshMETA.nfaceCapacityInput(address()); }
        /** @return the value of the {@code faceCountOutput} field. */
        @NativeType("uint32_t")
        public int faceCountOutput() { return XrRoomMeshMETA.nfaceCountOutput(address()); }
        /** @return a {@link XrRoomMeshFaceMETA.Buffer} view of the struct array pointed to by the {@code faces} field. */
        @NativeType("XrRoomMeshFaceMETA *")
        public XrRoomMeshFaceMETA.@Nullable Buffer faces() { return XrRoomMeshMETA.nfaces(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRoomMeshMETA.Buffer type(@NativeType("XrStructureType") int value) { XrRoomMeshMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityRoomMesh#XR_TYPE_ROOM_MESH_META TYPE_ROOM_MESH_META} value to the {@code type} field. */
        public XrRoomMeshMETA.Buffer type$Default() { return type(METASpatialEntityRoomMesh.XR_TYPE_ROOM_MESH_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrRoomMeshMETA.Buffer next(@NativeType("void *") long value) { XrRoomMeshMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrRoomMeshMETA.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrRoomMeshMETA.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrRoomMeshMETA.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrRoomMeshMETA.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
        public XrRoomMeshMETA.Buffer vertices(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrRoomMeshMETA.nvertices(address(), value); return this; }
        /** Sets the specified value to the {@code faceCapacityInput} field. */
        public XrRoomMeshMETA.Buffer faceCapacityInput(@NativeType("uint32_t") int value) { XrRoomMeshMETA.nfaceCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code faceCountOutput} field. */
        public XrRoomMeshMETA.Buffer faceCountOutput(@NativeType("uint32_t") int value) { XrRoomMeshMETA.nfaceCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrRoomMeshFaceMETA.Buffer} to the {@code faces} field. */
        public XrRoomMeshMETA.Buffer faces(@NativeType("XrRoomMeshFaceMETA *") XrRoomMeshFaceMETA.@Nullable Buffer value) { XrRoomMeshMETA.nfaces(address(), value); return this; }

    }

}