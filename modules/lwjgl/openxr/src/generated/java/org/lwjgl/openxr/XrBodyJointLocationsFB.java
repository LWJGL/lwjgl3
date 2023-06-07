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
 * Returns the body joint locations.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code jointCount} does not equal to the number of joints defined by the {@code XrBodyJointSetFB} used to create the {@code XrBodyTrackerFB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@code jointLocations} representing the range of human body motion, without any obstructions. Input systems that either obstruct the movement of the user’s body (for example, a held controller preventing the user from making a fist) or input systems that have only limited ability to track finger positions <b>must</b> use the information available to them to emulate an unobstructed range of motion.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code jointLocations} array ordered so that the application can index elements using the corresponding body joint enum (e.g. {@code XrBodyJointFB}) as described by {@code XrBodyJointSetFB} when creating the {@code XrBodyTrackerFB}. For example, when the {@code XrBodyTrackerFB} is created with {@link FBBodyTracking#XR_BODY_JOINT_SET_DEFAULT_FB BODY_JOINT_SET_DEFAULT_FB}, the application <b>must</b> set the {@code jointCount} to {@link FBBodyTracking#XR_BODY_JOINT_COUNT_FB BODY_JOINT_COUNT_FB}, and the runtime <b>must</b> fill the {@code jointLocations} array ordered so that it is indexed by the {@code XrBodyJointFB} enum.</p>
 * 
 * <p>If the returned {@code isActive} is true, the runtime <b>must</b> return all joint locations with both {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set. However, in this case, some joint space locations <b>may</b> be untracked (i.e. {@link XR10#XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} or {@link XR10#XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT SPACE_LOCATION_ORIENTATION_TRACKED_BIT} is unset).</p>
 * 
 * <p>If the returned {@code isActive} is false, it indicates that the body tracker did not detect the body input, the application lost input focus, or the consent for body tracking was denied by the user. In this case, the runtime <b>must</b> return all {@code jointLocations} with neither {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} nor {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyJointLocationsFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointCount} {@link XrBodyJointLocationFB} structures</li>
 * <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBodyJointLocationFB}, {@link FBBodyTracking#xrLocateBodyJointsFB LocateBodyJointsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyJointLocationsFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #isActive};
 *     float {@link #confidence};
 *     uint32_t {@link #jointCount};
 *     {@link XrBodyJointLocationFB XrBodyJointLocationFB} * {@link #jointLocations};
 *     uint32_t {@link #skeletonChangedCount};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrBodyJointLocationsFB extends Struct<XrBodyJointLocationsFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        CONFIDENCE,
        JOINTCOUNT,
        JOINTLOCATIONS,
        SKELETONCHANGEDCOUNT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        CONFIDENCE = layout.offsetof(3);
        JOINTCOUNT = layout.offsetof(4);
        JOINTLOCATIONS = layout.offsetof(5);
        SKELETONCHANGEDCOUNT = layout.offsetof(6);
        TIME = layout.offsetof(7);
    }

    protected XrBodyJointLocationsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationsFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationsFB(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationsFB(ByteBuffer container) {
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
    /** an {@code XrBool32} indicating if the body tracker is actively tracking. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** a {@code float} between 0 and 1 which represents the confidence for the returned body pose. A value of 0 means there is no confidence in the pose returned, and a value of 1 means maximum confidence in the returned body pose. */
    public float confidence() { return nconfidence(address()); }
    /** a {@code uint32_t} describing the count of elements in {@code jointLocations} array. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** an application-allocated array of {@link XrBodyJointLocationFB} that will be filled with joint locations. */
    @NativeType("XrBodyJointLocationFB *")
    public XrBodyJointLocationFB.Buffer jointLocations() { return njointLocations(address()); }
    /** an output {@code uint32_t} incremental counter indicating that the skeleton scale proportions have changed. {@link FBBodyTracking#xrGetBodySkeletonFB GetBodySkeletonFB} <b>can</b> be called when this counter increases to get the latest body proportions/scale. */
    @NativeType("uint32_t")
    public int skeletonChangedCount() { return nskeletonChangedCount(address()); }
    /** an {@code XrTime} time at which the returned joints are tracked. Equals the time at which the joints were requested if the interpolation at the time was successful. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodyJointLocationsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB} value to the {@link #type} field. */
    public XrBodyJointLocationsFB type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyJointLocationsFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrBodyJointLocationsFB isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #confidence} field. */
    public XrBodyJointLocationsFB confidence(float value) { nconfidence(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodyJointLocationFB.Buffer} to the {@link #jointLocations} field. */
    public XrBodyJointLocationsFB jointLocations(@NativeType("XrBodyJointLocationFB *") XrBodyJointLocationFB.Buffer value) { njointLocations(address(), value); return this; }
    /** Sets the specified value to the {@link #skeletonChangedCount} field. */
    public XrBodyJointLocationsFB skeletonChangedCount(@NativeType("uint32_t") int value) { nskeletonChangedCount(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrBodyJointLocationsFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationsFB set(
        int type,
        long next,
        boolean isActive,
        float confidence,
        XrBodyJointLocationFB.Buffer jointLocations,
        int skeletonChangedCount,
        long time
    ) {
        type(type);
        next(next);
        isActive(isActive);
        confidence(confidence);
        jointLocations(jointLocations);
        skeletonChangedCount(skeletonChangedCount);
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
    public XrBodyJointLocationsFB set(XrBodyJointLocationsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsFB malloc() {
        return new XrBodyJointLocationsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsFB calloc() {
        return new XrBodyJointLocationsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance for the specified memory address. */
    public static XrBodyJointLocationsFB create(long address) {
        return new XrBodyJointLocationsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationsFB createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationsFB(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointLocationsFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsFB malloc(MemoryStack stack) {
        return new XrBodyJointLocationsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsFB calloc(MemoryStack stack) {
        return new XrBodyJointLocationsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBodyJointLocationsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointLocationsFB.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrBodyJointLocationsFB.ISACTIVE); }
    /** Unsafe version of {@link #confidence}. */
    public static float nconfidence(long struct) { return UNSAFE.getFloat(null, struct + XrBodyJointLocationsFB.CONFIDENCE); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return UNSAFE.getInt(null, struct + XrBodyJointLocationsFB.JOINTCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrBodyJointLocationFB.Buffer njointLocations(long struct) { return XrBodyJointLocationFB.create(memGetAddress(struct + XrBodyJointLocationsFB.JOINTLOCATIONS), njointCount(struct)); }
    /** Unsafe version of {@link #skeletonChangedCount}. */
    public static int nskeletonChangedCount(long struct) { return UNSAFE.getInt(null, struct + XrBodyJointLocationsFB.SKELETONCHANGEDCOUNT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrBodyJointLocationsFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyJointLocationsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointLocationsFB.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyJointLocationsFB.ISACTIVE, value); }
    /** Unsafe version of {@link #confidence(float) confidence}. */
    public static void nconfidence(long struct, float value) { UNSAFE.putFloat(null, struct + XrBodyJointLocationsFB.CONFIDENCE, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyJointLocationsFB.JOINTCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrBodyJointLocationFB.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrBodyJointLocationFB.Buffer value) { memPutAddress(struct + XrBodyJointLocationsFB.JOINTLOCATIONS, value.address()); njointCount(struct, value.remaining()); }
    /** Unsafe version of {@link #skeletonChangedCount(int) skeletonChangedCount}. */
    public static void nskeletonChangedCount(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyJointLocationsFB.SKELETONCHANGEDCOUNT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrBodyJointLocationsFB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointLocationsFB.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationsFB} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationsFB, Buffer> implements NativeResource {

        private static final XrBodyJointLocationsFB ELEMENT_FACTORY = XrBodyJointLocationsFB.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyJointLocationsFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointLocationsFB.ntype(address()); }
        /** @return the value of the {@link XrBodyJointLocationsFB#next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointLocationsFB.nnext(address()); }
        /** @return the value of the {@link XrBodyJointLocationsFB#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrBodyJointLocationsFB.nisActive(address()) != 0; }
        /** @return the value of the {@link XrBodyJointLocationsFB#confidence} field. */
        public float confidence() { return XrBodyJointLocationsFB.nconfidence(address()); }
        /** @return the value of the {@link XrBodyJointLocationsFB#jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrBodyJointLocationsFB.njointCount(address()); }
        /** @return a {@link XrBodyJointLocationFB.Buffer} view of the struct array pointed to by the {@link XrBodyJointLocationsFB#jointLocations} field. */
        @NativeType("XrBodyJointLocationFB *")
        public XrBodyJointLocationFB.Buffer jointLocations() { return XrBodyJointLocationsFB.njointLocations(address()); }
        /** @return the value of the {@link XrBodyJointLocationsFB#skeletonChangedCount} field. */
        @NativeType("uint32_t")
        public int skeletonChangedCount() { return XrBodyJointLocationsFB.nskeletonChangedCount(address()); }
        /** @return the value of the {@link XrBodyJointLocationsFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrBodyJointLocationsFB.ntime(address()); }

        /** Sets the specified value to the {@link XrBodyJointLocationsFB#type} field. */
        public XrBodyJointLocationsFB.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointLocationsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB} value to the {@link XrBodyJointLocationsFB#type} field. */
        public XrBodyJointLocationsFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_FB); }
        /** Sets the specified value to the {@link XrBodyJointLocationsFB#next} field. */
        public XrBodyJointLocationsFB.Buffer next(@NativeType("void *") long value) { XrBodyJointLocationsFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsFB#isActive} field. */
        public XrBodyJointLocationsFB.Buffer isActive(@NativeType("XrBool32") boolean value) { XrBodyJointLocationsFB.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsFB#confidence} field. */
        public XrBodyJointLocationsFB.Buffer confidence(float value) { XrBodyJointLocationsFB.nconfidence(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodyJointLocationFB.Buffer} to the {@link XrBodyJointLocationsFB#jointLocations} field. */
        public XrBodyJointLocationsFB.Buffer jointLocations(@NativeType("XrBodyJointLocationFB *") XrBodyJointLocationFB.Buffer value) { XrBodyJointLocationsFB.njointLocations(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsFB#skeletonChangedCount} field. */
        public XrBodyJointLocationsFB.Buffer skeletonChangedCount(@NativeType("uint32_t") int value) { XrBodyJointLocationsFB.nskeletonChangedCount(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointLocationsFB#time} field. */
        public XrBodyJointLocationsFB.Buffer time(@NativeType("XrTime") long value) { XrBodyJointLocationsFB.ntime(address(), value); return this; }

    }

}