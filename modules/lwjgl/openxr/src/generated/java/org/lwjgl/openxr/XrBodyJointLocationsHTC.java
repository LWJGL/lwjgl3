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
 * Returns the body joint data.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>must</b> set {@code jointLocationCount} as appropriate for the chosen {@code XrBodyJointSetHTC} value when creating the {@code XrBodyTrackerHTC}. If {@code jointLocationCount} does not match the value associated with the supplied {@code XrBodyJointSetHTC} value, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} from {@link HTCBodyTracking#xrLocateBodyJointsHTC LocateBodyJointsHTC}.</p>
 * 
 * <p>An application <b>must</b> allocate the output {@code jointLocations} array with a minimum capacity of {@code jointLocationCount} of {@link XrBodyJointLocationHTC} elements. If the application supplies a {@code NULL} value for {@code jointLocations}, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code jointLocations} array elements indexed using the corresponding body joint enumeration (e.g. {@code XrBodyJointHTC} for the joint set {@link HTCBodyTracking#XR_BODY_JOINT_SET_FULL_HTC BODY_JOINT_SET_FULL_HTC}) as described by {@code XrBodyJointSetHTC} when creating the {@code XrBodyTrackerHTC}. For example, when the {@code XrBodyTrackerHTC} is created with {@link HTCBodyTracking#XR_BODY_JOINT_SET_FULL_HTC BODY_JOINT_SET_FULL_HTC}, the runtime <b>must</b> fill the {@code jointLocations} array with body joint data indexed by the {@code XrBodyJointHTC} enumeration.</p>
 * 
 * <p>If the runtime returns {@code combinedLocationFlags} with {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set, it indicates that the body tracker detects the joint space locations. If the runtime returns {@code combinedLocationFlags} with neither {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} nor {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set, it indicates that the body tracker did not detect the joint space locations.</p>
 * 
 * <p>The purpose of the skeleton is to provide data about the body size. The calculation of the body size <b>may</b> be updated during a session. Each time the calculation of the size is changed, {@link XrBodyJointLocationsHTC}{@code ::skeletonGenerationId} is changed to indicate that a new skeleton <b>may</b> be retrieved. {@link HTCBodyTracking#xrGetBodySkeletonHTC GetBodySkeletonHTC} <b>can</b> be called with the specified skeletonGenerationId to get the corresponding skeleton.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyJointLocationsHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code combinedLocationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
 * <li>{@code confidenceLevel} <b>must</b> be a valid {@code XrBodyJointConfidenceHTC} value</li>
 * <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointLocationCount} {@link XrBodyJointLocationHTC} structures</li>
 * <li>The {@code jointLocationCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBodyJointLocationHTC}, {@link HTCBodyTracking#xrLocateBodyJointsHTC LocateBodyJointsHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyJointLocationsHTC {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrSpaceLocationFlags {@link #combinedLocationFlags};
 *     XrBodyJointConfidenceHTC {@link #confidenceLevel};
 *     uint32_t {@link #jointLocationCount};
 *     {@link XrBodyJointLocationHTC XrBodyJointLocationHTC} * {@link #jointLocations};
 *     uint32_t {@link #skeletonGenerationId};
 * }</code></pre>
 */
public class XrBodyJointLocationsHTC extends Struct<XrBodyJointLocationsHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMBINEDLOCATIONFLAGS,
        CONFIDENCELEVEL,
        JOINTLOCATIONCOUNT,
        JOINTLOCATIONS,
        SKELETONGENERATIONID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMBINEDLOCATIONFLAGS = layout.offsetof(2);
        CONFIDENCELEVEL = layout.offsetof(3);
        JOINTLOCATIONCOUNT = layout.offsetof(4);
        JOINTLOCATIONS = layout.offsetof(5);
        SKELETONGENERATIONID = layout.offsetof(6);
    }

    protected XrBodyJointLocationsHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationsHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationsHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationsHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationsHTC(ByteBuffer container) {
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
    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, containing the bitwise OR of the location flags of all body joints. */
    @NativeType("XrSpaceLocationFlags")
    public long combinedLocationFlags() { return ncombinedLocationFlags(address()); }
    /** an {@code XrBodyJointConfidenceHTC} value which indicates the confidence level for the returned body joint pose. */
    @NativeType("XrBodyJointConfidenceHTC")
    public int confidenceLevel() { return nconfidenceLevel(address()); }
    /** a {@code uint32_t} describing the count of elements in {@code jointLocations} array. */
    @NativeType("uint32_t")
    public int jointLocationCount() { return njointLocationCount(address()); }
    /** an application-allocated {@link XrBodyJointLocationHTC} array filled in by the runtime specifying the locations for individual body joints. */
    @NativeType("XrBodyJointLocationHTC *")
    public XrBodyJointLocationHTC.Buffer jointLocations() { return njointLocations(address()); }
    /** a unique identifier, representing the skeleton which is generated when the tracking auto-calibrates the user skeleton scale and proportions. */
    @NativeType("uint32_t")
    public int skeletonGenerationId() { return nskeletonGenerationId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodyJointLocationsHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC} value to the {@link #type} field. */
    public XrBodyJointLocationsHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyJointLocationsHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #combinedLocationFlags} field. */
    public XrBodyJointLocationsHTC combinedLocationFlags(@NativeType("XrSpaceLocationFlags") long value) { ncombinedLocationFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #confidenceLevel} field. */
    public XrBodyJointLocationsHTC confidenceLevel(@NativeType("XrBodyJointConfidenceHTC") int value) { nconfidenceLevel(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodyJointLocationHTC.Buffer} to the {@link #jointLocations} field. */
    public XrBodyJointLocationsHTC jointLocations(@NativeType("XrBodyJointLocationHTC *") XrBodyJointLocationHTC.Buffer value) { njointLocations(address(), value); return this; }
    /** Sets the specified value to the {@link #skeletonGenerationId} field. */
    public XrBodyJointLocationsHTC skeletonGenerationId(@NativeType("uint32_t") int value) { nskeletonGenerationId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationsHTC set(
        int type,
        long next,
        long combinedLocationFlags,
        int confidenceLevel,
        XrBodyJointLocationHTC.Buffer jointLocations,
        int skeletonGenerationId
    ) {
        type(type);
        next(next);
        combinedLocationFlags(combinedLocationFlags);
        confidenceLevel(confidenceLevel);
        jointLocations(jointLocations);
        skeletonGenerationId(skeletonGenerationId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointLocationsHTC set(XrBodyJointLocationsHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsHTC malloc() {
        return new XrBodyJointLocationsHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsHTC calloc() {
        return new XrBodyJointLocationsHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationsHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationsHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance for the specified memory address. */
    public static XrBodyJointLocationsHTC create(long address) {
        return new XrBodyJointLocationsHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationsHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationsHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationsHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationsHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsHTC malloc(MemoryStack stack) {
        return new XrBodyJointLocationsHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsHTC calloc(MemoryStack stack) {
        return new XrBodyJointLocationsHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointLocationsHTC.NEXT); }
    /** Unsafe version of {@link #combinedLocationFlags}. */
    public static long ncombinedLocationFlags(long struct) { return memGetLong(struct + XrBodyJointLocationsHTC.COMBINEDLOCATIONFLAGS); }
    /** Unsafe version of {@link #confidenceLevel}. */
    public static int nconfidenceLevel(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.CONFIDENCELEVEL); }
    /** Unsafe version of {@link #jointLocationCount}. */
    public static int njointLocationCount(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.JOINTLOCATIONCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrBodyJointLocationHTC.Buffer njointLocations(long struct) { return XrBodyJointLocationHTC.create(memGetAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS), njointLocationCount(struct)); }
    /** Unsafe version of {@link #skeletonGenerationId}. */
    public static int nskeletonGenerationId(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.SKELETONGENERATIONID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointLocationsHTC.NEXT, value); }
    /** Unsafe version of {@link #combinedLocationFlags(long) combinedLocationFlags}. */
    public static void ncombinedLocationFlags(long struct, long value) { memPutLong(struct + XrBodyJointLocationsHTC.COMBINEDLOCATIONFLAGS, value); }
    /** Unsafe version of {@link #confidenceLevel(int) confidenceLevel}. */
    public static void nconfidenceLevel(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.CONFIDENCELEVEL, value); }
    /** Sets the specified value to the {@code jointLocationCount} field of the specified {@code struct}. */
    public static void njointLocationCount(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.JOINTLOCATIONCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrBodyJointLocationHTC.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrBodyJointLocationHTC.Buffer value) { memPutAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS, value.address()); njointLocationCount(struct, value.remaining()); }
    /** Unsafe version of {@link #skeletonGenerationId(int) skeletonGenerationId}. */
    public static void nskeletonGenerationId(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.SKELETONGENERATIONID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationsHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationsHTC, Buffer> implements NativeResource {

        private static final XrBodyJointLocationsHTC ELEMENT_FACTORY = XrBodyJointLocationsHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationsHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationsHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationsHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyJointLocationsHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointLocationsHTC.ntype(address()); }
        /** @return the value of the {@link XrBodyJointLocationsHTC#next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointLocationsHTC.nnext(address()); }
        /** @return the value of the {@link XrBodyJointLocationsHTC#combinedLocationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long combinedLocationFlags() { return XrBodyJointLocationsHTC.ncombinedLocationFlags(address()); }
        /** @return the value of the {@link XrBodyJointLocationsHTC#confidenceLevel} field. */
        @NativeType("XrBodyJointConfidenceHTC")
        public int confidenceLevel() { return XrBodyJointLocationsHTC.nconfidenceLevel(address()); }
        /** @return the value of the {@link XrBodyJointLocationsHTC#jointLocationCount} field. */
        @NativeType("uint32_t")
        public int jointLocationCount() { return XrBodyJointLocationsHTC.njointLocationCount(address()); }
        /** @return a {@link XrBodyJointLocationHTC.Buffer} view of the struct array pointed to by the {@link XrBodyJointLocationsHTC#jointLocations} field. */
        @NativeType("XrBodyJointLocationHTC *")
        public XrBodyJointLocationHTC.Buffer jointLocations() { return XrBodyJointLocationsHTC.njointLocations(address()); }
        /** @return the value of the {@link XrBodyJointLocationsHTC#skeletonGenerationId} field. */
        @NativeType("uint32_t")
        public int skeletonGenerationId() { return XrBodyJointLocationsHTC.nskeletonGenerationId(address()); }

        /** Sets the specified value to the {@link XrBodyJointLocationsHTC#type} field. */
        public XrBodyJointLocationsHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointLocationsHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC} value to the {@link XrBodyJointLocationsHTC#type} field. */
        public XrBodyJointLocationsHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_HTC); }
        /** Sets the specified value to the {@link XrBodyJointLocationsHTC#next} field. */
        public XrBodyJointLocationsHTC.Buffer next(@NativeType("void *") long value) { XrBodyJointLocationsHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsHTC#combinedLocationFlags} field. */
        public XrBodyJointLocationsHTC.Buffer combinedLocationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrBodyJointLocationsHTC.ncombinedLocationFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsHTC#confidenceLevel} field. */
        public XrBodyJointLocationsHTC.Buffer confidenceLevel(@NativeType("XrBodyJointConfidenceHTC") int value) { XrBodyJointLocationsHTC.nconfidenceLevel(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodyJointLocationHTC.Buffer} to the {@link XrBodyJointLocationsHTC#jointLocations} field. */
        public XrBodyJointLocationsHTC.Buffer jointLocations(@NativeType("XrBodyJointLocationHTC *") XrBodyJointLocationHTC.Buffer value) { XrBodyJointLocationsHTC.njointLocations(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsHTC#skeletonGenerationId} field. */
        public XrBodyJointLocationsHTC.Buffer skeletonGenerationId(@NativeType("uint32_t") int value) { XrBodyJointLocationsHTC.nskeletonGenerationId(address(), value); return this; }

    }

}