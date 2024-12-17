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
 * <pre>{@code
 * struct XrInteractionProfileAnalogThresholdVALVE {
 *     XrStructureType type;
 *     void const * next;
 *     XrAction action;
 *     XrPath binding;
 *     float onThreshold;
 *     float offThreshold;
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * onHaptic;
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * offHaptic;
 * }}</pre>
 */
public class XrInteractionProfileAnalogThresholdVALVE extends Struct<XrInteractionProfileAnalogThresholdVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        BINDING,
        ONTHRESHOLD,
        OFFTHRESHOLD,
        ONHAPTIC,
        OFFHAPTIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        ONTHRESHOLD = layout.offsetof(4);
        OFFTHRESHOLD = layout.offsetof(5);
        ONHAPTIC = layout.offsetof(6);
        OFFHAPTIC = layout.offsetof(7);
    }

    protected XrInteractionProfileAnalogThresholdVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInteractionProfileAnalogThresholdVALVE create(long address, @Nullable ByteBuffer container) {
        return new XrInteractionProfileAnalogThresholdVALVE(address, container);
    }

    /**
     * Creates a {@code XrInteractionProfileAnalogThresholdVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionProfileAnalogThresholdVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code action} field. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("XrPath")
    public long binding() { return nbinding(address()); }
    /** @return the value of the {@code onThreshold} field. */
    public float onThreshold() { return nonThreshold(address()); }
    /** @return the value of the {@code offThreshold} field. */
    public float offThreshold() { return noffThreshold(address()); }
    /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code onHaptic} field. */
    @NativeType("XrHapticBaseHeader const *")
    public @Nullable XrHapticBaseHeader onHaptic() { return nonHaptic(address()); }
    /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code offHaptic} field. */
    @NativeType("XrHapticBaseHeader const *")
    public @Nullable XrHapticBaseHeader offHaptic() { return noffHaptic(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInteractionProfileAnalogThresholdVALVE type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VALVEAnalogThreshold#XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE} value to the {@code type} field. */
    public XrInteractionProfileAnalogThresholdVALVE type$Default() { return type(VALVEAnalogThreshold.XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE); }
    /** Sets the specified value to the {@code next} field. */
    public XrInteractionProfileAnalogThresholdVALVE next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code action} field. */
    public XrInteractionProfileAnalogThresholdVALVE action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public XrInteractionProfileAnalogThresholdVALVE binding(@NativeType("XrPath") long value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code onThreshold} field. */
    public XrInteractionProfileAnalogThresholdVALVE onThreshold(float value) { nonThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code offThreshold} field. */
    public XrInteractionProfileAnalogThresholdVALVE offThreshold(float value) { noffThreshold(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code onHaptic} field. */
    public XrInteractionProfileAnalogThresholdVALVE onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { nonHaptic(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code offHaptic} field. */
    public XrInteractionProfileAnalogThresholdVALVE offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { noffHaptic(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionProfileAnalogThresholdVALVE set(
        int type,
        long next,
        XrAction action,
        long binding,
        float onThreshold,
        float offThreshold,
        @Nullable XrHapticBaseHeader onHaptic,
        @Nullable XrHapticBaseHeader offHaptic
    ) {
        type(type);
        next(next);
        action(action);
        binding(binding);
        onThreshold(onThreshold);
        offThreshold(offThreshold);
        onHaptic(onHaptic);
        offHaptic(offHaptic);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInteractionProfileAnalogThresholdVALVE set(XrInteractionProfileAnalogThresholdVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileAnalogThresholdVALVE malloc() {
        return new XrInteractionProfileAnalogThresholdVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileAnalogThresholdVALVE calloc() {
        return new XrInteractionProfileAnalogThresholdVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileAnalogThresholdVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInteractionProfileAnalogThresholdVALVE(memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance for the specified memory address. */
    public static XrInteractionProfileAnalogThresholdVALVE create(long address) {
        return new XrInteractionProfileAnalogThresholdVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInteractionProfileAnalogThresholdVALVE createSafe(long address) {
        return address == NULL ? null : new XrInteractionProfileAnalogThresholdVALVE(address, null);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR} instance to {@code XrInteractionProfileAnalogThresholdVALVE}. */
    public static XrInteractionProfileAnalogThresholdVALVE create(XrBindingModificationBaseHeaderKHR value) {
        return new XrInteractionProfileAnalogThresholdVALVE(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInteractionProfileAnalogThresholdVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR.Buffer} instance to {@code XrInteractionProfileAnalogThresholdVALVE.Buffer}. */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(XrBindingModificationBaseHeaderKHR.Buffer value) {
        return new XrInteractionProfileAnalogThresholdVALVE.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileAnalogThresholdVALVE malloc(MemoryStack stack) {
        return new XrInteractionProfileAnalogThresholdVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileAnalogThresholdVALVE calloc(MemoryStack stack) {
        return new XrInteractionProfileAnalogThresholdVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInteractionProfileAnalogThresholdVALVE.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION); }
    /** Unsafe version of {@link #binding}. */
    public static long nbinding(long struct) { return memGetLong(struct + XrInteractionProfileAnalogThresholdVALVE.BINDING); }
    /** Unsafe version of {@link #onThreshold}. */
    public static float nonThreshold(long struct) { return memGetFloat(struct + XrInteractionProfileAnalogThresholdVALVE.ONTHRESHOLD); }
    /** Unsafe version of {@link #offThreshold}. */
    public static float noffThreshold(long struct) { return memGetFloat(struct + XrInteractionProfileAnalogThresholdVALVE.OFFTHRESHOLD); }
    /** Unsafe version of {@link #onHaptic}. */
    public static @Nullable XrHapticBaseHeader nonHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ONHAPTIC)); }
    /** Unsafe version of {@link #offHaptic}. */
    public static @Nullable XrHapticBaseHeader noffHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.OFFHAPTIC)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInteractionProfileAnalogThresholdVALVE.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION, value.address()); }
    /** Unsafe version of {@link #binding(long) binding}. */
    public static void nbinding(long struct, long value) { memPutLong(struct + XrInteractionProfileAnalogThresholdVALVE.BINDING, value); }
    /** Unsafe version of {@link #onThreshold(float) onThreshold}. */
    public static void nonThreshold(long struct, float value) { memPutFloat(struct + XrInteractionProfileAnalogThresholdVALVE.ONTHRESHOLD, value); }
    /** Unsafe version of {@link #offThreshold(float) offThreshold}. */
    public static void noffThreshold(long struct, float value) { memPutFloat(struct + XrInteractionProfileAnalogThresholdVALVE.OFFTHRESHOLD, value); }
    /** Unsafe version of {@link #onHaptic(XrHapticBaseHeader) onHaptic}. */
    public static void nonHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ONHAPTIC, memAddressSafe(value)); }
    /** Unsafe version of {@link #offHaptic(XrHapticBaseHeader) offHaptic}. */
    public static void noffHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.OFFHAPTIC, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrInteractionProfileAnalogThresholdVALVE} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileAnalogThresholdVALVE, Buffer> implements NativeResource {

        private static final XrInteractionProfileAnalogThresholdVALVE ELEMENT_FACTORY = XrInteractionProfileAnalogThresholdVALVE.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileAnalogThresholdVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileAnalogThresholdVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInteractionProfileAnalogThresholdVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileAnalogThresholdVALVE.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionProfileAnalogThresholdVALVE.nnext(address()); }
        /** @return the value of the {@code action} field. */
        @NativeType("XrAction")
        public long action() { return XrInteractionProfileAnalogThresholdVALVE.naction(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("XrPath")
        public long binding() { return XrInteractionProfileAnalogThresholdVALVE.nbinding(address()); }
        /** @return the value of the {@code onThreshold} field. */
        public float onThreshold() { return XrInteractionProfileAnalogThresholdVALVE.nonThreshold(address()); }
        /** @return the value of the {@code offThreshold} field. */
        public float offThreshold() { return XrInteractionProfileAnalogThresholdVALVE.noffThreshold(address()); }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code onHaptic} field. */
        @NativeType("XrHapticBaseHeader const *")
        public @Nullable XrHapticBaseHeader onHaptic() { return XrInteractionProfileAnalogThresholdVALVE.nonHaptic(address()); }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code offHaptic} field. */
        @NativeType("XrHapticBaseHeader const *")
        public @Nullable XrHapticBaseHeader offHaptic() { return XrInteractionProfileAnalogThresholdVALVE.noffHaptic(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileAnalogThresholdVALVE.ntype(address(), value); return this; }
        /** Sets the {@link VALVEAnalogThreshold#XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE} value to the {@code type} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer type$Default() { return type(VALVEAnalogThreshold.XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE); }
        /** Sets the specified value to the {@code next} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer next(@NativeType("void const *") long value) { XrInteractionProfileAnalogThresholdVALVE.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code action} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer action(XrAction value) { XrInteractionProfileAnalogThresholdVALVE.naction(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer binding(@NativeType("XrPath") long value) { XrInteractionProfileAnalogThresholdVALVE.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code onThreshold} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer onThreshold(float value) { XrInteractionProfileAnalogThresholdVALVE.nonThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code offThreshold} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer offThreshold(float value) { XrInteractionProfileAnalogThresholdVALVE.noffThreshold(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code onHaptic} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileAnalogThresholdVALVE.nonHaptic(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code offHaptic} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileAnalogThresholdVALVE.noffHaptic(address(), value); return this; }

    }

}