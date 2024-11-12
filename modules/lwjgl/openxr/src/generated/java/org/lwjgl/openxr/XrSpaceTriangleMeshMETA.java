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
 * Output parameter to the xrGetSpaceTriangleMeshMETA function.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceTriangleMeshMETA} structure <b>can</b> be used by the application to perform the two calls required to obtain a triangle mesh associated to a specified spatial entity.</p>
 * 
 * <p>The output values written in the {@code indices} array represent indices of vertices: Three consecutive elements represent a triangle with a counter-clockwise winding order.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METASpatialEntityMesh XR_META_spatial_entity_mesh} extension <b>must</b> be enabled prior to using {@link XrSpaceTriangleMeshMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METASpatialEntityMesh#XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVector3f}, {@link METASpatialEntityMesh#xrGetSpaceTriangleMeshMETA GetSpaceTriangleMeshMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceTriangleMeshMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #vertexCapacityInput};
 *     uint32_t {@link #vertexCountOutput};
 *     {@link XrVector3f XrVector3f} * {@link #vertices};
 *     uint32_t {@link #indexCapacityInput};
 *     uint32_t {@link #indexCountOutput};
 *     uint32_t * {@link #indices};
 * }</code></pre>
 */
public class XrSpaceTriangleMeshMETA extends Struct<XrSpaceTriangleMeshMETA> implements NativeResource {

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
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

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
        INDEXCAPACITYINPUT = layout.offsetof(5);
        INDEXCOUNTOUTPUT = layout.offsetof(6);
        INDICES = layout.offsetof(7);
    }

    protected XrSpaceTriangleMeshMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceTriangleMeshMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceTriangleMeshMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceTriangleMeshMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceTriangleMeshMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an input parameter for the application to specify the capacity of the {@code vertices} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** an output parameter that will hold the number of vertices written in the output array, or the required capacity in the case that {@code vertexCapacityInput} is insufficient. The returned value <b>must</b> be equal to or larger than 3. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** a pointer to an array of {@link XrVector3f}, but <b>can</b> be {@code NULL} if {@code vertexCapacityInput} is 0. The vertices are defined in the coordinate frame of {@code XrSpace} to which this struct is associated. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertices() { return nvertices(address()); }
    /** an input parameter for the application to specify the capacity of the {@code indices} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** an output parameter that will hold the number of indices written in the output array, or the required capacity in the case that {@code indexCapacityInput} is insufficient. The returned value <b>must</b> be a multiple of 3. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** a pointer to an array of {@code uint32_t}, but <b>can</b> be {@code NULL} if {@code indexCapacityInput} is 0. Each element refers to a vertex in {@code vertices}. */
    @NativeType("uint32_t *")
    public @Nullable IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceTriangleMeshMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityMesh#XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META} value to the {@link #type} field. */
    public XrSpaceTriangleMeshMETA type$Default() { return type(METASpatialEntityMesh.XR_TYPE_SPACE_TRIANGLE_MESH_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceTriangleMeshMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceTriangleMeshMETA set(
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
    public XrSpaceTriangleMeshMETA set(XrSpaceTriangleMeshMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceTriangleMeshMETA malloc() {
        return new XrSpaceTriangleMeshMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceTriangleMeshMETA calloc() {
        return new XrSpaceTriangleMeshMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceTriangleMeshMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceTriangleMeshMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance for the specified memory address. */
    public static XrSpaceTriangleMeshMETA create(long address) {
        return new XrSpaceTriangleMeshMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceTriangleMeshMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceTriangleMeshMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceTriangleMeshMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceTriangleMeshMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceTriangleMeshMETA malloc(MemoryStack stack) {
        return new XrSpaceTriangleMeshMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceTriangleMeshMETA calloc(MemoryStack stack) {
        return new XrSpaceTriangleMeshMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceTriangleMeshMETA.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.@Nullable Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSpaceTriangleMeshMETA.VERTICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpaceTriangleMeshMETA.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceTriangleMeshMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceTriangleMeshMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceTriangleMeshMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceTriangleMeshMETA, Buffer> implements NativeResource {

        private static final XrSpaceTriangleMeshMETA ELEMENT_FACTORY = XrSpaceTriangleMeshMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceTriangleMeshMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceTriangleMeshMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceTriangleMeshMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceTriangleMeshMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceTriangleMeshMETA.ntype(address()); }
        /** @return the value of the {@link XrSpaceTriangleMeshMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceTriangleMeshMETA.nnext(address()); }
        /** @return the value of the {@link XrSpaceTriangleMeshMETA#vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrSpaceTriangleMeshMETA.nvertexCapacityInput(address()); }
        /** @return the value of the {@link XrSpaceTriangleMeshMETA#vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrSpaceTriangleMeshMETA.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrSpaceTriangleMeshMETA#vertices} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertices() { return XrSpaceTriangleMeshMETA.nvertices(address()); }
        /** @return the value of the {@link XrSpaceTriangleMeshMETA#indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrSpaceTriangleMeshMETA.nindexCapacityInput(address()); }
        /** @return the value of the {@link XrSpaceTriangleMeshMETA#indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrSpaceTriangleMeshMETA.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrSpaceTriangleMeshMETA#indices} field. */
        @NativeType("uint32_t *")
        public @Nullable IntBuffer indices() { return XrSpaceTriangleMeshMETA.nindices(address()); }

        /** Sets the specified value to the {@link XrSpaceTriangleMeshMETA#type} field. */
        public XrSpaceTriangleMeshMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceTriangleMeshMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityMesh#XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META} value to the {@link XrSpaceTriangleMeshMETA#type} field. */
        public XrSpaceTriangleMeshMETA.Buffer type$Default() { return type(METASpatialEntityMesh.XR_TYPE_SPACE_TRIANGLE_MESH_META); }
        /** Sets the specified value to the {@link XrSpaceTriangleMeshMETA#next} field. */
        public XrSpaceTriangleMeshMETA.Buffer next(@NativeType("void *") long value) { XrSpaceTriangleMeshMETA.nnext(address(), value); return this; }

    }

}