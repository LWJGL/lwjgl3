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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrPlaneDetectorBeginInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     uint32_t orientationCount;
 *     XrPlaneDetectorOrientationEXT const * orientations;
 *     uint32_t semanticTypeCount;
 *     XrPlaneDetectorSemanticTypeEXT const * semanticTypes;
 *     uint32_t maxPlanes;
 *     float minArea;
 *     {@link XrPosef XrPosef} boundingBoxPose;
 *     {@link XrExtent3DfEXT XrExtent3DfEXT} boundingBoxExtent;
 * }}</pre>
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
    /** @return the value of the {@code orientationCount} field. */
    @NativeType("uint32_t")
    public int orientationCount() { return norientationCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code orientations} field. */
    @NativeType("XrPlaneDetectorOrientationEXT const *")
    public @Nullable IntBuffer orientations() { return norientations(address()); }
    /** @return the value of the {@code semanticTypeCount} field. */
    @NativeType("uint32_t")
    public int semanticTypeCount() { return nsemanticTypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code semanticTypes} field. */
    @NativeType("XrPlaneDetectorSemanticTypeEXT const *")
    public @Nullable IntBuffer semanticTypes() { return nsemanticTypes(address()); }
    /** @return the value of the {@code maxPlanes} field. */
    @NativeType("uint32_t")
    public int maxPlanes() { return nmaxPlanes(address()); }
    /** @return the value of the {@code minArea} field. */
    public float minArea() { return nminArea(address()); }
    /** @return a {@link XrPosef} view of the {@code boundingBoxPose} field. */
    public XrPosef boundingBoxPose() { return nboundingBoxPose(address()); }
    /** @return a {@link XrExtent3DfEXT} view of the {@code boundingBoxExtent} field. */
    public XrExtent3DfEXT boundingBoxExtent() { return nboundingBoxExtent(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPlaneDetectorBeginInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT} value to the {@code type} field. */
    public XrPlaneDetectorBeginInfoEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrPlaneDetectorBeginInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrPlaneDetectorBeginInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrPlaneDetectorBeginInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code orientationCount} field. */
    public XrPlaneDetectorBeginInfoEXT orientationCount(@NativeType("uint32_t") int value) { norientationCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code orientations} field. */
    public XrPlaneDetectorBeginInfoEXT orientations(@Nullable @NativeType("XrPlaneDetectorOrientationEXT const *") IntBuffer value) { norientations(address(), value); return this; }
    /** Sets the specified value to the {@code semanticTypeCount} field. */
    public XrPlaneDetectorBeginInfoEXT semanticTypeCount(@NativeType("uint32_t") int value) { nsemanticTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code semanticTypes} field. */
    public XrPlaneDetectorBeginInfoEXT semanticTypes(@Nullable @NativeType("XrPlaneDetectorSemanticTypeEXT const *") IntBuffer value) { nsemanticTypes(address(), value); return this; }
    /** Sets the specified value to the {@code maxPlanes} field. */
    public XrPlaneDetectorBeginInfoEXT maxPlanes(@NativeType("uint32_t") int value) { nmaxPlanes(address(), value); return this; }
    /** Sets the specified value to the {@code minArea} field. */
    public XrPlaneDetectorBeginInfoEXT minArea(float value) { nminArea(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code boundingBoxPose} field. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(XrPosef value) { nboundingBoxPose(address(), value); return this; }
    /** Passes the {@code boundingBoxPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxPose()); return this; }
    /** Copies the specified {@link XrExtent3DfEXT} to the {@code boundingBoxExtent} field. */
    public XrPlaneDetectorBeginInfoEXT boundingBoxExtent(XrExtent3DfEXT value) { nboundingBoxExtent(address(), value); return this; }
    /** Passes the {@code boundingBoxExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
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
    public static @Nullable XrPlaneDetectorBeginInfoEXT createSafe(long address) {
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
    public static XrPlaneDetectorBeginInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return memGetInt(struct + XrPlaneDetectorBeginInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrPlaneDetectorBeginInfoEXT.TIME); }
    /** Unsafe version of {@link #orientationCount}. */
    public static int norientationCount(long struct) { return memGetInt(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONCOUNT); }
    /** Unsafe version of {@link #orientations() orientations}. */
    public static @Nullable IntBuffer norientations(long struct) { return memIntBufferSafe(memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONS), norientationCount(struct)); }
    /** Unsafe version of {@link #semanticTypeCount}. */
    public static int nsemanticTypeCount(long struct) { return memGetInt(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPECOUNT); }
    /** Unsafe version of {@link #semanticTypes() semanticTypes}. */
    public static @Nullable IntBuffer nsemanticTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPES), nsemanticTypeCount(struct)); }
    /** Unsafe version of {@link #maxPlanes}. */
    public static int nmaxPlanes(long struct) { return memGetInt(struct + XrPlaneDetectorBeginInfoEXT.MAXPLANES); }
    /** Unsafe version of {@link #minArea}. */
    public static float nminArea(long struct) { return memGetFloat(struct + XrPlaneDetectorBeginInfoEXT.MINAREA); }
    /** Unsafe version of {@link #boundingBoxPose}. */
    public static XrPosef nboundingBoxPose(long struct) { return XrPosef.create(struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXPOSE); }
    /** Unsafe version of {@link #boundingBoxExtent}. */
    public static XrExtent3DfEXT nboundingBoxExtent(long struct) { return XrExtent3DfEXT.create(struct + XrPlaneDetectorBeginInfoEXT.BOUNDINGBOXEXTENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPlaneDetectorBeginInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrPlaneDetectorBeginInfoEXT.TIME, value); }
    /** Sets the specified value to the {@code orientationCount} field of the specified {@code struct}. */
    public static void norientationCount(long struct, int value) { memPutInt(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONCOUNT, value); }
    /** Unsafe version of {@link #orientations(IntBuffer) orientations}. */
    public static void norientations(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.ORIENTATIONS, memAddressSafe(value)); if (value != null) { norientationCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code semanticTypeCount} field of the specified {@code struct}. */
    public static void nsemanticTypeCount(long struct, int value) { memPutInt(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPECOUNT, value); }
    /** Unsafe version of {@link #semanticTypes(IntBuffer) semanticTypes}. */
    public static void nsemanticTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrPlaneDetectorBeginInfoEXT.SEMANTICTYPES, memAddressSafe(value)); if (value != null) { nsemanticTypeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #maxPlanes(int) maxPlanes}. */
    public static void nmaxPlanes(long struct, int value) { memPutInt(struct + XrPlaneDetectorBeginInfoEXT.MAXPLANES, value); }
    /** Unsafe version of {@link #minArea(float) minArea}. */
    public static void nminArea(long struct, float value) { memPutFloat(struct + XrPlaneDetectorBeginInfoEXT.MINAREA, value); }
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrPlaneDetectorBeginInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorBeginInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPlaneDetectorBeginInfoEXT.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrPlaneDetectorBeginInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrPlaneDetectorBeginInfoEXT.ntime(address()); }
        /** @return the value of the {@code orientationCount} field. */
        @NativeType("uint32_t")
        public int orientationCount() { return XrPlaneDetectorBeginInfoEXT.norientationCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code orientations} field. */
        @NativeType("XrPlaneDetectorOrientationEXT const *")
        public @Nullable IntBuffer orientations() { return XrPlaneDetectorBeginInfoEXT.norientations(address()); }
        /** @return the value of the {@code semanticTypeCount} field. */
        @NativeType("uint32_t")
        public int semanticTypeCount() { return XrPlaneDetectorBeginInfoEXT.nsemanticTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code semanticTypes} field. */
        @NativeType("XrPlaneDetectorSemanticTypeEXT const *")
        public @Nullable IntBuffer semanticTypes() { return XrPlaneDetectorBeginInfoEXT.nsemanticTypes(address()); }
        /** @return the value of the {@code maxPlanes} field. */
        @NativeType("uint32_t")
        public int maxPlanes() { return XrPlaneDetectorBeginInfoEXT.nmaxPlanes(address()); }
        /** @return the value of the {@code minArea} field. */
        public float minArea() { return XrPlaneDetectorBeginInfoEXT.nminArea(address()); }
        /** @return a {@link XrPosef} view of the {@code boundingBoxPose} field. */
        public XrPosef boundingBoxPose() { return XrPlaneDetectorBeginInfoEXT.nboundingBoxPose(address()); }
        /** @return a {@link XrExtent3DfEXT} view of the {@code boundingBoxExtent} field. */
        public XrExtent3DfEXT boundingBoxExtent() { return XrPlaneDetectorBeginInfoEXT.nboundingBoxExtent(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorBeginInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT} value to the {@code type} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer next(@NativeType("void const *") long value) { XrPlaneDetectorBeginInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer baseSpace(XrSpace value) { XrPlaneDetectorBeginInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrPlaneDetectorBeginInfoEXT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code orientationCount} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer orientationCount(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.norientationCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code orientations} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer orientations(@Nullable @NativeType("XrPlaneDetectorOrientationEXT const *") IntBuffer value) { XrPlaneDetectorBeginInfoEXT.norientations(address(), value); return this; }
        /** Sets the specified value to the {@code semanticTypeCount} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer semanticTypeCount(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.nsemanticTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code semanticTypes} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer semanticTypes(@Nullable @NativeType("XrPlaneDetectorSemanticTypeEXT const *") IntBuffer value) { XrPlaneDetectorBeginInfoEXT.nsemanticTypes(address(), value); return this; }
        /** Sets the specified value to the {@code maxPlanes} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer maxPlanes(@NativeType("uint32_t") int value) { XrPlaneDetectorBeginInfoEXT.nmaxPlanes(address(), value); return this; }
        /** Sets the specified value to the {@code minArea} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer minArea(float value) { XrPlaneDetectorBeginInfoEXT.nminArea(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code boundingBoxPose} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxPose(XrPosef value) { XrPlaneDetectorBeginInfoEXT.nboundingBoxPose(address(), value); return this; }
        /** Passes the {@code boundingBoxPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(boundingBoxPose()); return this; }
        /** Copies the specified {@link XrExtent3DfEXT} to the {@code boundingBoxExtent} field. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxExtent(XrExtent3DfEXT value) { XrPlaneDetectorBeginInfoEXT.nboundingBoxExtent(address(), value); return this; }
        /** Passes the {@code boundingBoxExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPlaneDetectorBeginInfoEXT.Buffer boundingBoxExtent(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(boundingBoxExtent()); return this; }

    }

}