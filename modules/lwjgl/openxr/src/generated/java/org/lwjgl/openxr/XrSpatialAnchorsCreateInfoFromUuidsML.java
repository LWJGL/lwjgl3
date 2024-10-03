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
 * Structure used to create tracked spatial anchors from uuids.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code XrSpace} handle or handles returned via {@link XrCreateSpatialAnchorsCompletionML}{@code ::spaces} <b>must</b> be in the same order as {@code uuids}.</p>
 * 
 * <p>The {@link XrCreateSpatialAnchorsCompletionML}{@code ::spaceCount} field <b>must</b> match {@code uuidCount}. If not the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} in {@link XrCreateSpatialAnchorsCompletionML}{@code ::futureResult}.</p>
 * 
 * <p>If an anchor with a given UUID is not found, the runtime <b>must</b> return {@link XR10#XR_NULL_HANDLE NULL_HANDLE} for the corresponding {@code XrSpace} handle(s) and return {@link XR10#XR_SUCCESS SUCCESS} in {@link XrCreateSpatialAnchorsCompletionML}{@code ::futureResult}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsCreateInfoFromUuidsML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
 * <li>{@code uuids} <b>must</b> be a pointer to an array of {@code uuidCount} {@link XrUuidEXT} structures</li>
 * <li>The {@code uuidCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidEXT}, {@link MLSpatialAnchors#xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsCreateInfoFromUuidsML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpatialAnchorsStorageML {@link #storage};
 *     uint32_t {@link #uuidCount};
 *     {@link XrUuidEXT XrUuidEXT} const * {@link #uuids};
 * }</code></pre>
 */
public class XrSpatialAnchorsCreateInfoFromUuidsML extends Struct<XrSpatialAnchorsCreateInfoFromUuidsML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STORAGE,
        UUIDCOUNT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STORAGE = layout.offsetof(2);
        UUIDCOUNT = layout.offsetof(3);
        UUIDS = layout.offsetof(4);
    }

    protected XrSpatialAnchorsCreateInfoFromUuidsML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsCreateInfoFromUuidsML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsCreateInfoFromUuidsML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code XrSpatialAnchorsStorageML} to use. */
    @NativeType("XrSpatialAnchorsStorageML")
    public long storage() { return nstorage(address()); }
    /** the number of elements in the uuids array. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** pointer to an array of {@link XrUuidEXT}. */
    @NativeType("XrUuidEXT const *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #storage} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML storage(XrSpatialAnchorsStorageML value) { nstorage(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link #uuids} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsCreateInfoFromUuidsML set(
        int type,
        long next,
        XrSpatialAnchorsStorageML storage,
        XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
        storage(storage);
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
    public XrSpatialAnchorsCreateInfoFromUuidsML set(XrSpatialAnchorsCreateInfoFromUuidsML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML malloc() {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML calloc() {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsCreateInfoFromUuidsML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance for the specified memory address. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create(long address) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsCreateInfoFromUuidsML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsCreateInfoFromUuidsML(address, null);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML} instance to {@code XrSpatialAnchorsCreateInfoFromUuidsML}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create(XrSpatialAnchorsCreateInfoBaseHeaderML value) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer} instance to {@code XrSpatialAnchorsCreateInfoFromUuidsML.Buffer}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer value) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsCreateInfoFromUuidsML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.NEXT); }
    /** Unsafe version of {@link #storage}. */
    public static long nstorage(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsCreateInfoFromUuidsML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.NEXT, value); }
    /** Unsafe version of {@link #storage(XrSpatialAnchorsStorageML) storage}. */
    public static void nstorage(long struct, XrSpatialAnchorsStorageML value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE, value.address()); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE));
        check(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsCreateInfoFromUuidsML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsCreateInfoFromUuidsML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsCreateInfoFromUuidsML ELEMENT_FACTORY = XrSpatialAnchorsCreateInfoFromUuidsML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsCreateInfoFromUuidsML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsCreateInfoFromUuidsML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromUuidsML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsCreateInfoFromUuidsML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromUuidsML#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsCreateInfoFromUuidsML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromUuidsML#storage} field. */
        @NativeType("XrSpatialAnchorsStorageML")
        public long storage() { return XrSpatialAnchorsCreateInfoFromUuidsML.nstorage(address()); }
        /** @return the value of the {@link XrSpatialAnchorsCreateInfoFromUuidsML#uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpatialAnchorsCreateInfoFromUuidsML.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@link XrSpatialAnchorsCreateInfoFromUuidsML#uuids} field. */
        @NativeType("XrUuidEXT const *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsCreateInfoFromUuidsML.nuuids(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromUuidsML#type} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsCreateInfoFromUuidsML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML} value to the {@link XrSpatialAnchorsCreateInfoFromUuidsML#type} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromUuidsML#next} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsCreateInfoFromUuidsML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsCreateInfoFromUuidsML#storage} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer storage(XrSpatialAnchorsStorageML value) { XrSpatialAnchorsCreateInfoFromUuidsML.nstorage(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link XrSpatialAnchorsCreateInfoFromUuidsML#uuids} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { XrSpatialAnchorsCreateInfoFromUuidsML.nuuids(address(), value); return this; }

    }

}