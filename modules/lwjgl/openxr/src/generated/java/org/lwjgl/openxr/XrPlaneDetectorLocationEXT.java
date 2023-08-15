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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the location of a plane.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using {@link XrPlaneDetectorLocationEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_LOCATION_EXT TYPE_PLANE_DETECTOR_LOCATION_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
 * <li>If {@code orientation} is not 0, {@code orientation} <b>must</b> be a valid {@code XrPlaneDetectorOrientationEXT} value</li>
 * <li>If {@code semanticType} is not 0, {@code semanticType} <b>must</b> be a valid {@code XrPlaneDetectorSemanticTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrPlaneDetectorLocationsEXT}, {@link XrPosef}, {@link EXTPlaneDetection#xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPlaneDetectorLocationEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint64_t {@link #planeId};
 *     XrSpaceLocationFlags {@link #locationFlags};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrExtent2Df XrExtent2Df} extents;
 *     XrPlaneDetectorOrientationEXT {@link #orientation};
 *     XrPlaneDetectorSemanticTypeEXT {@link #semanticType};
 *     uint32_t {@link #polygonBufferCount};
 * }</code></pre>
 */
public class XrPlaneDetectorLocationEXT extends Struct<XrPlaneDetectorLocationEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PLANEID,
        LOCATIONFLAGS,
        POSE,
        EXTENTS,
        ORIENTATION,
        SEMANTICTYPE,
        POLYGONBUFFERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PLANEID = layout.offsetof(2);
        LOCATIONFLAGS = layout.offsetof(3);
        POSE = layout.offsetof(4);
        EXTENTS = layout.offsetof(5);
        ORIENTATION = layout.offsetof(6);
        SEMANTICTYPE = layout.offsetof(7);
        POLYGONBUFFERCOUNT = layout.offsetof(8);
    }

    protected XrPlaneDetectorLocationEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorLocationEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorLocationEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorLocationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorLocationEXT(ByteBuffer container) {
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
    /** a {@code uint64_t} unique identifier of the plane. The planeId <b>should</b> remain the same for the duration of the {@code XrPlaneDetectorEXT} handle for a physical plane. A runtime on occasion <b>may</b> assign a different id to the same physical plane, for example when several planes merge into one plane. {@code planeId} <b>must</b> remain valid until the next call to {@link EXTPlaneDetection#xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} or {@link EXTPlaneDetection#xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT}. This id is used by {@link EXTPlaneDetection#xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT}. */
    @NativeType("uint64_t")
    public long planeId() { return nplaneId(address()); }
    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** an {@link XrPosef} defining the position and orientation of the origin of a plane within the reference frame of the corresponding {@link XrPlaneDetectorGetInfoEXT}{@code ::baseSpace}. */
    public XrPosef pose() { return npose(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }
    /** the detected orientation of the plane. */
    @NativeType("XrPlaneDetectorOrientationEXT")
    public int orientation() { return norientation(address()); }
    /** {@code semanticType} {@code XrPlaneDetectorSemanticTypeEXT} type of the plane. */
    @NativeType("XrPlaneDetectorSemanticTypeEXT")
    public int semanticType() { return nsemanticType(address()); }
    /** the number of polygon buffers associated with this plane. If this is zero no polygon buffer was generated. The first polygon buffer is always the outside contour. If contours are requested with {@link EXTPlaneDetection#XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT} this value <b>must</b> always be at least 1. */
    @NativeType("uint32_t")
    public int polygonBufferCount() { return npolygonBufferCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPlaneDetectorLocationEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_LOCATION_EXT TYPE_PLANE_DETECTOR_LOCATION_EXT} value to the {@code type} field. */
    public XrPlaneDetectorLocationEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_LOCATION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrPlaneDetectorLocationEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #planeId} field. */
    public XrPlaneDetectorLocationEXT planeId(@NativeType("uint64_t") long value) { nplaneId(address(), value); return this; }
    /** Sets the specified value to the {@link #locationFlags} field. */
    public XrPlaneDetectorLocationEXT locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrPlaneDetectorLocationEXT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPlaneDetectorLocationEXT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrPlaneDetectorLocationEXT extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPlaneDetectorLocationEXT extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
    /** Sets the specified value to the {@link #orientation} field. */
    public XrPlaneDetectorLocationEXT orientation(@NativeType("XrPlaneDetectorOrientationEXT") int value) { norientation(address(), value); return this; }
    /** Sets the specified value to the {@link #semanticType} field. */
    public XrPlaneDetectorLocationEXT semanticType(@NativeType("XrPlaneDetectorSemanticTypeEXT") int value) { nsemanticType(address(), value); return this; }
    /** Sets the specified value to the {@link #polygonBufferCount} field. */
    public XrPlaneDetectorLocationEXT polygonBufferCount(@NativeType("uint32_t") int value) { npolygonBufferCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorLocationEXT set(
        int type,
        long next,
        long planeId,
        long locationFlags,
        XrPosef pose,
        XrExtent2Df extents,
        int orientation,
        int semanticType,
        int polygonBufferCount
    ) {
        type(type);
        next(next);
        planeId(planeId);
        locationFlags(locationFlags);
        pose(pose);
        extents(extents);
        orientation(orientation);
        semanticType(semanticType);
        polygonBufferCount(polygonBufferCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPlaneDetectorLocationEXT set(XrPlaneDetectorLocationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorLocationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorLocationEXT malloc() {
        return new XrPlaneDetectorLocationEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorLocationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorLocationEXT calloc() {
        return new XrPlaneDetectorLocationEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorLocationEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorLocationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorLocationEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorLocationEXT} instance for the specified memory address. */
    public static XrPlaneDetectorLocationEXT create(long address) {
        return new XrPlaneDetectorLocationEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorLocationEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorLocationEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorLocationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorLocationEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorLocationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorLocationEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorLocationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorLocationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorLocationEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorLocationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorLocationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorLocationEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorLocationEXT.NEXT); }
    /** Unsafe version of {@link #planeId}. */
    public static long nplaneId(long struct) { return UNSAFE.getLong(null, struct + XrPlaneDetectorLocationEXT.PLANEID); }
    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return UNSAFE.getLong(null, struct + XrPlaneDetectorLocationEXT.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrPlaneDetectorLocationEXT.POSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrPlaneDetectorLocationEXT.EXTENTS); }
    /** Unsafe version of {@link #orientation}. */
    public static int norientation(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorLocationEXT.ORIENTATION); }
    /** Unsafe version of {@link #semanticType}. */
    public static int nsemanticType(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorLocationEXT.SEMANTICTYPE); }
    /** Unsafe version of {@link #polygonBufferCount}. */
    public static int npolygonBufferCount(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorLocationEXT.POLYGONBUFFERCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorLocationEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorLocationEXT.NEXT, value); }
    /** Unsafe version of {@link #planeId(long) planeId}. */
    public static void nplaneId(long struct, long value) { UNSAFE.putLong(null, struct + XrPlaneDetectorLocationEXT.PLANEID, value); }
    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrPlaneDetectorLocationEXT.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrPlaneDetectorLocationEXT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrPlaneDetectorLocationEXT.EXTENTS, XrExtent2Df.SIZEOF); }
    /** Unsafe version of {@link #orientation(int) orientation}. */
    public static void norientation(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorLocationEXT.ORIENTATION, value); }
    /** Unsafe version of {@link #semanticType(int) semanticType}. */
    public static void nsemanticType(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorLocationEXT.SEMANTICTYPE, value); }
    /** Unsafe version of {@link #polygonBufferCount(int) polygonBufferCount}. */
    public static void npolygonBufferCount(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorLocationEXT.POLYGONBUFFERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorLocationEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorLocationEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorLocationEXT ELEMENT_FACTORY = XrPlaneDetectorLocationEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorLocationEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorLocationEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorLocationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorLocationEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPlaneDetectorLocationEXT.nnext(address()); }
        /** @return the value of the {@link XrPlaneDetectorLocationEXT#planeId} field. */
        @NativeType("uint64_t")
        public long planeId() { return XrPlaneDetectorLocationEXT.nplaneId(address()); }
        /** @return the value of the {@link XrPlaneDetectorLocationEXT#locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrPlaneDetectorLocationEXT.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrPlaneDetectorLocationEXT#pose} field. */
        public XrPosef pose() { return XrPlaneDetectorLocationEXT.npose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrPlaneDetectorLocationEXT.nextents(address()); }
        /** @return the value of the {@link XrPlaneDetectorLocationEXT#orientation} field. */
        @NativeType("XrPlaneDetectorOrientationEXT")
        public int orientation() { return XrPlaneDetectorLocationEXT.norientation(address()); }
        /** @return the value of the {@link XrPlaneDetectorLocationEXT#semanticType} field. */
        @NativeType("XrPlaneDetectorSemanticTypeEXT")
        public int semanticType() { return XrPlaneDetectorLocationEXT.nsemanticType(address()); }
        /** @return the value of the {@link XrPlaneDetectorLocationEXT#polygonBufferCount} field. */
        @NativeType("uint32_t")
        public int polygonBufferCount() { return XrPlaneDetectorLocationEXT.npolygonBufferCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPlaneDetectorLocationEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorLocationEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_LOCATION_EXT TYPE_PLANE_DETECTOR_LOCATION_EXT} value to the {@code type} field. */
        public XrPlaneDetectorLocationEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_LOCATION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrPlaneDetectorLocationEXT.Buffer next(@NativeType("void *") long value) { XrPlaneDetectorLocationEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorLocationEXT#planeId} field. */
        public XrPlaneDetectorLocationEXT.Buffer planeId(@NativeType("uint64_t") long value) { XrPlaneDetectorLocationEXT.nplaneId(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorLocationEXT#locationFlags} field. */
        public XrPlaneDetectorLocationEXT.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrPlaneDetectorLocationEXT.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrPlaneDetectorLocationEXT#pose} field. */
        public XrPlaneDetectorLocationEXT.Buffer pose(XrPosef value) { XrPlaneDetectorLocationEXT.npose(address(), value); return this; }
        /** Passes the {@link XrPlaneDetectorLocationEXT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorLocationEXT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrPlaneDetectorLocationEXT.Buffer extents(XrExtent2Df value) { XrPlaneDetectorLocationEXT.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorLocationEXT.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorLocationEXT#orientation} field. */
        public XrPlaneDetectorLocationEXT.Buffer orientation(@NativeType("XrPlaneDetectorOrientationEXT") int value) { XrPlaneDetectorLocationEXT.norientation(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorLocationEXT#semanticType} field. */
        public XrPlaneDetectorLocationEXT.Buffer semanticType(@NativeType("XrPlaneDetectorSemanticTypeEXT") int value) { XrPlaneDetectorLocationEXT.nsemanticType(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorLocationEXT#polygonBufferCount} field. */
        public XrPlaneDetectorLocationEXT.Buffer polygonBufferCount(@NativeType("uint32_t") int value) { XrPlaneDetectorLocationEXT.npolygonBufferCount(address(), value); return this; }

    }

}