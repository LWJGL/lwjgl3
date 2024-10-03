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
 * Structure used to create a single anchors at a certain pose.
 * 
 * <h5>Description</h5>
 * 
 * <p>Note that {@link MLSpatialAnchors#xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML} <b>must</b> be called with {@link XrCreateSpatialAnchorsCompletionML}{@code ::spaceCount} set to 1 when using {@link XrSpatialAnchorsCreateInfoFromPoseML} to create a spatial anchor.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsCreateInfoFromPoseML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchors#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link MLSpatialAnchors#xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsCreateInfoFromPoseML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     {@link XrPosef XrPosef} {@link #poseInBaseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrSpatialAnchorsCreateInfoFromPoseML extends Struct<XrSpatialAnchorsCreateInfoFromPoseML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        POSEINBASESPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        POSEINBASESPACE = layout.offsetof(3);
        TIME = layout.offsetof(4);
    }

    protected XrSpatialAnchorsCreateInfoFromPoseML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsCreateInfoFromPoseML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsCreateInfoFromPoseML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsCreateInfoFromPoseML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsCreateInfoFromPoseML(ByteBuffer container) {
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
    /** {@code baseSpace} {@code XrSpace} used to calculate the position of the anchor. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** {@link XrPosef} of the anchor to create. */
    public XrPosef poseInBaseSpace() { return nposeInBaseSpace(address()); }
    /** {@code time} {@code XrTime} to resolve the pose in the base space. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchors#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML type$Default() { return type(MLSpatialAnchors.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInBaseSpace} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML poseInBaseSpace(XrPosef value) { nposeInBaseSpace(address(), value); return this; }
    /** Passes the {@link #poseInBaseSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorsCreateInfoFromPoseML poseInBaseSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInBaseSpace()); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSpatialAnchorsCreateInfoFromPoseML time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsCreateInfoFromPoseML set(
        int type,
        long next,
        XrSpace baseSpace,
        XrPosef poseInBaseSpace,
        long time
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        poseInBaseSpace(poseInBaseSpace);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsCreateInfoFromPoseML set(XrSpatialAnchorsCreateInfoFromPoseML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromPoseML malloc() {
        return new XrSpatialAnchorsCreateInfoFromPoseML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromPoseML calloc() {
        return new XrSpatialAnchorsCreateInfoFromPoseML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsCreateInfoFromPoseML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsCreateInfoFromPoseML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance for the specified memory address. */
    public static XrSpatialAnchorsCreateInfoFromPoseML create(long address) {
        return new XrSpatialAnchorsCreateInfoFromPoseML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsCreateInfoFromPoseML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsCreateInfoFromPoseML(address, null);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML} instance to {@code XrSpatialAnchorsCreateInfoFromPoseML}. */
    public static XrSpatialAnchorsCreateInfoFromPoseML create(XrSpatialAnchorsCreateInfoBaseHeaderML value) {
        return new XrSpatialAnchorsCreateInfoFromPoseML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer} instance to {@code XrSpatialAnchorsCreateInfoFromPoseML.Buffer}. */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer create(XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer value) {
        return new XrSpatialAnchorsCreateInfoFromPoseML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromPoseML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromPoseML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromPoseML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromPoseML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsCreateInfoFromPoseML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromPoseML.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromPoseML.BASESPACE); }
    /** Unsafe version of {@link #poseInBaseSpace}. */
    public static XrPosef nposeInBaseSpace(long struct) { return XrPosef.create(struct + XrSpatialAnchorsCreateInfoFromPoseML.POSEINBASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrSpatialAnchorsCreateInfoFromPoseML.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsCreateInfoFromPoseML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromPoseML.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromPoseML.BASESPACE, value.address()); }
    /** Unsafe version of {@link #poseInBaseSpace(XrPosef) poseInBaseSpace}. */
    public static void nposeInBaseSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorsCreateInfoFromPoseML.POSEINBASESPACE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrSpatialAnchorsCreateInfoFromPoseML.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromPoseML.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsCreateInfoFromPoseML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsCreateInfoFromPoseML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsCreateInfoFromPoseML ELEMENT_FACTORY = XrSpatialAnchorsCreateInfoFromPoseML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsCreateInfoFromPoseML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsCreateInfoFromPoseML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsCreateInfoFromPoseML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromPoseML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsCreateInfoFromPoseML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromPoseML#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsCreateInfoFromPoseML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromPoseML#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpatialAnchorsCreateInfoFromPoseML.nbaseSpace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialAnchorsCreateInfoFromPoseML#poseInBaseSpace} field. */
        public XrPosef poseInBaseSpace() { return XrSpatialAnchorsCreateInfoFromPoseML.nposeInBaseSpace(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromPoseML#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialAnchorsCreateInfoFromPoseML.ntime(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromPoseML#type} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsCreateInfoFromPoseML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchors#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML} value to the {@link XrSpatialAnchorsCreateInfoFromPoseML#type} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer type$Default() { return type(MLSpatialAnchors.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromPoseML#next} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsCreateInfoFromPoseML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromPoseML#baseSpace} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer baseSpace(XrSpace value) { XrSpatialAnchorsCreateInfoFromPoseML.nbaseSpace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialAnchorsCreateInfoFromPoseML#poseInBaseSpace} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer poseInBaseSpace(XrPosef value) { XrSpatialAnchorsCreateInfoFromPoseML.nposeInBaseSpace(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorsCreateInfoFromPoseML#poseInBaseSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer poseInBaseSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInBaseSpace()); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromPoseML#time} field. */
        public XrSpatialAnchorsCreateInfoFromPoseML.Buffer time(@NativeType("XrTime") long value) { XrSpatialAnchorsCreateInfoFromPoseML.ntime(address(), value); return this; }

    }

}