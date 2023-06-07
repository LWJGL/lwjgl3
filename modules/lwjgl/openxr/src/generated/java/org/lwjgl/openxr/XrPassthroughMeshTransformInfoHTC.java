/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The information of mesh and transformation of the passthrough.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrPassthroughMeshTransformInfoHTC} structure describes the mesh and transformation.</p>
 * 
 * <p>The application <b>must</b> specify the {@link XrPassthroughMeshTransformInfoHTC} in the {@code next} chain of {@link XrCompositionLayerPassthroughHTC} if the specified form of passthrough layer previously created by {@link HTCPassthrough#xrCreatePassthroughHTC CreatePassthroughHTC} is {@link HTCPassthrough#XR_PASSTHROUGH_FORM_PROJECTED_HTC PASSTHROUGH_FORM_PROJECTED_HTC}.</p>
 * 
 * <p>Passing {@link XrPassthroughMeshTransformInfoHTC} updates the projected mesh information in the runtime for passthrough layer composition.</p>
 * 
 * <p>If {@link XrPassthroughMeshTransformInfoHTC} is not set correctly, runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} when {@link XR10#xrEndFrame EndFrame} is called with composition layer {@link XrCompositionLayerPassthroughHTC}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to using {@link XrPassthroughMeshTransformInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code vertices} <b>must</b> be a pointer to an array of {@code vertexCount} {@link XrVector3f} structures</li>
 * <li>{@code indices} <b>must</b> be a pointer to an array of {@code indexCount} {@code uint32_t} values</li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>The {@code vertexCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code indexCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughMeshTransformInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #vertexCount};
 *     {@link XrVector3f XrVector3f} const * {@link #vertices};
 *     uint32_t {@link #indexCount};
 *     uint32_t const * {@link #indices};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrVector3f XrVector3f} {@link #scale};
 * }</code></pre>
 */
public class XrPassthroughMeshTransformInfoHTC extends Struct<XrPassthroughMeshTransformInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCOUNT,
        VERTICES,
        INDEXCOUNT,
        INDICES,
        BASESPACE,
        TIME,
        POSE,
        SCALE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VERTEXCOUNT = layout.offsetof(2);
        VERTICES = layout.offsetof(3);
        INDEXCOUNT = layout.offsetof(4);
        INDICES = layout.offsetof(5);
        BASESPACE = layout.offsetof(6);
        TIME = layout.offsetof(7);
        POSE = layout.offsetof(8);
        SCALE = layout.offsetof(9);
    }

    protected XrPassthroughMeshTransformInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughMeshTransformInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughMeshTransformInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrPassthroughMeshTransformInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughMeshTransformInfoHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the count of vertices array in the mesh. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** an array of {@link XrVector3f}. The size of the array <b>must</b> be equal to vertexCount. */
    @NativeType("XrVector3f const *")
    public XrVector3f.Buffer vertices() { return nvertices(address()); }
    /** the count of indices array in the mesh. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** an array of triangle indices. The size of the array <b>must</b> be equal to indexCount. */
    @NativeType("uint32_t const *")
    public IntBuffer indices() { return nindices(address()); }
    /** the {@code XrSpace} that defines the projected passthrough’s base space for transformations. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** the {@code XrTime} that defines the time at which the transform is applied. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** the {@link XrPosef} that defines the pose of the mesh */
    public XrPosef pose() { return npose(address()); }
    /** the {@link XrVector3f} that defines the scale of the mesh */
    public XrVector3f scale() { return nscale(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPassthroughMeshTransformInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC} value to the {@link #type} field. */
    public XrPassthroughMeshTransformInfoHTC type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPassthroughMeshTransformInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #vertices} field. */
    public XrPassthroughMeshTransformInfoHTC vertices(@NativeType("XrVector3f const *") XrVector3f.Buffer value) { nvertices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #indices} field. */
    public XrPassthroughMeshTransformInfoHTC indices(@NativeType("uint32_t const *") IntBuffer value) { nindices(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrPassthroughMeshTransformInfoHTC baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrPassthroughMeshTransformInfoHTC time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrPassthroughMeshTransformInfoHTC pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughMeshTransformInfoHTC pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #scale} field. */
    public XrPassthroughMeshTransformInfoHTC scale(XrVector3f value) { nscale(address(), value); return this; }
    /** Passes the {@link #scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughMeshTransformInfoHTC scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughMeshTransformInfoHTC set(
        int type,
        long next,
        XrVector3f.Buffer vertices,
        IntBuffer indices,
        XrSpace baseSpace,
        long time,
        XrPosef pose,
        XrVector3f scale
    ) {
        type(type);
        next(next);
        vertices(vertices);
        indices(indices);
        baseSpace(baseSpace);
        time(time);
        pose(pose);
        scale(scale);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughMeshTransformInfoHTC set(XrPassthroughMeshTransformInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughMeshTransformInfoHTC malloc() {
        return new XrPassthroughMeshTransformInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughMeshTransformInfoHTC calloc() {
        return new XrPassthroughMeshTransformInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughMeshTransformInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughMeshTransformInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance for the specified memory address. */
    public static XrPassthroughMeshTransformInfoHTC create(long address) {
        return new XrPassthroughMeshTransformInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughMeshTransformInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrPassthroughMeshTransformInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughMeshTransformInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughMeshTransformInfoHTC malloc(MemoryStack stack) {
        return new XrPassthroughMeshTransformInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughMeshTransformInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughMeshTransformInfoHTC calloc(MemoryStack stack) {
        return new XrPassthroughMeshTransformInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughMeshTransformInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughMeshTransformInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughMeshTransformInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.NEXT); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughMeshTransformInfoHTC.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.Buffer nvertices(long struct) { return XrVector3f.create(memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.VERTICES), nvertexCount(struct)); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughMeshTransformInfoHTC.INDEXCOUNT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static IntBuffer nindices(long struct) { return memIntBuffer(memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.INDICES), nindexCount(struct)); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrPassthroughMeshTransformInfoHTC.TIME); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrPassthroughMeshTransformInfoHTC.POSE); }
    /** Unsafe version of {@link #scale}. */
    public static XrVector3f nscale(long struct) { return XrVector3f.create(struct + XrPassthroughMeshTransformInfoHTC.SCALE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughMeshTransformInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughMeshTransformInfoHTC.NEXT, value); }
    /** Sets the specified value to the {@code vertexCount} field of the specified {@code struct}. */
    public static void nvertexCount(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughMeshTransformInfoHTC.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrPassthroughMeshTransformInfoHTC.VERTICES, value.address()); nvertexCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code indexCount} field of the specified {@code struct}. */
    public static void nindexCount(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughMeshTransformInfoHTC.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, IntBuffer value) { memPutAddress(struct + XrPassthroughMeshTransformInfoHTC.INDICES, memAddress(value)); nindexCount(struct, value.remaining()); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrPassthroughMeshTransformInfoHTC.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrPassthroughMeshTransformInfoHTC.TIME, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrPassthroughMeshTransformInfoHTC.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #scale(XrVector3f) scale}. */
    public static void nscale(long struct, XrVector3f value) { memCopy(value.address(), struct + XrPassthroughMeshTransformInfoHTC.SCALE, XrVector3f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.VERTICES));
        check(memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.INDICES));
        check(memGetAddress(struct + XrPassthroughMeshTransformInfoHTC.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughMeshTransformInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughMeshTransformInfoHTC, Buffer> implements NativeResource {

        private static final XrPassthroughMeshTransformInfoHTC ELEMENT_FACTORY = XrPassthroughMeshTransformInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrPassthroughMeshTransformInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughMeshTransformInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughMeshTransformInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughMeshTransformInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughMeshTransformInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return XrPassthroughMeshTransformInfoHTC.nvertexCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrPassthroughMeshTransformInfoHTC#vertices} field. */
        @NativeType("XrVector3f const *")
        public XrVector3f.Buffer vertices() { return XrPassthroughMeshTransformInfoHTC.nvertices(address()); }
        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return XrPassthroughMeshTransformInfoHTC.nindexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrPassthroughMeshTransformInfoHTC#indices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer indices() { return XrPassthroughMeshTransformInfoHTC.nindices(address()); }
        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrPassthroughMeshTransformInfoHTC.nbaseSpace(address()); }
        /** @return the value of the {@link XrPassthroughMeshTransformInfoHTC#time} field. */
        @NativeType("XrTime")
        public long time() { return XrPassthroughMeshTransformInfoHTC.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@link XrPassthroughMeshTransformInfoHTC#pose} field. */
        public XrPosef pose() { return XrPassthroughMeshTransformInfoHTC.npose(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrPassthroughMeshTransformInfoHTC#scale} field. */
        public XrVector3f scale() { return XrPassthroughMeshTransformInfoHTC.nscale(address()); }

        /** Sets the specified value to the {@link XrPassthroughMeshTransformInfoHTC#type} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughMeshTransformInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCPassthrough#XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC} value to the {@link XrPassthroughMeshTransformInfoHTC#type} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer type$Default() { return type(HTCPassthrough.XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC); }
        /** Sets the specified value to the {@link XrPassthroughMeshTransformInfoHTC#next} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer next(@NativeType("void const *") long value) { XrPassthroughMeshTransformInfoHTC.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrPassthroughMeshTransformInfoHTC#vertices} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer vertices(@NativeType("XrVector3f const *") XrVector3f.Buffer value) { XrPassthroughMeshTransformInfoHTC.nvertices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrPassthroughMeshTransformInfoHTC#indices} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer indices(@NativeType("uint32_t const *") IntBuffer value) { XrPassthroughMeshTransformInfoHTC.nindices(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughMeshTransformInfoHTC#baseSpace} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer baseSpace(XrSpace value) { XrPassthroughMeshTransformInfoHTC.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrPassthroughMeshTransformInfoHTC#time} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer time(@NativeType("XrTime") long value) { XrPassthroughMeshTransformInfoHTC.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrPassthroughMeshTransformInfoHTC#pose} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer pose(XrPosef value) { XrPassthroughMeshTransformInfoHTC.npose(address(), value); return this; }
        /** Passes the {@link XrPassthroughMeshTransformInfoHTC#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughMeshTransformInfoHTC.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrPassthroughMeshTransformInfoHTC#scale} field. */
        public XrPassthroughMeshTransformInfoHTC.Buffer scale(XrVector3f value) { XrPassthroughMeshTransformInfoHTC.nscale(address(), value); return this; }
        /** Passes the {@link XrPassthroughMeshTransformInfoHTC#scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughMeshTransformInfoHTC.Buffer scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    }

}