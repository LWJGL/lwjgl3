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
 * Describes the information to detect planes.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using {@link XrPlaneDetectorBeginInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>If {@code orientationCount} is not 0, {@code orientations} <b>must</b> be a pointer to an array of {@code orientationCount} valid {@code XrPlaneDetectorOrientationEXT} values</li>
 * <li>If {@code semanticTypeCount} is not 0, {@code semanticTypes} <b>must</b> be a pointer to an array of {@code semanticTypeCount} valid {@code XrPlaneDetectorSemanticTypeEXT} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent3DfEXT}, {@link XrPosef}, {@link EXTPlaneDetection#xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPlaneDetectorBeginInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 *     uint32_t {@link #orientationCount};
 *     XrPlaneDetectorOrientationEXT const * {@link #orientations};
 *     uint32_t {@link #semanticTypeCount};
 *     XrPlaneDetectorSemanticTypeEXT const * {@link #semanticTypes};
 *     uint32_t {@link #maxPlanes};
 *     float {@link #minArea};
 *     {@link XrPosef XrPosef} {@link #boundingBoxPose};
 *     {@link XrExtent3DfEXT XrExtent3DfEXT} {@link #boundingBoxExtent};
 * }</code></pre>
 */
public class XrPlaneDetectorBeginInfoEXT extends Struct<XrPlaneDetectorBeginInfoEXT> implements NativeResource {

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
        ORIENTATIONCOUNT,
        ORIENTATIONS,
        SEMANTICTYPECOUNT,
        SEMANTICTYPES,
        MAXPLANES,
        MINAREA,
        BOUNDINGBOXPOSE,
        BOUNDINGBOXEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent3DfEXT.SIZEOF, XrExtent3DfEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        ORIENTATIONCOUNT = layout.offsetof(4);
        ORIENTATIONS = layout.offsetof(5);
        SEMANTICTYPECOUNT = layout.offsetof(6);
        SEMANTICTYPES = layout.offsetof(7);
        MAXPLANES = layout.offsetof(8);
        MINAREA = layout.offsetof(9);
        BOUNDINGBOXPOSE = layout.offsetof(10);
        BOUNDINGBOXEXTENT = layout.offsetof(11);
    }

    protected XrPlaneDetectorBeginInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorBeginInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorBeginInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorBeginInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorBeginInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrSpace} that the {@code boundingBox} is defined in. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** an {@code XrTime} at which to detect the planes. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** the number of elements in the {@code orientations}. */
    @NativeType("uint32_t")
    public int orientationCount() { return norientationCount(address()); }
    /** an array of {@code XrPlaneDetectorOrientationEXT}. If this field is null no orientation filtering is applied. If any orientations are present only planes with any of the orientation listed are returned. */
    @Nullable
    @NativeType("XrPlaneDetectorOrientationEXT const *")
    public IntBuffer orientations() { return norientations(address()); }
    /** the number of elements in the {@code semanticTypes}. */
    @NativeType("uint32_t")
    public int semanticTypeCount() { return nsemanticTypeCount(address()); }
    /** an array of {@code XrPlaneDetectorSemanticTypeEXT}. If this field is null no semantic type filtering is applied. If any semantic types are present only planes with matching semantic types are returned. */
    @Nullable
    @NativeType("XrPlaneDetectorSemanticTypeEXT const *")
    public IntBuffer semanticTypes() { return nsemanticTypes(address()); }
    /** the maximum number of planes the runtime <b>may</b> return. This number <b>must</b> be larger than 0. If the number is 0 the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}. */
    @NativeType("uint32_t")
    public int maxPlanes() { return nmaxPlanes(address()); }
    /** the minimum area in square meters a plane <b>must</b> have to be returned. A runtime <b>may</b> have a lower limit under which planes are not detected regardless of {@code minArea} and silently drop planes lower than the internal minimum. */
    public float minArea() { return nminArea(address()); }
    /** the pose of the center of the bounding box of the volume to use for detection in {@code baseSpace}. */
    public XrPosef boundingBoxPose() { return nboundingBoxPose(address()); }
    /** the extent of the bounding box to use for detection. If any part of a plane falls within the bounding box it <b>should</b> be considered for inclusion subject to the other filters. This means that planes <b>may</b> extend beyond the bounding box. A runtime <b>may</b> have an upper limit on the detection range and silently clip the results to that internally. */
    public XrExtent3DfEXT boundingBoxExtent() { return nboundingBoxExtent(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPlaneDetectorBeginInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT} value to the {@link #type} field. */
    public XrPlaneDetectorBeginInfoEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPlaneDetectorBeginInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrPlaneDetectorBeginInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrPlaneDetectorBeginInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #orientationCount} field. */
    public XrPlaneDetectorBeginInfoEXT orientationCount(@NativeType("uint32_t") int value) { norientationCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #orientations} field. */
    public XrPlaneDetectorBeginInfoEXT orientations(@Nullable @NativeType("XrPlaneDetectorOrientationEXT const *") IntBuffer value) { norientations(address(), value); return this; }
    /** Sets the specified value to the {@link #semanticTypeCount} field. */
    public XrPlaneDetectorBeginInfoEXT semanticTypeCount(@NativeType("uint32_t") int value) { nsemanticTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #semanticTypes} field. */
    public XrPlaneDetectorBeginInfoEXT semanticTypes(@Nullable @NativeType("XrPlaneDetectorSemanticTypeEXT const *") IntBuffer value) { nsemanticTypes(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPlanes} field. */
    public XrPlaneDetectorBeginInfoEXT maxPlanes(@NativeType("uint32_t") int value) { nmaxPlanes(address(), value); return this; }
    /** Sets the specified value to the {@link #minArea} field. */
    public XrPlaneDetectorBeginInfoEXT minArea(float value) { nminArea(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #boundingBoxPose} field. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(XrPosef value) { nboundingBoxPose(address(), value); return this; }
    /** Passes the {@link #boundingBoxPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxPose()); return this; }
    /** Copies the specified {@link XrExtent3DfEXT} to the {@link #boundingBoxExtent} field. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxExtent(XrExtent3DfEXT value) { nboundingBoxExtent(address(), value); return this; }
    /** Passes the {@link #boundingBoxExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxExtent(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(boundingBoxExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorBeginInfoEXT set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        int orientationCount,
        @Nullable IntBuffer orientations,
        int semanticTypeCount,
        @Nullable IntBuffer semanticTypes,
        int maxPlanes,
        float minArea,
        XrPosef boundingBoxPose,
        XrExtent3DfEXT boundingBoxExtent
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        orientationCount(orientationCount);
        orientations(orientations);
        semanticTypeCount(semanticTypeCount);
        semanticTypes(semanticTypes);
        maxPlanes(maxPlanes);
        minArea(minArea);
        boundingBoxPose(boundingBoxPose);
        boundingBoxExtent(boundingBoxExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPlaneDetectorBeginInfoEXT set(XrPlaneDetectorBeginInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorBeginInfoEXT malloc() {
        return new XrPlaneDetectorBeginInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorBeginInfoEXT calloc() {
        return new XrPlaneDetectorBeginInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorBeginInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorBeginInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance for the specified memory address. */
    public static XrPlaneDetectorBeginInfoEXT create(long address) {
        return new XrPlaneDetectorBeginInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorBeginInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorBeginInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorBeginInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorBeginInfoEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorBeginInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorBeginInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorBeginInfoEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorBeginInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorBeginInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorBeginInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrPlaneDetectorBeginInfoEXT.TIME); }
    /** Unsafe version of {@link #orientationCount}. */
    public static int norientationCount(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONCOUNT); }
    /** Unsafe version of {@link #orientations() orientations}. */
    @Nullable public static IntBuffer norientations(long struct) { return memIntBufferSafe(memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONS), norientationCount(struct)); }
    /** Unsafe version of {@link #semanticTypeCount}. */
    public static int nsemanticTypeCount(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPECOUNT); }
    /** Unsafe version of {@link #semanticTypes() semanticTypes}. */
    @Nullable public static IntBuffer nsemanticTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPES), nsemanticTypeCount(struct)); }
    /** Unsafe version of {@link #maxPlanes}. */
    public static int nmaxPlanes(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorBeginInfoEXT.MAXPLANES); }
    /** Unsafe version of {@link #minArea}. */
    public static float nminArea(long struct) { return UNSAFE.getFloat(null, struct + XrPlaneDetectorBeginInfoEXT.MINAREA); }
    /** Unsafe version of {@link #boundingBoxPose}. */
    public static XrPosef nboundingBoxPose(long struct) { return XrPosef.create(struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXPOSE); }
    /** Unsafe version of {@link #boundingBoxExtent}. */
    public static XrExtent3DfEXT nboundingBoxExtent(long struct) { return XrExtent3DfEXT.create(struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXEXTENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorBeginInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrPlaneDetectorBeginInfoEXT.TIME, value); }
    /** Sets the specified value to the {@code orientationCount} field of the specified {@code struct}. */
    public static void norientationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONCOUNT, value); }
    /** Unsafe version of {@link #orientations(IntBuffer) orientations}. */
    public static void norientations(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONS, memAddressSafe(value)); if (value != null) { norientationCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code semanticTypeCount} field of the specified {@code struct}. */
    public static void nsemanticTypeCount(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPECOUNT, value); }
    /** Unsafe version of {@link #semanticTypes(IntBuffer) semanticTypes}. */
    public static void nsemanticTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPES, memAddressSafe(value)); if (value != null) { nsemanticTypeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #maxPlanes(int) maxPlanes}. */
    public static void nmaxPlanes(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorBeginInfoEXT.MAXPLANES, value); }
    /** Unsafe version of {@link #minArea(float) minArea}. */
    public static void nminArea(long struct, float value) { UNSAFE.putFloat(null, struct + XrPlaneDetectorBeginInfoEXT.MINAREA, value); }
    /** Unsafe version of {@link #boundingBoxPose(XrPosef) boundingBoxPose}. */
    public static void nboundingBoxPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #boundingBoxExtent(XrExtent3DfEXT) boundingBoxExtent}. */
    public static void nboundingBoxExtent(long struct, XrExtent3DfEXT value) { memCopy(value.address(), struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXEXTENT, XrExtent3DfEXT.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorBeginInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorBeginInfoEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorBeginInfoEXT ELEMENT_FACTORY = XrPlaneDetectorBeginInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorBeginInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorBeginInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorBeginInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorBeginInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrPlaneDetectorBeginInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrPlaneDetectorBeginInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrPlaneDetectorBeginInfoEXT.ntime(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#orientationCount} field. */
        @NativeType("uint32_t")
        public int orientationCount() { return XrPlaneDetectorBeginInfoEXT.norientationCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrPlaneDetectorBeginInfoEXT#orientations} field. */
        @Nullable
        @NativeType("XrPlaneDetectorOrientationEXT const *")
        public IntBuffer orientations() { return XrPlaneDetectorBeginInfoEXT.norientations(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#semanticTypeCount} field. */
        @NativeType("uint32_t")
        public int semanticTypeCount() { return XrPlaneDetectorBeginInfoEXT.nsemanticTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrPlaneDetectorBeginInfoEXT#semanticTypes} field. */
        @Nullable
        @NativeType("XrPlaneDetectorSemanticTypeEXT const *")
        public IntBuffer semanticTypes() { return XrPlaneDetectorBeginInfoEXT.nsemanticTypes(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#maxPlanes} field. */
        @NativeType("uint32_t")
        public int maxPlanes() { return XrPlaneDetectorBeginInfoEXT.nmaxPlanes(address()); }
        /** @return the value of the {@link XrPlaneDetectorBeginInfoEXT#minArea} field. */
        public float minArea() { return XrPlaneDetectorBeginInfoEXT.nminArea(address()); }
        /** @return a {@link XrPosef} view of the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxPose} field. */
        public XrPosef boundingBoxPose() { return XrPlaneDetectorBeginInfoEXT.nboundingBoxPose(address()); }
        /** @return a {@link XrExtent3DfEXT} view of the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxExtent} field. */
        public XrExtent3DfEXT boundingBoxExtent() { return XrPlaneDetectorBeginInfoEXT.nboundingBoxExtent(address()); }

        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#type} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorBeginInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT} value to the {@link XrPlaneDetectorBeginInfoEXT#type} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT); }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#next} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer next(@NativeType("void const *") long value) { XrPlaneDetectorBeginInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#baseSpace} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer baseSpace(XrSpace value) { XrPlaneDetectorBeginInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#time} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrPlaneDetectorBeginInfoEXT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#orientationCount} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer orientationCount(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.norientationCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrPlaneDetectorBeginInfoEXT#orientations} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer orientations(@Nullable @NativeType("XrPlaneDetectorOrientationEXT const *") IntBuffer value) { XrPlaneDetectorBeginInfoEXT.norientations(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#semanticTypeCount} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer semanticTypeCount(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.nsemanticTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrPlaneDetectorBeginInfoEXT#semanticTypes} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer semanticTypes(@Nullable @NativeType("XrPlaneDetectorSemanticTypeEXT const *") IntBuffer value) { XrPlaneDetectorBeginInfoEXT.nsemanticTypes(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#maxPlanes} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer maxPlanes(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.nmaxPlanes(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorBeginInfoEXT#minArea} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer minArea(float value) { XrPlaneDetectorBeginInfoEXT.nminArea(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxPose} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxPose(XrPosef value) { XrPlaneDetectorBeginInfoEXT.nboundingBoxPose(address(), value); return this; }
        /** Passes the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxPose()); return this; }
        /** Copies the specified {@link XrExtent3DfEXT} to the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxExtent} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxExtent(XrExtent3DfEXT value) { XrPlaneDetectorBeginInfoEXT.nboundingBoxExtent(address(), value); return this; }
        /** Passes the {@link XrPlaneDetectorBeginInfoEXT#boundingBoxExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxExtent(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(boundingBoxExtent()); return this; }

    }

}