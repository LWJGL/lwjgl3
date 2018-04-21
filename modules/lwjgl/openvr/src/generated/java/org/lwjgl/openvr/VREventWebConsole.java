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
 * <code><pre>
 * struct VREvent_WebConsole_t {
 *     WebConsoleHandle_t webConsoleHandle;
 * }</pre></code>
 */
@NativeType("struct VREvent_WebConsole_t")
public class VREventWebConsole extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    VREventWebConsole(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventWebConsole} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventWebConsole(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code webConsoleHandle} field. */
    @NativeType("WebConsoleHandle_t")
    public long webConsoleHandle() { return nwebConsoleHandle(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventWebConsole} instance for the specified memory address. */
    public static VREventWebConsole create(long address) {
        return new VREventWebConsole(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventWebConsole createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventWebConsole.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventWebConsole.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventWebConsole.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #webConsoleHandle}. */
    public static long nwebConsoleHandle(long struct) { return memGetLong(struct + VREventWebConsole.WEBCONSOLEHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventWebConsole} structs. */
    public static class Buffer extends StructBuffer<VREventWebConsole, Buffer> {

        /**
         * Creates a new {@link VREventWebConsole.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventWebConsole newInstance(long address) {
            return new VREventWebConsole(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code webConsoleHandle} field. */
        @NativeType("WebConsoleHandle_t")
        public long webConsoleHandle() { return VREventWebConsole.nwebConsoleHandle(address()); }

    }

}