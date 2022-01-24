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
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SPACE_VELOCITY TYPE_SPACE_VELOCITY}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code velocityFlags} <b>must</b> be 0 or a valid combination of {@code XrSpaceVelocityFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpaceLocation}, {@link XrVector3f}, {@link XR10#xrLocateSpace LocateSpace}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceVelocity {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrSpaceVelocityFlags {@link #velocityFlags};
 *     {@link XrVector3f XrVector3f} {@link #linearVelocity};
 *     {@link XrVector3f XrVector3f} {@link #angularVelocity};
 * }</code></pre>
 */
public class XrSpaceVelocity extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VELOCITYFLAGS,
        LINEARVELOCITY,
        ANGULARVELOCITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VELOCITYFLAGS = layout.offsetof(2);
        LINEARVELOCITY = layout.offsetof(3);
        ANGULARVELOCITY = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSpaceVelocity} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceVelocity(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a bitfield, with bit masks defined in {@code XrSpaceVelocityFlagBits}, to indicate which members contain valid data. If none of the bits are set, no other fields in this structure <b>should</b> be considered to be valid or meaningful. */
    @NativeType("XrSpaceVelocityFlags")
    public long velocityFlags() { return nvelocityFlags(address()); }
    /** the relative linear velocity of the origin of {@link XR10#xrLocateSpace LocateSpace}{@code ::space} with respect to and expressed in the reference frame of {@link XR10#xrLocateSpace LocateSpace}{@code ::baseSpace}, in units of meters per second. */
    public XrVector3f linearVelocity() { return nlinearVelocity(address()); }
    /** the relative angular velocity of {@link XR10#xrLocateSpace LocateSpace}{@code ::space} with respect to {@link XR10#xrLocateSpace LocateSpace}{@code ::baseSpace}. The vector’s direction is expressed in the reference frame of {@link XR10#xrLocateSpace LocateSpace}{@code ::baseSpace} and is parallel to the rotational axis of {@link XR10#xrLocateSpace LocateSpace}{@code ::space}. The vector’s magnitude is the relative angular speed of {@link XR10#xrLocateSpace LocateSpace}{@code ::space} in radians per second. The vector follows the right-hand rule for torque/rotation. */
    public XrVector3f angularVelocity() { return nangularVelocity(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceVelocity type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SPACE_VELOCITY TYPE_SPACE_VELOCITY} value to the {@link #type} field. */
    public XrSpaceVelocity type$Default() { return type(XR10.XR_TYPE_SPACE_VELOCITY); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceVelocity next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #velocityFlags} field. */
    public XrSpaceVelocity velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { nvelocityFlags(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #linearVelocity} field. */
    public XrSpaceVelocity linearVelocity(XrVector3f value) { nlinearVelocity(address(), value); return this; }
    /** Passes the {@link #linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceVelocity linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #angularVelocity} field. */
    public XrSpaceVelocity angularVelocity(XrVector3f value) { nangularVelocity(address(), value); return this; }
    /** Passes the {@link #angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceVelocity angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceVelocity set(
        int type,
        long next,
        long velocityFlags,
        XrVector3f linearVelocity,
        XrVector3f angularVelocity
    ) {
        type(type);
        next(next);
        velocityFlags(velocityFlags);
        linearVelocity(linearVelocity);
        angularVelocity(angularVelocity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceVelocity set(XrSpaceVelocity src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocity malloc() {
        return wrap(XrSpaceVelocity.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocity calloc() {
        return wrap(XrSpaceVelocity.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpaceVelocity} instance allocated with {@link BufferUtils}. */
    public static XrSpaceVelocity create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpaceVelocity.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceVelocity} instance for the specified memory address. */
    public static XrSpaceVelocity create(long address) {
        return wrap(XrSpaceVelocity.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceVelocity createSafe(long address) {
        return address == NULL ? null : wrap(XrSpaceVelocity.class, address);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpaceVelocity.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceVelocity.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceVelocity} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocity malloc(MemoryStack stack) {
        return wrap(XrSpaceVelocity.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpaceVelocity} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocity calloc(MemoryStack stack) {
        return wrap(XrSpaceVelocity.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocity.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocity.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceVelocity.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceVelocity.NEXT); }
    /** Unsafe version of {@link #velocityFlags}. */
    public static long nvelocityFlags(long struct) { return UNSAFE.getLong(null, struct + XrSpaceVelocity.VELOCITYFLAGS); }
    /** Unsafe version of {@link #linearVelocity}. */
    public static XrVector3f nlinearVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocity.LINEARVELOCITY); }
    /** Unsafe version of {@link #angularVelocity}. */
    public static XrVector3f nangularVelocity(long struct) { return XrVector3f.create(struct + XrSpaceVelocity.ANGULARVELOCITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceVelocity.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceVelocity.NEXT, value); }
    /** Unsafe version of {@link #velocityFlags(long) velocityFlags}. */
    public static void nvelocityFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSpaceVelocity.VELOCITYFLAGS, value); }
    /** Unsafe version of {@link #linearVelocity(XrVector3f) linearVelocity}. */
    public static void nlinearVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpaceVelocity.LINEARVELOCITY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #angularVelocity(XrVector3f) angularVelocity}. */
    public static void nangularVelocity(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpaceVelocity.ANGULARVELOCITY, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpaceVelocity} structs. */
    public static class Buffer extends StructBuffer<XrSpaceVelocity, Buffer> implements NativeResource {

        private static final XrSpaceVelocity ELEMENT_FACTORY = XrSpaceVelocity.create(-1L);

        /**
         * Creates a new {@code XrSpaceVelocity.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceVelocity#SIZEOF}, and its mark will be undefined.
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
        protected XrSpaceVelocity getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceVelocity#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceVelocity.ntype(address()); }
        /** @return the value of the {@link XrSpaceVelocity#next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceVelocity.nnext(address()); }
        /** @return the value of the {@link XrSpaceVelocity#velocityFlags} field. */
        @NativeType("XrSpaceVelocityFlags")
        public long velocityFlags() { return XrSpaceVelocity.nvelocityFlags(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrSpaceVelocity#linearVelocity} field. */
        public XrVector3f linearVelocity() { return XrSpaceVelocity.nlinearVelocity(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrSpaceVelocity#angularVelocity} field. */
        public XrVector3f angularVelocity() { return XrSpaceVelocity.nangularVelocity(address()); }

        /** Sets the specified value to the {@link XrSpaceVelocity#type} field. */
        public XrSpaceVelocity.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceVelocity.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SPACE_VELOCITY TYPE_SPACE_VELOCITY} value to the {@link XrSpaceVelocity#type} field. */
        public XrSpaceVelocity.Buffer type$Default() { return type(XR10.XR_TYPE_SPACE_VELOCITY); }
        /** Sets the specified value to the {@link XrSpaceVelocity#next} field. */
        public XrSpaceVelocity.Buffer next(@NativeType("void *") long value) { XrSpaceVelocity.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceVelocity#velocityFlags} field. */
        public XrSpaceVelocity.Buffer velocityFlags(@NativeType("XrSpaceVelocityFlags") long value) { XrSpaceVelocity.nvelocityFlags(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrSpaceVelocity#linearVelocity} field. */
        public XrSpaceVelocity.Buffer linearVelocity(XrVector3f value) { XrSpaceVelocity.nlinearVelocity(address(), value); return this; }
        /** Passes the {@link XrSpaceVelocity#linearVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceVelocity.Buffer linearVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(linearVelocity()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrSpaceVelocity#angularVelocity} field. */
        public XrSpaceVelocity.Buffer angularVelocity(XrVector3f value) { XrSpaceVelocity.nangularVelocity(address(), value); return this; }
        /** Passes the {@link XrSpaceVelocity#angularVelocity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceVelocity.Buffer angularVelocity(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(angularVelocity()); return this; }

    }

}