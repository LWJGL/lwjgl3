/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.bullet.PhysicsClient.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3VRControllerEvent {
 *     int m_controllerId;
 *     int m_deviceType;
 *     int m_numMoveEvents;
 *     int m_numButtonEvents;
 *     float m_pos[4];
 *     float m_orn[4];
 *     float m_analogAxis;
 *     float m_auxAnalogAxis[MAX_VR_ANALOG_AXIS * 2];
 *     int m_buttons[MAX_VR_BUTTONS];
 * }</code></pre>
 */
@NativeType("struct b3VRControllerEvent")
public class B3VRControllerEvent extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_CONTROLLERID,
        M_DEVICETYPE,
        M_NUMMOVEEVENTS,
        M_NUMBUTTONEVENTS,
        M_POS,
        M_ORN,
        M_ANALOGAXIS,
        M_AUXANALOGAXIS,
        M_BUTTONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 4),
            __array(4, 4),
            __member(4),
            __array(4, MAX_VR_ANALOG_AXIS * 2),
            __array(4, MAX_VR_BUTTONS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_CONTROLLERID = layout.offsetof(0);
        M_DEVICETYPE = layout.offsetof(1);
        M_NUMMOVEEVENTS = layout.offsetof(2);
        M_NUMBUTTONEVENTS = layout.offsetof(3);
        M_POS = layout.offsetof(4);
        M_ORN = layout.offsetof(5);
        M_ANALOGAXIS = layout.offsetof(6);
        M_AUXANALOGAXIS = layout.offsetof(7);
        M_BUTTONS = layout.offsetof(8);
    }

    /**
     * Creates a {@code B3VRControllerEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3VRControllerEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_controllerId} field. */
    public int m_controllerId() { return nm_controllerId(address()); }
    /** Returns the value of the {@code m_deviceType} field. */
    public int m_deviceType() { return nm_deviceType(address()); }
    /** Returns the value of the {@code m_numMoveEvents} field. */
    public int m_numMoveEvents() { return nm_numMoveEvents(address()); }
    /** Returns the value of the {@code m_numButtonEvents} field. */
    public int m_numButtonEvents() { return nm_numButtonEvents(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code m_pos} field. */
    @NativeType("float[4]")
    public FloatBuffer m_pos() { return nm_pos(address()); }
    /** Returns the value at the specified index of the {@code m_pos} field. */
    public float m_pos(int index) { return nm_pos(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code m_orn} field. */
    @NativeType("float[4]")
    public FloatBuffer m_orn() { return nm_orn(address()); }
    /** Returns the value at the specified index of the {@code m_orn} field. */
    public float m_orn(int index) { return nm_orn(address(), index); }
    /** Returns the value of the {@code m_analogAxis} field. */
    public float m_analogAxis() { return nm_analogAxis(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code m_auxAnalogAxis} field. */
    @NativeType("float[MAX_VR_ANALOG_AXIS * 2]")
    public FloatBuffer m_auxAnalogAxis() { return nm_auxAnalogAxis(address()); }
    /** Returns the value at the specified index of the {@code m_auxAnalogAxis} field. */
    public float m_auxAnalogAxis(int index) { return nm_auxAnalogAxis(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code m_buttons} field. */
    @NativeType("int[MAX_VR_BUTTONS]")
    public IntBuffer m_buttons() { return nm_buttons(address()); }
    /** Returns the value at the specified index of the {@code m_buttons} field. */
    public int m_buttons(int index) { return nm_buttons(address(), index); }

    /** Sets the specified value to the {@code m_controllerId} field. */
    public B3VRControllerEvent m_controllerId(int value) { nm_controllerId(address(), value); return this; }
    /** Sets the specified value to the {@code m_deviceType} field. */
    public B3VRControllerEvent m_deviceType(int value) { nm_deviceType(address(), value); return this; }
    /** Sets the specified value to the {@code m_numMoveEvents} field. */
    public B3VRControllerEvent m_numMoveEvents(int value) { nm_numMoveEvents(address(), value); return this; }
    /** Sets the specified value to the {@code m_numButtonEvents} field. */
    public B3VRControllerEvent m_numButtonEvents(int value) { nm_numButtonEvents(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_pos} field. */
    public B3VRControllerEvent m_pos(@NativeType("float[4]") FloatBuffer value) { nm_pos(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_pos} field. */
    public B3VRControllerEvent m_pos(int index, float value) { nm_pos(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_orn} field. */
    public B3VRControllerEvent m_orn(@NativeType("float[4]") FloatBuffer value) { nm_orn(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_orn} field. */
    public B3VRControllerEvent m_orn(int index, float value) { nm_orn(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_analogAxis} field. */
    public B3VRControllerEvent m_analogAxis(float value) { nm_analogAxis(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code m_auxAnalogAxis} field. */
    public B3VRControllerEvent m_auxAnalogAxis(@NativeType("float[MAX_VR_ANALOG_AXIS * 2]") FloatBuffer value) { nm_auxAnalogAxis(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_auxAnalogAxis} field. */
    public B3VRControllerEvent m_auxAnalogAxis(int index, float value) { nm_auxAnalogAxis(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code m_buttons} field. */
    public B3VRControllerEvent m_buttons(@NativeType("int[MAX_VR_BUTTONS]") IntBuffer value) { nm_buttons(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_buttons} field. */
    public B3VRControllerEvent m_buttons(int index, int value) { nm_buttons(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public B3VRControllerEvent set(
        int m_controllerId,
        int m_deviceType,
        int m_numMoveEvents,
        int m_numButtonEvents,
        FloatBuffer m_pos,
        FloatBuffer m_orn,
        float m_analogAxis,
        FloatBuffer m_auxAnalogAxis,
        IntBuffer m_buttons
    ) {
        m_controllerId(m_controllerId);
        m_deviceType(m_deviceType);
        m_numMoveEvents(m_numMoveEvents);
        m_numButtonEvents(m_numButtonEvents);
        m_pos(m_pos);
        m_orn(m_orn);
        m_analogAxis(m_analogAxis);
        m_auxAnalogAxis(m_auxAnalogAxis);
        m_buttons(m_buttons);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3VRControllerEvent set(B3VRControllerEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3VRControllerEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3VRControllerEvent malloc() {
        return wrap(B3VRControllerEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3VRControllerEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3VRControllerEvent calloc() {
        return wrap(B3VRControllerEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3VRControllerEvent} instance allocated with {@link BufferUtils}. */
    public static B3VRControllerEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3VRControllerEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code B3VRControllerEvent} instance for the specified memory address. */
    public static B3VRControllerEvent create(long address) {
        return wrap(B3VRControllerEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3VRControllerEvent createSafe(long address) {
        return address == NULL ? null : wrap(B3VRControllerEvent.class, address);
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3VRControllerEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3VRControllerEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3VRControllerEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3VRControllerEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3VRControllerEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3VRControllerEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3VRControllerEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3VRControllerEvent mallocStack(MemoryStack stack) {
        return wrap(B3VRControllerEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3VRControllerEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3VRControllerEvent callocStack(MemoryStack stack) {
        return wrap(B3VRControllerEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3VRControllerEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3VRControllerEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_controllerId}. */
    public static int nm_controllerId(long struct) { return UNSAFE.getInt(null, struct + B3VRControllerEvent.M_CONTROLLERID); }
    /** Unsafe version of {@link #m_deviceType}. */
    public static int nm_deviceType(long struct) { return UNSAFE.getInt(null, struct + B3VRControllerEvent.M_DEVICETYPE); }
    /** Unsafe version of {@link #m_numMoveEvents}. */
    public static int nm_numMoveEvents(long struct) { return UNSAFE.getInt(null, struct + B3VRControllerEvent.M_NUMMOVEEVENTS); }
    /** Unsafe version of {@link #m_numButtonEvents}. */
    public static int nm_numButtonEvents(long struct) { return UNSAFE.getInt(null, struct + B3VRControllerEvent.M_NUMBUTTONEVENTS); }
    /** Unsafe version of {@link #m_pos}. */
    public static FloatBuffer nm_pos(long struct) { return memFloatBuffer(struct + B3VRControllerEvent.M_POS, 4); }
    /** Unsafe version of {@link #m_pos(int) m_pos}. */
    public static float nm_pos(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3VRControllerEvent.M_POS + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #m_orn}. */
    public static FloatBuffer nm_orn(long struct) { return memFloatBuffer(struct + B3VRControllerEvent.M_ORN, 4); }
    /** Unsafe version of {@link #m_orn(int) m_orn}. */
    public static float nm_orn(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3VRControllerEvent.M_ORN + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #m_analogAxis}. */
    public static float nm_analogAxis(long struct) { return UNSAFE.getFloat(null, struct + B3VRControllerEvent.M_ANALOGAXIS); }
    /** Unsafe version of {@link #m_auxAnalogAxis}. */
    public static FloatBuffer nm_auxAnalogAxis(long struct) { return memFloatBuffer(struct + B3VRControllerEvent.M_AUXANALOGAXIS, MAX_VR_ANALOG_AXIS * 2); }
    /** Unsafe version of {@link #m_auxAnalogAxis(int) m_auxAnalogAxis}. */
    public static float nm_auxAnalogAxis(long struct, int index) {
        return UNSAFE.getFloat(null, struct + B3VRControllerEvent.M_AUXANALOGAXIS + check(index, MAX_VR_ANALOG_AXIS * 2) * 4);
    }
    /** Unsafe version of {@link #m_buttons}. */
    public static IntBuffer nm_buttons(long struct) { return memIntBuffer(struct + B3VRControllerEvent.M_BUTTONS, MAX_VR_BUTTONS); }
    /** Unsafe version of {@link #m_buttons(int) m_buttons}. */
    public static int nm_buttons(long struct, int index) {
        return UNSAFE.getInt(null, struct + B3VRControllerEvent.M_BUTTONS + check(index, MAX_VR_BUTTONS) * 4);
    }

    /** Unsafe version of {@link #m_controllerId(int) m_controllerId}. */
    public static void nm_controllerId(long struct, int value) { UNSAFE.putInt(null, struct + B3VRControllerEvent.M_CONTROLLERID, value); }
    /** Unsafe version of {@link #m_deviceType(int) m_deviceType}. */
    public static void nm_deviceType(long struct, int value) { UNSAFE.putInt(null, struct + B3VRControllerEvent.M_DEVICETYPE, value); }
    /** Unsafe version of {@link #m_numMoveEvents(int) m_numMoveEvents}. */
    public static void nm_numMoveEvents(long struct, int value) { UNSAFE.putInt(null, struct + B3VRControllerEvent.M_NUMMOVEEVENTS, value); }
    /** Unsafe version of {@link #m_numButtonEvents(int) m_numButtonEvents}. */
    public static void nm_numButtonEvents(long struct, int value) { UNSAFE.putInt(null, struct + B3VRControllerEvent.M_NUMBUTTONEVENTS, value); }
    /** Unsafe version of {@link #m_pos(FloatBuffer) m_pos}. */
    public static void nm_pos(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3VRControllerEvent.M_POS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_pos(int, float) m_pos}. */
    public static void nm_pos(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3VRControllerEvent.M_POS + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #m_orn(FloatBuffer) m_orn}. */
    public static void nm_orn(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3VRControllerEvent.M_ORN, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_orn(int, float) m_orn}. */
    public static void nm_orn(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3VRControllerEvent.M_ORN + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #m_analogAxis(float) m_analogAxis}. */
    public static void nm_analogAxis(long struct, float value) { UNSAFE.putFloat(null, struct + B3VRControllerEvent.M_ANALOGAXIS, value); }
    /** Unsafe version of {@link #m_auxAnalogAxis(FloatBuffer) m_auxAnalogAxis}. */
    public static void nm_auxAnalogAxis(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, MAX_VR_ANALOG_AXIS * 2); }
        memCopy(memAddress(value), struct + B3VRControllerEvent.M_AUXANALOGAXIS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_auxAnalogAxis(int, float) m_auxAnalogAxis}. */
    public static void nm_auxAnalogAxis(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + B3VRControllerEvent.M_AUXANALOGAXIS + check(index, MAX_VR_ANALOG_AXIS * 2) * 4, value);
    }
    /** Unsafe version of {@link #m_buttons(IntBuffer) m_buttons}. */
    public static void nm_buttons(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, MAX_VR_BUTTONS); }
        memCopy(memAddress(value), struct + B3VRControllerEvent.M_BUTTONS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_buttons(int, int) m_buttons}. */
    public static void nm_buttons(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + B3VRControllerEvent.M_BUTTONS + check(index, MAX_VR_BUTTONS) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link B3VRControllerEvent} structs. */
    public static class Buffer extends StructBuffer<B3VRControllerEvent, Buffer> implements NativeResource {

        private static final B3VRControllerEvent ELEMENT_FACTORY = B3VRControllerEvent.create(-1L);

        /**
         * Creates a new {@code B3VRControllerEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3VRControllerEvent#SIZEOF}, and its mark will be undefined.
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
        protected B3VRControllerEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_controllerId} field. */
        public int m_controllerId() { return B3VRControllerEvent.nm_controllerId(address()); }
        /** Returns the value of the {@code m_deviceType} field. */
        public int m_deviceType() { return B3VRControllerEvent.nm_deviceType(address()); }
        /** Returns the value of the {@code m_numMoveEvents} field. */
        public int m_numMoveEvents() { return B3VRControllerEvent.nm_numMoveEvents(address()); }
        /** Returns the value of the {@code m_numButtonEvents} field. */
        public int m_numButtonEvents() { return B3VRControllerEvent.nm_numButtonEvents(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code m_pos} field. */
        @NativeType("float[4]")
        public FloatBuffer m_pos() { return B3VRControllerEvent.nm_pos(address()); }
        /** Returns the value at the specified index of the {@code m_pos} field. */
        public float m_pos(int index) { return B3VRControllerEvent.nm_pos(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code m_orn} field. */
        @NativeType("float[4]")
        public FloatBuffer m_orn() { return B3VRControllerEvent.nm_orn(address()); }
        /** Returns the value at the specified index of the {@code m_orn} field. */
        public float m_orn(int index) { return B3VRControllerEvent.nm_orn(address(), index); }
        /** Returns the value of the {@code m_analogAxis} field. */
        public float m_analogAxis() { return B3VRControllerEvent.nm_analogAxis(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code m_auxAnalogAxis} field. */
        @NativeType("float[MAX_VR_ANALOG_AXIS * 2]")
        public FloatBuffer m_auxAnalogAxis() { return B3VRControllerEvent.nm_auxAnalogAxis(address()); }
        /** Returns the value at the specified index of the {@code m_auxAnalogAxis} field. */
        public float m_auxAnalogAxis(int index) { return B3VRControllerEvent.nm_auxAnalogAxis(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code m_buttons} field. */
        @NativeType("int[MAX_VR_BUTTONS]")
        public IntBuffer m_buttons() { return B3VRControllerEvent.nm_buttons(address()); }
        /** Returns the value at the specified index of the {@code m_buttons} field. */
        public int m_buttons(int index) { return B3VRControllerEvent.nm_buttons(address(), index); }

        /** Sets the specified value to the {@code m_controllerId} field. */
        public B3VRControllerEvent.Buffer m_controllerId(int value) { B3VRControllerEvent.nm_controllerId(address(), value); return this; }
        /** Sets the specified value to the {@code m_deviceType} field. */
        public B3VRControllerEvent.Buffer m_deviceType(int value) { B3VRControllerEvent.nm_deviceType(address(), value); return this; }
        /** Sets the specified value to the {@code m_numMoveEvents} field. */
        public B3VRControllerEvent.Buffer m_numMoveEvents(int value) { B3VRControllerEvent.nm_numMoveEvents(address(), value); return this; }
        /** Sets the specified value to the {@code m_numButtonEvents} field. */
        public B3VRControllerEvent.Buffer m_numButtonEvents(int value) { B3VRControllerEvent.nm_numButtonEvents(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_pos} field. */
        public B3VRControllerEvent.Buffer m_pos(@NativeType("float[4]") FloatBuffer value) { B3VRControllerEvent.nm_pos(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_pos} field. */
        public B3VRControllerEvent.Buffer m_pos(int index, float value) { B3VRControllerEvent.nm_pos(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_orn} field. */
        public B3VRControllerEvent.Buffer m_orn(@NativeType("float[4]") FloatBuffer value) { B3VRControllerEvent.nm_orn(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_orn} field. */
        public B3VRControllerEvent.Buffer m_orn(int index, float value) { B3VRControllerEvent.nm_orn(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_analogAxis} field. */
        public B3VRControllerEvent.Buffer m_analogAxis(float value) { B3VRControllerEvent.nm_analogAxis(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code m_auxAnalogAxis} field. */
        public B3VRControllerEvent.Buffer m_auxAnalogAxis(@NativeType("float[MAX_VR_ANALOG_AXIS * 2]") FloatBuffer value) { B3VRControllerEvent.nm_auxAnalogAxis(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_auxAnalogAxis} field. */
        public B3VRControllerEvent.Buffer m_auxAnalogAxis(int index, float value) { B3VRControllerEvent.nm_auxAnalogAxis(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code m_buttons} field. */
        public B3VRControllerEvent.Buffer m_buttons(@NativeType("int[MAX_VR_BUTTONS]") IntBuffer value) { B3VRControllerEvent.nm_buttons(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_buttons} field. */
        public B3VRControllerEvent.Buffer m_buttons(int index, int value) { B3VRControllerEvent.nm_buttons(address(), index, value); return this; }

    }

}