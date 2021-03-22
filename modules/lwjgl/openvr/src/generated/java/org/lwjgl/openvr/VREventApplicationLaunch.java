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
 * struct VREvent_ApplicationLaunch_t {
 *     uint32_t pid;
 *     uint32_t unArgsHandle;
 * }</code></pre>
 */
@NativeType("struct VREvent_ApplicationLaunch_t")
public class VREventApplicationLaunch extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PID,
        UNARGSHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PID = layout.offsetof(0);
        UNARGSHANDLE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VREventApplicationLaunch} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventApplicationLaunch(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pid} field. */
    @NativeType("uint32_t")
    public int pid() { return npid(address()); }
    /** @return the value of the {@code unArgsHandle} field. */
    @NativeType("uint32_t")
    public int unArgsHandle() { return nunArgsHandle(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventApplicationLaunch} instance for the specified memory address. */
    public static VREventApplicationLaunch create(long address) {
        return wrap(VREventApplicationLaunch.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventApplicationLaunch createSafe(long address) {
        return address == NULL ? null : wrap(VREventApplicationLaunch.class, address);
    }

    /**
     * Create a {@link VREventApplicationLaunch.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventApplicationLaunch.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventApplicationLaunch.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pid}. */
    public static int npid(long struct) { return UNSAFE.getInt(null, struct + VREventApplicationLaunch.PID); }
    /** Unsafe version of {@link #unArgsHandle}. */
    public static int nunArgsHandle(long struct) { return UNSAFE.getInt(null, struct + VREventApplicationLaunch.UNARGSHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventApplicationLaunch} structs. */
    public static class Buffer extends StructBuffer<VREventApplicationLaunch, Buffer> {

        private static final VREventApplicationLaunch ELEMENT_FACTORY = VREventApplicationLaunch.create(-1L);

        /**
         * Creates a new {@code VREventApplicationLaunch.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventApplicationLaunch#SIZEOF}, and its mark will be undefined.
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
        protected VREventApplicationLaunch getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pid} field. */
        @NativeType("uint32_t")
        public int pid() { return VREventApplicationLaunch.npid(address()); }
        /** @return the value of the {@code unArgsHandle} field. */
        @NativeType("uint32_t")
        public int unArgsHandle() { return VREventApplicationLaunch.nunArgsHandle(address()); }

    }

}