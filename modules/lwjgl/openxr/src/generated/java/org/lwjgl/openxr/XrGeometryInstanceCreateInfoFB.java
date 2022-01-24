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
 * A create structure for geometry instance.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code layer} is the {@code XrPassthroughLayerFB}.</li>
 * <li>{@code mesh} is the {@code XrTriangleMeshFB}.</li>
 * <li>{@code baseSpace} is the {@code XrSpace} that defines the geometry instance’s base space for transformations.</li>
 * <li>{@code pose} is the {@link XrPosef} that defines the geometry instance’s pose.</li>
 * <li>{@code scale} is the {@link XrVector3f} that defines the geometry instance’s scale.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrGeometryInstanceCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
 * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>Each of {@code baseSpace}, {@code layer}, and {@code mesh} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrVector3f}, {@link FBPassthrough#xrCreateGeometryInstanceFB CreateGeometryInstanceFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGeometryInstanceCreateInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughLayerFB layer;
 *     XrTriangleMeshFB mesh;
 *     XrSpace baseSpace;
 *     {@link XrPosef XrPosef} pose;
 *     {@link XrVector3f XrVector3f} scale;
 * }</code></pre>
 */
public class XrGeometryInstanceCreateInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYER,
        MESH,
        BASESPACE,
        POSE,
        SCALE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYER = layout.offsetof(2);
        MESH = layout.offsetof(3);
        BASESPACE = layout.offsetof(4);
        POSE = layout.offsetof(5);
        SCALE = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrGeometryInstanceCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeometryInstanceCreateInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code layer} field. */
    @NativeType("XrPassthroughLayerFB")
    public long layer() { return nlayer(address()); }
    /** @return the value of the {@code mesh} field. */
    @NativeType("XrTriangleMeshFB")
    public long mesh() { return nmesh(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return a {@link XrVector3f} view of the {@code scale} field. */
    public XrVector3f scale() { return nscale(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeometryInstanceCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB} value to the {@code type} field. */
    public XrGeometryInstanceCreateInfoFB type$Default() { return type(FBPassthrough.XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeometryInstanceCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public XrGeometryInstanceCreateInfoFB layer(XrPassthroughLayerFB value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@code mesh} field. */
    public XrGeometryInstanceCreateInfoFB mesh(XrTriangleMeshFB value) { nmesh(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrGeometryInstanceCreateInfoFB baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrGeometryInstanceCreateInfoFB pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeometryInstanceCreateInfoFB pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
    public XrGeometryInstanceCreateInfoFB scale(XrVector3f value) { nscale(address(), value); return this; }
    /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeometryInstanceCreateInfoFB scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeometryInstanceCreateInfoFB set(
        int type,
        long next,
        XrPassthroughLayerFB layer,
        XrTriangleMeshFB mesh,
        XrSpace baseSpace,
        XrPosef pose,
        XrVector3f scale
    ) {
        type(type);
        next(next);
        layer(layer);
        mesh(mesh);
        baseSpace(baseSpace);
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
    public XrGeometryInstanceCreateInfoFB set(XrGeometryInstanceCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeometryInstanceCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeometryInstanceCreateInfoFB malloc() {
        return wrap(XrGeometryInstanceCreateInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGeometryInstanceCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeometryInstanceCreateInfoFB calloc() {
        return wrap(XrGeometryInstanceCreateInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGeometryInstanceCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrGeometryInstanceCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGeometryInstanceCreateInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGeometryInstanceCreateInfoFB} instance for the specified memory address. */
    public static XrGeometryInstanceCreateInfoFB create(long address) {
        return wrap(XrGeometryInstanceCreateInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGeometryInstanceCreateInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrGeometryInstanceCreateInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrGeometryInstanceCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGeometryInstanceCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGeometryInstanceCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGeometryInstanceCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeometryInstanceCreateInfoFB malloc(MemoryStack stack) {
        return wrap(XrGeometryInstanceCreateInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGeometryInstanceCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeometryInstanceCreateInfoFB calloc(MemoryStack stack) {
        return wrap(XrGeometryInstanceCreateInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGeometryInstanceCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGeometryInstanceCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeometryInstanceCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #layer}. */
    public static long nlayer(long struct) { return memGetAddress(struct + XrGeometryInstanceCreateInfoFB.LAYER); }
    /** Unsafe version of {@link #mesh}. */
    public static long nmesh(long struct) { return memGetAddress(struct + XrGeometryInstanceCreateInfoFB.MESH); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrGeometryInstanceCreateInfoFB.BASESPACE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrGeometryInstanceCreateInfoFB.POSE); }
    /** Unsafe version of {@link #scale}. */
    public static XrVector3f nscale(long struct) { return XrVector3f.create(struct + XrGeometryInstanceCreateInfoFB.SCALE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGeometryInstanceCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeometryInstanceCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #layer(XrPassthroughLayerFB) layer}. */
    public static void nlayer(long struct, XrPassthroughLayerFB value) { memPutAddress(struct + XrGeometryInstanceCreateInfoFB.LAYER, value.address()); }
    /** Unsafe version of {@link #mesh(XrTriangleMeshFB) mesh}. */
    public static void nmesh(long struct, XrTriangleMeshFB value) { memPutAddress(struct + XrGeometryInstanceCreateInfoFB.MESH, value.address()); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrGeometryInstanceCreateInfoFB.BASESPACE, value.address()); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrGeometryInstanceCreateInfoFB.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #scale(XrVector3f) scale}. */
    public static void nscale(long struct, XrVector3f value) { memCopy(value.address(), struct + XrGeometryInstanceCreateInfoFB.SCALE, XrVector3f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGeometryInstanceCreateInfoFB.LAYER));
        check(memGetAddress(struct + XrGeometryInstanceCreateInfoFB.MESH));
        check(memGetAddress(struct + XrGeometryInstanceCreateInfoFB.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrGeometryInstanceCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrGeometryInstanceCreateInfoFB, Buffer> implements NativeResource {

        private static final XrGeometryInstanceCreateInfoFB ELEMENT_FACTORY = XrGeometryInstanceCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrGeometryInstanceCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeometryInstanceCreateInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrGeometryInstanceCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeometryInstanceCreateInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeometryInstanceCreateInfoFB.nnext(address()); }
        /** @return the value of the {@code layer} field. */
        @NativeType("XrPassthroughLayerFB")
        public long layer() { return XrGeometryInstanceCreateInfoFB.nlayer(address()); }
        /** @return the value of the {@code mesh} field. */
        @NativeType("XrTriangleMeshFB")
        public long mesh() { return XrGeometryInstanceCreateInfoFB.nmesh(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrGeometryInstanceCreateInfoFB.nbaseSpace(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrGeometryInstanceCreateInfoFB.npose(address()); }
        /** @return a {@link XrVector3f} view of the {@code scale} field. */
        public XrVector3f scale() { return XrGeometryInstanceCreateInfoFB.nscale(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrGeometryInstanceCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB} value to the {@code type} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrGeometryInstanceCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer layer(XrPassthroughLayerFB value) { XrGeometryInstanceCreateInfoFB.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@code mesh} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer mesh(XrTriangleMeshFB value) { XrGeometryInstanceCreateInfoFB.nmesh(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer baseSpace(XrSpace value) { XrGeometryInstanceCreateInfoFB.nbaseSpace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer pose(XrPosef value) { XrGeometryInstanceCreateInfoFB.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeometryInstanceCreateInfoFB.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
        public XrGeometryInstanceCreateInfoFB.Buffer scale(XrVector3f value) { XrGeometryInstanceCreateInfoFB.nscale(address(), value); return this; }
        /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeometryInstanceCreateInfoFB.Buffer scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    }

}