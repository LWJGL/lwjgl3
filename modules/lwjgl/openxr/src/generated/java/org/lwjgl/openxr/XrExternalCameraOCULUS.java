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

import static org.lwjgl.openxr.OCULUSExternalCamera.*;

/**
 * Camera intrintics state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using {@link XrExternalCameraOCULUS}</li>
 * <li>{@code type} <b>must</b> be {@link OCULUSExternalCamera#XR_TYPE_EXTERNAL_CAMERA_OCULUS TYPE_EXTERNAL_CAMERA_OCULUS}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExternalCameraExtrinsicsOCULUS}, {@link XrExternalCameraIntrinsicsOCULUS}, {@link OCULUSExternalCamera#xrEnumerateExternalCamerasOCULUS EnumerateExternalCamerasOCULUS}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExternalCameraOCULUS {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     char {@link #name}[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS];
 *     {@link XrExternalCameraIntrinsicsOCULUS XrExternalCameraIntrinsicsOCULUS} {@link #intrinsics};
 *     {@link XrExternalCameraExtrinsicsOCULUS XrExternalCameraExtrinsicsOCULUS} {@link #extrinsics};
 * }</code></pre>
 */
public class XrExternalCameraOCULUS extends Struct<XrExternalCameraOCULUS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NAME,
        INTRINSICS,
        EXTRINSICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS),
            __member(XrExternalCameraIntrinsicsOCULUS.SIZEOF, XrExternalCameraIntrinsicsOCULUS.ALIGNOF),
            __member(XrExternalCameraExtrinsicsOCULUS.SIZEOF, XrExternalCameraExtrinsicsOCULUS.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        INTRINSICS = layout.offsetof(3);
        EXTRINSICS = layout.offsetof(4);
    }

    protected XrExternalCameraOCULUS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExternalCameraOCULUS create(long address, @Nullable ByteBuffer container) {
        return new XrExternalCameraOCULUS(address, container);
    }

    /**
     * Creates a {@code XrExternalCameraOCULUS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExternalCameraOCULUS(ByteBuffer container) {
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
    /** a null-terminated UTF-8 string containing a camera identifier: VID (vendor ID), PID (product ID), and serial number */
    @NativeType("char[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS]")
    public ByteBuffer name() { return nname(address()); }
    /** a null-terminated UTF-8 string containing a camera identifier: VID (vendor ID), PID (product ID), and serial number */
    @NativeType("char[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS]")
    public String nameString() { return nnameString(address()); }
    /** the {@link XrExternalCameraIntrinsicsOCULUS} for the camera */
    public XrExternalCameraIntrinsicsOCULUS intrinsics() { return nintrinsics(address()); }
    /** the {@link XrExternalCameraExtrinsicsOCULUS} for the camera */
    public XrExternalCameraExtrinsicsOCULUS extrinsics() { return nextrinsics(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrExternalCameraOCULUS type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link OCULUSExternalCamera#XR_TYPE_EXTERNAL_CAMERA_OCULUS TYPE_EXTERNAL_CAMERA_OCULUS} value to the {@link #type} field. */
    public XrExternalCameraOCULUS type$Default() { return type(OCULUSExternalCamera.XR_TYPE_EXTERNAL_CAMERA_OCULUS); }
    /** Sets the specified value to the {@link #next} field. */
    public XrExternalCameraOCULUS next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExternalCameraOCULUS set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExternalCameraOCULUS set(XrExternalCameraOCULUS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExternalCameraOCULUS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExternalCameraOCULUS malloc() {
        return new XrExternalCameraOCULUS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraOCULUS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExternalCameraOCULUS calloc() {
        return new XrExternalCameraOCULUS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraOCULUS} instance allocated with {@link BufferUtils}. */
    public static XrExternalCameraOCULUS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExternalCameraOCULUS(memAddress(container), container);
    }

    /** Returns a new {@code XrExternalCameraOCULUS} instance for the specified memory address. */
    public static XrExternalCameraOCULUS create(long address) {
        return new XrExternalCameraOCULUS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraOCULUS createSafe(long address) {
        return address == NULL ? null : new XrExternalCameraOCULUS(address, null);
    }

    /**
     * Returns a new {@link XrExternalCameraOCULUS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraOCULUS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraOCULUS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExternalCameraOCULUS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraOCULUS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExternalCameraOCULUS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraOCULUS malloc(MemoryStack stack) {
        return new XrExternalCameraOCULUS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExternalCameraOCULUS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraOCULUS calloc(MemoryStack stack) {
        return new XrExternalCameraOCULUS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExternalCameraOCULUS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraOCULUS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraOCULUS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrExternalCameraOCULUS.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrExternalCameraOCULUS.NEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + XrExternalCameraOCULUS.NAME, XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + XrExternalCameraOCULUS.NAME); }
    /** Unsafe version of {@link #intrinsics}. */
    public static XrExternalCameraIntrinsicsOCULUS nintrinsics(long struct) { return XrExternalCameraIntrinsicsOCULUS.create(struct + XrExternalCameraOCULUS.INTRINSICS); }
    /** Unsafe version of {@link #extrinsics}. */
    public static XrExternalCameraExtrinsicsOCULUS nextrinsics(long struct) { return XrExternalCameraExtrinsicsOCULUS.create(struct + XrExternalCameraOCULUS.EXTRINSICS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrExternalCameraOCULUS.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrExternalCameraOCULUS.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrExternalCameraOCULUS} structs. */
    public static class Buffer extends StructBuffer<XrExternalCameraOCULUS, Buffer> implements NativeResource {

        private static final XrExternalCameraOCULUS ELEMENT_FACTORY = XrExternalCameraOCULUS.create(-1L);

        /**
         * Creates a new {@code XrExternalCameraOCULUS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExternalCameraOCULUS#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExternalCameraOCULUS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExternalCameraOCULUS#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrExternalCameraOCULUS.ntype(address()); }
        /** @return the value of the {@link XrExternalCameraOCULUS#next} field. */
        @NativeType("void const *")
        public long next() { return XrExternalCameraOCULUS.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrExternalCameraOCULUS#name} field. */
        @NativeType("char[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS]")
        public ByteBuffer name() { return XrExternalCameraOCULUS.nname(address()); }
        /** @return the null-terminated string stored in the {@link XrExternalCameraOCULUS#name} field. */
        @NativeType("char[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS]")
        public String nameString() { return XrExternalCameraOCULUS.nnameString(address()); }
        /** @return a {@link XrExternalCameraIntrinsicsOCULUS} view of the {@link XrExternalCameraOCULUS#intrinsics} field. */
        public XrExternalCameraIntrinsicsOCULUS intrinsics() { return XrExternalCameraOCULUS.nintrinsics(address()); }
        /** @return a {@link XrExternalCameraExtrinsicsOCULUS} view of the {@link XrExternalCameraOCULUS#extrinsics} field. */
        public XrExternalCameraExtrinsicsOCULUS extrinsics() { return XrExternalCameraOCULUS.nextrinsics(address()); }

        /** Sets the specified value to the {@link XrExternalCameraOCULUS#type} field. */
        public XrExternalCameraOCULUS.Buffer type(@NativeType("XrStructureType") int value) { XrExternalCameraOCULUS.ntype(address(), value); return this; }
        /** Sets the {@link OCULUSExternalCamera#XR_TYPE_EXTERNAL_CAMERA_OCULUS TYPE_EXTERNAL_CAMERA_OCULUS} value to the {@link XrExternalCameraOCULUS#type} field. */
        public XrExternalCameraOCULUS.Buffer type$Default() { return type(OCULUSExternalCamera.XR_TYPE_EXTERNAL_CAMERA_OCULUS); }
        /** Sets the specified value to the {@link XrExternalCameraOCULUS#next} field. */
        public XrExternalCameraOCULUS.Buffer next(@NativeType("void const *") long value) { XrExternalCameraOCULUS.nnext(address(), value); return this; }

    }

}