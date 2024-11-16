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
 * The information to query and modify hand joint overall scale.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHandTrackingMesh XR_FB_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandTrackingScaleFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_SCALE_FB TYPE_HAND_TRACKING_SCALE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingScaleFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     float {@link #sensorOutput};
 *     float {@link #currentOutput};
 *     XrBool32 {@link #overrideHandScale};
 *     float {@link #overrideValueInput};
 * }</code></pre>
 */
public class XrHandTrackingScaleFB extends Struct<XrHandTrackingScaleFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SENSOROUTPUT,
        CURRENTOUTPUT,
        OVERRIDEHANDSCALE,
        OVERRIDEVALUEINPUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SENSOROUTPUT = layout.offsetof(2);
        CURRENTOUTPUT = layout.offsetof(3);
        OVERRIDEHANDSCALE = layout.offsetof(4);
        OVERRIDEVALUEINPUT = layout.offsetof(5);
    }

    protected XrHandTrackingScaleFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandTrackingScaleFB create(long address, @Nullable ByteBuffer container) {
        return new XrHandTrackingScaleFB(address, container);
    }

    /**
     * Creates a {@code XrHandTrackingScaleFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingScaleFB(ByteBuffer container) {
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
    /** an output value: the currently measured scale as otherwise applied without passing this structure. */
    public float sensorOutput() { return nsensorOutput(address()); }
    /** an output value: the effective output that the bind skeleton is getting on the current call, which <b>may</b> be subject to filtering, scaling, or validation. */
    public float currentOutput() { return ncurrentOutput(address()); }
    /** indicates whether the runtime <b>must</b> scale the output of this {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT} call according to {@code overrideValueInput} */
    @NativeType("XrBool32")
    public boolean overrideHandScale() { return noverrideHandScale(address()) != 0; }
    /** an <b>optional</b> input value, enabled only when the {@code overrideHandScale} parameter is set. Setting this to 1.0 and setting {@code overrideHandScale} to {@code true} will give the joints in mesh binding scale. */
    public float overrideValueInput() { return noverrideValueInput(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandTrackingScaleFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_SCALE_FB TYPE_HAND_TRACKING_SCALE_FB} value to the {@link #type} field. */
    public XrHandTrackingScaleFB type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_SCALE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandTrackingScaleFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingScaleFB set(
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
    public XrHandTrackingScaleFB set(XrHandTrackingScaleFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingScaleFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingScaleFB malloc() {
        return new XrHandTrackingScaleFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingScaleFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingScaleFB calloc() {
        return new XrHandTrackingScaleFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingScaleFB} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingScaleFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandTrackingScaleFB(memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingScaleFB} instance for the specified memory address. */
    public static XrHandTrackingScaleFB create(long address) {
        return new XrHandTrackingScaleFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandTrackingScaleFB createSafe(long address) {
        return address == NULL ? null : new XrHandTrackingScaleFB(address, null);
    }

    /**
     * Returns a new {@link XrHandTrackingScaleFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingScaleFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingScaleFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandTrackingScaleFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandTrackingScaleFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingScaleFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingScaleFB malloc(MemoryStack stack) {
        return new XrHandTrackingScaleFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandTrackingScaleFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingScaleFB calloc(MemoryStack stack) {
        return new XrHandTrackingScaleFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandTrackingScaleFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingScaleFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingScaleFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandTrackingScaleFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingScaleFB.NEXT); }
    /** Unsafe version of {@link #sensorOutput}. */
    public static float nsensorOutput(long struct) { return memGetFloat(struct + XrHandTrackingScaleFB.SENSOROUTPUT); }
    /** Unsafe version of {@link #currentOutput}. */
    public static float ncurrentOutput(long struct) { return memGetFloat(struct + XrHandTrackingScaleFB.CURRENTOUTPUT); }
    /** Unsafe version of {@link #overrideHandScale}. */
    public static int noverrideHandScale(long struct) { return memGetInt(struct + XrHandTrackingScaleFB.OVERRIDEHANDSCALE); }
    /** Unsafe version of {@link #overrideValueInput}. */
    public static float noverrideValueInput(long struct) { return memGetFloat(struct + XrHandTrackingScaleFB.OVERRIDEVALUEINPUT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandTrackingScaleFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingScaleFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrHandTrackingScaleFB} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingScaleFB, Buffer> implements NativeResource {

        private static final XrHandTrackingScaleFB ELEMENT_FACTORY = XrHandTrackingScaleFB.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingScaleFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingScaleFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandTrackingScaleFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingScaleFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingScaleFB.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingScaleFB#next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingScaleFB.nnext(address()); }
        /** @return the value of the {@link XrHandTrackingScaleFB#sensorOutput} field. */
        public float sensorOutput() { return XrHandTrackingScaleFB.nsensorOutput(address()); }
        /** @return the value of the {@link XrHandTrackingScaleFB#currentOutput} field. */
        public float currentOutput() { return XrHandTrackingScaleFB.ncurrentOutput(address()); }
        /** @return the value of the {@link XrHandTrackingScaleFB#overrideHandScale} field. */
        @NativeType("XrBool32")
        public boolean overrideHandScale() { return XrHandTrackingScaleFB.noverrideHandScale(address()) != 0; }
        /** @return the value of the {@link XrHandTrackingScaleFB#overrideValueInput} field. */
        public float overrideValueInput() { return XrHandTrackingScaleFB.noverrideValueInput(address()); }

        /** Sets the specified value to the {@link XrHandTrackingScaleFB#type} field. */
        public XrHandTrackingScaleFB.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingScaleFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_SCALE_FB TYPE_HAND_TRACKING_SCALE_FB} value to the {@link XrHandTrackingScaleFB#type} field. */
        public XrHandTrackingScaleFB.Buffer type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_SCALE_FB); }
        /** Sets the specified value to the {@link XrHandTrackingScaleFB#next} field. */
        public XrHandTrackingScaleFB.Buffer next(@NativeType("void *") long value) { XrHandTrackingScaleFB.nnext(address(), value); return this; }

    }

}