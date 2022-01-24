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
 * Returns the hand joint velocities.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>must</b> allocate the memory for the output array {@code jointVelocities} that can contain at least {@code jointCount} of {@link XrHandJointVelocityEXT}.</p>
 * 
 * <p>The application <b>must</b> input {@code jointCount} as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. Otherwise, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>The runtime <b>must</b> update the {@code jointVelocities} array in the order so that the application can index elements using the corresponding hand joint enum (e.g. {@code XrHandJointEXT}) as described by the {@code XrHandJointSetEXT} when creating the {@code XrHandTrackerEXT}. For example, when the {@code XrHandTrackerEXT} is created with {@link EXTHandTracking#XR_HAND_JOINT_SET_DEFAULT_EXT HAND_JOINT_SET_DEFAULT_EXT}, the application <b>must</b> set the {@code jointCount} to {@link EXTHandTracking#XR_HAND_JOINT_COUNT_EXT HAND_JOINT_COUNT_EXT}, and the returned {@code jointVelocities} array <b>must</b> be ordered to be indexed by enum {@code XrHandJointEXT} enum.</p>
 * 
 * <p>If the returned {@link XrHandJointLocationsEXT}{@code ::isActive} is false, it indicates the hand tracker did not detect a hand input or the application lost input focus. In this case, the runtime <b>must</b> return all {@code jointVelocities} with neither {@link XR10#XR_SPACE_VELOCITY_LINEAR_VALID_BIT SPACE_VELOCITY_LINEAR_VALID_BIT} nor {@link XR10#XR_SPACE_VELOCITY_ANGULAR_VALID_BIT SPACE_VELOCITY_ANGULAR_VALID_BIT} set.</p>
 * 
 * <p>If an {@link XrHandJointVelocitiesEXT} structure is chained to {@link XrHandJointLocationsEXT}{@code ::next}, the returned {@link XrHandJointLocationsEXT}{@code ::isActive} is true, and the velocity is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the linear velocity of each hand joint within the reference frame of {@code baseSpace} and set the {@link XR10#XR_SPACE_VELOCITY_LINEAR_VALID_BIT SPACE_VELOCITY_LINEAR_VALID_BIT}. Similarly, if an {@link XrHandJointVelocitiesEXT} structure is chained to {@link XrHandJointLocationsEXT}{@code ::next}, the returned {@link XrHandJointLocationsEXT}{@code ::isActive} is true, and the <em>angular velocity</em> is observed or can be calculated by the runtime, the runtime <b>must</b> fill in the angular velocity of each joint within the reference frame of {@code baseSpace} and set the {@link XR10#XR_SPACE_VELOCITY_ANGULAR_VALID_BIT SPACE_VELOCITY_ANGULAR_VALID_BIT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrHandJointVelocitiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTracking#XR_TYPE_HAND_JOINT_VELOCITIES_EXT TYPE_HAND_JOINT_VELOCITIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code jointVelocities} <b>must</b> be a pointer to an array of {@code jointCount} {@link XrHandJointVelocityEXT} structures</li>
 * <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointLocationsEXT}, {@link XrHandJointVelocityEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointVelocitiesEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #jointCount};
 *     {@link XrHandJointVelocityEXT XrHandJointVelocityEXT} * {@link #jointVelocities};
 * }</code></pre>
 */
public class XrHandJointVelocitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCOUNT,
        JOINTVELOCITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        JOINTCOUNT = layout.offsetof(2);
        JOINTVELOCITIES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandJointVelocitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointVelocitiesEXT(ByteBuffer container) {
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
    /** a {@code uint32_t} describing the number of elements in {@code jointVelocities} array. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** an array of {@link XrHandJointVelocityEXT} receiving the returned hand joint velocities. */
    @NativeType("XrHandJointVelocityEXT *")
    public XrHandJointVelocityEXT.Buffer jointVelocities() { return njointVelocities(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandJointVelocitiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_VELOCITIES_EXT TYPE_HAND_JOINT_VELOCITIES_EXT} value to the {@link #type} field. */
    public XrHandJointVelocitiesEXT type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_VELOCITIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandJointVelocitiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrHandJointVelocityEXT.Buffer} to the {@link #jointVelocities} field. */
    public XrHandJointVelocitiesEXT jointVelocities(@NativeType("XrHandJointVelocityEXT *") XrHandJointVelocityEXT.Buffer value) { njointVelocities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointVelocitiesEXT set(
        int type,
        long next,
        XrHandJointVelocityEXT.Buffer jointVelocities
    ) {
        type(type);
        next(next);
        jointVelocities(jointVelocities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointVelocitiesEXT set(XrHandJointVelocitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocitiesEXT malloc() {
        return wrap(XrHandJointVelocitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointVelocitiesEXT calloc() {
        return wrap(XrHandJointVelocitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointVelocitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointVelocitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointVelocitiesEXT} instance for the specified memory address. */
    public static XrHandJointVelocitiesEXT create(long address) {
        return wrap(XrHandJointVelocitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointVelocitiesEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointVelocitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointVelocitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocitiesEXT malloc(MemoryStack stack) {
        return wrap(XrHandJointVelocitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointVelocitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointVelocitiesEXT calloc(MemoryStack stack) {
        return wrap(XrHandJointVelocitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointVelocitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointVelocitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandJointVelocitiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointVelocitiesEXT.NEXT); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return UNSAFE.getInt(null, struct + XrHandJointVelocitiesEXT.JOINTCOUNT); }
    /** Unsafe version of {@link #jointVelocities}. */
    public static XrHandJointVelocityEXT.Buffer njointVelocities(long struct) { return XrHandJointVelocityEXT.create(memGetAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointVelocitiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointVelocitiesEXT.NEXT, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointVelocitiesEXT.JOINTCOUNT, value); }
    /** Unsafe version of {@link #jointVelocities(XrHandJointVelocityEXT.Buffer) jointVelocities}. */
    public static void njointVelocities(long struct, XrHandJointVelocityEXT.Buffer value) { memPutAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointVelocitiesEXT.JOINTVELOCITIES));
    }

    // -----------------------------------

    /** An array of {@link XrHandJointVelocitiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointVelocitiesEXT, Buffer> implements NativeResource {

        private static final XrHandJointVelocitiesEXT ELEMENT_FACTORY = XrHandJointVelocitiesEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointVelocitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointVelocitiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointVelocitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointVelocitiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointVelocitiesEXT.ntype(address()); }
        /** @return the value of the {@link XrHandJointVelocitiesEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrHandJointVelocitiesEXT.nnext(address()); }
        /** @return the value of the {@link XrHandJointVelocitiesEXT#jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrHandJointVelocitiesEXT.njointCount(address()); }
        /** @return a {@link XrHandJointVelocityEXT.Buffer} view of the struct array pointed to by the {@link XrHandJointVelocitiesEXT#jointVelocities} field. */
        @NativeType("XrHandJointVelocityEXT *")
        public XrHandJointVelocityEXT.Buffer jointVelocities() { return XrHandJointVelocitiesEXT.njointVelocities(address()); }

        /** Sets the specified value to the {@link XrHandJointVelocitiesEXT#type} field. */
        public XrHandJointVelocitiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointVelocitiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINT_VELOCITIES_EXT TYPE_HAND_JOINT_VELOCITIES_EXT} value to the {@link XrHandJointVelocitiesEXT#type} field. */
        public XrHandJointVelocitiesEXT.Buffer type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINT_VELOCITIES_EXT); }
        /** Sets the specified value to the {@link XrHandJointVelocitiesEXT#next} field. */
        public XrHandJointVelocitiesEXT.Buffer next(@NativeType("void *") long value) { XrHandJointVelocitiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrHandJointVelocityEXT.Buffer} to the {@link XrHandJointVelocitiesEXT#jointVelocities} field. */
        public XrHandJointVelocitiesEXT.Buffer jointVelocities(@NativeType("XrHandJointVelocityEXT *") XrHandJointVelocityEXT.Buffer value) { XrHandJointVelocitiesEXT.njointVelocities(address(), value); return this; }

    }

}