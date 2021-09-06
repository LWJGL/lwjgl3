/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
 * 
 * <pre><code>
 * { UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }</code></pre>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrFovPort {
 *     float {@link #UpTan};
 *     float {@link #DownTan};
 *     float {@link #LeftTan};
 *     float {@link #RightTan};
 * }</code></pre>
 */
@NativeType("struct ovrFovPort")
public class OVRFovPort extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UPTAN,
        DOWNTAN,
        LEFTTAN,
        RIGHTTAN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UPTAN = layout.offsetof(0);
        DOWNTAN = layout.offsetof(1);
        LEFTTAN = layout.offsetof(2);
        RIGHTTAN = layout.offsetof(3);
    }

    /**
     * Creates a {@code OVRFovPort} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRFovPort(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** tangent of the angle between the viewing vector and top edge of the FOV */
    public float UpTan() { return nUpTan(address()); }
    /** tangent of the angle between the viewing vector and bottom edge of the FOV */
    public float DownTan() { return nDownTan(address()); }
    /** tangent of the angle between the viewing vector and left edge of the FOV */
    public float LeftTan() { return nLeftTan(address()); }
    /** tangent of the angle between the viewing vector and right edge of the FOV */
    public float RightTan() { return nRightTan(address()); }

    /** Sets the specified value to the {@link #UpTan} field. */
    public OVRFovPort UpTan(float value) { nUpTan(address(), value); return this; }
    /** Sets the specified value to the {@link #DownTan} field. */
    public OVRFovPort DownTan(float value) { nDownTan(address(), value); return this; }
    /** Sets the specified value to the {@link #LeftTan} field. */
    public OVRFovPort LeftTan(float value) { nLeftTan(address(), value); return this; }
    /** Sets the specified value to the {@link #RightTan} field. */
    public OVRFovPort RightTan(float value) { nRightTan(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRFovPort set(
        float UpTan,
        float DownTan,
        float LeftTan,
        float RightTan
    ) {
        UpTan(UpTan);
        DownTan(DownTan);
        LeftTan(LeftTan);
        RightTan(RightTan);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRFovPort set(OVRFovPort src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRFovPort} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRFovPort malloc() {
        return wrap(OVRFovPort.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRFovPort} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRFovPort calloc() {
        return wrap(OVRFovPort.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRFovPort} instance allocated with {@link BufferUtils}. */
    public static OVRFovPort create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRFovPort.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRFovPort} instance for the specified memory address. */
    public static OVRFovPort create(long address) {
        return wrap(OVRFovPort.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovPort createSafe(long address) {
        return address == NULL ? null : wrap(OVRFovPort.class, address);
    }

    /**
     * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRFovPort.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovPort.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovPort mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovPort callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovPort mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovPort callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovPort.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovPort.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovPort.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovPort.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRFovPort} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovPort malloc(MemoryStack stack) {
        return wrap(OVRFovPort.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRFovPort} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovPort calloc(MemoryStack stack) {
        return wrap(OVRFovPort.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRFovPort.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovPort.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovPort.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #UpTan}. */
    public static float nUpTan(long struct) { return UNSAFE.getFloat(null, struct + OVRFovPort.UPTAN); }
    /** Unsafe version of {@link #DownTan}. */
    public static float nDownTan(long struct) { return UNSAFE.getFloat(null, struct + OVRFovPort.DOWNTAN); }
    /** Unsafe version of {@link #LeftTan}. */
    public static float nLeftTan(long struct) { return UNSAFE.getFloat(null, struct + OVRFovPort.LEFTTAN); }
    /** Unsafe version of {@link #RightTan}. */
    public static float nRightTan(long struct) { return UNSAFE.getFloat(null, struct + OVRFovPort.RIGHTTAN); }

    /** Unsafe version of {@link #UpTan(float) UpTan}. */
    public static void nUpTan(long struct, float value) { UNSAFE.putFloat(null, struct + OVRFovPort.UPTAN, value); }
    /** Unsafe version of {@link #DownTan(float) DownTan}. */
    public static void nDownTan(long struct, float value) { UNSAFE.putFloat(null, struct + OVRFovPort.DOWNTAN, value); }
    /** Unsafe version of {@link #LeftTan(float) LeftTan}. */
    public static void nLeftTan(long struct, float value) { UNSAFE.putFloat(null, struct + OVRFovPort.LEFTTAN, value); }
    /** Unsafe version of {@link #RightTan(float) RightTan}. */
    public static void nRightTan(long struct, float value) { UNSAFE.putFloat(null, struct + OVRFovPort.RIGHTTAN, value); }

    // -----------------------------------

    /** An array of {@link OVRFovPort} structs. */
    public static class Buffer extends StructBuffer<OVRFovPort, Buffer> implements NativeResource {

        private static final OVRFovPort ELEMENT_FACTORY = OVRFovPort.create(-1L);

        /**
         * Creates a new {@code OVRFovPort.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRFovPort#SIZEOF}, and its mark will be undefined.
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
        protected OVRFovPort getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRFovPort#UpTan} field. */
        public float UpTan() { return OVRFovPort.nUpTan(address()); }
        /** @return the value of the {@link OVRFovPort#DownTan} field. */
        public float DownTan() { return OVRFovPort.nDownTan(address()); }
        /** @return the value of the {@link OVRFovPort#LeftTan} field. */
        public float LeftTan() { return OVRFovPort.nLeftTan(address()); }
        /** @return the value of the {@link OVRFovPort#RightTan} field. */
        public float RightTan() { return OVRFovPort.nRightTan(address()); }

        /** Sets the specified value to the {@link OVRFovPort#UpTan} field. */
        public OVRFovPort.Buffer UpTan(float value) { OVRFovPort.nUpTan(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovPort#DownTan} field. */
        public OVRFovPort.Buffer DownTan(float value) { OVRFovPort.nDownTan(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovPort#LeftTan} field. */
        public OVRFovPort.Buffer LeftTan(float value) { OVRFovPort.nLeftTan(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovPort#RightTan} field. */
        public OVRFovPort.Buffer RightTan(float value) { OVRFovPort.nRightTan(address(), value); return this; }

    }

}