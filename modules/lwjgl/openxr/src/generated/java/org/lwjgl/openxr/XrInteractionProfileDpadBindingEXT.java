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
 * struct XrInteractionProfileDpadBindingEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrPath binding;
 *     XrActionSet actionSet;
 *     float forceThreshold;
 *     float forceThresholdReleased;
 *     float centerRegion;
 *     float wedgeAngle;
 *     XrBool32 isSticky;
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * onHaptic;
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * offHaptic;
 * }}</pre>
 */
public class XrInteractionProfileDpadBindingEXT extends Struct<XrInteractionProfileDpadBindingEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BINDING,
        ACTIONSET,
        FORCETHRESHOLD,
        FORCETHRESHOLDRELEASED,
        CENTERREGION,
        WEDGEANGLE,
        ISSTICKY,
        ONHAPTIC,
        OFFHAPTIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        ACTIONSET = layout.offsetof(3);
        FORCETHRESHOLD = layout.offsetof(4);
        FORCETHRESHOLDRELEASED = layout.offsetof(5);
        CENTERREGION = layout.offsetof(6);
        WEDGEANGLE = layout.offsetof(7);
        ISSTICKY = layout.offsetof(8);
        ONHAPTIC = layout.offsetof(9);
        OFFHAPTIC = layout.offsetof(10);
    }

    protected XrInteractionProfileDpadBindingEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInteractionProfileDpadBindingEXT create(long address, @Nullable ByteBuffer container) {
        return new XrInteractionProfileDpadBindingEXT(address, container);
    }

    /**
     * Creates a {@code XrInteractionProfileDpadBindingEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionProfileDpadBindingEXT(ByteBuffer container) {
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
    /** @return the value of the {@code binding} field. */
    @NativeType("XrPath")
    public long binding() { return nbinding(address()); }
    /** @return the value of the {@code actionSet} field. */
    @NativeType("XrActionSet")
    public long actionSet() { return nactionSet(address()); }
    /** @return the value of the {@code forceThreshold} field. */
    public float forceThreshold() { return nforceThreshold(address()); }
    /** @return the value of the {@code forceThresholdReleased} field. */
    public float forceThresholdReleased() { return nforceThresholdReleased(address()); }
    /** @return the value of the {@code centerRegion} field. */
    public float centerRegion() { return ncenterRegion(address()); }
    /** @return the value of the {@code wedgeAngle} field. */
    public float wedgeAngle() { return nwedgeAngle(address()); }
    /** @return the value of the {@code isSticky} field. */
    @NativeType("XrBool32")
    public boolean isSticky() { return nisSticky(address()) != 0; }
    /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code onHaptic} field. */
    @NativeType("XrHapticBaseHeader const *")
    public @Nullable XrHapticBaseHeader onHaptic() { return nonHaptic(address()); }
    /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code offHaptic} field. */
    @NativeType("XrHapticBaseHeader const *")
    public @Nullable XrHapticBaseHeader offHaptic() { return noffHaptic(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInteractionProfileDpadBindingEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTDpadBinding#XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT} value to the {@code type} field. */
    public XrInteractionProfileDpadBindingEXT type$Default() { return type(EXTDpadBinding.XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrInteractionProfileDpadBindingEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public XrInteractionProfileDpadBindingEXT binding(@NativeType("XrPath") long value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code actionSet} field. */
    public XrInteractionProfileDpadBindingEXT actionSet(XrActionSet value) { nactionSet(address(), value); return this; }
    /** Sets the specified value to the {@code forceThreshold} field. */
    public XrInteractionProfileDpadBindingEXT forceThreshold(float value) { nforceThreshold(address(), value); return this; }
    /** Sets the specified value to the {@code forceThresholdReleased} field. */
    public XrInteractionProfileDpadBindingEXT forceThresholdReleased(float value) { nforceThresholdReleased(address(), value); return this; }
    /** Sets the specified value to the {@code centerRegion} field. */
    public XrInteractionProfileDpadBindingEXT centerRegion(float value) { ncenterRegion(address(), value); return this; }
    /** Sets the specified value to the {@code wedgeAngle} field. */
    public XrInteractionProfileDpadBindingEXT wedgeAngle(float value) { nwedgeAngle(address(), value); return this; }
    /** Sets the specified value to the {@code isSticky} field. */
    public XrInteractionProfileDpadBindingEXT isSticky(@NativeType("XrBool32") boolean value) { nisSticky(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code onHaptic} field. */
    public XrInteractionProfileDpadBindingEXT onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { nonHaptic(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code offHaptic} field. */
    public XrInteractionProfileDpadBindingEXT offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { noffHaptic(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionProfileDpadBindingEXT set(
        int type,
        long next,
        long binding,
        XrActionSet actionSet,
        float forceThreshold,
        float forceThresholdReleased,
        float centerRegion,
        float wedgeAngle,
        boolean isSticky,
        @Nullable XrHapticBaseHeader onHaptic,
        @Nullable XrHapticBaseHeader offHaptic
    ) {
        type(type);
        next(next);
        binding(binding);
        actionSet(actionSet);
        forceThreshold(forceThreshold);
        forceThresholdReleased(forceThresholdReleased);
        centerRegion(centerRegion);
        wedgeAngle(wedgeAngle);
        isSticky(isSticky);
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
    public XrInteractionProfileDpadBindingEXT set(XrInteractionProfileDpadBindingEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileDpadBindingEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileDpadBindingEXT malloc() {
        return new XrInteractionProfileDpadBindingEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileDpadBindingEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileDpadBindingEXT calloc() {
        return new XrInteractionProfileDpadBindingEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInteractionProfileDpadBindingEXT} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileDpadBindingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInteractionProfileDpadBindingEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileDpadBindingEXT} instance for the specified memory address. */
    public static XrInteractionProfileDpadBindingEXT create(long address) {
        return new XrInteractionProfileDpadBindingEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInteractionProfileDpadBindingEXT createSafe(long address) {
        return address == NULL ? null : new XrInteractionProfileDpadBindingEXT(address, null);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR} instance to {@code XrInteractionProfileDpadBindingEXT}. */
    public static XrInteractionProfileDpadBindingEXT create(XrBindingModificationBaseHeaderKHR value) {
        return new XrInteractionProfileDpadBindingEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrInteractionProfileDpadBindingEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileDpadBindingEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileDpadBindingEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInteractionProfileDpadBindingEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInteractionProfileDpadBindingEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR.Buffer} instance to {@code XrInteractionProfileDpadBindingEXT.Buffer}. */
    public static XrInteractionProfileDpadBindingEXT.Buffer create(XrBindingModificationBaseHeaderKHR.Buffer value) {
        return new XrInteractionProfileDpadBindingEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrInteractionProfileDpadBindingEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileDpadBindingEXT malloc(MemoryStack stack) {
        return new XrInteractionProfileDpadBindingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInteractionProfileDpadBindingEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileDpadBindingEXT calloc(MemoryStack stack) {
        return new XrInteractionProfileDpadBindingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInteractionProfileDpadBindingEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileDpadBindingEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileDpadBindingEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInteractionProfileDpadBindingEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileDpadBindingEXT.NEXT); }
    /** Unsafe version of {@link #binding}. */
    public static long nbinding(long struct) { return memGetLong(struct + XrInteractionProfileDpadBindingEXT.BINDING); }
    /** Unsafe version of {@link #actionSet}. */
    public static long nactionSet(long struct) { return memGetAddress(struct + XrInteractionProfileDpadBindingEXT.ACTIONSET); }
    /** Unsafe version of {@link #forceThreshold}. */
    public static float nforceThreshold(long struct) { return memGetFloat(struct + XrInteractionProfileDpadBindingEXT.FORCETHRESHOLD); }
    /** Unsafe version of {@link #forceThresholdReleased}. */
    public static float nforceThresholdReleased(long struct) { return memGetFloat(struct + XrInteractionProfileDpadBindingEXT.FORCETHRESHOLDRELEASED); }
    /** Unsafe version of {@link #centerRegion}. */
    public static float ncenterRegion(long struct) { return memGetFloat(struct + XrInteractionProfileDpadBindingEXT.CENTERREGION); }
    /** Unsafe version of {@link #wedgeAngle}. */
    public static float nwedgeAngle(long struct) { return memGetFloat(struct + XrInteractionProfileDpadBindingEXT.WEDGEANGLE); }
    /** Unsafe version of {@link #isSticky}. */
    public static int nisSticky(long struct) { return memGetInt(struct + XrInteractionProfileDpadBindingEXT.ISSTICKY); }
    /** Unsafe version of {@link #onHaptic}. */
    public static @Nullable XrHapticBaseHeader nonHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileDpadBindingEXT.ONHAPTIC)); }
    /** Unsafe version of {@link #offHaptic}. */
    public static @Nullable XrHapticBaseHeader noffHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileDpadBindingEXT.OFFHAPTIC)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInteractionProfileDpadBindingEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileDpadBindingEXT.NEXT, value); }
    /** Unsafe version of {@link #binding(long) binding}. */
    public static void nbinding(long struct, long value) { memPutLong(struct + XrInteractionProfileDpadBindingEXT.BINDING, value); }
    /** Unsafe version of {@link #actionSet(XrActionSet) actionSet}. */
    public static void nactionSet(long struct, XrActionSet value) { memPutAddress(struct + XrInteractionProfileDpadBindingEXT.ACTIONSET, value.address()); }
    /** Unsafe version of {@link #forceThreshold(float) forceThreshold}. */
    public static void nforceThreshold(long struct, float value) { memPutFloat(struct + XrInteractionProfileDpadBindingEXT.FORCETHRESHOLD, value); }
    /** Unsafe version of {@link #forceThresholdReleased(float) forceThresholdReleased}. */
    public static void nforceThresholdReleased(long struct, float value) { memPutFloat(struct + XrInteractionProfileDpadBindingEXT.FORCETHRESHOLDRELEASED, value); }
    /** Unsafe version of {@link #centerRegion(float) centerRegion}. */
    public static void ncenterRegion(long struct, float value) { memPutFloat(struct + XrInteractionProfileDpadBindingEXT.CENTERREGION, value); }
    /** Unsafe version of {@link #wedgeAngle(float) wedgeAngle}. */
    public static void nwedgeAngle(long struct, float value) { memPutFloat(struct + XrInteractionProfileDpadBindingEXT.WEDGEANGLE, value); }
    /** Unsafe version of {@link #isSticky(boolean) isSticky}. */
    public static void nisSticky(long struct, int value) { memPutInt(struct + XrInteractionProfileDpadBindingEXT.ISSTICKY, value); }
    /** Unsafe version of {@link #onHaptic(XrHapticBaseHeader) onHaptic}. */
    public static void nonHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileDpadBindingEXT.ONHAPTIC, memAddressSafe(value)); }
    /** Unsafe version of {@link #offHaptic(XrHapticBaseHeader) offHaptic}. */
    public static void noffHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileDpadBindingEXT.OFFHAPTIC, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInteractionProfileDpadBindingEXT.ACTIONSET));
    }

    // -----------------------------------

    /** An array of {@link XrInteractionProfileDpadBindingEXT} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileDpadBindingEXT, Buffer> implements NativeResource {

        private static final XrInteractionProfileDpadBindingEXT ELEMENT_FACTORY = XrInteractionProfileDpadBindingEXT.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileDpadBindingEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileDpadBindingEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInteractionProfileDpadBindingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileDpadBindingEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionProfileDpadBindingEXT.nnext(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("XrPath")
        public long binding() { return XrInteractionProfileDpadBindingEXT.nbinding(address()); }
        /** @return the value of the {@code actionSet} field. */
        @NativeType("XrActionSet")
        public long actionSet() { return XrInteractionProfileDpadBindingEXT.nactionSet(address()); }
        /** @return the value of the {@code forceThreshold} field. */
        public float forceThreshold() { return XrInteractionProfileDpadBindingEXT.nforceThreshold(address()); }
        /** @return the value of the {@code forceThresholdReleased} field. */
        public float forceThresholdReleased() { return XrInteractionProfileDpadBindingEXT.nforceThresholdReleased(address()); }
        /** @return the value of the {@code centerRegion} field. */
        public float centerRegion() { return XrInteractionProfileDpadBindingEXT.ncenterRegion(address()); }
        /** @return the value of the {@code wedgeAngle} field. */
        public float wedgeAngle() { return XrInteractionProfileDpadBindingEXT.nwedgeAngle(address()); }
        /** @return the value of the {@code isSticky} field. */
        @NativeType("XrBool32")
        public boolean isSticky() { return XrInteractionProfileDpadBindingEXT.nisSticky(address()) != 0; }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code onHaptic} field. */
        @NativeType("XrHapticBaseHeader const *")
        public @Nullable XrHapticBaseHeader onHaptic() { return XrInteractionProfileDpadBindingEXT.nonHaptic(address()); }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@code offHaptic} field. */
        @NativeType("XrHapticBaseHeader const *")
        public @Nullable XrHapticBaseHeader offHaptic() { return XrInteractionProfileDpadBindingEXT.noffHaptic(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileDpadBindingEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTDpadBinding#XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT} value to the {@code type} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer type$Default() { return type(EXTDpadBinding.XR_TYPE_INTERACTION_PROFILE_DPAD_BINDING_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer next(@NativeType("void const *") long value) { XrInteractionProfileDpadBindingEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer binding(@NativeType("XrPath") long value) { XrInteractionProfileDpadBindingEXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code actionSet} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer actionSet(XrActionSet value) { XrInteractionProfileDpadBindingEXT.nactionSet(address(), value); return this; }
        /** Sets the specified value to the {@code forceThreshold} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer forceThreshold(float value) { XrInteractionProfileDpadBindingEXT.nforceThreshold(address(), value); return this; }
        /** Sets the specified value to the {@code forceThresholdReleased} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer forceThresholdReleased(float value) { XrInteractionProfileDpadBindingEXT.nforceThresholdReleased(address(), value); return this; }
        /** Sets the specified value to the {@code centerRegion} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer centerRegion(float value) { XrInteractionProfileDpadBindingEXT.ncenterRegion(address(), value); return this; }
        /** Sets the specified value to the {@code wedgeAngle} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer wedgeAngle(float value) { XrInteractionProfileDpadBindingEXT.nwedgeAngle(address(), value); return this; }
        /** Sets the specified value to the {@code isSticky} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer isSticky(@NativeType("XrBool32") boolean value) { XrInteractionProfileDpadBindingEXT.nisSticky(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code onHaptic} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileDpadBindingEXT.nonHaptic(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@code offHaptic} field. */
        public XrInteractionProfileDpadBindingEXT.Buffer offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileDpadBindingEXT.noffHaptic(address(), value); return this; }

    }

}