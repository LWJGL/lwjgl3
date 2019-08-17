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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrHand_Count;

/**
 * Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
 * their inputs are combined.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code TimeInSeconds} &ndash; system type when the controller state was last updated</li>
 * <li>{@code Buttons} &ndash; values for buttons described by {@code ovrButton}</li>
 * <li>{@code Touches} &ndash; touch values for buttons and sensors as described by {@code ovrTouch}.</li>
 * <li>{@code IndexTrigger[ovrHand_Count]} &ndash; left and right finger trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range 0.0 to 1.0f.</li>
 * <li>{@code HandTrigger[ovrHand_Count]} &ndash; left and right hand trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range 0.0 to 1.0f.</li>
 * <li>{@code Thumbstick[ovrHand_Count]} &ndash; horizontal and vertical thumbstick axis values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range -1.0f to 1.0f.</li>
 * <li>{@code ControllerType} &ndash; The type of the controller this state is for. One of:<br><table><tr><td>{@link OVR#ovrControllerType_None ControllerType_None}</td><td>{@link OVR#ovrControllerType_LTouch ControllerType_LTouch}</td><td>{@link OVR#ovrControllerType_RTouch ControllerType_RTouch}</td></tr><tr><td>{@link OVR#ovrControllerType_Touch ControllerType_Touch}</td><td>{@link OVR#ovrControllerType_Remote ControllerType_Remote}</td><td>{@link OVR#ovrControllerType_XBox ControllerType_XBox}</td></tr><tr><td>{@link OVR#ovrControllerType_Object0 ControllerType_Object0}</td><td>{@link OVR#ovrControllerType_Object1 ControllerType_Object1}</td><td>{@link OVR#ovrControllerType_Object2 ControllerType_Object2}</td></tr><tr><td>{@link OVR#ovrControllerType_Object3 ControllerType_Object3}</td><td>{@link OVR#ovrControllerType_Active ControllerType_Active}</td></tr></table></li>
 * <li>{@code IndexTriggerNoDeadzone[ovrHand_Count]} &ndash; Left and right finger trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter.</li>
 * <li>{@code HandTriggerNoDeadzone[ovrHand_Count]} &ndash; Left and right hand trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range 0.0 to 1.0f. Does not apply a deadzone. Only touch applies a filter.</li>
 * <li>{@code ThumbstickNoDeadzone[ovrHand_Count]} &ndash; Horizontal and vertical thumbstick axis values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range -1.0f to 1.0f. Does not apply a deadzone or filter.</li>
 * <li>{@code IndexTriggerRaw[ovrHand_Count]} &ndash; Left and right finger trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in range 0.0 to 1.0f. No deadzone or filter.</li>
 * <li>{@code HandTriggerRaw[ovrHand_Count]} &ndash; Left and right hand trigger values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in the range 0.0 to 1.0f. No deadzone or filter.</li>
 * <li>{@code ThumbstickRaw[ovrHand_Count]} &ndash; Horizontal and vertical thumbstick axis values ({@link OVR#ovrHand_Left Hand_Left} and {@link OVR#ovrHand_Right Hand_Right}), in range -1.0f to 1.0f. No deadzone or filter.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
@NativeType("struct ovrInputState")
public class OVRInputState extends Struct implements NativeResource {

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

    /** Returns the value of the {@code TimeInSeconds} field. */
    public double TimeInSeconds() { return nTimeInSeconds(address()); }
    /** Returns the value of the {@code Buttons} field. */
    @NativeType("unsigned int")
    public int Buttons() { return nButtons(address()); }
    /** Returns the value of the {@code Touches} field. */
    @NativeType("unsigned int")
    public int Touches() { return nTouches(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTrigger() { return nIndexTrigger(address()); }
    /** Returns the value at the specified index of the {@code IndexTrigger} field. */
    public float IndexTrigger(int index) { return nIndexTrigger(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code HandTrigger} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTrigger() { return nHandTrigger(address()); }
    /** Returns the value at the specified index of the {@code HandTrigger} field. */
    public float HandTrigger(int index) { return nHandTrigger(address(), index); }
    /** Returns a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer Thumbstick() { return nThumbstick(address()); }
    /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f Thumbstick(int index) { return nThumbstick(address(), index); }
    /** Returns the value of the {@code ControllerType} field. */
    @NativeType("ovrControllerType")
    public int ControllerType() { return nControllerType(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code IndexTriggerNoDeadzone} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTriggerNoDeadzone() { return nIndexTriggerNoDeadzone(address()); }
    /** Returns the value at the specified index of the {@code IndexTriggerNoDeadzone} field. */
    public float IndexTriggerNoDeadzone(int index) { return nIndexTriggerNoDeadzone(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code HandTriggerNoDeadzone} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTriggerNoDeadzone() { return nHandTriggerNoDeadzone(address()); }
    /** Returns the value at the specified index of the {@code HandTriggerNoDeadzone} field. */
    public float HandTriggerNoDeadzone(int index) { return nHandTriggerNoDeadzone(address(), index); }
    /** Returns a {@link OVRVector2f}.Buffer view of the {@code ThumbstickNoDeadzone} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer ThumbstickNoDeadzone() { return nThumbstickNoDeadzone(address()); }
    /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickNoDeadzone} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f ThumbstickNoDeadzone(int index) { return nThumbstickNoDeadzone(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code IndexTriggerRaw} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer IndexTriggerRaw() { return nIndexTriggerRaw(address()); }
    /** Returns the value at the specified index of the {@code IndexTriggerRaw} field. */
    public float IndexTriggerRaw(int index) { return nIndexTriggerRaw(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code HandTriggerRaw} field. */
    @NativeType("float[ovrHand_Count]")
    public FloatBuffer HandTriggerRaw() { return nHandTriggerRaw(address()); }
    /** Returns the value at the specified index of the {@code HandTriggerRaw} field. */
    public float HandTriggerRaw(int index) { return nHandTriggerRaw(address(), index); }
    /** Returns a {@link OVRVector2f}.Buffer view of the {@code ThumbstickRaw} field. */
    @NativeType("ovrVector2f[ovrHand_Count]")
    public OVRVector2f.Buffer ThumbstickRaw() { return nThumbstickRaw(address()); }
    /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickRaw} field. */
    @NativeType("ovrVector2f")
    public OVRVector2f ThumbstickRaw(int index) { return nThumbstickRaw(address(), index); }

    // -----------------------------------

    /** Returns a new {@code OVRInputState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRInputState malloc() {
        return wrap(OVRInputState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRInputState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRInputState calloc() {
        return wrap(OVRInputState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRInputState} instance allocated with {@link BufferUtils}. */
    public static OVRInputState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRInputState.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRInputState} instance for the specified memory address. */
    public static OVRInputState create(long address) {
        return wrap(OVRInputState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRInputState createSafe(long address) {
        return address == NULL ? null : wrap(OVRInputState.class, address);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRInputState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRInputState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRInputState} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRInputState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRInputState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRInputState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRInputState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInputState mallocStack(MemoryStack stack) {
        return wrap(OVRInputState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRInputState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInputState callocStack(MemoryStack stack) {
        return wrap(OVRInputState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRInputState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRInputState.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #TimeInSeconds}. */
    public static double nTimeInSeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRInputState.TIMEINSECONDS); }
    /** Unsafe version of {@link #Buttons}. */
    public static int nButtons(long struct) { return UNSAFE.getInt(null, struct + OVRInputState.BUTTONS); }
    /** Unsafe version of {@link #Touches}. */
    public static int nTouches(long struct) { return UNSAFE.getInt(null, struct + OVRInputState.TOUCHES); }
    /** Unsafe version of {@link #IndexTrigger}. */
    public static FloatBuffer nIndexTrigger(long struct) { return memFloatBuffer(struct + OVRInputState.INDEXTRIGGER, ovrHand_Count); }
    /** Unsafe version of {@link #IndexTrigger(int) IndexTrigger}. */
    public static float nIndexTrigger(long struct, int index) {
        return UNSAFE.getFloat(null, struct + OVRInputState.INDEXTRIGGER + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTrigger}. */
    public static FloatBuffer nHandTrigger(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGER, ovrHand_Count); }
    /** Unsafe version of {@link #HandTrigger(int) HandTrigger}. */
    public static float nHandTrigger(long struct, int index) {
        return UNSAFE.getFloat(null, struct + OVRInputState.HANDTRIGGER + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #Thumbstick}. */
    public static OVRVector2f.Buffer nThumbstick(long struct) { return OVRVector2f.create(struct + OVRInputState.THUMBSTICK, ovrHand_Count); }
    /** Unsafe version of {@link #Thumbstick(int) Thumbstick}. */
    public static OVRVector2f nThumbstick(long struct, int index) {
        return OVRVector2f.create(struct + OVRInputState.THUMBSTICK + check(index, ovrHand_Count) * OVRVector2f.SIZEOF);
    }
    /** Unsafe version of {@link #ControllerType}. */
    public static int nControllerType(long struct) { return UNSAFE.getInt(null, struct + OVRInputState.CONTROLLERTYPE); }
    /** Unsafe version of {@link #IndexTriggerNoDeadzone}. */
    public static FloatBuffer nIndexTriggerNoDeadzone(long struct) { return memFloatBuffer(struct + OVRInputState.INDEXTRIGGERNODEADZONE, ovrHand_Count); }
    /** Unsafe version of {@link #IndexTriggerNoDeadzone(int) IndexTriggerNoDeadzone}. */
    public static float nIndexTriggerNoDeadzone(long struct, int index) {
        return UNSAFE.getFloat(null, struct + OVRInputState.INDEXTRIGGERNODEADZONE + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTriggerNoDeadzone}. */
    public static FloatBuffer nHandTriggerNoDeadzone(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGERNODEADZONE, ovrHand_Count); }
    /** Unsafe version of {@link #HandTriggerNoDeadzone(int) HandTriggerNoDeadzone}. */
    public static float nHandTriggerNoDeadzone(long struct, int index) {
        return UNSAFE.getFloat(null, struct + OVRInputState.HANDTRIGGERNODEADZONE + check(index, ovrHand_Count) * 4);
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
        return UNSAFE.getFloat(null, struct + OVRInputState.INDEXTRIGGERRAW + check(index, ovrHand_Count) * 4);
    }
    /** Unsafe version of {@link #HandTriggerRaw}. */
    public static FloatBuffer nHandTriggerRaw(long struct) { return memFloatBuffer(struct + OVRInputState.HANDTRIGGERRAW, ovrHand_Count); }
    /** Unsafe version of {@link #HandTriggerRaw(int) HandTriggerRaw}. */
    public static float nHandTriggerRaw(long struct, int index) {
        return UNSAFE.getFloat(null, struct + OVRInputState.HANDTRIGGERRAW + check(index, ovrHand_Count) * 4);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRInputState#SIZEOF}, and its mark will be undefined.
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
        protected OVRInputState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code TimeInSeconds} field. */
        public double TimeInSeconds() { return OVRInputState.nTimeInSeconds(address()); }
        /** Returns the value of the {@code Buttons} field. */
        @NativeType("unsigned int")
        public int Buttons() { return OVRInputState.nButtons(address()); }
        /** Returns the value of the {@code Touches} field. */
        @NativeType("unsigned int")
        public int Touches() { return OVRInputState.nTouches(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTrigger() { return OVRInputState.nIndexTrigger(address()); }
        /** Returns the value at the specified index of the {@code IndexTrigger} field. */
        public float IndexTrigger(int index) { return OVRInputState.nIndexTrigger(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code HandTrigger} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTrigger() { return OVRInputState.nHandTrigger(address()); }
        /** Returns the value at the specified index of the {@code HandTrigger} field. */
        public float HandTrigger(int index) { return OVRInputState.nHandTrigger(address(), index); }
        /** Returns a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer Thumbstick() { return OVRInputState.nThumbstick(address()); }
        /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f Thumbstick(int index) { return OVRInputState.nThumbstick(address(), index); }
        /** Returns the value of the {@code ControllerType} field. */
        @NativeType("ovrControllerType")
        public int ControllerType() { return OVRInputState.nControllerType(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code IndexTriggerNoDeadzone} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTriggerNoDeadzone() { return OVRInputState.nIndexTriggerNoDeadzone(address()); }
        /** Returns the value at the specified index of the {@code IndexTriggerNoDeadzone} field. */
        public float IndexTriggerNoDeadzone(int index) { return OVRInputState.nIndexTriggerNoDeadzone(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code HandTriggerNoDeadzone} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTriggerNoDeadzone() { return OVRInputState.nHandTriggerNoDeadzone(address()); }
        /** Returns the value at the specified index of the {@code HandTriggerNoDeadzone} field. */
        public float HandTriggerNoDeadzone(int index) { return OVRInputState.nHandTriggerNoDeadzone(address(), index); }
        /** Returns a {@link OVRVector2f}.Buffer view of the {@code ThumbstickNoDeadzone} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer ThumbstickNoDeadzone() { return OVRInputState.nThumbstickNoDeadzone(address()); }
        /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickNoDeadzone} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f ThumbstickNoDeadzone(int index) { return OVRInputState.nThumbstickNoDeadzone(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code IndexTriggerRaw} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer IndexTriggerRaw() { return OVRInputState.nIndexTriggerRaw(address()); }
        /** Returns the value at the specified index of the {@code IndexTriggerRaw} field. */
        public float IndexTriggerRaw(int index) { return OVRInputState.nIndexTriggerRaw(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code HandTriggerRaw} field. */
        @NativeType("float[ovrHand_Count]")
        public FloatBuffer HandTriggerRaw() { return OVRInputState.nHandTriggerRaw(address()); }
        /** Returns the value at the specified index of the {@code HandTriggerRaw} field. */
        public float HandTriggerRaw(int index) { return OVRInputState.nHandTriggerRaw(address(), index); }
        /** Returns a {@link OVRVector2f}.Buffer view of the {@code ThumbstickRaw} field. */
        @NativeType("ovrVector2f[ovrHand_Count]")
        public OVRVector2f.Buffer ThumbstickRaw() { return OVRInputState.nThumbstickRaw(address()); }
        /** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code ThumbstickRaw} field. */
        @NativeType("ovrVector2f")
        public OVRVector2f ThumbstickRaw(int index) { return OVRInputState.nThumbstickRaw(address(), index); }

    }

}