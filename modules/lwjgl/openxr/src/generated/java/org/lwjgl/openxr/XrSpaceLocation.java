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
 * Contains info about a space.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrEyeGazeSampleTimeEXT}, {@link XrSpaceVelocity}</li>
 * <li>{@code locationFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceLocationFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrSpaceVelocity}, {@link XR10#xrLocateSpace LocateSpace}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceLocation {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrSpaceLocationFlags {@link #locationFlags};
 *     {@link XrPosef XrPosef} {@link #pose};
 * }</code></pre>
 */
public class XrSpaceLocation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONFLAGS,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATIONFLAGS = layout.offsetof(2);
        POSE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSpaceLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceLocation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain, such as {@link XrSpaceVelocity}. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a bitfield, with bit masks defined in {@code XrSpaceLocationFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** an {@link XrPosef} defining the position and orientation of the origin of {@link XR10#xrLocateSpace LocateSpace}{@code ::space} within the reference frame of {@link XR10#xrLocateSpace LocateSpace}{@code ::baseSpace}. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceLocation type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION} value to the {@link #type} field. */
    public XrSpaceLocation type$Default() { return type(XR10.XR_TYPE_SPACE_LOCATION); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceLocation next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrEyeGazeSampleTimeEXT} value to the {@code next} chain. */
    public XrSpaceLocation next(XrEyeGazeSampleTimeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpaceVelocity} value to the {@code next} chain. */
    public XrSpaceLocation next(XrSpaceVelocity value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #locationFlags} field. */
    public XrSpaceLocation locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSpaceLocation pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceLocation pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceLocation set(
        int type,
        long next,
        long locationFlags,
        XrPosef pose
    ) {
        type(type);
        next(next);
        locationFlags(locationFlags);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceLocation set(XrSpaceLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceLocation malloc() {
        return wrap(XrSpaceLocation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceLocation calloc() {
        return wrap(XrSpaceLocation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link BufferUtils}. */
    public static XrSpaceLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpaceLocation.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceLocation} instance for the specified memory address. */
    public static XrSpaceLocation create(long address) {
        return wrap(XrSpaceLocation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceLocation createSafe(long address) {
        return address == NULL ? null : wrap(XrSpaceLocation.class, address);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpaceLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceLocation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocation malloc(MemoryStack stack) {
        return wrap(XrSpaceLocation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpaceLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocation calloc(MemoryStack stack) {
        return wrap(XrSpaceLocation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceLocation.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceLocation.NEXT); }
    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return UNSAFE.getLong(null, struct + XrSpaceLocation.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpaceLocation.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceLocation.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceLocation.NEXT, value); }
    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSpaceLocation.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpaceLocation.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpaceLocation} structs. */
    public static class Buffer extends StructBuffer<XrSpaceLocation, Buffer> implements NativeResource {

        private static final XrSpaceLocation ELEMENT_FACTORY = XrSpaceLocation.create(-1L);

        /**
         * Creates a new {@code XrSpaceLocation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceLocation#SIZEOF}, and its mark will be undefined.
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
        protected XrSpaceLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceLocation#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceLocation.ntype(address()); }
        /** @return the value of the {@link XrSpaceLocation#next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceLocation.nnext(address()); }
        /** @return the value of the {@link XrSpaceLocation#locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrSpaceLocation.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpaceLocation#pose} field. */
        public XrPosef pose() { return XrSpaceLocation.npose(address()); }

        /** Sets the specified value to the {@link XrSpaceLocation#type} field. */
        public XrSpaceLocation.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceLocation.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION} value to the {@link XrSpaceLocation#type} field. */
        public XrSpaceLocation.Buffer type$Default() { return type(XR10.XR_TYPE_SPACE_LOCATION); }
        /** Sets the specified value to the {@link XrSpaceLocation#next} field. */
        public XrSpaceLocation.Buffer next(@NativeType("void *") long value) { XrSpaceLocation.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrEyeGazeSampleTimeEXT} value to the {@code next} chain. */
        public XrSpaceLocation.Buffer next(XrEyeGazeSampleTimeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpaceVelocity} value to the {@code next} chain. */
        public XrSpaceLocation.Buffer next(XrSpaceVelocity value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSpaceLocation#locationFlags} field. */
        public XrSpaceLocation.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrSpaceLocation.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpaceLocation#pose} field. */
        public XrSpaceLocation.Buffer pose(XrPosef value) { XrSpaceLocation.npose(address(), value); return this; }
        /** Passes the {@link XrSpaceLocation#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceLocation.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}