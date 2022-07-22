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
 * Describes where a spatial entity is stored.
 * 
 * <h5>Description</h5>
 * 
 * <p>Extends a query filter to limit a query to a specific storage location. Set the {@code next} pointer of an {@link XrSpaceFilterInfoBaseHeaderFB} to chain this extra filtering functionality.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrSpaceStorageLocationFilterInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityQuery#XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceStorageLocationFilterInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpaceStorageLocationFB {@link #location};
 * }</code></pre>
 */
public class XrSpaceStorageLocationFilterInfoFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATION = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSpaceStorageLocationFilterInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceStorageLocationFilterInfoFB(ByteBuffer container) {
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
    /** the location to limit the query to. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceStorageLocationFilterInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB} value to the {@link #type} field. */
    public XrSpaceStorageLocationFilterInfoFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceStorageLocationFilterInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #location} field. */
    public XrSpaceStorageLocationFilterInfoFB location(@NativeType("XrSpaceStorageLocationFB") int value) { nlocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceStorageLocationFilterInfoFB set(
        int type,
        long next,
        int location
    ) {
        type(type);
        next(next);
        location(location);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceStorageLocationFilterInfoFB set(XrSpaceStorageLocationFilterInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceStorageLocationFilterInfoFB malloc() {
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceStorageLocationFilterInfoFB calloc() {
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceStorageLocationFilterInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance for the specified memory address. */
    public static XrSpaceStorageLocationFilterInfoFB create(long address) {
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceStorageLocationFilterInfoFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSpaceStorageLocationFilterInfoFB.class, address);
    }

    /**
     * Returns a new {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceStorageLocationFilterInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceStorageLocationFilterInfoFB malloc(MemoryStack stack) {
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpaceStorageLocationFilterInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceStorageLocationFilterInfoFB calloc(MemoryStack stack) {
        return wrap(XrSpaceStorageLocationFilterInfoFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceStorageLocationFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceStorageLocationFilterInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceStorageLocationFilterInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceStorageLocationFilterInfoFB.NEXT); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + XrSpaceStorageLocationFilterInfoFB.LOCATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceStorageLocationFilterInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceStorageLocationFilterInfoFB.NEXT, value); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceStorageLocationFilterInfoFB.LOCATION, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceStorageLocationFilterInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceStorageLocationFilterInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceStorageLocationFilterInfoFB ELEMENT_FACTORY = XrSpaceStorageLocationFilterInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceStorageLocationFilterInfoFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceStorageLocationFilterInfoFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSpaceStorageLocationFilterInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceStorageLocationFilterInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceStorageLocationFilterInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceStorageLocationFilterInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceStorageLocationFilterInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceStorageLocationFilterInfoFB#location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrSpaceStorageLocationFilterInfoFB.nlocation(address()); }

        /** Sets the specified value to the {@link XrSpaceStorageLocationFilterInfoFB#type} field. */
        public XrSpaceStorageLocationFilterInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceStorageLocationFilterInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB} value to the {@link XrSpaceStorageLocationFilterInfoFB#type} field. */
        public XrSpaceStorageLocationFilterInfoFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceStorageLocationFilterInfoFB#next} field. */
        public XrSpaceStorageLocationFilterInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceStorageLocationFilterInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceStorageLocationFilterInfoFB#location} field. */
        public XrSpaceStorageLocationFilterInfoFB.Buffer location(@NativeType("XrSpaceStorageLocationFB") int value) { XrSpaceStorageLocationFilterInfoFB.nlocation(address(), value); return this; }

    }

}