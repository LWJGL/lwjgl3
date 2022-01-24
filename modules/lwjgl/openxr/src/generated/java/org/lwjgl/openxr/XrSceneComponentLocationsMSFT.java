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
 * Returns the scene component locations.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentLocationsMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code locationCount} is not 0, {@code locations} <b>must</b> be a pointer to an array of {@code locationCount} {@link XrSceneComponentLocationMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneComponentLocationMSFT}, {@link MSFTSceneUnderstanding#xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentLocationsMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #locationCount};
 *     {@link XrSceneComponentLocationMSFT XrSceneComponentLocationMSFT} * {@link #locations};
 * }</code></pre>
 */
public class XrSceneComponentLocationsMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONCOUNT,
        LOCATIONS;

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
        LOCATIONCOUNT = layout.offsetof(2);
        LOCATIONS = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSceneComponentLocationsMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentLocationsMSFT(ByteBuffer container) {
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
    /** a {@code uint32_t} describing the count of elements in the {@code locations} array. */
    @NativeType("uint32_t")
    public int locationCount() { return nlocationCount(address()); }
    /** an array of {@link XrSceneComponentLocationMSFT} scene component locations. */
    @Nullable
    @NativeType("XrSceneComponentLocationMSFT *")
    public XrSceneComponentLocationMSFT.Buffer locations() { return nlocations(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneComponentLocationsMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT} value to the {@link #type} field. */
    public XrSceneComponentLocationsMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneComponentLocationsMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #locationCount} field. */
    public XrSceneComponentLocationsMSFT locationCount(@NativeType("uint32_t") int value) { nlocationCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneComponentLocationMSFT.Buffer} to the {@link #locations} field. */
    public XrSceneComponentLocationsMSFT locations(@Nullable @NativeType("XrSceneComponentLocationMSFT *") XrSceneComponentLocationMSFT.Buffer value) { nlocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentLocationsMSFT set(
        int type,
        long next,
        int locationCount,
        @Nullable XrSceneComponentLocationMSFT.Buffer locations
    ) {
        type(type);
        next(next);
        locationCount(locationCount);
        locations(locations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentLocationsMSFT set(XrSceneComponentLocationsMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationsMSFT malloc() {
        return wrap(XrSceneComponentLocationsMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationsMSFT calloc() {
        return wrap(XrSceneComponentLocationsMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentLocationsMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentLocationsMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance for the specified memory address. */
    public static XrSceneComponentLocationsMSFT create(long address) {
        return wrap(XrSceneComponentLocationsMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentLocationsMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentLocationsMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentLocationsMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentLocationsMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationsMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentLocationsMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationsMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentLocationsMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentLocationsMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentLocationsMSFT.NEXT); }
    /** Unsafe version of {@link #locationCount}. */
    public static int nlocationCount(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentLocationsMSFT.LOCATIONCOUNT); }
    /** Unsafe version of {@link #locations}. */
    @Nullable public static XrSceneComponentLocationMSFT.Buffer nlocations(long struct) { return XrSceneComponentLocationMSFT.createSafe(memGetAddress(struct + XrSceneComponentLocationsMSFT.LOCATIONS), nlocationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentLocationsMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentLocationsMSFT.NEXT, value); }
    /** Sets the specified value to the {@code locationCount} field of the specified {@code struct}. */
    public static void nlocationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentLocationsMSFT.LOCATIONCOUNT, value); }
    /** Unsafe version of {@link #locations(XrSceneComponentLocationMSFT.Buffer) locations}. */
    public static void nlocations(long struct, @Nullable XrSceneComponentLocationMSFT.Buffer value) { memPutAddress(struct + XrSceneComponentLocationsMSFT.LOCATIONS, memAddressSafe(value)); if (value != null) { nlocationCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneComponentLocationsMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentLocationsMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentLocationsMSFT ELEMENT_FACTORY = XrSceneComponentLocationsMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentLocationsMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentLocationsMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentLocationsMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentLocationsMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentLocationsMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneComponentLocationsMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSceneComponentLocationsMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneComponentLocationsMSFT#locationCount} field. */
        @NativeType("uint32_t")
        public int locationCount() { return XrSceneComponentLocationsMSFT.nlocationCount(address()); }
        /** @return a {@link XrSceneComponentLocationMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneComponentLocationsMSFT#locations} field. */
        @Nullable
        @NativeType("XrSceneComponentLocationMSFT *")
        public XrSceneComponentLocationMSFT.Buffer locations() { return XrSceneComponentLocationsMSFT.nlocations(address()); }

        /** Sets the specified value to the {@link XrSceneComponentLocationsMSFT#type} field. */
        public XrSceneComponentLocationsMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentLocationsMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT} value to the {@link XrSceneComponentLocationsMSFT#type} field. */
        public XrSceneComponentLocationsMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT); }
        /** Sets the specified value to the {@link XrSceneComponentLocationsMSFT#next} field. */
        public XrSceneComponentLocationsMSFT.Buffer next(@NativeType("void *") long value) { XrSceneComponentLocationsMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneComponentLocationsMSFT#locationCount} field. */
        public XrSceneComponentLocationsMSFT.Buffer locationCount(@NativeType("uint32_t") int value) { XrSceneComponentLocationsMSFT.nlocationCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneComponentLocationMSFT.Buffer} to the {@link XrSceneComponentLocationsMSFT#locations} field. */
        public XrSceneComponentLocationsMSFT.Buffer locations(@Nullable @NativeType("XrSceneComponentLocationMSFT *") XrSceneComponentLocationMSFT.Buffer value) { XrSceneComponentLocationsMSFT.nlocations(address(), value); return this; }

    }

}