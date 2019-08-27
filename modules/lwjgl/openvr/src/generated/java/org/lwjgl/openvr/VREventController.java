/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Used for controller button events.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code button} &ndash; one of:<br><table><tr><td>{@link VR#EVRButtonId_k_EButton_System}</td><td>{@link VR#EVRButtonId_k_EButton_ApplicationMenu}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Grip}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Left}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Up}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Right}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Down}</td><td>{@link VR#EVRButtonId_k_EButton_A}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_ProximitySensor}</td><td>{@link VR#EVRButtonId_k_EButton_Axis0}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis1}</td><td>{@link VR#EVRButtonId_k_EButton_Axis2}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis3}</td><td>{@link VR#EVRButtonId_k_EButton_Axis4}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Touchpad}</td><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Trigger}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Dashboard_Back}</td><td>{@link VR#EVRButtonId_k_EButton_IndexController_A}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_IndexController_B}</td><td>{@link VR#EVRButtonId_k_EButton_IndexController_JoyStick}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Max}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Controller_t {
 *     uint32_t button;
 * }</code></pre>
 */
@NativeType("struct VREvent_Controller_t")
public class VREventController extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUTTON;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUTTON = layout.offsetof(0);
    }

    /**
     * Creates a {@code VREventController} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventController(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code button} field. */
    @NativeType("uint32_t")
    public int button() { return nbutton(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventController} instance for the specified memory address. */
    public static VREventController create(long address) {
        return wrap(VREventController.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventController createSafe(long address) {
        return address == NULL ? null : wrap(VREventController.class, address);
    }

    /**
     * Create a {@link VREventController.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventController.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventController.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return UNSAFE.getInt(null, struct + VREventController.BUTTON); }

    // -----------------------------------

    /** An array of {@link VREventController} structs. */
    public static class Buffer extends StructBuffer<VREventController, Buffer> {

        private static final VREventController ELEMENT_FACTORY = VREventController.create(-1L);

        /**
         * Creates a new {@code VREventController.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventController#SIZEOF}, and its mark will be undefined.
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
        protected VREventController getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code button} field. */
        @NativeType("uint32_t")
        public int button() { return VREventController.nbutton(address()); }

    }

}