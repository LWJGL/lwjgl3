/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrHand_Count;

/**
 * <pre>{@code
 * struct ovrInputState {
 *     double TimeInSeconds;
 *     unsigned int Buttons;
 *     unsigned int Touches;
 *     float IndexTrigger[ovrHand_Count];
 *     float HandTrigger[ovrHand_Count];
 *     {@link OVRVector2f ovrVector2f} Thumbstick[ovrHand_Count];
 *     ovrControllerType ControllerType;
 *     float IndexTriggerNoDeadzone[ovrHand_Count];
 *     float HandTriggerNoDeadzone[ovrHand_Count];
 *     {@link OVRVector2f ovrVector2f} ThumbstickNoDeadzone[ovrHand_Count];
 *     float IndexTriggerRaw[ovrHand_Count];
 *     float HandTriggerRaw[ovrHand_Count];
 *     {@link OVRVector2f ovrVector2f} ThumbstickRaw[ovrHand_Count];
 * }}</pre>
 */
@NativeType("struct ovrInputState")
public class OVRInputState extends Struct<OVRInputState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TIMEINSECONDS,
        BUTTONS,
        TOUCHES,
        INDEXTRIGGER,
        HANDTRIGGER,
        THUMBSTICK,
        CONTROLLERTYPE,
        INDEXTRIGGERNODEADZONE,
        HANDTRIGGERNODEADZONE,
        THUMBSTICKNODEADZONE,
        INDEXTRIGGERRAW,
        HANDTRIGGERRAW,
        THUMBSTICKRAW;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __array(4, ovrHand_Count),
            __array(4, ovrHand_Count),
            __array(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF, ovrHand_Count),
            __member(4),
            __array(4, ovrHand_Count),
            __array(4, ovrHand_Count),
            __array(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF, ovrHand_Count),
            __array(4, ovrHand_Count),
            __array(4, ovrHand_Count),
            __array(OVRVector2f.SIZEOF, OVRVector2f.ALIGNOF, ovrHand_Count)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TIMEINSECONDS = layout.offsetof(0);
        BUTTONS = layout.offsetof(1);
        TOUCHES = layout.offsetof(2);
        INDEXTRIGGER = layout.offsetof(3);
        HANDTRIGGER = layout.offsetof(4);
        THUMBSTICK = layout.offsetof(5);
        CONTROLLERTYPE = layout.offsetof(6);
        INDEXTRIGGERNODEADZONE = layout.offsetof(7);
        HANDTRIGGERNODEADZONE = layout.offsetof(8);
        THUMBSTICKNODEADZONE = layout.offsetof(9);
        INDEXTRIGGERRAW = layout.offsetof(10);
        HANDTRIGGERRAW = layout.offsetof(11);
        THUMBSTICKRAW = layout.offsetof(12);
    }

    protected OVRInputState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRInputState create(long address, @Nullable ByteBuffer container) {
        return new OVRInputState(address, container);
    }

    /**
     * Creates a {@code OVRInputState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRInputState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code TimeInSeconds} field. */
    public double TimeInSeconds() { return nTimeInSeconds(address()); }
    /** @return the value of the {@code Buttons} field. */
    @NativeType("unsigned int")
    public int Buttons() { return nButtons(address()); }
    /** @return the value of the {@code Touches} field. */
    @NativeType("unsigned int")
    public int Touches() { return nTouches(address()); }
    /** @return a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTrigger() { return nIndexTrigger(address()); }
    /** @return the value at the specified index of the {@code IndexTrigger} field. */
    public float IndexTrigger(int index) { return nIndexTrigger(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code HandTrigger} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTrigger() { return nHandTrigger(address()); }
    /** @return the value at the specified index of the {@code HandTrigger} field. */
    public float HandTrigger(int index) { return nHandTrigger(address(), index); }
    /** @return a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer Thumbstick() { return nThumbstick(address()); }
    /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f Thumbstick(int index) { return nThumbstick(address(), index); }
    /** @return the value of the {@code ControllerType} field. */
    @NativeType("ovrControllerType")
    public int ControllerType() { return nControllerType(address()); }
    /** @return a {@link FloatBuffer} view of the {@code IndexTriggerNoDeadzone} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTriggerNoDeadzone() { return nIndexTriggerNoDeadzone(address()); }
    /** @return the value at the specified index of the {@code IndexTriggerNoDeadzone} field. */
    public float IndexTriggerNoDeadzone(int index) { return nIndexTriggerNoDeadzone(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code HandTriggerNoDeadzone} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTriggerNoDeadzone() { return nHandTriggerNoDeadzone(address()); }
    /** @return the value at the specified index of the {@code HandTriggerNoDeadzone} field. */
    public float HandTriggerNoDeadzone(int index) { return nHandTriggerNoDeadzone(address(), index); }
    /** @return a {@link OVRVector2f}.Buffer view of the {@code ThumbstickNoDeadzone} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer ThumbstickNoDeadzone() { return nThumbstickNoDeadzone(address()); }
    /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickNoDeadzone} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f ThumbstickNoDeadzone(int index) { return nThumbstickNoDeadzone(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code IndexTriggerRaw} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTriggerRaw() { return nIndexTriggerRaw(address()); }
    /** @return the value at the specified index of the {@code IndexTriggerRaw} field. */
    public float IndexTriggerRaw(int index) { return nIndexTriggerRaw(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code HandTriggerRaw} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTriggerRaw() { return nHandTriggerRaw(address()); }
    /** @return the value at the specified index of the {@code HandTriggerRaw} field. */
    public float HandTriggerRaw(int index) { return nHandTriggerRaw(address(), index); }
    /** @return a {@link OVRVector2f}.Buffer view of the {@code ThumbstickRaw} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer ThumbstickRaw() { return nThumbstickRaw(address()); }
    /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickRaw} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f ThumbstickRaw(int index) { return nThumbstickRaw(address(), index); }

    // -----------------------------------

    /** Returns a new {@code OVRInputState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRInputState malloc() {
        return new OVRInputState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRInputState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRInputState calloc() {
        return new OVRInputState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRInputState} instance allocated with {@link BufferUtils}. */
    public static OVRInputState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRInputState(memAddress(container), container);
    }

    /** Returns a new {@code OVRInputState} instance for the specified memory address. */
    public static OVRInputState create(long address) {
        return new OVRInputState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRInputState createSafe(long address) {
        return address == NULL ? null : new OVRInputState(address, null);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRInputState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRInputState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRInputState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRInputState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRInputState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRInputState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRInputState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRInputState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRInputState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRInputState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRInputState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInputState malloc(MemoryStack stack) {
        return new OVRInputState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRInputState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInputState calloc(MemoryStack stack) {
        return new OVRInputState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #TimeInSeconds}. */
    public static double nTimeInSeconds(long struct) { return memGetDouble(struct + OVRInputState.TIMEINSECONDS); }
    /** Unsafe version of {@link #Buttons}. */
    public static int nButtons(long struct) { return memGetInt(struct + OVRInputState.BUTTONS); }
    /** Unsafe version of {@link #Touches}. */
    public static int nTouches(long struct) { return memGetInt(struct + OVRInputState.TOUCHES); }
    /** Unsafe version of {@link #IndexTrigger}. */
    public static FloatBuffer nIndexTrigger(long struct) { return memFloatBuffer(struct + OVRInputState.INDEXTRIGGER, ovrHand_Count); }
    /** Unsafe version of {@link #IndexTrigger(int) IndexTrigger}. */
    public static float nIndexTrigger(long struct, int index) {
        return memGetFloat(struct + OVRInputState.INDEXTRIGGER + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTrigger}. */
    public static FloatBuffer nHandTrigger(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGER, ovrHand_Count); }
    /** Unsafe version of {@link #HandTrigger(int) HandTrigger}. */
    public static float nHandTrigger(long struct, int index) {
        return memGetFloat(struct + OVRInputState.HANDTRIGGER + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #Thumbstick}. */
    public static OVRVector2f.Buffer nThumbstick(long struct) { return OVRVector2f.create(struct + OVRInputState.THUMBSTICK, ovrHand_Count); }
    /** Unsafe version of {@link #Thumbstick(int) Thumbstick}. */
    public static OVRVector2f nThumbstick(long struct, int index) {
        return OVRVector2f.create(struct + OVRInputState.THUMBSTICK + check(index, ovrHand_Count) * OVRVector2f.SIZEOF);
    }
    /** Unsafe version of {@link #ControllerType}. */
    public static int nControllerType(long struct) { return memGetInt(struct + OVRInputState.CONTROLLERTYPE); }
    /** Unsafe version of {@link #IndexTriggerNoDeadzone}. */
    public static FloatBuffer nIndexTriggerNoDeadzone(long struct) { return memFloatBuffer(struct + OVRInputState.INDEXTRIGGERNODEADZONE, ovrHand_Count); }
    /** Unsafe version of {@link #IndexTriggerNoDeadzone(int) IndexTriggerNoDeadzone}. */
    public static float nIndexTriggerNoDeadzone(long struct, int index) {
        return memGetFloat(struct + OVRInputState.INDEXTRIGGERNODEADZONE + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTriggerNoDeadzone}. */
    public static FloatBuffer nHandTriggerNoDeadzone(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGERNODEADZONE, ovrHand_Count); }
    /** Unsafe version of {@link #HandTriggerNoDeadzone(int) HandTriggerNoDeadzone}. */
    public static float nHandTriggerNoDeadzone(long struct, int index) {
        return memGetFloat(struct + OVRInputState.HANDTRIGGERNODEADZONE + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #ThumbstickNoDeadzone}. */
    public static OVRVector2f.Buffer nThumbstickNoDeadzone(long struct) { return OVRVector2f.create(struct + OVRInputState.THUMBSTICKNODEADZONE, ovrHand_Count); }
    /** Unsafe version of {@link #ThumbstickNoDeadzone(int) ThumbstickNoDeadzone}. */
    public static OVRVector2f nThumbstickNoDeadzone(long struct, int index) {
        return OVRVector2f.create(struct + OVRInputState.THUMBSTICKNODEADZONE + check(index, ovrHand_Count) * OVRVector2f.SIZEOF);
    }
    /** Unsafe version of {@link #IndexTriggerRaw}. */
    public static FloatBuffer nIndexTriggerRaw(long struct) { return memFloatBuffer(struct + OVRInputState.INDEXTRIGGERRAW, ovrHand_Count); }
    /** Unsafe version of {@link #IndexTriggerRaw(int) IndexTriggerRaw}. */
    public static float nIndexTriggerRaw(long struct, int index) {
        return memGetFloat(struct + OVRInputState.INDEXTRIGGERRAW + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTriggerRaw}. */
    public static FloatBuffer nHandTriggerRaw(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGERRAW, ovrHand_Count); }
    /** Unsafe version of {@link #HandTriggerRaw(int) HandTriggerRaw}. */
    public static float nHandTriggerRaw(long struct, int index) {
        return memGetFloat(struct + OVRInputState.HANDTRIGGERRAW + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #ThumbstickRaw}. */
    public static OVRVector2f.Buffer nThumbstickRaw(long struct) { return OVRVector2f.create(struct + OVRInputState.THUMBSTICKRAW, ovrHand_Count); }
    /** Unsafe version of {@link #ThumbstickRaw(int) ThumbstickRaw}. */
    public static OVRVector2f nThumbstickRaw(long struct, int index) {
        return OVRVector2f.create(struct + OVRInputState.THUMBSTICKRAW + check(index, ovrHand_Count) * OVRVector2f.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link OVRInputState} structs. */
    public static class Buffer extends StructBuffer<OVRInputState, Buffer> implements NativeResource {

        private static final OVRInputState ELEMENT_FACTORY = OVRInputState.create(-1L);

        /**
         * Creates a new {@code OVRInputState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRInputState#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRInputState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code TimeInSeconds} field. */
        public double TimeInSeconds() { return OVRInputState.nTimeInSeconds(address()); }
        /** @return the value of the {@code Buttons} field. */
        @NativeType("unsigned int")
        public int Buttons() { return OVRInputState.nButtons(address()); }
        /** @return the value of the {@code Touches} field. */
        @NativeType("unsigned int")
        public int Touches() { return OVRInputState.nTouches(address()); }
        /** @return a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTrigger() { return OVRInputState.nIndexTrigger(address()); }
        /** @return the value at the specified index of the {@code IndexTrigger} field. */
        public float IndexTrigger(int index) { return OVRInputState.nIndexTrigger(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code HandTrigger} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTrigger() { return OVRInputState.nHandTrigger(address()); }
        /** @return the value at the specified index of the {@code HandTrigger} field. */
        public float HandTrigger(int index) { return OVRInputState.nHandTrigger(address(), index); }
        /** @return a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer Thumbstick() { return OVRInputState.nThumbstick(address()); }
        /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f Thumbstick(int index) { return OVRInputState.nThumbstick(address(), index); }
        /** @return the value of the {@code ControllerType} field. */
        @NativeType("ovrControllerType")
        public int ControllerType() { return OVRInputState.nControllerType(address()); }
        /** @return a {@link FloatBuffer} view of the {@code IndexTriggerNoDeadzone} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTriggerNoDeadzone() { return OVRInputState.nIndexTriggerNoDeadzone(address()); }
        /** @return the value at the specified index of the {@code IndexTriggerNoDeadzone} field. */
        public float IndexTriggerNoDeadzone(int index) { return OVRInputState.nIndexTriggerNoDeadzone(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code HandTriggerNoDeadzone} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTriggerNoDeadzone() { return OVRInputState.nHandTriggerNoDeadzone(address()); }
        /** @return the value at the specified index of the {@code HandTriggerNoDeadzone} field. */
        public float HandTriggerNoDeadzone(int index) { return OVRInputState.nHandTriggerNoDeadzone(address(), index); }
        /** @return a {@link OVRVector2f}.Buffer view of the {@code ThumbstickNoDeadzone} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer ThumbstickNoDeadzone() { return OVRInputState.nThumbstickNoDeadzone(address()); }
        /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickNoDeadzone} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f ThumbstickNoDeadzone(int index) { return OVRInputState.nThumbstickNoDeadzone(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code IndexTriggerRaw} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTriggerRaw() { return OVRInputState.nIndexTriggerRaw(address()); }
        /** @return the value at the specified index of the {@code IndexTriggerRaw} field. */
        public float IndexTriggerRaw(int index) { return OVRInputState.nIndexTriggerRaw(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code HandTriggerRaw} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTriggerRaw() { return OVRInputState.nHandTriggerRaw(address()); }
        /** @return the value at the specified index of the {@code HandTriggerRaw} field. */
        public float HandTriggerRaw(int index) { return OVRInputState.nHandTriggerRaw(address(), index); }
        /** @return a {@link OVRVector2f}.Buffer view of the {@code ThumbstickRaw} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer ThumbstickRaw() { return OVRInputState.nThumbstickRaw(address()); }
        /** @return a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickRaw} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f ThumbstickRaw(int index) { return OVRInputState.nThumbstickRaw(address(), index); }

    }

}