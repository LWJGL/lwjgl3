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
 * Parameters for a list save operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceListSaveInfoFB} structure contains information used to save multiple spatial entities.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to using {@link XrSpaceListSaveInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityStorageBatch#XR_TYPE_SPACE_LIST_SAVE_INFO_FB TYPE_SPACE_LIST_SAVE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code spaces} <b>must</b> be a pointer to an array of {@code spaceCount} {@code XrSpace} handles</li>
 * <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
 * <li>The {@code spaceCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntityStorageBatch#xrSaveSpaceListFB SaveSpaceListFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceListSaveInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #spaceCount};
 *     XrSpace * {@link #spaces};
 *     XrSpaceStorageLocationFB {@link #location};
 * }</code></pre>
 */
public class XrSpaceListSaveInfoFB extends Struct<XrSpaceListSaveInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACECOUNT,
        SPACES,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACECOUNT = layout.offsetof(2);
        SPACES = layout.offsetof(3);
        LOCATION = layout.offsetof(4);
    }

    protected XrSpaceListSaveInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceListSaveInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceListSaveInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceListSaveInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceListSaveInfoFB(ByteBuffer container) {
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
    /** the number of spatial entities to save. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** a list of {@code XrSpace} handles for the entities to be saved. */
    @NativeType("XrSpace *")
    public PointerBuffer spaces() { return nspaces(address()); }
    /** the storage location. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceListSaveInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorageBatch#XR_TYPE_SPACE_LIST_SAVE_INFO_FB TYPE_SPACE_LIST_SAVE_INFO_FB} value to the {@link #type} field. */
    public XrSpaceListSaveInfoFB type$Default() { return type(FBSpatialEntityStorageBatch.XR_TYPE_SPACE_LIST_SAVE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceListSaveInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #spaces} field. */
    public XrSpaceListSaveInfoFB spaces(@NativeType("XrSpace *") PointerBuffer value) { nspaces(address(), value); return this; }
    /** Sets the specified value to the {@link #location} field. */
    public XrSpaceListSaveInfoFB location(@NativeType("XrSpaceStorageLocationFB") int value) { nlocation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceListSaveInfoFB set(
        int type,
        long next,
        PointerBuffer spaces,
        int location
    ) {
        type(type);
        next(next);
        spaces(spaces);
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
    public XrSpaceListSaveInfoFB set(XrSpaceListSaveInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceListSaveInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceListSaveInfoFB malloc() {
        return new XrSpaceListSaveInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceListSaveInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceListSaveInfoFB calloc() {
        return new XrSpaceListSaveInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceListSaveInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceListSaveInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceListSaveInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceListSaveInfoFB} instance for the specified memory address. */
    public static XrSpaceListSaveInfoFB create(long address) {
        return new XrSpaceListSaveInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceListSaveInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceListSaveInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceListSaveInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceListSaveInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceListSaveInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceListSaveInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceListSaveInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceListSaveInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceListSaveInfoFB malloc(MemoryStack stack) {
        return new XrSpaceListSaveInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceListSaveInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceListSaveInfoFB calloc(MemoryStack stack) {
        return new XrSpaceListSaveInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceListSaveInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceListSaveInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceListSaveInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceListSaveInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceListSaveInfoFB.NEXT); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return UNSAFE.getInt(null, struct + XrSpaceListSaveInfoFB.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static PointerBuffer nspaces(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpaceListSaveInfoFB.SPACES), nspaceCount(struct)); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + XrSpaceListSaveInfoFB.LOCATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceListSaveInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceListSaveInfoFB.NEXT, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceListSaveInfoFB.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, PointerBuffer value) { memPutAddress(struct + XrSpaceListSaveInfoFB.SPACES, memAddress(value)); nspaceCount(struct, value.remaining()); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceListSaveInfoFB.LOCATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceListSaveInfoFB.SPACES));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceListSaveInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceListSaveInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceListSaveInfoFB ELEMENT_FACTORY = XrSpaceListSaveInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceListSaveInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceListSaveInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceListSaveInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceListSaveInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceListSaveInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceListSaveInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceListSaveInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceListSaveInfoFB#spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrSpaceListSaveInfoFB.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrSpaceListSaveInfoFB#spaces} field. */
        @NativeType("XrSpace *")
        public PointerBuffer spaces() { return XrSpaceListSaveInfoFB.nspaces(address()); }
        /** @return the value of the {@link XrSpaceListSaveInfoFB#location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrSpaceListSaveInfoFB.nlocation(address()); }

        /** Sets the specified value to the {@link XrSpaceListSaveInfoFB#type} field. */
        public XrSpaceListSaveInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceListSaveInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorageBatch#XR_TYPE_SPACE_LIST_SAVE_INFO_FB TYPE_SPACE_LIST_SAVE_INFO_FB} value to the {@link XrSpaceListSaveInfoFB#type} field. */
        public XrSpaceListSaveInfoFB.Buffer type$Default() { return type(FBSpatialEntityStorageBatch.XR_TYPE_SPACE_LIST_SAVE_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceListSaveInfoFB#next} field. */
        public XrSpaceListSaveInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceListSaveInfoFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrSpaceListSaveInfoFB#spaces} field. */
        public XrSpaceListSaveInfoFB.Buffer spaces(@NativeType("XrSpace *") PointerBuffer value) { XrSpaceListSaveInfoFB.nspaces(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceListSaveInfoFB#location} field. */
        public XrSpaceListSaveInfoFB.Buffer location(@NativeType("XrSpaceStorageLocationFB") int value) { XrSpaceListSaveInfoFB.nlocation(address(), value); return this; }

    }

}