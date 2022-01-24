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
 * Returns the hand joint locations.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>must</b> allocate the memory for the output array {@code jointLocations} that can contain at least {@code jointCount} of {@link XrHandJointLocationEXT}.</p>
 * 
 * <p>The application <b>must</b> set {@code jointCount} as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT} otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>The runtime <b>must</b> return {@code jointLocations} representing the range of motion of a human hand, without any obstructions. Input systems that obstruct the movement of the user’s hand (e.g.: a held controller preventing the user from making a fist) or that have only limited ability to track finger positions <b>must</b> use the information available to them to emulate an unobstructed range of motion.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code jointLocations} array ordered so that the application can index elements using the corresponding hand joint enum (e.g. {@code XrHandJointEXT}) as described by {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. For example, when the {@code XrHandTrackerEXT} is created with {@link EXTHandTracking#XR_HAND_JOINT_SET_DEFAULT_EXT HAND_JOINT_SET_DEFAULT_EXT}, the application <b>must</b> set the {@code jointCount} to {@link EXTHandTracking#XR_HAND_JOINT_COUNT_EXT HAND_JOINT_COUNT_EXT}, and the runtime <b>must</b> fill the {@code jointLocations} array ordered so that it may be indexed by the {@code XrHandJointEXT} enum.</p>
 * 
 * <p>If the returned {@code isActive} is true, the runtime <b>must</b> return all joint locations with both {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set. Although, in this case, some joint space locations <b>may</b> be untracked (i.e. {@link XR10#XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} or {@link XR10#XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT SPACE_LOCATION_ORIENTATION_TRACKED_BIT} is unset).</p>
 * 
 * <p>If the returned {@code isActive} is false, it indicates the hand tracker did not detect the hand input or the application lost input focus. In this case, the runtime <b>must</b> return all {@code jointLocations} with neither {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} nor {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} set.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrHandJointLocationsEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTracking#XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrHandJointVelocitiesEXT}</li>
 * <li>{@code jointLocations} <b>must</b> be a pointer to an array of {@code jointCount} {@link XrHandJointLocationEXT} structures</li>
 * <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointLocationEXT}, {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointLocationsEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #isActive};
 *     uint32_t {@link #jointCount};
 *     {@link XrHandJointLocationEXT XrHandJointLocationEXT} * {@link #jointLocations};
 * }</code></pre>
 */
public class XrHandJointLocationsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        JOINTCOUNT,
        JOINTLOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        JOINTCOUNT = layout.offsetof(3);
        JOINTLOCATIONS = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrHandJointLocationsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointLocationsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain, such as {@link XrHandJointVelocitiesEXT}. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32} indicating if the hand tracker is actively tracking. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** a {@code uint32_t} describing the count of elements in {@code jointLocations} array. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** an array of {@link XrHandJointLocationEXT} receiving the returned hand joint locations. */
    @NativeType("XrHandJointLocationEXT *")
    public XrHandJointLocationEXT.Buffer jointLocations() { return njointLocations(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandJointLocationsEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT} value to the {@link #type} field. */
    public XrHandJointLocationsEXT type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_LOCATIONS_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandJointLocationsEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrHandJointVelocitiesEXT} value to the {@code next} chain. */
    public XrHandJointLocationsEXT next(XrHandJointVelocitiesEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrHandJointLocationsEXT isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link XrHandJointLocationEXT.Buffer} to the {@link #jointLocations} field. */
    public XrHandJointLocationsEXT jointLocations(@NativeType("XrHandJointLocationEXT *") XrHandJointLocationEXT.Buffer value) { njointLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointLocationsEXT set(
        int type,
        long next,
        boolean isActive,
        XrHandJointLocationEXT.Buffer jointLocations
    ) {
        type(type);
        next(next);
        isActive(isActive);
        jointLocations(jointLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointLocationsEXT set(XrHandJointLocationsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationsEXT malloc() {
        return wrap(XrHandJointLocationsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationsEXT calloc() {
        return wrap(XrHandJointLocationsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointLocationsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointLocationsEXT} instance for the specified memory address. */
    public static XrHandJointLocationsEXT create(long address) {
        return wrap(XrHandJointLocationsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointLocationsEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointLocationsEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointLocationsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointLocationsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointLocationsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationsEXT malloc(MemoryStack stack) {
        return wrap(XrHandJointLocationsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointLocationsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationsEXT calloc(MemoryStack stack) {
        return wrap(XrHandJointLocationsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandJointLocationsEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointLocationsEXT.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrHandJointLocationsEXT.ISACTIVE); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return UNSAFE.getInt(null, struct + XrHandJointLocationsEXT.JOINTCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrHandJointLocationEXT.Buffer njointLocations(long struct) { return XrHandJointLocationEXT.create(memGetAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointLocationsEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointLocationsEXT.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointLocationsEXT.ISACTIVE, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointLocationsEXT.JOINTCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrHandJointLocationEXT.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrHandJointLocationEXT.Buffer value) { memPutAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointLocationsEXT.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrHandJointLocationsEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointLocationsEXT, Buffer> implements NativeResource {

        private static final XrHandJointLocationsEXT ELEMENT_FACTORY = XrHandJointLocationsEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointLocationsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointLocationsEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointLocationsEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointLocationsEXT.ntype(address()); }
        /** @return the value of the {@link XrHandJointLocationsEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrHandJointLocationsEXT.nnext(address()); }
        /** @return the value of the {@link XrHandJointLocationsEXT#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrHandJointLocationsEXT.nisActive(address()) != 0; }
        /** @return the value of the {@link XrHandJointLocationsEXT#jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrHandJointLocationsEXT.njointCount(address()); }
        /** @return a {@link XrHandJointLocationEXT.Buffer} view of the struct array pointed to by the {@link XrHandJointLocationsEXT#jointLocations} field. */
        @NativeType("XrHandJointLocationEXT *")
        public XrHandJointLocationEXT.Buffer jointLocations() { return XrHandJointLocationsEXT.njointLocations(address()); }

        /** Sets the specified value to the {@link XrHandJointLocationsEXT#type} field. */
        public XrHandJointLocationsEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointLocationsEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT} value to the {@link XrHandJointLocationsEXT#type} field. */
        public XrHandJointLocationsEXT.Buffer type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_LOCATIONS_EXT); }
        /** Sets the specified value to the {@link XrHandJointLocationsEXT#next} field. */
        public XrHandJointLocationsEXT.Buffer next(@NativeType("void *") long value) { XrHandJointLocationsEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrHandJointVelocitiesEXT} value to the {@code next} chain. */
        public XrHandJointLocationsEXT.Buffer next(XrHandJointVelocitiesEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrHandJointLocationsEXT#isActive} field. */
        public XrHandJointLocationsEXT.Buffer isActive(@NativeType("XrBool32") boolean value) { XrHandJointLocationsEXT.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link XrHandJointLocationEXT.Buffer} to the {@link XrHandJointLocationsEXT#jointLocations} field. */
        public XrHandJointLocationsEXT.Buffer jointLocations(@NativeType("XrHandJointLocationEXT *") XrHandJointLocationEXT.Buffer value) { XrHandJointLocationsEXT.njointLocations(address(), value); return this; }

    }

}