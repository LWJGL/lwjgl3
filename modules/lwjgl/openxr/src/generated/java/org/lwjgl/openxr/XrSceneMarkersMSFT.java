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
 * Provide an array to retrieve scene marker properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>Once the application creates an {@code XrSceneMSFT} after a successful scene compute, it <b>can</b> retrieve the scene markers' properties by chaining {@link XrSceneMarkersMSFT} structure to the next pointer of {@link XrSceneComponentsGetInfoMSFT} when calling {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}.</p>
 * 
 * <p>{@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT} follows the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-buffer-size-parameters">two-call idiom</a> for filling the {@link XrSceneComponentsMSFT} structure to which an {@link XrSceneMarkersMSFT} structure <b>can</b> be chained.</p>
 * 
 * <p>The input {@code sceneMarkerCapacityInput} <b>must</b> be equal to or greater than the corresponding {@link XrSceneComponentsMSFT}::componentCapacityInput, otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}.</p>
 * 
 * <p>The actual count of elements returned in the array {@code sceneMarkers} is consistent with the extended {@link XrSceneComponentsMSFT} structure and returned in {@link XrSceneComponentsMSFT}{@code ::componentCountOutput}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneMarker XR_MSFT_scene_marker} extension <b>must</b> be enabled prior to using {@link XrSceneMarkersMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code sceneMarkerCapacityInput} is not 0, {@code sceneMarkers} <b>must</b> be a pointer to an array of {@code sceneMarkerCapacityInput} {@link XrSceneMarkerMSFT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneMarkerMSFT}, {@link MSFTSceneUnderstanding#xrGetSceneComponentsMSFT GetSceneComponentsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMarkersMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #sceneMarkerCapacityInput};
 *     {@link XrSceneMarkerMSFT XrSceneMarkerMSFT} * {@link #sceneMarkers};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. See also: {@link XrSceneComponentsMSFT}, {@link XrSceneMarkerQRCodesMSFT} */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a {@code uint32_t} indicating the capacity of elements in the {@code sceneMarkers} array. */
    @NativeType("uint32_t")
    public int sceneMarkerCapacityInput() { return nsceneMarkerCapacityInput(address()); }
    /** an array of {@link XrSceneMarkerMSFT} to fill with the properties of the markers. */
    @Nullable
    @NativeType("XrSceneMarkerMSFT *")
    public XrSceneMarkerMSFT.Buffer sceneMarkers() { return nsceneMarkers(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneMarkersMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT} value to the {@link #type} field. */
    public XrSceneMarkersMSFT type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKERS_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneMarkersMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #sceneMarkerCapacityInput} field. */
    public XrSceneMarkersMSFT sceneMarkerCapacityInput(@NativeType("uint32_t") int value) { nsceneMarkerCapacityInput(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneMarkerMSFT.Buffer} to the {@link #sceneMarkers} field. */
    public XrSceneMarkersMSFT sceneMarkers(@Nullable @NativeType("XrSceneMarkerMSFT *") XrSceneMarkerMSFT.Buffer value) { nsceneMarkers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMarkersMSFT set(
        int type,
        long next,
        int sceneMarkerCapacityInput,
        @Nullable XrSceneMarkerMSFT.Buffer sceneMarkers
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
    @Nullable
    public static XrSceneMarkersMSFT createSafe(long address) {
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
    @Nullable
    public static XrSceneMarkersMSFT.Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneMarkersMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMarkersMSFT.NEXT); }
    /** Unsafe version of {@link #sceneMarkerCapacityInput}. */
    public static int nsceneMarkerCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSceneMarkersMSFT.SCENEMARKERCAPACITYINPUT); }
    /** Unsafe version of {@link #sceneMarkers}. */
    @Nullable public static XrSceneMarkerMSFT.Buffer nsceneMarkers(long struct) { return XrSceneMarkerMSFT.createSafe(memGetAddress(struct + XrSceneMarkersMSFT.SCENEMARKERS), nsceneMarkerCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMarkersMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMarkersMSFT.NEXT, value); }
    /** Sets the specified value to the {@code sceneMarkerCapacityInput} field of the specified {@code struct}. */
    public static void nsceneMarkerCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMarkersMSFT.SCENEMARKERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #sceneMarkers(XrSceneMarkerMSFT.Buffer) sceneMarkers}. */
    public static void nsceneMarkers(long struct, @Nullable XrSceneMarkerMSFT.Buffer value) { memPutAddress(struct + XrSceneMarkersMSFT.SCENEMARKERS, memAddressSafe(value)); if (value != null) { nsceneMarkerCapacityInput(struct, value.remaining()); } }

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
        protected XrSceneMarkersMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMarkersMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMarkersMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneMarkersMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMarkersMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneMarkersMSFT#sceneMarkerCapacityInput} field. */
        @NativeType("uint32_t")
        public int sceneMarkerCapacityInput() { return XrSceneMarkersMSFT.nsceneMarkerCapacityInput(address()); }
        /** @return a {@link XrSceneMarkerMSFT.Buffer} view of the struct array pointed to by the {@link XrSceneMarkersMSFT#sceneMarkers} field. */
        @Nullable
        @NativeType("XrSceneMarkerMSFT *")
        public XrSceneMarkerMSFT.Buffer sceneMarkers() { return XrSceneMarkersMSFT.nsceneMarkers(address()); }

        /** Sets the specified value to the {@link XrSceneMarkersMSFT#type} field. */
        public XrSceneMarkersMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMarkersMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneMarker#XR_TYPE_SCENE_MARKERS_MSFT TYPE_SCENE_MARKERS_MSFT} value to the {@link XrSceneMarkersMSFT#type} field. */
        public XrSceneMarkersMSFT.Buffer type$Default() { return type(MSFTSceneMarker.XR_TYPE_SCENE_MARKERS_MSFT); }
        /** Sets the specified value to the {@link XrSceneMarkersMSFT#next} field. */
        public XrSceneMarkersMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneMarkersMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMarkersMSFT#sceneMarkerCapacityInput} field. */
        public XrSceneMarkersMSFT.Buffer sceneMarkerCapacityInput(@NativeType("uint32_t") int value) { XrSceneMarkersMSFT.nsceneMarkerCapacityInput(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneMarkerMSFT.Buffer} to the {@link XrSceneMarkersMSFT#sceneMarkers} field. */
        public XrSceneMarkersMSFT.Buffer sceneMarkers(@Nullable @NativeType("XrSceneMarkerMSFT *") XrSceneMarkerMSFT.Buffer value) { XrSceneMarkersMSFT.nsceneMarkers(address(), value); return this; }

    }

}