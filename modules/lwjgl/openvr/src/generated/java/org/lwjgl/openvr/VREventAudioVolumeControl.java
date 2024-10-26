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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_AudioVolumeControl_t {
 *     float fVolumeLevel;
 * }</code></pre>
 */
@NativeType("struct VREvent_AudioVolumeControl_t")
public class VREventAudioVolumeControl extends Struct<VREventAudioVolumeControl> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FVOLUMELEVEL;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FVOLUMELEVEL = layout.offsetof(0);
    }

    protected VREventAudioVolumeControl(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventAudioVolumeControl create(long address, @Nullable ByteBuffer container) {
        return new VREventAudioVolumeControl(address, container);
    }

    /**
     * Creates a {@code VREventAudioVolumeControl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventAudioVolumeControl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fVolumeLevel} field. */
    public float fVolumeLevel() { return nfVolumeLevel(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventAudioVolumeControl} instance for the specified memory address. */
    public static VREventAudioVolumeControl create(long address) {
        return new VREventAudioVolumeControl(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventAudioVolumeControl createSafe(long address) {
        return address == NULL ? null : new VREventAudioVolumeControl(address, null);
    }

    /**
     * Create a {@link VREventAudioVolumeControl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventAudioVolumeControl.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventAudioVolumeControl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fVolumeLevel}. */
    public static float nfVolumeLevel(long struct) { return UNSAFE.getFloat(null, struct + VREventAudioVolumeControl.FVOLUMELEVEL); }

    // -----------------------------------

    /** An array of {@link VREventAudioVolumeControl} structs. */
    public static class Buffer extends StructBuffer<VREventAudioVolumeControl, Buffer> {

        private static final VREventAudioVolumeControl ELEMENT_FACTORY = VREventAudioVolumeControl.create(-1L);

        /**
         * Creates a new {@code VREventAudioVolumeControl.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventAudioVolumeControl#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventAudioVolumeControl getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fVolumeLevel} field. */
        public float fVolumeLevel() { return VREventAudioVolumeControl.nfVolumeLevel(address()); }

    }

}