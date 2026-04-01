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
 * struct XrSceneSubmeshDataANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuid XrUuid} submeshId;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector3f XrVector3f} * vertexPositions;
 *     {@link XrVector3f XrVector3f} * vertexNormals;
 *     uint8_t * vertexSemantics;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     uint32_t * indices;
 * }</code></pre>
 */
public class XrSceneSubmeshDataANDROID extends Struct<XrSceneSubmeshDataANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUBMESHID,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTEXPOSITIONS,
        VERTEXNORMALS,
        VERTEXSEMANTICS,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUBMESHID = layout.offsetof(2);
        VERTEXCAPACITYINPUT = layout.offsetof(3);
        VERTEXCOUNTOUTPUT = layout.offsetof(4);
        VERTEXPOSITIONS = layout.offsetof(5);
        VERTEXNORMALS = layout.offsetof(6);
        VERTEXSEMANTICS = layout.offsetof(7);
        INDEXCAPACITYINPUT = layout.offsetof(8);
        INDEXCOUNTOUTPUT = layout.offsetof(9);
        INDICES = layout.offsetof(10);
    }

    protected XrSceneSubmeshDataANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneSubmeshDataANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSceneSubmeshDataANDROID(address, container);
    }

    /**
     * Creates a {@code XrSceneSubmeshDataANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneSubmeshDataANDROID(ByteBuffer container) {
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
    /** @return a {@link XrUuid} view of the {@code submeshId} field. */
    public XrUuid submeshId() { return nsubmeshId(address()); }
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexPositions} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertexPositions() { return nvertexPositions(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexNormals} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertexNormals() { return nvertexNormals(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code vertexSemantics} field. */
    @NativeType("uint8_t *")
    public @Nullable ByteBuffer vertexSemantics() { return nvertexSemantics(address()); }
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
    public XrSceneSubmeshDataANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_SUBMESH_DATA_ANDROID TYPE_SCENE_SUBMESH_DATA_ANDROID} value to the {@code type} field. */
    public XrSceneSubmeshDataANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_SUBMESH_DATA_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneSubmeshDataANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code submeshId} field. */
    public XrSceneSubmeshDataANDROID submeshId(XrUuid value) { nsubmeshId(address(), value); return this; }
    /** Passes the {@code submeshId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneSubmeshDataANDROID submeshId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(submeshId()); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrSceneSubmeshDataANDROID vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrSceneSubmeshDataANDROID vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexPositions} field. */
    public XrSceneSubmeshDataANDROID vertexPositions(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertexPositions(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexNormals} field. */
    public XrSceneSubmeshDataANDROID vertexNormals(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertexNormals(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code vertexSemantics} field. */
    public XrSceneSubmeshDataANDROID vertexSemantics(@Nullable @NativeType("uint8_t *") ByteBuffer value) { nvertexSemantics(address(), value); return this; }
    /** Sets the specified value to the {@code indexCapacityInput} field. */
    public XrSceneSubmeshDataANDROID indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code indexCountOutput} field. */
    public XrSceneSubmeshDataANDROID indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
    public XrSceneSubmeshDataANDROID indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneSubmeshDataANDROID set(
        int type,
        long next,
        XrUuid submeshId,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector3f.@Nullable Buffer vertexPositions,
        XrVector3f.@Nullable Buffer vertexNormals,
        @Nullable ByteBuffer vertexSemantics,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable IntBuffer indices
    ) {
        type(type);
        next(next);
        submeshId(submeshId);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertexPositions(vertexPositions);
        vertexNormals(vertexNormals);
        vertexSemantics(vertexSemantics);
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
    public XrSceneSubmeshDataANDROID set(XrSceneSubmeshDataANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneSubmeshDataANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneSubmeshDataANDROID malloc() {
        return new XrSceneSubmeshDataANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneSubmeshDataANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneSubmeshDataANDROID calloc() {
        return new XrSceneSubmeshDataANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneSubmeshDataANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSceneSubmeshDataANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneSubmeshDataANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneSubmeshDataANDROID} instance for the specified memory address. */
    public static XrSceneSubmeshDataANDROID create(long address) {
        return new XrSceneSubmeshDataANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneSubmeshDataANDROID createSafe(long address) {
        return address == NULL ? null : new XrSceneSubmeshDataANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSceneSubmeshDataANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshDataANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshDataANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneSubmeshDataANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneSubmeshDataANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneSubmeshDataANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSubmeshDataANDROID malloc(MemoryStack stack) {
        return new XrSceneSubmeshDataANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneSubmeshDataANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSubmeshDataANDROID calloc(MemoryStack stack) {
        return new XrSceneSubmeshDataANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneSubmeshDataANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSubmeshDataANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSubmeshDataANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneSubmeshDataANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneSubmeshDataANDROID.NEXT); }
    /** Unsafe version of {@link #submeshId}. */
    public static XrUuid nsubmeshId(long struct) { return XrUuid.create(struct + XrSceneSubmeshDataANDROID.SUBMESHID); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrSceneSubmeshDataANDROID.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrSceneSubmeshDataANDROID.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertexPositions}. */
    public static XrVector3f.@Nullable Buffer nvertexPositions(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSceneSubmeshDataANDROID.VERTEXPOSITIONS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexNormals}. */
    public static XrVector3f.@Nullable Buffer nvertexNormals(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSceneSubmeshDataANDROID.VERTEXNORMALS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexSemantics() vertexSemantics}. */
    public static @Nullable ByteBuffer nvertexSemantics(long struct) { return memByteBufferSafe(memGetAddress(struct + XrSceneSubmeshDataANDROID.VERTEXSEMANTICS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrSceneSubmeshDataANDROID.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrSceneSubmeshDataANDROID.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSceneSubmeshDataANDROID.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneSubmeshDataANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneSubmeshDataANDROID.NEXT, value); }
    /** Unsafe version of {@link #submeshId(XrUuid) submeshId}. */
    public static void nsubmeshId(long struct, XrUuid value) { memCopy(value.address(), struct + XrSceneSubmeshDataANDROID.SUBMESHID, XrUuid.SIZEOF); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrSceneSubmeshDataANDROID.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrSceneSubmeshDataANDROID.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertexPositions(XrVector3f.Buffer) vertexPositions}. */
    public static void nvertexPositions(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrSceneSubmeshDataANDROID.VERTEXPOSITIONS, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexNormals(XrVector3f.Buffer) vertexNormals}. */
    public static void nvertexNormals(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrSceneSubmeshDataANDROID.VERTEXNORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexSemantics(ByteBuffer) vertexSemantics}. */
    public static void nvertexSemantics(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrSceneSubmeshDataANDROID.VERTEXSEMANTICS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { memPutInt(struct + XrSceneSubmeshDataANDROID.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { memPutInt(struct + XrSceneSubmeshDataANDROID.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSceneSubmeshDataANDROID.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneSubmeshDataANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSceneSubmeshDataANDROID, Buffer> implements NativeResource {

        private static final XrSceneSubmeshDataANDROID ELEMENT_FACTORY = XrSceneSubmeshDataANDROID.create(-1L);

        /**
         * Creates a new {@code XrSceneSubmeshDataANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneSubmeshDataANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneSubmeshDataANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneSubmeshDataANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneSubmeshDataANDROID.nnext(address()); }
        /** @return a {@link XrUuid} view of the {@code submeshId} field. */
        public XrUuid submeshId() { return XrSceneSubmeshDataANDROID.nsubmeshId(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrSceneSubmeshDataANDROID.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrSceneSubmeshDataANDROID.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexPositions} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertexPositions() { return XrSceneSubmeshDataANDROID.nvertexPositions(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexNormals} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertexNormals() { return XrSceneSubmeshDataANDROID.nvertexNormals(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code vertexSemantics} field. */
        @NativeType("uint8_t *")
        public @Nullable ByteBuffer vertexSemantics() { return XrSceneSubmeshDataANDROID.nvertexSemantics(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrSceneSubmeshDataANDROID.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrSceneSubmeshDataANDROID.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint32_t *")
        public @Nullable IntBuffer indices() { return XrSceneSubmeshDataANDROID.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneSubmeshDataANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSceneSubmeshDataANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_SUBMESH_DATA_ANDROID TYPE_SCENE_SUBMESH_DATA_ANDROID} value to the {@code type} field. */
        public XrSceneSubmeshDataANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_SUBMESH_DATA_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneSubmeshDataANDROID.Buffer next(@NativeType("void const *") long value) { XrSceneSubmeshDataANDROID.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code submeshId} field. */
        public XrSceneSubmeshDataANDROID.Buffer submeshId(XrUuid value) { XrSceneSubmeshDataANDROID.nsubmeshId(address(), value); return this; }
        /** Passes the {@code submeshId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneSubmeshDataANDROID.Buffer submeshId(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(submeshId()); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrSceneSubmeshDataANDROID.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrSceneSubmeshDataANDROID.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrSceneSubmeshDataANDROID.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrSceneSubmeshDataANDROID.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexPositions} field. */
        public XrSceneSubmeshDataANDROID.Buffer vertexPositions(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrSceneSubmeshDataANDROID.nvertexPositions(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexNormals} field. */
        public XrSceneSubmeshDataANDROID.Buffer vertexNormals(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrSceneSubmeshDataANDROID.nvertexNormals(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code vertexSemantics} field. */
        public XrSceneSubmeshDataANDROID.Buffer vertexSemantics(@Nullable @NativeType("uint8_t *") ByteBuffer value) { XrSceneSubmeshDataANDROID.nvertexSemantics(address(), value); return this; }
        /** Sets the specified value to the {@code indexCapacityInput} field. */
        public XrSceneSubmeshDataANDROID.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrSceneSubmeshDataANDROID.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code indexCountOutput} field. */
        public XrSceneSubmeshDataANDROID.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrSceneSubmeshDataANDROID.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
        public XrSceneSubmeshDataANDROID.Buffer indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { XrSceneSubmeshDataANDROID.nindices(address(), value); return this; }

    }

}