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
 * Filters for entities with specific unique identifiers.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceUuidFilterInfoFB} structure is a filter an application <b>can</b> use to find {@code XrSpace} entities that match specified UUIDs, to include or exclude them from a query.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrSpaceUuidFilterInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityQuery#XR_TYPE_SPACE_UUID_FILTER_INFO_FB TYPE_SPACE_UUID_FILTER_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code uuids} <b>must</b> be a pointer to an array of {@code uuidCount} {@link XrUuidEXT} structures</li>
 * <li>The {@code uuidCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpaceFilterInfoBaseHeaderFB}, {@link XrSpaceQueryInfoFB}, {@link XrUuidEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceUuidFilterInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #uuidCount};
 *     {@link XrUuidEXT XrUuidEXT} * {@link #uuids};
 * }</code></pre>
 */
public class XrSpaceUuidFilterInfoFB extends Struct<XrSpaceUuidFilterInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUIDCOUNT,
        UUIDS;

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
        UUIDCOUNT = layout.offsetof(2);
        UUIDS = layout.offsetof(3);
    }

    protected XrSpaceUuidFilterInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceUuidFilterInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceUuidFilterInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceUuidFilterInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceUuidFilterInfoFB(ByteBuffer container) {
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
    /** the number of UUIDs to be matched. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** an array of {@link XrUuidEXT} that contains the UUIDs to be matched. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceUuidFilterInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_UUID_FILTER_INFO_FB TYPE_SPACE_UUID_FILTER_INFO_FB} value to the {@link #type} field. */
    public XrSpaceUuidFilterInfoFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_UUID_FILTER_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceUuidFilterInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link #uuids} field. */
    public XrSpaceUuidFilterInfoFB uuids(@NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceUuidFilterInfoFB set(
        int type,
        long next,
        XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
        uuids(uuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceUuidFilterInfoFB set(XrSpaceUuidFilterInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceUuidFilterInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceUuidFilterInfoFB malloc() {
        return new XrSpaceUuidFilterInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceUuidFilterInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceUuidFilterInfoFB calloc() {
        return new XrSpaceUuidFilterInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceUuidFilterInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceUuidFilterInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceUuidFilterInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceUuidFilterInfoFB} instance for the specified memory address. */
    public static XrSpaceUuidFilterInfoFB create(long address) {
        return new XrSpaceUuidFilterInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceUuidFilterInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceUuidFilterInfoFB(address, null);
    }

    /** Downcasts the specified {@code XrSpaceFilterInfoBaseHeaderFB} instance to {@code XrSpaceUuidFilterInfoFB}. */
    public static XrSpaceUuidFilterInfoFB create(XrSpaceFilterInfoBaseHeaderFB value) {
        return new XrSpaceUuidFilterInfoFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceUuidFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUuidFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUuidFilterInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceUuidFilterInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceUuidFilterInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpaceFilterInfoBaseHeaderFB.Buffer} instance to {@code XrSpaceUuidFilterInfoFB.Buffer}. */
    public static XrSpaceUuidFilterInfoFB.Buffer create(XrSpaceFilterInfoBaseHeaderFB.Buffer value) {
        return new XrSpaceUuidFilterInfoFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceUuidFilterInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceUuidFilterInfoFB malloc(MemoryStack stack) {
        return new XrSpaceUuidFilterInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceUuidFilterInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceUuidFilterInfoFB calloc(MemoryStack stack) {
        return new XrSpaceUuidFilterInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceUuidFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUuidFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceUuidFilterInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceUuidFilterInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceUuidFilterInfoFB.NEXT); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return UNSAFE.getInt(null, struct + XrSpaceUuidFilterInfoFB.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpaceUuidFilterInfoFB.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceUuidFilterInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceUuidFilterInfoFB.NEXT, value); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceUuidFilterInfoFB.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpaceUuidFilterInfoFB.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceUuidFilterInfoFB.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceUuidFilterInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceUuidFilterInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceUuidFilterInfoFB ELEMENT_FACTORY = XrSpaceUuidFilterInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceUuidFilterInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceUuidFilterInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceUuidFilterInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceUuidFilterInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceUuidFilterInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceUuidFilterInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceUuidFilterInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceUuidFilterInfoFB#uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpaceUuidFilterInfoFB.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@link XrSpaceUuidFilterInfoFB#uuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.Buffer uuids() { return XrSpaceUuidFilterInfoFB.nuuids(address()); }

        /** Sets the specified value to the {@link XrSpaceUuidFilterInfoFB#type} field. */
        public XrSpaceUuidFilterInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceUuidFilterInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_UUID_FILTER_INFO_FB TYPE_SPACE_UUID_FILTER_INFO_FB} value to the {@link XrSpaceUuidFilterInfoFB#type} field. */
        public XrSpaceUuidFilterInfoFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_UUID_FILTER_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceUuidFilterInfoFB#next} field. */
        public XrSpaceUuidFilterInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceUuidFilterInfoFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link XrSpaceUuidFilterInfoFB#uuids} field. */
        public XrSpaceUuidFilterInfoFB.Buffer uuids(@NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { XrSpaceUuidFilterInfoFB.nuuids(address(), value); return this; }

    }

}