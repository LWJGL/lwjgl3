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
 * A container of mesh data.
 * 
 * <h5>Description</h5>
 * 
 * <p>All arrays are application-allocated, and all <b>may</b> be {@code NULL} if any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is 0.</p>
 * 
 * <p>The data in a fully-populated {@link XrHandTrackingMeshFB} is immutable during the lifetime of the corresponding {@code XrInstance}, and is intended to be retrieved once then used in combination with data changing per-frame retrieved from {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandTrackingMeshFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code jointCapacityInput} is not 0, {@code jointBindPoses} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@link XrPosef} structures</li>
 * <li>If {@code jointCapacityInput} is not 0, {@code jointRadii} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code float} values</li>
 * <li>If {@code jointCapacityInput} is not 0, {@code jointParents} <b>must</b> be a pointer to an array of {@code jointCapacityInput} {@code XrHandJointEXT} values</li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertexPositions} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector3f} structures</li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertexNormals} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector3f} structures</li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertexUVs} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector2f} structures</li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertexBlendIndices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector4sFB} structures</li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertexBlendWeights} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector4f} structures</li>
 * <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code int16_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrVector2f}, {@link XrVector3f}, {@link XrVector4f}, {@link XrVector4sFB}, {@link FBHandTrackingMesh#xrGetHandMeshFB GetHandMeshFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingMeshFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #jointCapacityInput};
 *     uint32_t {@link #jointCountOutput};
 *     {@link XrPosef XrPosef} * {@link #jointBindPoses};
 *     float * {@link #jointRadii};
 *     XrHandJointEXT * {@link #jointParents};
 *     uint32_t {@link #vertexCapacityInput};
 *     uint32_t {@link #vertexCountOutput};
 *     {@link XrVector3f XrVector3f} * {@link #vertexPositions};
 *     {@link XrVector3f XrVector3f} * {@link #vertexNormals};
 *     {@link XrVector2f XrVector2f} * {@link #vertexUVs};
 *     {@link XrVector4sFB XrVector4sFB} * {@link #vertexBlendIndices};
 *     {@link XrVector4f XrVector4f} * {@link #vertexBlendWeights};
 *     uint32_t {@link #indexCapacityInput};
 *     uint32_t {@link #indexCountOutput};
 *     int16_t * {@link #indices};
 * }</code></pre>
 */
public class XrHandTrackingMeshFB extends Struct<XrHandTrackingMeshFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCAPACITYINPUT,
        JOINTCOUNTOUTPUT,
        JOINTBINDPOSES,
        JOINTRADII,
        JOINTPARENTS,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTEXPOSITIONS,
        VERTEXNORMALS,
        VERTEXUVS,
        VERTEXBLENDINDICES,
        VERTEXBLENDWEIGHTS,
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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
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
        JOINTCAPACITYINPUT = layout.offsetof(2);
        JOINTCOUNTOUTPUT = layout.offsetof(3);
        JOINTBINDPOSES = layout.offsetof(4);
        JOINTRADII = layout.offsetof(5);
        JOINTPARENTS = layout.offsetof(6);
        VERTEXCAPACITYINPUT = layout.offsetof(7);
        VERTEXCOUNTOUTPUT = layout.offsetof(8);
        VERTEXPOSITIONS = layout.offsetof(9);
        VERTEXNORMALS = layout.offsetof(10);
        VERTEXUVS = layout.offsetof(11);
        VERTEXBLENDINDICES = layout.offsetof(12);
        VERTEXBLENDWEIGHTS = layout.offsetof(13);
        INDEXCAPACITYINPUT = layout.offsetof(14);
        INDEXCOUNTOUTPUT = layout.offsetof(15);
        INDICES = layout.offsetof(16);
    }

    protected XrHandTrackingMeshFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandTrackingMeshFB create(long address, @Nullable ByteBuffer container) {
        return new XrHandTrackingMeshFB(address, container);
    }

    /**
     * Creates a {@code XrHandTrackingMeshFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingMeshFB(ByteBuffer container) {
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
    /** the capacity of the joint data arrays in this structure, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int jointCapacityInput() { return njointCapacityInput(address()); }
    /** filled in by the runtime with the count of joint data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int jointCountOutput() { return njointCountOutput(address()); }
    /** an array of poses that matches what is returned by {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT} which describes the hand skeleton’s bind pose. */
    @NativeType("XrPosef *")
    public XrPosef.@Nullable Buffer jointBindPoses() { return njointBindPoses(address()); }
    /** an array of joint radii at bind pose. */
    @NativeType("float *")
    public @Nullable FloatBuffer jointRadii() { return njointRadii(address()); }
    /** an array of joint parents to define a bone hierarchy for the hand skeleton. */
    @NativeType("XrHandJointEXT *")
    public @Nullable IntBuffer jointParents() { return njointParents(address()); }
    /** the capacity of the vertex data arrays in this structure, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** filled in by the runtime with the count of vertex data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** an array of 3D vertex positions. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertexPositions() { return nvertexPositions(address()); }
    /** an array of 3D vertex normals. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertexNormals() { return nvertexNormals(address()); }
    /** an array of texture coordinates for this vertex. */
    @NativeType("XrVector2f *")
    public XrVector2f.@Nullable Buffer vertexUVs() { return nvertexUVs(address()); }
    /** an array of bone blend indices. */
    @NativeType("XrVector4sFB *")
    public XrVector4sFB.@Nullable Buffer vertexBlendIndices() { return nvertexBlendIndices(address()); }
    /** an array of bone blend weights. */
    @NativeType("XrVector4f *")
    public XrVector4f.@Nullable Buffer vertexBlendWeights() { return nvertexBlendWeights(address()); }
    /** the capacity of the index data arrays in this structure, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** filled in by the runtime with the count of index data elements written, or the required capacity in the case that any of {@code jointCapacityInput}, {@code vertexCapacityInput}, or {@code indexCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** an array of triangle indices. */
    @NativeType("int16_t *")
    public @Nullable ShortBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandTrackingMeshFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB} value to the {@link #type} field. */
    public XrHandTrackingMeshFB type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_MESH_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandTrackingMeshFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #jointCapacityInput} field. */
    public XrHandTrackingMeshFB jointCapacityInput(@NativeType("uint32_t") int value) { njointCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #jointCountOutput} field. */
    public XrHandTrackingMeshFB jointCountOutput(@NativeType("uint32_t") int value) { njointCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrPosef.Buffer} to the {@link #jointBindPoses} field. */
    public XrHandTrackingMeshFB jointBindPoses(@NativeType("XrPosef *") XrPosef.@Nullable Buffer value) { njointBindPoses(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #jointRadii} field. */
    public XrHandTrackingMeshFB jointRadii(@Nullable @NativeType("float *") FloatBuffer value) { njointRadii(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #jointParents} field. */
    public XrHandTrackingMeshFB jointParents(@Nullable @NativeType("XrHandJointEXT *") IntBuffer value) { njointParents(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCapacityInput} field. */
    public XrHandTrackingMeshFB vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCountOutput} field. */
    public XrHandTrackingMeshFB vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #vertexPositions} field. */
    public XrHandTrackingMeshFB vertexPositions(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertexPositions(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #vertexNormals} field. */
    public XrHandTrackingMeshFB vertexNormals(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertexNormals(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@link #vertexUVs} field. */
    public XrHandTrackingMeshFB vertexUVs(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { nvertexUVs(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector4sFB.Buffer} to the {@link #vertexBlendIndices} field. */
    public XrHandTrackingMeshFB vertexBlendIndices(@NativeType("XrVector4sFB *") XrVector4sFB.@Nullable Buffer value) { nvertexBlendIndices(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector4f.Buffer} to the {@link #vertexBlendWeights} field. */
    public XrHandTrackingMeshFB vertexBlendWeights(@NativeType("XrVector4f *") XrVector4f.@Nullable Buffer value) { nvertexBlendWeights(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCapacityInput} field. */
    public XrHandTrackingMeshFB indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCountOutput} field. */
    public XrHandTrackingMeshFB indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@link #indices} field. */
    public XrHandTrackingMeshFB indices(@Nullable @NativeType("int16_t *") ShortBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingMeshFB set(
        int type,
        long next,
        int jointCapacityInput,
        int jointCountOutput,
        XrPosef.@Nullable Buffer jointBindPoses,
        @Nullable FloatBuffer jointRadii,
        @Nullable IntBuffer jointParents,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector3f.@Nullable Buffer vertexPositions,
        XrVector3f.@Nullable Buffer vertexNormals,
        XrVector2f.@Nullable Buffer vertexUVs,
        XrVector4sFB.@Nullable Buffer vertexBlendIndices,
        XrVector4f.@Nullable Buffer vertexBlendWeights,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable ShortBuffer indices
    ) {
        type(type);
        next(next);
        jointCapacityInput(jointCapacityInput);
        jointCountOutput(jointCountOutput);
        jointBindPoses(jointBindPoses);
        jointRadii(jointRadii);
        jointParents(jointParents);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertexPositions(vertexPositions);
        vertexNormals(vertexNormals);
        vertexUVs(vertexUVs);
        vertexBlendIndices(vertexBlendIndices);
        vertexBlendWeights(vertexBlendWeights);
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
    public XrHandTrackingMeshFB set(XrHandTrackingMeshFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingMeshFB malloc() {
        return new XrHandTrackingMeshFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingMeshFB calloc() {
        return new XrHandTrackingMeshFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingMeshFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandTrackingMeshFB(memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance for the specified memory address. */
    public static XrHandTrackingMeshFB create(long address) {
        return new XrHandTrackingMeshFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandTrackingMeshFB createSafe(long address) {
        return address == NULL ? null : new XrHandTrackingMeshFB(address, null);
    }

    /**
     * Returns a new {@link XrHandTrackingMeshFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingMeshFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingMeshFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandTrackingMeshFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandTrackingMeshFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingMeshFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingMeshFB malloc(MemoryStack stack) {
        return new XrHandTrackingMeshFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandTrackingMeshFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingMeshFB calloc(MemoryStack stack) {
        return new XrHandTrackingMeshFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandTrackingMeshFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingMeshFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingMeshFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingMeshFB.NEXT); }
    /** Unsafe version of {@link #jointCapacityInput}. */
    public static int njointCapacityInput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.JOINTCAPACITYINPUT); }
    /** Unsafe version of {@link #jointCountOutput}. */
    public static int njointCountOutput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.JOINTCOUNTOUTPUT); }
    /** Unsafe version of {@link #jointBindPoses}. */
    public static XrPosef.@Nullable Buffer njointBindPoses(long struct) { return XrPosef.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.JOINTBINDPOSES), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #jointRadii() jointRadii}. */
    public static @Nullable FloatBuffer njointRadii(long struct) { return memFloatBufferSafe(memGetAddress(struct + XrHandTrackingMeshFB.JOINTRADII), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #jointParents() jointParents}. */
    public static @Nullable IntBuffer njointParents(long struct) { return memIntBufferSafe(memGetAddress(struct + XrHandTrackingMeshFB.JOINTPARENTS), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertexPositions}. */
    public static XrVector3f.@Nullable Buffer nvertexPositions(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXPOSITIONS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexNormals}. */
    public static XrVector3f.@Nullable Buffer nvertexNormals(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXNORMALS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexUVs}. */
    public static XrVector2f.@Nullable Buffer nvertexUVs(long struct) { return XrVector2f.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXUVS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexBlendIndices}. */
    public static XrVector4sFB.@Nullable Buffer nvertexBlendIndices(long struct) { return XrVector4sFB.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDINDICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexBlendWeights}. */
    public static XrVector4f.@Nullable Buffer nvertexBlendWeights(long struct) { return XrVector4f.createSafe(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDWEIGHTS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrHandTrackingMeshFB.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable ShortBuffer nindices(long struct) { return memShortBufferSafe(memGetAddress(struct + XrHandTrackingMeshFB.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingMeshFB.NEXT, value); }
    /** Sets the specified value to the {@code jointCapacityInput} field of the specified {@code struct}. */
    public static void njointCapacityInput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.JOINTCAPACITYINPUT, value); }
    /** Unsafe version of {@link #jointCountOutput(int) jointCountOutput}. */
    public static void njointCountOutput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.JOINTCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #jointBindPoses(XrPosef.Buffer) jointBindPoses}. */
    public static void njointBindPoses(long struct, XrPosef.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTBINDPOSES, memAddressSafe(value)); }
    /** Unsafe version of {@link #jointRadii(FloatBuffer) jointRadii}. */
    public static void njointRadii(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTRADII, memAddressSafe(value)); }
    /** Unsafe version of {@link #jointParents(IntBuffer) jointParents}. */
    public static void njointParents(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTPARENTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertexPositions(XrVector3f.Buffer) vertexPositions}. */
    public static void nvertexPositions(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXPOSITIONS, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexNormals(XrVector3f.Buffer) vertexNormals}. */
    public static void nvertexNormals(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXNORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexUVs(XrVector2f.Buffer) vertexUVs}. */
    public static void nvertexUVs(long struct, XrVector2f.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXUVS, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexBlendIndices(XrVector4sFB.Buffer) vertexBlendIndices}. */
    public static void nvertexBlendIndices(long struct, XrVector4sFB.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDINDICES, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertexBlendWeights(XrVector4f.Buffer) vertexBlendWeights}. */
    public static void nvertexBlendWeights(long struct, XrVector4f.@Nullable Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDWEIGHTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { memPutInt(struct + XrHandTrackingMeshFB.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(ShortBuffer) indices}. */
    public static void nindices(long struct, @Nullable ShortBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrHandTrackingMeshFB} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingMeshFB, Buffer> implements NativeResource {

        private static final XrHandTrackingMeshFB ELEMENT_FACTORY = XrHandTrackingMeshFB.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingMeshFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingMeshFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandTrackingMeshFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingMeshFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingMeshFB.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingMeshFB.nnext(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#jointCapacityInput} field. */
        @NativeType("uint32_t")
        public int jointCapacityInput() { return XrHandTrackingMeshFB.njointCapacityInput(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#jointCountOutput} field. */
        @NativeType("uint32_t")
        public int jointCountOutput() { return XrHandTrackingMeshFB.njointCountOutput(address()); }
        /** @return a {@link XrPosef.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#jointBindPoses} field. */
        @NativeType("XrPosef *")
        public XrPosef.@Nullable Buffer jointBindPoses() { return XrHandTrackingMeshFB.njointBindPoses(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrHandTrackingMeshFB#jointRadii} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer jointRadii() { return XrHandTrackingMeshFB.njointRadii(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrHandTrackingMeshFB#jointParents} field. */
        @NativeType("XrHandJointEXT *")
        public @Nullable IntBuffer jointParents() { return XrHandTrackingMeshFB.njointParents(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrHandTrackingMeshFB.nvertexCapacityInput(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrHandTrackingMeshFB.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#vertexPositions} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertexPositions() { return XrHandTrackingMeshFB.nvertexPositions(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#vertexNormals} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertexNormals() { return XrHandTrackingMeshFB.nvertexNormals(address()); }
        /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#vertexUVs} field. */
        @NativeType("XrVector2f *")
        public XrVector2f.@Nullable Buffer vertexUVs() { return XrHandTrackingMeshFB.nvertexUVs(address()); }
        /** @return a {@link XrVector4sFB.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#vertexBlendIndices} field. */
        @NativeType("XrVector4sFB *")
        public XrVector4sFB.@Nullable Buffer vertexBlendIndices() { return XrHandTrackingMeshFB.nvertexBlendIndices(address()); }
        /** @return a {@link XrVector4f.Buffer} view of the struct array pointed to by the {@link XrHandTrackingMeshFB#vertexBlendWeights} field. */
        @NativeType("XrVector4f *")
        public XrVector4f.@Nullable Buffer vertexBlendWeights() { return XrHandTrackingMeshFB.nvertexBlendWeights(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrHandTrackingMeshFB.nindexCapacityInput(address()); }
        /** @return the value of the {@link XrHandTrackingMeshFB#indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrHandTrackingMeshFB.nindexCountOutput(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@link XrHandTrackingMeshFB#indices} field. */
        @NativeType("int16_t *")
        public @Nullable ShortBuffer indices() { return XrHandTrackingMeshFB.nindices(address()); }

        /** Sets the specified value to the {@link XrHandTrackingMeshFB#type} field. */
        public XrHandTrackingMeshFB.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingMeshFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB} value to the {@link XrHandTrackingMeshFB#type} field. */
        public XrHandTrackingMeshFB.Buffer type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_MESH_FB); }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#next} field. */
        public XrHandTrackingMeshFB.Buffer next(@NativeType("void *") long value) { XrHandTrackingMeshFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#jointCapacityInput} field. */
        public XrHandTrackingMeshFB.Buffer jointCapacityInput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.njointCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#jointCountOutput} field. */
        public XrHandTrackingMeshFB.Buffer jointCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.njointCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrPosef.Buffer} to the {@link XrHandTrackingMeshFB#jointBindPoses} field. */
        public XrHandTrackingMeshFB.Buffer jointBindPoses(@NativeType("XrPosef *") XrPosef.@Nullable Buffer value) { XrHandTrackingMeshFB.njointBindPoses(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrHandTrackingMeshFB#jointRadii} field. */
        public XrHandTrackingMeshFB.Buffer jointRadii(@Nullable @NativeType("float *") FloatBuffer value) { XrHandTrackingMeshFB.njointRadii(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrHandTrackingMeshFB#jointParents} field. */
        public XrHandTrackingMeshFB.Buffer jointParents(@Nullable @NativeType("XrHandJointEXT *") IntBuffer value) { XrHandTrackingMeshFB.njointParents(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#vertexCapacityInput} field. */
        public XrHandTrackingMeshFB.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#vertexCountOutput} field. */
        public XrHandTrackingMeshFB.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrHandTrackingMeshFB#vertexPositions} field. */
        public XrHandTrackingMeshFB.Buffer vertexPositions(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrHandTrackingMeshFB.nvertexPositions(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrHandTrackingMeshFB#vertexNormals} field. */
        public XrHandTrackingMeshFB.Buffer vertexNormals(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrHandTrackingMeshFB.nvertexNormals(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@link XrHandTrackingMeshFB#vertexUVs} field. */
        public XrHandTrackingMeshFB.Buffer vertexUVs(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { XrHandTrackingMeshFB.nvertexUVs(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector4sFB.Buffer} to the {@link XrHandTrackingMeshFB#vertexBlendIndices} field. */
        public XrHandTrackingMeshFB.Buffer vertexBlendIndices(@NativeType("XrVector4sFB *") XrVector4sFB.@Nullable Buffer value) { XrHandTrackingMeshFB.nvertexBlendIndices(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector4f.Buffer} to the {@link XrHandTrackingMeshFB#vertexBlendWeights} field. */
        public XrHandTrackingMeshFB.Buffer vertexBlendWeights(@NativeType("XrVector4f *") XrVector4f.@Nullable Buffer value) { XrHandTrackingMeshFB.nvertexBlendWeights(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#indexCapacityInput} field. */
        public XrHandTrackingMeshFB.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingMeshFB#indexCountOutput} field. */
        public XrHandTrackingMeshFB.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@link XrHandTrackingMeshFB#indices} field. */
        public XrHandTrackingMeshFB.Buffer indices(@Nullable @NativeType("int16_t *") ShortBuffer value) { XrHandTrackingMeshFB.nindices(address(), value); return this; }

    }

}