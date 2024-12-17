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
 * <pre>{@code
 * struct XrSceneMarkersMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t sceneMarkerCapacityInput;
 *     {@link XrSceneMarkerMSFT XrSceneMarkerMSFT} * sceneMarkers;
 * }}</pre>
 */
public class XrSceneMarkersMSFT extends Struct<XrSceneMarkersMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SCENEMARKERCAPACITYINPUT,
        SCENEMARKERS;

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
        SCENEMARKERCAPACITYINPUT = layout.offsetof(2);
        SCENEMARKERS = layout.offsetof(3);
    }

    protected XrSceneMarkersMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMarkersMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMarkersMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneMarkersMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMarkersMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code sceneMarkerCapacityInput} field. */
    @NativeType("uint32_t")
    public int sceneMarkerCapacityInput() { return nsceneMarkerCapacityInput(address()); }
    /** @return a {@link XrSceneMarkerMSFT.Buffer} view of the struct array pointed to by the {@code sceneMarkers} field. */
    @NativeType("XrSceneMarkerMSFT *")
    public XrSceneMarkerMSFT.@Nullable Buffer sceneMarkers() { return nsceneMarkers(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneMarkersMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT} value to the {@code type} field. */
    public XrSceneMarkersMSFT type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKERS_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneMarkersMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code sceneMarkerCapacityInput} field. */
    public XrSceneMarkersMSFT sceneMarkerCapacityInput(@NativeType("uint32_t") int value) { nsceneMarkerCapacityInput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneMarkerMSFT.Buffer} to the {@code sceneMarkers} field. */
    public XrSceneMarkersMSFT sceneMarkers(@NativeType("XrSceneMarkerMSFT *") XrSceneMarkerMSFT.@Nullable Buffer value) { nsceneMarkers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMarkersMSFT set(
        int type,
        long next,
        int sceneMarkerCapacityInput,
        XrSceneMarkerMSFT.@Nullable Buffer sceneMarkers
    ) {
        type(type);
        next(next);
        sceneMarkerCapacityInput(sceneMarkerCapacityInput);
        sceneMarkers(sceneMarkers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMarkersMSFT set(XrSceneMarkersMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMarkersMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMarkersMSFT malloc() {
        return new XrSceneMarkersMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkersMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMarkersMSFT calloc() {
        return new XrSceneMarkersMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMarkersMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMarkersMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMarkersMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMarkersMSFT} instance for the specified memory address. */
    public static XrSceneMarkersMSFT create(long address) {
        return new XrSceneMarkersMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMarkersMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneMarkersMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneMarkersMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkersMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkersMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMarkersMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMarkersMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMarkersMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkersMSFT malloc(MemoryStack stack) {
        return new XrSceneMarkersMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMarkersMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMarkersMSFT calloc(MemoryStack stack) {
        return new XrSceneMarkersMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMarkersMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMarkersMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMarkersMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMarkersMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMarkersMSFT.NEXT); }
    /** Unsafe version of {@link #sceneMarkerCapacityInput}. */
    public static int nsceneMarkerCapacityInput(long struct) { return memGetInt(struct + XrSceneMarkersMSFT.SCENEMARKERCAPACITYINPUT); }
    /** Unsafe version of {@link #sceneMarkers}. */
    public static XrSceneMarkerMSFT.@Nullable Buffer nsceneMarkers(long struct) { return XrSceneMarkerMSFT.createSafe(memGetAddress(struct + XrSceneMarkersMSFT.SCENEMARKERS), nsceneMarkerCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMarkersMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMarkersMSFT.NEXT, value); }
    /** Sets the specified value to the {@code sceneMarkerCapacityInput} field of the specified {@code struct}. */
    public static void nsceneMarkerCapacityInput(long struct, int value) { memPutInt(struct + XrSceneMarkersMSFT.SCENEMARKERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #sceneMarkers(XrSceneMarkerMSFT.Buffer) sceneMarkers}. */
    public static void nsceneMarkers(long struct, XrSceneMarkerMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneMarkersMSFT.SCENEMARKERS, memAddressSafe(value)); if (value != null) { nsceneMarkerCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneMarkersMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMarkersMSFT, Buffer> implements NativeResource {

        private static final XrSceneMarkersMSFT ELEMENT_FACTORY = XrSceneMarkersMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMarkersMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMarkersMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMarkersMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMarkersMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMarkersMSFT.nnext(address()); }
        /** @return the value of the {@code sceneMarkerCapacityInput} field. */
        @NativeType("uint32_t")
        public int sceneMarkerCapacityInput() { return XrSceneMarkersMSFT.nsceneMarkerCapacityInput(address()); }
        /** @return a {@link XrSceneMarkerMSFT.Buffer} view of the struct array pointed to by the {@code sceneMarkers} field. */
        @NativeType("XrSceneMarkerMSFT *")
        public XrSceneMarkerMSFT.@Nullable Buffer sceneMarkers() { return XrSceneMarkersMSFT.nsceneMarkers(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneMarkersMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMarkersMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT} value to the {@code type} field. */
        public XrSceneMarkersMSFT.Buffer type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKERS_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneMarkersMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneMarkersMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code sceneMarkerCapacityInput} field. */
        public XrSceneMarkersMSFT.Buffer sceneMarkerCapacityInput(@NativeType("uint32_t") int value) { XrSceneMarkersMSFT.nsceneMarkerCapacityInput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneMarkerMSFT.Buffer} to the {@code sceneMarkers} field. */
        public XrSceneMarkersMSFT.Buffer sceneMarkers(@NativeType("XrSceneMarkerMSFT *") XrSceneMarkerMSFT.@Nullable Buffer value) { XrSceneMarkersMSFT.nsceneMarkers(address(), value); return this; }

    }

}