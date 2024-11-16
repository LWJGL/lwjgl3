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
 * Information to create a space from a spatial anchor.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using {@link XrMarkerSpaceCreateInfoVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOMarkerTracking#XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link VARJOMarkerTracking#xrCreateMarkerSpaceVARJO CreateMarkerSpaceVARJO}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrMarkerSpaceCreateInfoVARJO {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint64_t {@link #markerId};
 *     {@link XrPosef XrPosef} {@link #poseInMarkerSpace};
 * }</code></pre>
 */
public class XrMarkerSpaceCreateInfoVARJO extends Struct<XrMarkerSpaceCreateInfoVARJO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERID,
        POSEINMARKERSPACE;

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
        MARKERID = layout.offsetof(2);
        POSEINMARKERSPACE = layout.offsetof(3);
    }

    protected XrMarkerSpaceCreateInfoVARJO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerSpaceCreateInfoVARJO create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerSpaceCreateInfoVARJO(address, container);
    }

    /**
     * Creates a {@code XrMarkerSpaceCreateInfoVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerSpaceCreateInfoVARJO(ByteBuffer container) {
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
    /** unique identifier of the marker. */
    @NativeType("uint64_t")
    public long markerId() { return nmarkerId(address()); }
    /** an {@link XrPosef} defining the position and orientation of the new space’s origin relative to the marker’s natural origin. */
    public XrPosef poseInMarkerSpace() { return nposeInMarkerSpace(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrMarkerSpaceCreateInfoVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOMarkerTracking#XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO} value to the {@link #type} field. */
    public XrMarkerSpaceCreateInfoVARJO type$Default() { return type(VARJOMarkerTracking.XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrMarkerSpaceCreateInfoVARJO next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #markerId} field. */
    public XrMarkerSpaceCreateInfoVARJO markerId(@NativeType("uint64_t") long value) { nmarkerId(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #poseInMarkerSpace} field. */
    public XrMarkerSpaceCreateInfoVARJO poseInMarkerSpace(XrPosef value) { nposeInMarkerSpace(address(), value); return this; }
    /** Passes the {@link #poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrMarkerSpaceCreateInfoVARJO poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerSpaceCreateInfoVARJO set(
        int type,
        long next,
        long markerId,
        XrPosef poseInMarkerSpace
    ) {
        type(type);
        next(next);
        markerId(markerId);
        poseInMarkerSpace(poseInMarkerSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerSpaceCreateInfoVARJO set(XrMarkerSpaceCreateInfoVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoVARJO malloc() {
        return new XrMarkerSpaceCreateInfoVARJO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoVARJO calloc() {
        return new XrMarkerSpaceCreateInfoVARJO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link BufferUtils}. */
    public static XrMarkerSpaceCreateInfoVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerSpaceCreateInfoVARJO(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance for the specified memory address. */
    public static XrMarkerSpaceCreateInfoVARJO create(long address) {
        return new XrMarkerSpaceCreateInfoVARJO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerSpaceCreateInfoVARJO createSafe(long address) {
        return address == NULL ? null : new XrMarkerSpaceCreateInfoVARJO(address, null);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerSpaceCreateInfoVARJO.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoVARJO malloc(MemoryStack stack) {
        return new XrMarkerSpaceCreateInfoVARJO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoVARJO calloc(MemoryStack stack) {
        return new XrMarkerSpaceCreateInfoVARJO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerSpaceCreateInfoVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerSpaceCreateInfoVARJO.NEXT); }
    /** Unsafe version of {@link #markerId}. */
    public static long nmarkerId(long struct) { return memGetLong(struct + XrMarkerSpaceCreateInfoVARJO.MARKERID); }
    /** Unsafe version of {@link #poseInMarkerSpace}. */
    public static XrPosef nposeInMarkerSpace(long struct) { return XrPosef.create(struct + XrMarkerSpaceCreateInfoVARJO.POSEINMARKERSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerSpaceCreateInfoVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerSpaceCreateInfoVARJO.NEXT, value); }
    /** Unsafe version of {@link #markerId(long) markerId}. */
    public static void nmarkerId(long struct, long value) { memPutLong(struct + XrMarkerSpaceCreateInfoVARJO.MARKERID, value); }
    /** Unsafe version of {@link #poseInMarkerSpace(XrPosef) poseInMarkerSpace}. */
    public static void nposeInMarkerSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrMarkerSpaceCreateInfoVARJO.POSEINMARKERSPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrMarkerSpaceCreateInfoVARJO} structs. */
    public static class Buffer extends StructBuffer<XrMarkerSpaceCreateInfoVARJO, Buffer> implements NativeResource {

        private static final XrMarkerSpaceCreateInfoVARJO ELEMENT_FACTORY = XrMarkerSpaceCreateInfoVARJO.create(-1L);

        /**
         * Creates a new {@code XrMarkerSpaceCreateInfoVARJO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerSpaceCreateInfoVARJO#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerSpaceCreateInfoVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrMarkerSpaceCreateInfoVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerSpaceCreateInfoVARJO.ntype(address()); }
        /** @return the value of the {@link XrMarkerSpaceCreateInfoVARJO#next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerSpaceCreateInfoVARJO.nnext(address()); }
        /** @return the value of the {@link XrMarkerSpaceCreateInfoVARJO#markerId} field. */
        @NativeType("uint64_t")
        public long markerId() { return XrMarkerSpaceCreateInfoVARJO.nmarkerId(address()); }
        /** @return a {@link XrPosef} view of the {@link XrMarkerSpaceCreateInfoVARJO#poseInMarkerSpace} field. */
        public XrPosef poseInMarkerSpace() { return XrMarkerSpaceCreateInfoVARJO.nposeInMarkerSpace(address()); }

        /** Sets the specified value to the {@link XrMarkerSpaceCreateInfoVARJO#type} field. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerSpaceCreateInfoVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOMarkerTracking#XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO} value to the {@link XrMarkerSpaceCreateInfoVARJO#type} field. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer type$Default() { return type(VARJOMarkerTracking.XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO); }
        /** Sets the specified value to the {@link XrMarkerSpaceCreateInfoVARJO#next} field. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer next(@NativeType("void const *") long value) { XrMarkerSpaceCreateInfoVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrMarkerSpaceCreateInfoVARJO#markerId} field. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer markerId(@NativeType("uint64_t") long value) { XrMarkerSpaceCreateInfoVARJO.nmarkerId(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrMarkerSpaceCreateInfoVARJO#poseInMarkerSpace} field. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer poseInMarkerSpace(XrPosef value) { XrMarkerSpaceCreateInfoVARJO.nposeInMarkerSpace(address(), value); return this; }
        /** Passes the {@link XrMarkerSpaceCreateInfoVARJO#poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrMarkerSpaceCreateInfoVARJO.Buffer poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    }

}