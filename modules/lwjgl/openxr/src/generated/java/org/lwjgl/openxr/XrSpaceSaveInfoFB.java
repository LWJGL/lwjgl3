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
 * Parameters for a save operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceSaveInfoFB} structure contains information used to save the spatial entity.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to using {@link XrSpaceSaveInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityStorage#XR_TYPE_SPACE_SAVE_INFO_FB TYPE_SPACE_SAVE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code location} <b>must</b> be a valid {@code XrSpaceStorageLocationFB} value</li>
 * <li>{@code persistenceMode} <b>must</b> be a valid {@code XrSpacePersistenceModeFB} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntityStorage#xrSaveSpaceFB SaveSpaceFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceSaveInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     XrSpaceStorageLocationFB {@link #location};
 *     XrSpacePersistenceModeFB {@link #persistenceMode};
 * }</code></pre>
 */
public class XrSpaceSaveInfoFB extends Struct<XrSpaceSaveInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        LOCATION,
        PERSISTENCEMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        LOCATION = layout.offsetof(3);
        PERSISTENCEMODE = layout.offsetof(4);
    }

    protected XrSpaceSaveInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceSaveInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceSaveInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceSaveInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceSaveInfoFB(ByteBuffer container) {
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
    /** the {@code XrSpace} handle to the reference space that defines the {@code poseInSpace} of the entity to be saved. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the storage location. */
    @NativeType("XrSpaceStorageLocationFB")
    public int location() { return nlocation(address()); }
    /** the persistence mode. */
    @NativeType("XrSpacePersistenceModeFB")
    public int persistenceMode() { return npersistenceMode(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceSaveInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_SPACE_SAVE_INFO_FB TYPE_SPACE_SAVE_INFO_FB} value to the {@link #type} field. */
    public XrSpaceSaveInfoFB type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_SPACE_SAVE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceSaveInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrSpaceSaveInfoFB space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@link #location} field. */
    public XrSpaceSaveInfoFB location(@NativeType("XrSpaceStorageLocationFB") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@link #persistenceMode} field. */
    public XrSpaceSaveInfoFB persistenceMode(@NativeType("XrSpacePersistenceModeFB") int value) { npersistenceMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceSaveInfoFB set(
        int type,
        long next,
        XrSpace space,
        int location,
        int persistenceMode
    ) {
        type(type);
        next(next);
        space(space);
        location(location);
        persistenceMode(persistenceMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceSaveInfoFB set(XrSpaceSaveInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceSaveInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceSaveInfoFB malloc() {
        return new XrSpaceSaveInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceSaveInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceSaveInfoFB calloc() {
        return new XrSpaceSaveInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceSaveInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceSaveInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceSaveInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceSaveInfoFB} instance for the specified memory address. */
    public static XrSpaceSaveInfoFB create(long address) {
        return new XrSpaceSaveInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceSaveInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceSaveInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceSaveInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceSaveInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceSaveInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceSaveInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceSaveInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceSaveInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceSaveInfoFB malloc(MemoryStack stack) {
        return new XrSpaceSaveInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceSaveInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceSaveInfoFB calloc(MemoryStack stack) {
        return new XrSpaceSaveInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceSaveInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceSaveInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceSaveInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceSaveInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceSaveInfoFB.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpaceSaveInfoFB.SPACE); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + XrSpaceSaveInfoFB.LOCATION); }
    /** Unsafe version of {@link #persistenceMode}. */
    public static int npersistenceMode(long struct) { return UNSAFE.getInt(null, struct + XrSpaceSaveInfoFB.PERSISTENCEMODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceSaveInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceSaveInfoFB.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpaceSaveInfoFB.SPACE, value.address()); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceSaveInfoFB.LOCATION, value); }
    /** Unsafe version of {@link #persistenceMode(int) persistenceMode}. */
    public static void npersistenceMode(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceSaveInfoFB.PERSISTENCEMODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceSaveInfoFB.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceSaveInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceSaveInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceSaveInfoFB ELEMENT_FACTORY = XrSpaceSaveInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceSaveInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceSaveInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceSaveInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceSaveInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceSaveInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceSaveInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceSaveInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceSaveInfoFB#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpaceSaveInfoFB.nspace(address()); }
        /** @return the value of the {@link XrSpaceSaveInfoFB#location} field. */
        @NativeType("XrSpaceStorageLocationFB")
        public int location() { return XrSpaceSaveInfoFB.nlocation(address()); }
        /** @return the value of the {@link XrSpaceSaveInfoFB#persistenceMode} field. */
        @NativeType("XrSpacePersistenceModeFB")
        public int persistenceMode() { return XrSpaceSaveInfoFB.npersistenceMode(address()); }

        /** Sets the specified value to the {@link XrSpaceSaveInfoFB#type} field. */
        public XrSpaceSaveInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceSaveInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityStorage#XR_TYPE_SPACE_SAVE_INFO_FB TYPE_SPACE_SAVE_INFO_FB} value to the {@link XrSpaceSaveInfoFB#type} field. */
        public XrSpaceSaveInfoFB.Buffer type$Default() { return type(FBSpatialEntityStorage.XR_TYPE_SPACE_SAVE_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceSaveInfoFB#next} field. */
        public XrSpaceSaveInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceSaveInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceSaveInfoFB#space} field. */
        public XrSpaceSaveInfoFB.Buffer space(XrSpace value) { XrSpaceSaveInfoFB.nspace(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceSaveInfoFB#location} field. */
        public XrSpaceSaveInfoFB.Buffer location(@NativeType("XrSpaceStorageLocationFB") int value) { XrSpaceSaveInfoFB.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceSaveInfoFB#persistenceMode} field. */
        public XrSpaceSaveInfoFB.Buffer persistenceMode(@NativeType("XrSpacePersistenceModeFB") int value) { XrSpaceSaveInfoFB.npersistenceMode(address(), value); return this; }

    }

}