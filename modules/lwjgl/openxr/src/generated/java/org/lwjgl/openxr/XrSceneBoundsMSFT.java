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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The scene bounds.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneBoundsMSFT}</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>If {@code sphereCount} is not 0, {@code spheres} <b>must</b> be a pointer to an array of {@code sphereCount} {@link XrSceneSphereBoundMSFT} structures</li>
 * <li>If {@code boxCount} is not 0, {@code boxes} <b>must</b> be a pointer to an array of {@code boxCount} {@link XrSceneOrientedBoxBoundMSFT} structures</li>
 * <li>If {@code frustumCount} is not 0, {@code frustums} <b>must</b> be a pointer to an array of {@code frustumCount} {@link XrSceneFrustumBoundMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrNewSceneComputeInfoMSFT}, {@link XrSceneFrustumBoundMSFT}, {@link XrSceneOrientedBoxBoundMSFT}, {@link XrSceneSphereBoundMSFT}, {@link MSFTSceneUnderstanding#xrComputeNewSceneMSFT ComputeNewSceneMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneBoundsMSFT {
 *     XrSpace {@link #space};
 *     XrTime {@link #time};
 *     uint32_t {@link #sphereCount};
 *     {@link XrSceneSphereBoundMSFT XrSceneSphereBoundMSFT} const * {@link #spheres};
 *     uint32_t {@link #boxCount};
 *     {@link XrSceneOrientedBoxBoundMSFT XrSceneOrientedBoxBoundMSFT} const * {@link #boxes};
 *     uint32_t {@link #frustumCount};
 *     {@link XrSceneFrustumBoundMSFT XrSceneFrustumBoundMSFT} const * {@link #frustums};
 * }</code></pre>
 */
public class XrSceneBoundsMSFT extends Struct<XrSceneBoundsMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SPACE,
        TIME,
        SPHERECOUNT,
        SPHERES,
        BOXCOUNT,
        BOXES,
        FRUSTUMCOUNT,
        FRUSTUMS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SPACE = layout.offsetof(0);
        TIME = layout.offsetof(1);
        SPHERECOUNT = layout.offsetof(2);
        SPHERES = layout.offsetof(3);
        BOXCOUNT = layout.offsetof(4);
        BOXES = layout.offsetof(5);
        FRUSTUMCOUNT = layout.offsetof(6);
        FRUSTUMS = layout.offsetof(7);
    }

    protected XrSceneBoundsMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneBoundsMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneBoundsMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneBoundsMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneBoundsMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a handle to the {@code XrSpace} in which the bounds are specified. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the {@code XrTime} at which the bounds will be evaluated within {@code space}. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** the number of sphere bounds. */
    @NativeType("uint32_t")
    public int sphereCount() { return nsphereCount(address()); }
    /** an array of {@link XrSceneSphereBoundMSFT}. */
    @NativeType("XrSceneSphereBoundMSFT const *")
    public XrSceneSphereBoundMSFT.@Nullable Buffer spheres() { return nspheres(address()); }
    /** the number of oriented box bounds. */
    @NativeType("uint32_t")
    public int boxCount() { return nboxCount(address()); }
    /** an array of {@link XrSceneOrientedBoxBoundMSFT}. */
    @NativeType("XrSceneOrientedBoxBoundMSFT const *")
    public XrSceneOrientedBoxBoundMSFT.@Nullable Buffer boxes() { return nboxes(address()); }
    /** the number of frustum bounds. */
    @NativeType("uint32_t")
    public int frustumCount() { return nfrustumCount(address()); }
    /** an array of {@link XrSceneFrustumBoundMSFT}. */
    @NativeType("XrSceneFrustumBoundMSFT const *")
    public XrSceneFrustumBoundMSFT.@Nullable Buffer frustums() { return nfrustums(address()); }

    /** Sets the specified value to the {@link #space} field. */
    public XrSceneBoundsMSFT space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrSceneBoundsMSFT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #sphereCount} field. */
    public XrSceneBoundsMSFT sphereCount(@NativeType("uint32_t") int value) { nsphereCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneSphereBoundMSFT.Buffer} to the {@link #spheres} field. */
    public XrSceneBoundsMSFT spheres(@NativeType("XrSceneSphereBoundMSFT const *") XrSceneSphereBoundMSFT.@Nullable Buffer value) { nspheres(address(), value); return this; }
    /** Sets the specified value to the {@link #boxCount} field. */
    public XrSceneBoundsMSFT boxCount(@NativeType("uint32_t") int value) { nboxCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneOrientedBoxBoundMSFT.Buffer} to the {@link #boxes} field. */
    public XrSceneBoundsMSFT boxes(@NativeType("XrSceneOrientedBoxBoundMSFT const *") XrSceneOrientedBoxBoundMSFT.@Nullable Buffer value) { nboxes(address(), value); return this; }
    /** Sets the specified value to the {@link #frustumCount} field. */
    public XrSceneBoundsMSFT frustumCount(@NativeType("uint32_t") int value) { nfrustumCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneFrustumBoundMSFT.Buffer} to the {@link #frustums} field. */
    public XrSceneBoundsMSFT frustums(@NativeType("XrSceneFrustumBoundMSFT const *") XrSceneFrustumBoundMSFT.@Nullable Buffer value) { nfrustums(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneBoundsMSFT set(
        XrSpace space,
        long time,
        int sphereCount,
        XrSceneSphereBoundMSFT.@Nullable Buffer spheres,
        int boxCount,
        XrSceneOrientedBoxBoundMSFT.@Nullable Buffer boxes,
        int frustumCount,
        XrSceneFrustumBoundMSFT.@Nullable Buffer frustums
    ) {
        space(space);
        time(time);
        sphereCount(sphereCount);
        spheres(spheres);
        boxCount(boxCount);
        boxes(boxes);
        frustumCount(frustumCount);
        frustums(frustums);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneBoundsMSFT set(XrSceneBoundsMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneBoundsMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneBoundsMSFT malloc() {
        return new XrSceneBoundsMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneBoundsMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneBoundsMSFT calloc() {
        return new XrSceneBoundsMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneBoundsMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneBoundsMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneBoundsMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneBoundsMSFT} instance for the specified memory address. */
    public static XrSceneBoundsMSFT create(long address) {
        return new XrSceneBoundsMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneBoundsMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneBoundsMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneBoundsMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneBoundsMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneBoundsMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneBoundsMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneBoundsMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneBoundsMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneBoundsMSFT malloc(MemoryStack stack) {
        return new XrSceneBoundsMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneBoundsMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneBoundsMSFT calloc(MemoryStack stack) {
        return new XrSceneBoundsMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneBoundsMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneBoundsMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneBoundsMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSceneBoundsMSFT.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSceneBoundsMSFT.TIME); }
    /** Unsafe version of {@link #sphereCount}. */
    public static int nsphereCount(long struct) { return memGetInt(struct + XrSceneBoundsMSFT.SPHERECOUNT); }
    /** Unsafe version of {@link #spheres}. */
    public static XrSceneSphereBoundMSFT.@Nullable Buffer nspheres(long struct) { return XrSceneSphereBoundMSFT.createSafe(memGetAddress(struct + XrSceneBoundsMSFT.SPHERES), nsphereCount(struct)); }
    /** Unsafe version of {@link #boxCount}. */
    public static int nboxCount(long struct) { return memGetInt(struct + XrSceneBoundsMSFT.BOXCOUNT); }
    /** Unsafe version of {@link #boxes}. */
    public static XrSceneOrientedBoxBoundMSFT.@Nullable Buffer nboxes(long struct) { return XrSceneOrientedBoxBoundMSFT.createSafe(memGetAddress(struct + XrSceneBoundsMSFT.BOXES), nboxCount(struct)); }
    /** Unsafe version of {@link #frustumCount}. */
    public static int nfrustumCount(long struct) { return memGetInt(struct + XrSceneBoundsMSFT.FRUSTUMCOUNT); }
    /** Unsafe version of {@link #frustums}. */
    public static XrSceneFrustumBoundMSFT.@Nullable Buffer nfrustums(long struct) { return XrSceneFrustumBoundMSFT.createSafe(memGetAddress(struct + XrSceneBoundsMSFT.FRUSTUMS), nfrustumCount(struct)); }

    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSceneBoundsMSFT.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSceneBoundsMSFT.TIME, value); }
    /** Sets the specified value to the {@code sphereCount} field of the specified {@code struct}. */
    public static void nsphereCount(long struct, int value) { memPutInt(struct + XrSceneBoundsMSFT.SPHERECOUNT, value); }
    /** Unsafe version of {@link #spheres(XrSceneSphereBoundMSFT.Buffer) spheres}. */
    public static void nspheres(long struct, XrSceneSphereBoundMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneBoundsMSFT.SPHERES, memAddressSafe(value)); if (value != null) { nsphereCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code boxCount} field of the specified {@code struct}. */
    public static void nboxCount(long struct, int value) { memPutInt(struct + XrSceneBoundsMSFT.BOXCOUNT, value); }
    /** Unsafe version of {@link #boxes(XrSceneOrientedBoxBoundMSFT.Buffer) boxes}. */
    public static void nboxes(long struct, XrSceneOrientedBoxBoundMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneBoundsMSFT.BOXES, memAddressSafe(value)); if (value != null) { nboxCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code frustumCount} field of the specified {@code struct}. */
    public static void nfrustumCount(long struct, int value) { memPutInt(struct + XrSceneBoundsMSFT.FRUSTUMCOUNT, value); }
    /** Unsafe version of {@link #frustums(XrSceneFrustumBoundMSFT.Buffer) frustums}. */
    public static void nfrustums(long struct, XrSceneFrustumBoundMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneBoundsMSFT.FRUSTUMS, memAddressSafe(value)); if (value != null) { nfrustumCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSceneBoundsMSFT.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSceneBoundsMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneBoundsMSFT, Buffer> implements NativeResource {

        private static final XrSceneBoundsMSFT ELEMENT_FACTORY = XrSceneBoundsMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneBoundsMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneBoundsMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneBoundsMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneBoundsMSFT#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSceneBoundsMSFT.nspace(address()); }
        /** @return the value of the {@link XrSceneBoundsMSFT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrSceneBoundsMSFT.ntime(address()); }
        /** @return the value of the {@link XrSceneBoundsMSFT#sphereCount} field. */
        @NativeType("uint32_t")
        public int sphereCount() { return XrSceneBoundsMSFT.nsphereCount(address()); }
        /** @return a {@link XrSceneSphereBoundMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneBoundsMSFT#spheres} field. */
        @NativeType("XrSceneSphereBoundMSFT const *")
        public XrSceneSphereBoundMSFT.@Nullable Buffer spheres() { return XrSceneBoundsMSFT.nspheres(address()); }
        /** @return the value of the {@link XrSceneBoundsMSFT#boxCount} field. */
        @NativeType("uint32_t")
        public int boxCount() { return XrSceneBoundsMSFT.nboxCount(address()); }
        /** @return a {@link XrSceneOrientedBoxBoundMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneBoundsMSFT#boxes} field. */
        @NativeType("XrSceneOrientedBoxBoundMSFT const *")
        public XrSceneOrientedBoxBoundMSFT.@Nullable Buffer boxes() { return XrSceneBoundsMSFT.nboxes(address()); }
        /** @return the value of the {@link XrSceneBoundsMSFT#frustumCount} field. */
        @NativeType("uint32_t")
        public int frustumCount() { return XrSceneBoundsMSFT.nfrustumCount(address()); }
        /** @return a {@link XrSceneFrustumBoundMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneBoundsMSFT#frustums} field. */
        @NativeType("XrSceneFrustumBoundMSFT const *")
        public XrSceneFrustumBoundMSFT.@Nullable Buffer frustums() { return XrSceneBoundsMSFT.nfrustums(address()); }

        /** Sets the specified value to the {@link XrSceneBoundsMSFT#space} field. */
        public XrSceneBoundsMSFT.Buffer space(XrSpace value) { XrSceneBoundsMSFT.nspace(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneBoundsMSFT#time} field. */
        public XrSceneBoundsMSFT.Buffer time(@NativeType("XrTime") long value) { XrSceneBoundsMSFT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneBoundsMSFT#sphereCount} field. */
        public XrSceneBoundsMSFT.Buffer sphereCount(@NativeType("uint32_t") int value) { XrSceneBoundsMSFT.nsphereCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneSphereBoundMSFT.Buffer} to the {@link XrSceneBoundsMSFT#spheres} field. */
        public XrSceneBoundsMSFT.Buffer spheres(@NativeType("XrSceneSphereBoundMSFT const *") XrSceneSphereBoundMSFT.@Nullable Buffer value) { XrSceneBoundsMSFT.nspheres(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneBoundsMSFT#boxCount} field. */
        public XrSceneBoundsMSFT.Buffer boxCount(@NativeType("uint32_t") int value) { XrSceneBoundsMSFT.nboxCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneOrientedBoxBoundMSFT.Buffer} to the {@link XrSceneBoundsMSFT#boxes} field. */
        public XrSceneBoundsMSFT.Buffer boxes(@NativeType("XrSceneOrientedBoxBoundMSFT const *") XrSceneOrientedBoxBoundMSFT.@Nullable Buffer value) { XrSceneBoundsMSFT.nboxes(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneBoundsMSFT#frustumCount} field. */
        public XrSceneBoundsMSFT.Buffer frustumCount(@NativeType("uint32_t") int value) { XrSceneBoundsMSFT.nfrustumCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneFrustumBoundMSFT.Buffer} to the {@link XrSceneBoundsMSFT#frustums} field. */
        public XrSceneBoundsMSFT.Buffer frustums(@NativeType("XrSceneFrustumBoundMSFT const *") XrSceneFrustumBoundMSFT.@Nullable Buffer value) { XrSceneBoundsMSFT.nfrustums(address(), value); return this; }

    }

}