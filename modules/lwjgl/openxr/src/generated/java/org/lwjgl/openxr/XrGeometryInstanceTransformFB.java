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
 * A geometry transformation.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code baseSpace} is the {@code XrSpace} that defines the geometry instance’s base space for transformations.</li>
 * <li>{@code time} is the {@code XrTime} that define the time at which the transform is applied.</li>
 * <li>{@code pose} is the {@link XrPosef} that defines the geometry instance’s pose.</li>
 * <li>{@code scale} is the {@link XrVector3f} that defines the geometry instance’s scale.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrGeometryInstanceTransformFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrVector3f}, {@link FBPassthrough#xrGeometryInstanceSetTransformFB GeometryInstanceSetTransformFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGeometryInstanceTransformFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     {@link XrPosef XrPosef} pose;
 *     {@link XrVector3f XrVector3f} scale;
 * }</code></pre>
 */
public class XrGeometryInstanceTransformFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        POSE,
        SCALE;

    static {
        Layout layout = __struct(
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
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        POSE = layout.offsetof(4);
        SCALE = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrGeometryInstanceTransformFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeometryInstanceTransformFB(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return a {@link XrVector3f} view of the {@code scale} field. */
    public XrVector3f scale() { return nscale(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeometryInstanceTransformFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB} value to the {@code type} field. */
    public XrGeometryInstanceTransformFB type$Default() { return type(FBPassthrough.XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeometryInstanceTransformFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrGeometryInstanceTransformFB baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrGeometryInstanceTransformFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrGeometryInstanceTransformFB pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeometryInstanceTransformFB pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
    public XrGeometryInstanceTransformFB scale(XrVector3f value) { nscale(address(), value); return this; }
    /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeometryInstanceTransformFB scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeometryInstanceTransformFB set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        XrPosef pose,
        XrVector3f scale
    ) {
        type(type);
        next(next);
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
    public XrGeometryInstanceTransformFB set(XrGeometryInstanceTransformFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeometryInstanceTransformFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeometryInstanceTransformFB malloc() {
        return wrap(XrGeometryInstanceTransformFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGeometryInstanceTransformFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeometryInstanceTransformFB calloc() {
        return wrap(XrGeometryInstanceTransformFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGeometryInstanceTransformFB} instance allocated with {@link BufferUtils}. */
    public static XrGeometryInstanceTransformFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGeometryInstanceTransformFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGeometryInstanceTransformFB} instance for the specified memory address. */
    public static XrGeometryInstanceTransformFB create(long address) {
        return wrap(XrGeometryInstanceTransformFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGeometryInstanceTransformFB createSafe(long address) {
        return address == NULL ? null : wrap(XrGeometryInstanceTransformFB.class, address);
    }

    /**
     * Returns a new {@link XrGeometryInstanceTransformFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceTransformFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceTransformFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGeometryInstanceTransformFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGeometryInstanceTransformFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGeometryInstanceTransformFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeometryInstanceTransformFB malloc(MemoryStack stack) {
        return wrap(XrGeometryInstanceTransformFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGeometryInstanceTransformFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeometryInstanceTransformFB calloc(MemoryStack stack) {
        return wrap(XrGeometryInstanceTransformFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGeometryInstanceTransformFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeometryInstanceTransformFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeometryInstanceTransformFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGeometryInstanceTransformFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeometryInstanceTransformFB.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrGeometryInstanceTransformFB.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrGeometryInstanceTransformFB.TIME); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrGeometryInstanceTransformFB.POSE); }
    /** Unsafe version of {@link #scale}. */
    public static XrVector3f nscale(long struct) { return XrVector3f.create(struct + XrGeometryInstanceTransformFB.SCALE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGeometryInstanceTransformFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeometryInstanceTransformFB.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrGeometryInstanceTransformFB.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrGeometryInstanceTransformFB.TIME, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrGeometryInstanceTransformFB.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #scale(XrVector3f) scale}. */
    public static void nscale(long struct, XrVector3f value) { memCopy(value.address(), struct + XrGeometryInstanceTransformFB.SCALE, XrVector3f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGeometryInstanceTransformFB.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrGeometryInstanceTransformFB} structs. */
    public static class Buffer extends StructBuffer<XrGeometryInstanceTransformFB, Buffer> implements NativeResource {

        private static final XrGeometryInstanceTransformFB ELEMENT_FACTORY = XrGeometryInstanceTransformFB.create(-1L);

        /**
         * Creates a new {@code XrGeometryInstanceTransformFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeometryInstanceTransformFB#SIZEOF}, and its mark will be undefined.
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
        protected XrGeometryInstanceTransformFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeometryInstanceTransformFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeometryInstanceTransformFB.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrGeometryInstanceTransformFB.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrGeometryInstanceTransformFB.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrGeometryInstanceTransformFB.npose(address()); }
        /** @return a {@link XrVector3f} view of the {@code scale} field. */
        public XrVector3f scale() { return XrGeometryInstanceTransformFB.nscale(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeometryInstanceTransformFB.Buffer type(@NativeType("XrStructureType") int value) { XrGeometryInstanceTransformFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB} value to the {@code type} field. */
        public XrGeometryInstanceTransformFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeometryInstanceTransformFB.Buffer next(@NativeType("void const *") long value) { XrGeometryInstanceTransformFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrGeometryInstanceTransformFB.Buffer baseSpace(XrSpace value) { XrGeometryInstanceTransformFB.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrGeometryInstanceTransformFB.Buffer time(@NativeType("XrTime") long value) { XrGeometryInstanceTransformFB.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrGeometryInstanceTransformFB.Buffer pose(XrPosef value) { XrGeometryInstanceTransformFB.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeometryInstanceTransformFB.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code scale} field. */
        public XrGeometryInstanceTransformFB.Buffer scale(XrVector3f value) { XrGeometryInstanceTransformFB.nscale(address(), value); return this; }
        /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeometryInstanceTransformFB.Buffer scale(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(scale()); return this; }

    }

}