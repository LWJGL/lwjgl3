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
 * <pre>{@code
 * struct XrTrackablePlaneANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrTrackingStateANDROID trackingState;
 *     {@link XrPosef XrPosef} centerPose;
 *     {@link XrExtent2Df XrExtent2Df} extents;
 *     XrPlaneTypeANDROID planeType;
 *     XrPlaneLabelANDROID planeLabel;
 *     XrTrackableANDROID subsumedByPlane;
 *     XrTime lastUpdatedTime;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector2f XrVector2f} * vertices;
 * }}</pre>
 */
public class XrTrackablePlaneANDROID extends Struct<XrTrackablePlaneANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGSTATE,
        CENTERPOSE,
        EXTENTS,
        PLANETYPE,
        PLANELABEL,
        SUBSUMEDBYPLANE,
        LASTUPDATEDTIME,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGSTATE = layout.offsetof(2);
        CENTERPOSE = layout.offsetof(3);
        EXTENTS = layout.offsetof(4);
        PLANETYPE = layout.offsetof(5);
        PLANELABEL = layout.offsetof(6);
        SUBSUMEDBYPLANE = layout.offsetof(7);
        LASTUPDATEDTIME = layout.offsetof(8);
        VERTEXCAPACITYINPUT = layout.offsetof(9);
        VERTEXCOUNTOUTPUT = layout.offsetof(10);
        VERTICES = layout.offsetof(11);
    }

    protected XrTrackablePlaneANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackablePlaneANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackablePlaneANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackablePlaneANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackablePlaneANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingState} field. */
    @NativeType("XrTrackingStateANDROID")
    public int trackingState() { return ntrackingState(address()); }
    /** @return a {@link XrPosef} view of the {@code centerPose} field. */
    public XrPosef centerPose() { return ncenterPose(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }
    /** @return the value of the {@code planeType} field. */
    @NativeType("XrPlaneTypeANDROID")
    public int planeType() { return nplaneType(address()); }
    /** @return the value of the {@code planeLabel} field. */
    @NativeType("XrPlaneLabelANDROID")
    public int planeLabel() { return nplaneLabel(address()); }
    /** @return the value of the {@code subsumedByPlane} field. */
    @NativeType("XrTrackableANDROID")
    public long subsumedByPlane() { return nsubsumedByPlane(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector2f *")
    public XrVector2f.@Nullable Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackablePlaneANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackables#XR_TYPE_TRACKABLE_PLANE_ANDROID TYPE_TRACKABLE_PLANE_ANDROID} value to the {@code type} field. */
    public XrTrackablePlaneANDROID type$Default() { return type(ANDROIDTrackables.XR_TYPE_TRACKABLE_PLANE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackablePlaneANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrTrackablePlaneANDROID trackingState(@NativeType("XrTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
    public XrTrackablePlaneANDROID centerPose(XrPosef value) { ncenterPose(address(), value); return this; }
    /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackablePlaneANDROID centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrTrackablePlaneANDROID extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackablePlaneANDROID extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
    /** Sets the specified value to the {@code planeType} field. */
    public XrTrackablePlaneANDROID planeType(@NativeType("XrPlaneTypeANDROID") int value) { nplaneType(address(), value); return this; }
    /** Sets the specified value to the {@code planeLabel} field. */
    public XrTrackablePlaneANDROID planeLabel(@NativeType("XrPlaneLabelANDROID") int value) { nplaneLabel(address(), value); return this; }
    /** Sets the specified value to the {@code subsumedByPlane} field. */
    public XrTrackablePlaneANDROID subsumedByPlane(@NativeType("XrTrackableANDROID") long value) { nsubsumedByPlane(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrTrackablePlaneANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrTrackablePlaneANDROID vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrTrackablePlaneANDROID vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertices} field. */
    public XrTrackablePlaneANDROID vertices(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackablePlaneANDROID set(
        int type,
        long next,
        int trackingState,
        XrPosef centerPose,
        XrExtent2Df extents,
        int planeType,
        int planeLabel,
        long subsumedByPlane,
        long lastUpdatedTime,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector2f.@Nullable Buffer vertices
    ) {
        type(type);
        next(next);
        trackingState(trackingState);
        centerPose(centerPose);
        extents(extents);
        planeType(planeType);
        planeLabel(planeLabel);
        subsumedByPlane(subsumedByPlane);
        lastUpdatedTime(lastUpdatedTime);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackablePlaneANDROID set(XrTrackablePlaneANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackablePlaneANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackablePlaneANDROID malloc() {
        return new XrTrackablePlaneANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackablePlaneANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackablePlaneANDROID calloc() {
        return new XrTrackablePlaneANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackablePlaneANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackablePlaneANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackablePlaneANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackablePlaneANDROID} instance for the specified memory address. */
    public static XrTrackablePlaneANDROID create(long address) {
        return new XrTrackablePlaneANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackablePlaneANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackablePlaneANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackablePlaneANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackablePlaneANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackablePlaneANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackablePlaneANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackablePlaneANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackablePlaneANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackablePlaneANDROID malloc(MemoryStack stack) {
        return new XrTrackablePlaneANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackablePlaneANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackablePlaneANDROID calloc(MemoryStack stack) {
        return new XrTrackablePlaneANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackablePlaneANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackablePlaneANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackablePlaneANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackablePlaneANDROID.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.TRACKINGSTATE); }
    /** Unsafe version of {@link #centerPose}. */
    public static XrPosef ncenterPose(long struct) { return XrPosef.create(struct + XrTrackablePlaneANDROID.CENTERPOSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrTrackablePlaneANDROID.EXTENTS); }
    /** Unsafe version of {@link #planeType}. */
    public static int nplaneType(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.PLANETYPE); }
    /** Unsafe version of {@link #planeLabel}. */
    public static int nplaneLabel(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.PLANELABEL); }
    /** Unsafe version of {@link #subsumedByPlane}. */
    public static long nsubsumedByPlane(long struct) { return memGetLong(struct + XrTrackablePlaneANDROID.SUBSUMEDBYPLANE); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrTrackablePlaneANDROID.LASTUPDATEDTIME); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrTrackablePlaneANDROID.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector2f.@Nullable Buffer nvertices(long struct) { return XrVector2f.createSafe(memGetAddress(struct + XrTrackablePlaneANDROID.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackablePlaneANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.TRACKINGSTATE, value); }
    /** Unsafe version of {@link #centerPose(XrPosef) centerPose}. */
    public static void ncenterPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrTrackablePlaneANDROID.CENTERPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrTrackablePlaneANDROID.EXTENTS, XrExtent2Df.SIZEOF); }
    /** Unsafe version of {@link #planeType(int) planeType}. */
    public static void nplaneType(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.PLANETYPE, value); }
    /** Unsafe version of {@link #planeLabel(int) planeLabel}. */
    public static void nplaneLabel(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.PLANELABEL, value); }
    /** Unsafe version of {@link #subsumedByPlane(long) subsumedByPlane}. */
    public static void nsubsumedByPlane(long struct, long value) { memPutLong(struct + XrTrackablePlaneANDROID.SUBSUMEDBYPLANE, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrTrackablePlaneANDROID.LASTUPDATEDTIME, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrTrackablePlaneANDROID.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector2f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector2f.@Nullable Buffer value) { memPutAddress(struct + XrTrackablePlaneANDROID.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrTrackablePlaneANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackablePlaneANDROID, Buffer> implements NativeResource {

        private static final XrTrackablePlaneANDROID ELEMENT_FACTORY = XrTrackablePlaneANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackablePlaneANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackablePlaneANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackablePlaneANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackablePlaneANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackablePlaneANDROID.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrTrackingStateANDROID")
        public int trackingState() { return XrTrackablePlaneANDROID.ntrackingState(address()); }
        /** @return a {@link XrPosef} view of the {@code centerPose} field. */
        public XrPosef centerPose() { return XrTrackablePlaneANDROID.ncenterPose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrTrackablePlaneANDROID.nextents(address()); }
        /** @return the value of the {@code planeType} field. */
        @NativeType("XrPlaneTypeANDROID")
        public int planeType() { return XrTrackablePlaneANDROID.nplaneType(address()); }
        /** @return the value of the {@code planeLabel} field. */
        @NativeType("XrPlaneLabelANDROID")
        public int planeLabel() { return XrTrackablePlaneANDROID.nplaneLabel(address()); }
        /** @return the value of the {@code subsumedByPlane} field. */
        @NativeType("XrTrackableANDROID")
        public long subsumedByPlane() { return XrTrackablePlaneANDROID.nsubsumedByPlane(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrTrackablePlaneANDROID.nlastUpdatedTime(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrTrackablePlaneANDROID.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrTrackablePlaneANDROID.nvertexCountOutput(address()); }
        /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector2f *")
        public XrVector2f.@Nullable Buffer vertices() { return XrTrackablePlaneANDROID.nvertices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackablePlaneANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackablePlaneANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackables#XR_TYPE_TRACKABLE_PLANE_ANDROID TYPE_TRACKABLE_PLANE_ANDROID} value to the {@code type} field. */
        public XrTrackablePlaneANDROID.Buffer type$Default() { return type(ANDROIDTrackables.XR_TYPE_TRACKABLE_PLANE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackablePlaneANDROID.Buffer next(@NativeType("void *") long value) { XrTrackablePlaneANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrTrackablePlaneANDROID.Buffer trackingState(@NativeType("XrTrackingStateANDROID") int value) { XrTrackablePlaneANDROID.ntrackingState(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
        public XrTrackablePlaneANDROID.Buffer centerPose(XrPosef value) { XrTrackablePlaneANDROID.ncenterPose(address(), value); return this; }
        /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackablePlaneANDROID.Buffer centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrTrackablePlaneANDROID.Buffer extents(XrExtent2Df value) { XrTrackablePlaneANDROID.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackablePlaneANDROID.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }
        /** Sets the specified value to the {@code planeType} field. */
        public XrTrackablePlaneANDROID.Buffer planeType(@NativeType("XrPlaneTypeANDROID") int value) { XrTrackablePlaneANDROID.nplaneType(address(), value); return this; }
        /** Sets the specified value to the {@code planeLabel} field. */
        public XrTrackablePlaneANDROID.Buffer planeLabel(@NativeType("XrPlaneLabelANDROID") int value) { XrTrackablePlaneANDROID.nplaneLabel(address(), value); return this; }
        /** Sets the specified value to the {@code subsumedByPlane} field. */
        public XrTrackablePlaneANDROID.Buffer subsumedByPlane(@NativeType("XrTrackableANDROID") long value) { XrTrackablePlaneANDROID.nsubsumedByPlane(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrTrackablePlaneANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrTrackablePlaneANDROID.nlastUpdatedTime(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrTrackablePlaneANDROID.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrTrackablePlaneANDROID.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrTrackablePlaneANDROID.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrTrackablePlaneANDROID.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertices} field. */
        public XrTrackablePlaneANDROID.Buffer vertices(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { XrTrackablePlaneANDROID.nvertices(address(), value); return this; }

    }

}