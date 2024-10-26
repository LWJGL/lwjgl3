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
 * struct VREvent_AudioMuteControl_t {
 *     bool bMute;
 * }</code></pre>
 */
@NativeType("struct VREvent_AudioMuteControl_t")
public class VREventAudioMuteControl extends Struct<VREventAudioMuteControl> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BMUTE;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BMUTE = layout.offsetof(0);
    }

    protected VREventAudioMuteControl(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventAudioMuteControl create(long address, @Nullable ByteBuffer container) {
        return new VREventAudioMuteControl(address, container);
    }

    /**
     * Creates a {@code VREventAudioMuteControl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventAudioMuteControl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bMute} field. */
    @NativeType("bool")
    public boolean bMute() { return nbMute(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventAudioMuteControl} instance for the specified memory address. */
    public static VREventAudioMuteControl create(long address) {
        return new VREventAudioMuteControl(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventAudioMuteControl createSafe(long address) {
        return address == NULL ? null : new VREventAudioMuteControl(address, null);
    }

    /**
     * Create a {@link VREventAudioMuteControl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventAudioMuteControl.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventAudioMuteControl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bMute}. */
    public static boolean nbMute(long struct) { return UNSAFE.getByte(null, struct + VREventAudioMuteControl.BMUTE) != 0; }

    // -----------------------------------

    /** An array of {@link VREventAudioMuteControl} structs. */
    public static class Buffer extends StructBuffer<VREventAudioMuteControl, Buffer> {

        private static final VREventAudioMuteControl ELEMENT_FACTORY = VREventAudioMuteControl.create(-1L);

        /**
         * Creates a new {@code VREventAudioMuteControl.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventAudioMuteControl#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventAudioMuteControl getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bMute} field. */
        @NativeType("bool")
        public boolean bMute() { return VREventAudioMuteControl.nbMute(address()); }

    }

}