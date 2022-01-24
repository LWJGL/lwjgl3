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
 * Describes the information to locate scene components.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneComponentsLocateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>If {@code componentIdCount} is not 0, {@code componentIds} <b>must</b> be a pointer to an array of {@code componentIdCount} {@link XrUuidMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidMSFT}, {@link MSFTSceneUnderstanding#xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneComponentsLocateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 *     uint32_t {@link #componentIdCount};
 *     {@link XrUuidMSFT XrUuidMSFT} const * {@link #componentIds};
 * }</code></pre>
 */
public class XrSceneComponentsLocateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        COMPONENTIDCOUNT,
        COMPONENTIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        COMPONENTIDCOUNT = layout.offsetof(4);
        COMPONENTIDS = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrSceneComponentsLocateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentsLocateInfoMSFT(ByteBuffer container) {
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
    /** an {@code XrSpace} within which the scene components will be located. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** an {@code XrTime} at which to locate the scene components. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** a {@code uint32_t} describing the count of elements in the {@code componentIds} array. */
    @NativeType("uint32_t")
    public int componentIdCount() { return ncomponentIdCount(address()); }
    /** an array of {@link XrUuidMSFT} identifiers for the scene components to location. */
    @Nullable
    @NativeType("XrUuidMSFT const *")
    public XrUuidMSFT.Buffer componentIds() { return ncomponentIds(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneComponentsLocateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneComponentsLocateInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneComponentsLocateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrSceneComponentsLocateInfoMSFT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSceneComponentsLocateInfoMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #componentIdCount} field. */
    public XrSceneComponentsLocateInfoMSFT componentIdCount(@NativeType("uint32_t") int value) { ncomponentIdCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidMSFT.Buffer} to the {@link #componentIds} field. */
    public XrSceneComponentsLocateInfoMSFT componentIds(@Nullable @NativeType("XrUuidMSFT const *") XrUuidMSFT.Buffer value) { ncomponentIds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentsLocateInfoMSFT set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        int componentIdCount,
        @Nullable XrUuidMSFT.Buffer componentIds
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        componentIdCount(componentIdCount);
        componentIds(componentIds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentsLocateInfoMSFT set(XrSceneComponentsLocateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsLocateInfoMSFT malloc() {
        return wrap(XrSceneComponentsLocateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentsLocateInfoMSFT calloc() {
        return wrap(XrSceneComponentsLocateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentsLocateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneComponentsLocateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance for the specified memory address. */
    public static XrSceneComponentsLocateInfoMSFT create(long address) {
        return wrap(XrSceneComponentsLocateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentsLocateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneComponentsLocateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneComponentsLocateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsLocateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneComponentsLocateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneComponentsLocateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentsLocateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneComponentsLocateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentsLocateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentsLocateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentsLocateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentsLocateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSceneComponentsLocateInfoMSFT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrSceneComponentsLocateInfoMSFT.TIME); }
    /** Unsafe version of {@link #componentIdCount}. */
    public static int ncomponentIdCount(long struct) { return UNSAFE.getInt(null, struct + XrSceneComponentsLocateInfoMSFT.COMPONENTIDCOUNT); }
    /** Unsafe version of {@link #componentIds}. */
    @Nullable public static XrUuidMSFT.Buffer ncomponentIds(long struct) { return XrUuidMSFT.createSafe(memGetAddress(struct + XrSceneComponentsLocateInfoMSFT.COMPONENTIDS), ncomponentIdCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentsLocateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentsLocateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSceneComponentsLocateInfoMSFT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrSceneComponentsLocateInfoMSFT.TIME, value); }
    /** Sets the specified value to the {@code componentIdCount} field of the specified {@code struct}. */
    public static void ncomponentIdCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneComponentsLocateInfoMSFT.COMPONENTIDCOUNT, value); }
    /** Unsafe version of {@link #componentIds(XrUuidMSFT.Buffer) componentIds}. */
    public static void ncomponentIds(long struct, @Nullable XrUuidMSFT.Buffer value) { memPutAddress(struct + XrSceneComponentsLocateInfoMSFT.COMPONENTIDS, memAddressSafe(value)); if (value != null) { ncomponentIdCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSceneComponentsLocateInfoMSFT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSceneComponentsLocateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentsLocateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentsLocateInfoMSFT ELEMENT_FACTORY = XrSceneComponentsLocateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentsLocateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentsLocateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneComponentsLocateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneComponentsLocateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentsLocateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneComponentsLocateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneComponentsLocateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneComponentsLocateInfoMSFT#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSceneComponentsLocateInfoMSFT.nbaseSpace(address()); }
        /** @return the value of the {@link XrSceneComponentsLocateInfoMSFT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSceneComponentsLocateInfoMSFT.ntime(address()); }
        /** @return the value of the {@link XrSceneComponentsLocateInfoMSFT#componentIdCount} field. */
        @NativeType("uint32_t")
        public int componentIdCount() { return XrSceneComponentsLocateInfoMSFT.ncomponentIdCount(address()); }
        /** @return a {@link XrUuidMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneComponentsLocateInfoMSFT#componentIds} field. */
        @Nullable
        @NativeType("XrUuidMSFT const *")
        public XrUuidMSFT.Buffer componentIds() { return XrSceneComponentsLocateInfoMSFT.ncomponentIds(address()); }

        /** Sets the specified value to the {@link XrSceneComponentsLocateInfoMSFT#type} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentsLocateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT} value to the {@link XrSceneComponentsLocateInfoMSFT#type} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneComponentsLocateInfoMSFT#next} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneComponentsLocateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneComponentsLocateInfoMSFT#baseSpace} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer baseSpace(XrSpace value) { XrSceneComponentsLocateInfoMSFT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneComponentsLocateInfoMSFT#time} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer time(@NativeType("XrTime") long value) { XrSceneComponentsLocateInfoMSFT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneComponentsLocateInfoMSFT#componentIdCount} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer componentIdCount(@NativeType("uint32_t") int value) { XrSceneComponentsLocateInfoMSFT.ncomponentIdCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidMSFT.Buffer} to the {@link XrSceneComponentsLocateInfoMSFT#componentIds} field. */
        public XrSceneComponentsLocateInfoMSFT.Buffer componentIds(@Nullable @NativeType("XrUuidMSFT const *") XrUuidMSFT.Buffer value) { XrSceneComponentsLocateInfoMSFT.ncomponentIds(address(), value); return this; }

    }

}