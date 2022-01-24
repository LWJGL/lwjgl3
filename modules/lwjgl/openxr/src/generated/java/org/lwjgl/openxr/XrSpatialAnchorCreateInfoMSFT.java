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
 * Information to create a spatial anchor.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link MSFTSpatialAnchor#xrCreateSpatialAnchorMSFT CreateSpatialAnchorMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     {@link XrPosef XrPosef} {@link #pose};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrSpatialAnchorCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        POSE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        POSE = layout.offsetof(3);
        TIME = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSpatialAnchorCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCreateInfoMSFT(ByteBuffer container) {
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
    /** a handle to the {@code XrSpace} in which {@code pose} is specified. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@link XrPosef} within {@code space} at {@code time} that specifies the point in the real world used to initialize the new anchor. */
    public XrPosef pose() { return npose(address()); }
    /** the {@code XrTime} at which {@code pose} will be evaluated within {@code space}. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSpatialAnchorCreateInfoMSFT type$Default() { return type(MSFTSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrSpatialAnchorCreateInfoMSFT space(XrSpace value) { nspace(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSpatialAnchorCreateInfoMSFT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateInfoMSFT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSpatialAnchorCreateInfoMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCreateInfoMSFT set(
        int type,
        long next,
        XrSpace space,
        XrPosef pose,
        long time
    ) {
        type(type);
        next(next);
        space(space);
        pose(pose);
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
    public XrSpatialAnchorCreateInfoMSFT set(XrSpatialAnchorCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoMSFT malloc() {
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoMSFT calloc() {
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorCreateInfoMSFT create(long address) {
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSpatialAnchorCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoMSFT.SPACE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpatialAnchorCreateInfoMSFT.POSE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrSpatialAnchorCreateInfoMSFT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorCreateInfoMSFT.SPACE, value.address()); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorCreateInfoMSFT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrSpatialAnchorCreateInfoMSFT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorCreateInfoMSFT.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCreateInfoMSFT ELEMENT_FACTORY = XrSpatialAnchorCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSpatialAnchorCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoMSFT#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialAnchorCreateInfoMSFT.nspace(address()); }
        /** @return a {@link XrPosef} view of the {@link XrSpatialAnchorCreateInfoMSFT#pose} field. */
        public XrPosef pose() { return XrSpatialAnchorCreateInfoMSFT.npose(address()); }
        /** @return the value of the {@link XrSpatialAnchorCreateInfoMSFT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialAnchorCreateInfoMSFT.ntime(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoMSFT#type} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT} value to the {@link XrSpatialAnchorCreateInfoMSFT#type} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer type$Default() { return type(MSFTSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoMSFT#next} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoMSFT#space} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer space(XrSpace value) { XrSpatialAnchorCreateInfoMSFT.nspace(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrSpatialAnchorCreateInfoMSFT#pose} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer pose(XrPosef value) { XrSpatialAnchorCreateInfoMSFT.npose(address(), value); return this; }
        /** Passes the {@link XrSpatialAnchorCreateInfoMSFT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorCreateInfoMSFT#time} field. */
        public XrSpatialAnchorCreateInfoMSFT.Buffer time(@NativeType("XrTime") long value) { XrSpatialAnchorCreateInfoMSFT.ntime(address(), value); return this; }

    }

}