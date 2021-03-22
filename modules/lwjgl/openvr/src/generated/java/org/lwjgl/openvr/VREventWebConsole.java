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
 * struct VREvent_WebConsole_t {
 *     WebConsoleHandle_t webConsoleHandle;
 * }</code></pre>
 */
@NativeType("struct VREvent_WebConsole_t")
public class VREventWebConsole extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WEBCONSOLEHANDLE;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WEBCONSOLEHANDLE = layout.offsetof(0);
    }

    /**
     * Creates a {@code VREventWebConsole} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventWebConsole(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code webConsoleHandle} field. */
    @NativeType("WebConsoleHandle_t")
    public long webConsoleHandle() { return nwebConsoleHandle(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventWebConsole} instance for the specified memory address. */
    public static VREventWebConsole create(long address) {
        return wrap(VREventWebConsole.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventWebConsole createSafe(long address) {
        return address == NULL ? null : wrap(VREventWebConsole.class, address);
    }

    /**
     * Create a {@link VREventWebConsole.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventWebConsole.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventWebConsole.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #webConsoleHandle}. */
    public static long nwebConsoleHandle(long struct) { return UNSAFE.getLong(null, struct + VREventWebConsole.WEBCONSOLEHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventWebConsole} structs. */
    public static class Buffer extends StructBuffer<VREventWebConsole, Buffer> {

        private static final VREventWebConsole ELEMENT_FACTORY = VREventWebConsole.create(-1L);

        /**
         * Creates a new {@code VREventWebConsole.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventWebConsole#SIZEOF}, and its mark will be undefined.
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
        protected VREventWebConsole getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code webConsoleHandle} field. */
        @NativeType("WebConsoleHandle_t")
        public long webConsoleHandle() { return VREventWebConsole.nwebConsoleHandle(address()); }

    }

}